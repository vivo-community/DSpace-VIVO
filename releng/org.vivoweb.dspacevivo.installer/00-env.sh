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
export TRANSFORM_HOME=$BUNDLES/org.vivoweb.dspacevivo.transformation
export DSPACEVIVO_HOME=$BUNDLES/org.vivoweb.dspacevivo.vivo
export DSPACEVIVO_PKG_HOME=$BUNDLES/org.vivoweb.dspacevivo

###################################################################
## VIVO Installation Variables
export VIVO_APP_NAME=vivo-dspace
export API_APP_NAME=dspace-vivo-dex
export CATALINA_HOME=$DEPLOY/app-tomcat
export SOLR_DIR=$DEPLOY/app-solr
export VIVO_HOME=$DEPLOY/vivo-home
export PATH=$CATALINA_HOME/bin:$SOLR_DIR/bin:$PATH

###################################################################
## Useful variables for Jena (sparql, json2rdf, xml2json and others)
export TRANSLATOR_HOME=$DEPLOY/translator
export JENA_HOME=$TRANSLATOR_HOME
export JENA_CP=$JENA_HOME/lib
export PATH=$JENA_HOME/bin:$DSPACEVIVO_PKG_HOME/script:$PATH

###################################################################
## Useful variables extracted from runtime.properties
export RUNTIME_PROP=$VIVO_HOME/config/runtime.properties
export ROOT_USER="${ROOT_USER:=$(grep 'rootUser.emailAddress' < $RUNTIME_PROP | tr -d ' ' | cut -f 2 -d "=")}"
export ROOT_PASSWD="${ROOT_PASSWD:=$(grep 'rootUser.password =' < $RUNTIME_PROP | tr -d ' ' | cut -f 2 -d "=")}"




