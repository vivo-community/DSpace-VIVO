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

rm -fr $LOC_SCRIPT_DIR/data $LOC_SCRIPT_DIR/data_src_dspace6 $LOC_SCRIPT_DIR/data_src_dspace7

mkdir -p $LOC_SCRIPT_DIR/data
cd $LOC_SCRIPT_DIR/data
mkdir -p extract transform transform_doc_type transform_person transform_expertises transform_person_expertises

mkdir -p $LOC_SCRIPT_DIR/data_src_dspace6
cd $LOC_SCRIPT_DIR/data_src_dspace6
mkdir -p extract transform

mkdir -p $LOC_SCRIPT_DIR/data_src_dspace7
cd $LOC_SCRIPT_DIR/data_src_dspace7
mkdir -p extract transform

