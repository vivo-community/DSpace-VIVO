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
/usr/local/bin/etl_script.sh &
echo "/usr/local/bin/etl_script.sh is send " > /tmp/run-etl.log 
