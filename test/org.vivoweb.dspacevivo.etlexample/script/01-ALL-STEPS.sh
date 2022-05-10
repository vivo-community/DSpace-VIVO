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
###################################################################
# Produce all list
###########################
echo run produce-list-of-expertise.sh
produce-list-of-expertise.sh
###########################
echo run produce-list-of-itemtype.sh
produce-list-of-itemtype.sh
###########################
echo run produce-list-of-persons.sh
produce-list-of-persons.sh

###################################################################
# Process transformation
load-data-to-vivo.sh &

transform-map-vivo-doc-type.sh
load-data-doc_type-to-vivo.sh & 

transform-map-vivo-person.sh
load-data-person-to-vivo.sh &

transform-map-vivo-expertises.sh
load-data-expertises-to-vivo.sh &

transform-map-expertise-and-item-to-a-person-to-vivo.sh
load-data-person-expertise-to-vivo.sh 

###################################################################
# Load to VIVO
# load-data-to-vivo.sh
# load-data-doc_type-to-vivo.sh
# load-data-person-to-vivo.sh
# load-data-expertises-to-vivo.sh
# load-data-person-expertise-to-vivo.sh


vivo-recomputeIndex.sh
