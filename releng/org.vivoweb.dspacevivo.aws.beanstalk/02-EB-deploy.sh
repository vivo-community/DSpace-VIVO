#!/bin/bash

###################################################################
# Script Name   :
# Description   :
# Args          : 
# Author       	: Michel Héon PhD
# Institution   : Université du Québec à Montréal
# Copyright     : Université du Québec à Montréal (c) 2022
# Email         : heon.michel@uqam.ca
###################################################################
export SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd -P)"
source $SCRIPT_DIR/00-env.sh

echo "INSTALLATION OF ($CNAME) in the environment ($CNAME_ENV) in the VPC ($VPC_NAME)"

###################################################################
# Préparation des fichiers de config de VIVO_HOME avant le déploiement ainsi que le positionnement du fichier ROOT.war 
#
cp -rT $VIVO/aws-platform ./$CNAME


###################################################################
# Assigner les autres paramêtres beanstalk
VIVO_DEFAULT_NS_SED=$(echo $VIVO_DEFAULT_NS|sed 's/\//\\\//g') #Remplacement des '/' pas '\/'
cp ~/.aws/vivo-dspace-runtime.properties $VIVO/$CNAME/.platform/hooks/resources/vivo/config/runtime.properties
sed "s/_VPCID_/$VPC_ID/g" < $VIVO/aws-platform/.ebextensions/vpc.config \
    | sed "s/_SUBNET_1_/$AWS_SUBNET_PUBLIC_ID_1/g" \
    | sed "s/_SUBNET_2_/$AWS_SUBNET_PUBLIC_ID_2/g" \
    > $VIVO/$CNAME/.ebextensions/vpc.config
sed "s/_SG_GROUP_/$AWS_CUSTOM_SECURITY_GROUP_ID/g" < $VIVO/aws-platform/.ebextensions/instance.config \
    | sed "s/_EC2KeyName_/$CLE_SSH/g" \
    > $VIVO/$CNAME/.ebextensions/instance.config
# cat $VIVO/$CNAME/.ebextensions/vpc.config
# cat $VIVO/$CNAME/.ebextensions/instance.config
# cat $VIVO/$CNAME/.platform/hooks/prebuild/01-copy-resources.sh


###################################################################
# Déploiement de VIVO dans Beanstalk  
#
cd $VIVO/$CNAME
eb init $CNAME -p 'Tomcat 8.5 with Corretto 11 running on 64bit Amazon Linux 2/4.2.16' -r $REGION -k $CLE_SSH
eb create $CNAME_ENV -c $CNAME -p 'Tomcat 8.5 with Corretto 11 running on 64bit Amazon Linux 2/4.2.16' -r $REGION -k $CLE_SSH --single

echo "$CNAME creation done!"
export EC2_ID=$(aws ec2 describe-instances --filters  "Name=tag:Name,Values=$CNAME_ENV" "Name=instance-state-name,Values=running" --query "Reservations[].Instances[].InstanceId" --output=text)
aws ec2 wait instance-running --instance-ids $EC2_ID
PUBLIC_IP=$(aws ec2 describe-addresses --filters Name=instance-id,Values=$EC2_ID --query "Addresses[*].PublicIp"  --output=text)
cat <<EOF > $VIVO_ENV_FN 
################################################################### 
# 
# ($VIVO_ENV_FN)
# ATTENTION, NE PAS EDITER
# ces variables sont générées par;  
# $(realpath $0) 
# 
###################################################################
export EC2_ID=$EC2_ID  # instance-id
export EC2_IP=$AWS_VIVO_IP # public ip 
export BEANS_ENV=$CNAME_ENV
export BEANS_CNAME=$CNAME
export BEANS_PATH=$(pwd -P)
EOF
cat $VIVO_ENV_FN 
exit 0




