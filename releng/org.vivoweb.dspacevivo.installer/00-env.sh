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
export DEPLOY=$(cd $SCRIPT_DIR/../../deploy; pwd -P)
export GIT_REPO=$(cd $SCRIPT_DIR/../../../; pwd -P)
export VIVO_PROJECT=$GIT_REPO/VIVO
export VITRO_PROJECT=$GIT_REPO/Vitro
export LIB=$DEPLOY/lib
export TARGET_HOME=$BUNDLES/org.vivoweb.dspacevivo.model.openapi/target

###################################################################
## HOME directory of the various packages

export INSTALLER_HOME=$RELENG/org.vivoweb.dspacevivo.installer
export VOCAB_HOME=$BUNDLES/org.vivoweb.dspacevivo.model.ontologie
export METAMODEL_HOME=$BUNDLES/org.vivoweb.dspacevivo.model.openapi
export DSPACEVIVO_HOME=$BUNDLES/org.vivoweb.dspacevivo.vivo
###################################################################
## VIVO Installation Variables
export VIVO_APP_NAME=vivo-dspace
export CATALINA_HOME=$DEPLOY/app-tomcat
export SOLR_DIR=$DEPLOY/app-solr
export VIVO_HOME=$DEPLOY/vivo-home

export PATH=$CATALINA_HOME/bin:$SOLR_DIR/bin:$PATH



