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
export TEST_SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd -P)"
source $TEST_SCRIPT_DIR/../../../releng/org.vivoweb.dspacevivo.installer/00-env.sh
export PATH=$TEST_SCRIPT_DIR:$DSPACEVIVO_PKG_HOME/script:$PATH
export RESSOURCES=$(cd $TEST_SCRIPT_DIR/../src/test/resources; pwd -P) # Resource directory where the sample data is located

