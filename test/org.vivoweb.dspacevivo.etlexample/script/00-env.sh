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
export LOC_SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd -P)"
source $LOC_SCRIPT_DIR/../../../releng/org.vivoweb.dspacevivo.installer/00-env.sh 
export WORKDIR=$(cd $LOC_SCRIPT_DIR/../; pwd -P)
export JAVA_CONF_PROPERTIES=$LOC_SCRIPT_DIR/../src/main/resources/harvester.conf 
function prop {
    grep "${1}" ${JAVA_CONF_PROPERTIES}|cut -d'=' -f2
}
export ETL_DIR_EXTRACT=$PRJ_DIR/$(prop etl.dir.extract)
export ETL_DIR_TRANSFORM=$PRJ_DIR/$(prop etl.dir.transform)




