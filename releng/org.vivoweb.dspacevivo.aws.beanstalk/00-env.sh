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
export ENV_SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd -P)"
export LANG=C.UTF-8
export GIT=$(cd ${ENV_SCRIPT_DIR}/../../../ ; pwd -P)
export VIVO=${ENV_SCRIPT_DIR}
export CNAME=vivo-dspace  # Préfixe de l'URL de déploiement
export CNAME_ENV=$CNAME-env

###################################################################
# AWS Specific value
# 
export REGION="ca-central-1"
export VPC_NAME="DirectConnect"
export VPC_ID="vpc-03fce402830cbbb43"
export AWS_SUBNET_PUBLIC_ID_1=subnet-07d08261a4678cea1
export AWS_SUBNET_PUBLIC_ID_2=subnet-03c8ebedf4e938b06
export AWS_CUSTOM_SECURITY_GROUP_ID=sg-0c89f5a5a1d5f6bf2
export CLE_SSH="Cle-VIVO-Demo"  
export VIVO_ENV_FN="$ENV_SCRIPT_DIR/00-VIVO-DSPACE-env.sh"






