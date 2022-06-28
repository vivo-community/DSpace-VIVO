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
echo "at now + 10 minute -f /usr/local/bin/etl_script.sh" > /tmp/run-etl.log
at now + 10 minute -f /usr/local/bin/etl_script.sh

