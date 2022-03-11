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

## Variables to setup
# export JAVA_HOME=/opt/jdk1.8.0_281
# export PATH=$PATH:$JAVA_HOME/bin

# export MAVEN_HOME=
# export PATH=$PATH:$MAVEN_HOME/bin

export SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd -P )"
export PGT_HOME=$(cd $SCRIPT_DIR/../../bundles; pwd -P)
export LIB=$PGT_HOME/lib
export TARGET_HOME=$PGT_HOME/ca.uqam.dspace2vivo.model.openapi/target



