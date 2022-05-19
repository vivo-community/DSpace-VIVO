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
source $SCRIPT_DIR/../00-env.sh
cd $DEPLOY

######################
# Downloading packages
#
wget https://dlcdn.apache.org/tomcat/tomcat-8/v8.5.78/bin/apache-tomcat-8.5.78.tar.gz \
    https://dlcdn.apache.org/lucene/solr/8.11.1/solr-8.11.1.tgz

######################
echo Installing tomcat
#
tar -xf apache-tomcat-8.5.78.tar.gz 
mv apache-tomcat-8.5.78 app-tomcat

######################
echo Installing solr
#
tar -xf solr-8.11.1.tgz
mv solr-8.11.1 app-solr
cp -r $SCRIPT_DIR/vivo-solr/* app-solr

echo Done!