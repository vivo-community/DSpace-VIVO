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
source /etc/profile
if [ ! -d "/opt/vivo/home/config" ]; then
	mkdir -p /opt/vivo/home/config
	cp -r /tmp/resources/vivo/* /opt/vivo/home/
	chown -R tomcat:tomcat /opt/vivo
fi


