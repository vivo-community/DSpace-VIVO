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
PATH=$LOC_SCRIPT_DIR:$PATH
export WORKDIR=$(cd $LOC_SCRIPT_DIR/../; pwd -P)
export RESSOURCESDIR=$(cd $WORKDIR/src/main/resources ; pwd -P)
export MAPPING_DATA_DIR=$(cd $RESSOURCESDIR/mapping_data ; pwd -P)
export QUERY_DIR=$(cd $RESSOURCESDIR/query ; pwd -P)
export JAVA_CONF_PROPERTIES=$(realpath $RESSOURCESDIR/harvester.conf) 
function prop {
    grep "${1}" ${JAVA_CONF_PROPERTIES}|cut -d'=' -f2
}
export ETL_DIR_EXTRACT=$WORKDIR/$(prop etl.dir.extract)
export ETL_DIR_TRANSFORM=$WORKDIR/$(prop etl.dir.transform)
export ETL_DIR_TRANSFORM_DOC_TYPE=$(cd ${ETL_DIR_TRANSFORM}_doc_type ; pwd -P)
export ETL_DIR_TRANSFORM_PERSON=$(cd ${ETL_DIR_TRANSFORM}_person ; pwd -P)
export ETL_DIR_TRANSFORM_EXPERTISES=$(cd ${ETL_DIR_TRANSFORM}_expertises ; pwd -P)
export ETL_DIR_TRANSFORM_PERSON_EXPERTISES=$(cd ${ETL_DIR_TRANSFORM}_person_expertises ; pwd -P)

# Link https://duraspace.org/registry/?filter_10=DSpace






