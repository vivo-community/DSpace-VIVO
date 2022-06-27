#!/bin/bash 

###################################################################
# Script Name   :
# Description   :
# Args          : 
# Author       	: Michel Héon PhD
# Institution   : Université du Québec à Montréal
# Copyright     : Université du Québec à Montréal (c) 2021
# Email         : heon.michel@uqam.ca
###################################################################
cp -r /var/app/staging/.platform/hooks/resources /tmp
mkdir -p /opt/00-GIT
cat /tmp/resources/etc/jena_profile.txt >> /etc/profile
cat /tmp/resources/etc/maven_profile.txt >> /etc/profile  
wget https://www-eu.apache.org/dist/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz
tar xvf apache-maven-3.6.3-bin.tar.gz -C /usr/lib/



