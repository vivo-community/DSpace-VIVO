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
rm -fr $CNAME

###################################################################
# Compiling VIVO 

(cd $DSPACEVIVO_PKG_HOME/script ; vivo-compile-and-deploy-for-tomcat.sh)

###################################################################
# Compiling VIVO 
echo CNAME $VIVO_HOME $CNAME
# mkdir -p $MAIN_SCRIPT_DIR/$CNAME/.platform/hooks/resources/vivo
###################################################################
# Installing VIVO-Home/webapp
cp -r $CATALINA_HOME/webapps/$CNAME .
mkdir -p $MAIN_SCRIPT_DIR/$CNAME/.platform/hooks/resources/vivo
cp -r $VIVO_HOME/* $MAIN_SCRIPT_DIR/$CNAME/.platform/hooks/resources/vivo
cp -rT $VIVO/aws-platform ./$CNAME
LOCAL_RUNTIME_PROP=~/.aws/vivo-dspace-runtime.properties
[ -f LOCAL_RUNTIME_PROP ] || cp ~/.aws/vivo-dspace-runtime.properties $MAIN_SCRIPT_DIR/$CNAME/.platform/hooks/resources/vivo/config/runtime.properties
#cp $MAIN_SCRIPT_DIR/aws-platform/.platform/hooks/resources/context.xml $VIVO_APP_NAME/META-INF/context.xml
