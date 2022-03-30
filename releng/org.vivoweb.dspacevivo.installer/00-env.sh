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

###################################################################
## Variables to setup
# export JAVA_HOME=/opt/jdk1.8.0_281
# export PATH=$PATH:$JAVA_HOME/bin
# export MAVEN_HOME=
# export PATH=$PATH:$MAVEN_HOME/bin


###################################################################
## Root variables
export SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd -P )"
export BUNDLES=$(cd $SCRIPT_DIR/../../bundles; pwd -P)
export RELENG=$(cd $SCRIPT_DIR/../../releng; pwd -P)
export LIB=$BUNDLES/lib
export TARGET_HOME=$BUNDLES/org.vivoweb.dspacevivo.model.openapi/target

###################################################################
## HOME directory of the various packages

export INSTALLER_HOME=$RELENG/org.vivoweb.dspacevivo.installer
export VOCAB_HOME=$BUNDLES/org.vivoweb.dspacevivo.model.ontologie
export METAMODEL_HOME=$BUNDLES/org.vivoweb.dspacevivo.model.openapi


