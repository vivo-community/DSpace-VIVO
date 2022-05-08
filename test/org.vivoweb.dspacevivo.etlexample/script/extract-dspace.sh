#!/bin/bash -x
 
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
cd $WORKDIR
CLASSPATH=$(find "$LIB" -name '*.jar' -printf '%p:' | sed 's/:$//')
java  org.vivoweb.dspacevivo.etlexample.HarvestDSpace

#-cp "/home/heon/01-SPRINT/00-PROJET-DSPACE-VIVO/SPRINT-3/00-GIT/DSpace-VIVO/test/org.vivoweb.dspacevivo.etlexample/src/main/resources/:/home/heon/01-SPRINT/00-PROJET-DSPACE-VIVO/SPRINT-3/00-GIT/DSpace-VIVO/test/org.vivoweb.dspacevivo.etlexample/target/org.vivoweb.dspacevivo.etlexample-0.0.1-SNAPSHOT.jar:$LIB/*"

