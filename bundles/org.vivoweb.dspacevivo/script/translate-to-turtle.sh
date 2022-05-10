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
DATA=$(realpath $1)
riot --output=RDFXML $DATA > /$TMPDIR/$1.rdf 2>/dev/null
sparql --data=/$TMPDIR/$1.rdf --query=$SCRIPT_DIR/lib/construct.sparql 2>/dev/null 


