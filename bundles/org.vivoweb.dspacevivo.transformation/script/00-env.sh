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
export ENV_SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd -P)"
source $ENV_SCRIPT_DIR/../../../releng/org.vivoweb.dspacevivo.installer/00-env.sh
export PATH=$LOC_SCRIPT_DIR:$PATH
export RUNTIME_PROP=$VIVO_HOME/config/runtime.properties
export ROOT_USER="${ROOT_USER:=$(grep 'rootUser.emailAddress' < $RUNTIME_PROP | tr -d ' ' | cut -f 2 -d "=")}"
export ROOT_PASSWD="${ROOT_PASSWD:=$(grep 'rootUser.password =' < $RUNTIME_PROP | tr -d ' ' | cut -f 2 -d "=")}"
