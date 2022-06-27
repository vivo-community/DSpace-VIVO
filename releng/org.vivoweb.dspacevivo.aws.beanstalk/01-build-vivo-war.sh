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
export MAIN_SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd -P)"
source $MAIN_SCRIPT_DIR/00-env.sh


###################################################################
# Initialise directories
cp ~/.aws/vivo-dspace-runtime.properties $DSPACEVIVO_HOME/home/src/main/resources/config/runtime.properties
rm -fr $CNAME

###################################################################
# Compiling VIVO 

(cd $DSPACEVIVO_PKG_HOME/script ; vivo-compile-and-deploy-for-tomcat.sh)

###################################################################
# Compiling VIVO 
echo CNAME $VIVO_HOME $CNAME
# mkdir -p $MAIN_SCRIPT_DIR/$CNAME/.platform/hooks/resources/vivo
###################################################################
# Installing VIVO-Home 
cp -r $CATALINA_HOME/webapps/$CNAME .
mkdir -p $MAIN_SCRIPT_DIR/$CNAME/.platform/hooks/resources/vivo
cp -r $VIVO_HOME/* $MAIN_SCRIPT_DIR/$CNAME/.platform/hooks/resources/vivo
cp -rT $VIVO/aws-platform ./$CNAME
#cp $MAIN_SCRIPT_DIR/aws-platform/.platform/hooks/resources/context.xml $VIVO_APP_NAME/META-INF/context.xml
