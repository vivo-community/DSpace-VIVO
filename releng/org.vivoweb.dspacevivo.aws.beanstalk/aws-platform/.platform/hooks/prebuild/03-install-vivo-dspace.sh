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
source /etc/profile
cd /opt/00-GIT
git clone -b dev-heon https://github.com/vivo-community/DSpace-VIVO
cd /opt/00-GIT
if [ ! -d "/opt/00-GIT/DSpace-VIVO/deploy/vivo-home" ]; then
    mkdir -p /opt/00-GIT/DSpace-VIVO/deploy/vivo-home/config
    cp -r /tmp/resources/vivo/* /opt/00-GIT/DSpace-VIVO/deploy/vivo-home
    chown -R tomcat:tomcat /opt/00-GIT/DSpace-VIVO/deploy/vivo-home
fi
echo 'export VIVO_URL=http://$VIVO_APP_NAME.ca-central-1.elasticbeanstalk.com' > /opt/00-GIT/DSpace-VIVO/releng/org.vivoweb.dspacevivo.installer/00-env-vivo-url.sh
/opt/00-GIT/DSpace-VIVO/test/org.vivoweb.dspacevivo.etlexample/script/mvn_install_example.sh




