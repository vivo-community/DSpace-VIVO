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
export RELENG_SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd -P )"
source $RELENG_SCRIPT_DIR/lib/cleanup.sh
export BUNDLES=$(cd $RELENG_SCRIPT_DIR/../../bundles; pwd -P)
export RELENG=$(cd $RELENG_SCRIPT_DIR/../../releng; pwd -P)
export DEPLOY=$(cd $RELENG_SCRIPT_DIR/../../deploy; pwd -P)
export TEST=$(cd $RELENG_SCRIPT_DIR/../../test; pwd -P)
export GIT_REPO=$(cd $RELENG_SCRIPT_DIR/../../../; pwd -P)
export VIVO_PROJECT=$GIT_REPO/VIVO
export VITRO_PROJECT=$GIT_REPO/Vitro
export DSPACE_BRANCH=$GIT_REPO/DSpace
export DSPACE_FRONT_BRANCH=$GIT_REPO/dspace-angular
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

export CATALINA_HOME=$DEPLOY/app-tomcat
export SOLR_DIR=$DEPLOY/app-solr
export VIVO_HOME=$DEPLOY/vivo-home
export DSPACE_UI_HOME=$DEPLOY/dspace-ui
export DSPACE_HOME=$DEPLOY/dspace
source $RELENG_SCRIPT_DIR/00-env-vivo-url.sh
#[ -v VIVO_URL ] || export VIVO_URL=http://localhost:8080/$VIVO_APP_NAME
export PATH=$CATALINA_HOME/bin:$SOLR_DIR/bin:$DSPACE_HOME/bin:$PATH

###################################################################
## Useful variables for Jena (sparql, json2rdf, xml2json and others)
export TRANSLATOR_HOME=$DEPLOY/translator
export JENA_HOME=$TRANSLATOR_HOME
export JENA_CP=$JENA_HOME/lib
export PATH=$PATH:$JENA_HOME/bin:$DSPACEVIVO_PKG_HOME/script:$DSPACE_HOME/bin

###################################################################
## Useful variables extracted from runtime.properties
export RUNTIME_PROP=$VIVO_HOME/config/runtime.properties
# if test -f "$RUNTIME_PROP"; then
#	export ROOT_USER="${ROOT_USER:=$(grep 'rootUser.emailAddress' < $RUNTIME_PROP | tr -d ' ' | cut -f 2 -d "=")}"
#	export ROOT_PASSWD="${ROOT_PASSWD:=$(grep 'rootUser.password =' < $RUNTIME_PROP | tr -d ' ' | cut -f 2 -d "=")}"
#fi

[ -v ROOT_PASSWD ] || export ROOT_PASSWD=$(grep 'rootUser.password =' < $RUNTIME_PROP | tr -d ' ' | cut -f 2 -d '=')
[ -v ROOT_USER ] || export ROOT_USER=$(grep 'rootUser.emailAddress' < $RUNTIME_PROP | tr -d ' ' | cut -f 2 -d '=')
alias vivo_passwd="echo $ROOT_PASSWD"
alias vivo_user="echo $ROOT_USER"

###################################################################
## Variables for dspace backend/frontend runtime
# "ui" section
export DSPACE_UI_SSL=false
export DSPACE_UI_HOST=localhost
export DSPACE_UI_PORT=4000
export DSPACE_UI_NAMESPACE=/
 
# "rest" section
export DSPACE_REST_SSL=false
export DSPACE_REST_HOST=localhost
export DSPACE_REST_PORT=8080
export DSPACE_REST_NAMESPACE=/server




