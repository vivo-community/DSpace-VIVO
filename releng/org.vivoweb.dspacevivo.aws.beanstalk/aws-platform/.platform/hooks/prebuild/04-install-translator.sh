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
git clone https://bitbucket.org/vivo-workspace/data-format-translator
cd data-format-translator
./install-translator.sh /opt/00-GIT/DSpace-VIVO/deploy/translator

