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
source $GIT/DSpace-VIVO/releng/org.vivoweb.dspacevivo.installer/00-env.sh

cp ~/.aws/vivo-dspace-runtime.properties $DSPACEVIVO_HOME/home/src/main/resources/config/runtime.properties
(cd $DSPACEVIVO_PKG_HOME/script ; vivo-compile-and-deploy-for-tomcat.sh)
rm -fr $CNAME
cp -r $CATALINA_HOME/webapps/$CNAME .
cp $MAIN_SCRIPT_DIR/aws-platform/.platform/hooks/resources/context.xml $VIVO_APP_NAME/META-INF/context.xml
