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
cd /opt
wget https://downloads.apache.org/lucene/solr/8.11.2/solr-8.11.2.tgz
tar xzf solr-8.11.2.tgz solr-8.11.2/bin/install_solr_service.sh --strip-components=2
bash ./install_solr_service.sh solr-8.11.2.tgz -n -d /var/solr -i /opt -p 8983 -s solr -u solr 
su - solr -c '/opt/solr/bin/solr create -c vivocore -n data_driven_schema_configs'
yes | cp -rf /tmp/resources/vivocore /var/solr/data/vivocore
chown -R solr:solr /var/solr/data/vivocore 
service solr start 


