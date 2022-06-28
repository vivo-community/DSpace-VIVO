#!/bin/bash 

###################################################################
# Script Name   :
# Description   :
# Args          : 
# Author        : Michel Héon PhD
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

###################################################################
# Harvesting setup

cat <<EOF > /opt/00-GIT/DSpace-VIVO/test/org.vivoweb.dspacevivo.etlexample/src/main/resources/harvester-dspace6.conf
type = OAI
filePrefix=d6_
harvestTotalCount=10
uriPrefix = https://demo.dspace.org/resource/
endpoint = https://demo.dspace.org/oai/request
etl.dir.extract=data_src_dspace6/extract
etl.dir.transform=data_src_dspace6/transform
EOF

cat <<EOF > /opt/00-GIT/DSpace-VIVO/test/orzg.vivoweb.dspacevivo.etlexample/src/main/resources/harvester-dspace7.conf
type = OAI
filePrefix=d7_
harvestTotalCount=10
uriPrefix = https://dspace7.org/resource/
endpoint = https://api7.dspace.org/server/oai/request
etl.dir.extract=data_src_dspace7/extract
etl.dir.transform=data_src_dspace7/transform
EOF

###################################################################
# Compiling etlexample
/opt/00-GIT/DSpace-VIVO/test/org.vivoweb.dspacevivo.etlexample/script/mvn_install_example.sh


