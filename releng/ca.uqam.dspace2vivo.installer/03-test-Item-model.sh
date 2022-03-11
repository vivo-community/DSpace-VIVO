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
export SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )"
source $SCRIPT_DIR/00-env.sh
export CLASSPATH=$TARGET_HOME/classes:$TARGET_HOME/test-classes:"$LIB/*"
java -cp $CLASSPATH ca.uqam.dspacevivo.model.TestReadWriteItem 
