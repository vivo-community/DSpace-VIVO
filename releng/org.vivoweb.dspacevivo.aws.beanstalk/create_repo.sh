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
source $SCRIPT_DIR/00-env.sh

export DATA_DIR=$(cd $WORKDIR/data ; pwd -P)
export DATA_DIR=$(cd $WORKDIR/data_src_dspace6 ; pwd -P)
export DATA_DIR=$WORKDIR/data_src_dspace7

###################################################################
# Data transition sub-directories for each step of the ETL process
export ETL_DIR_EXTRACT=$DATA_DIR/extract
export ETL_DIR_TRANSFORM=$DATA_DIR/transform
export ETL_DIR_TRANSFORM_DOC_TYPE=${ETL_DIR_TRANSFORM}_doc_type
export ETL_DIR_TRANSFORM_PERSON=${ETL_DIR_TRANSFORM}_person
export ETL_DIR_TRANSFORM_EXPERTISES=${ETL_DIR_TRANSFORM}_expertises
export ETL_DIR_TRANSFORM_PERSON_EXPERTISES=${ETL_DIR_TRANSFORM}_person_expertises


mkdir -p $ETL_DIR_EXTRACT
mkdir -p $ETL_DIR_TRANSFORM
mkdir -p $ETL_DIR_TRANSFORM_DOC_TYPE
mkdir -p $ETL_DIR_TRANSFORM_PERSON
mkdir -p $ETL_DIR_TRANSFORM_EXPERTISES
mkdir -p $ETL_DIR_TRANSFORM_PERSON_EXPERTISES
