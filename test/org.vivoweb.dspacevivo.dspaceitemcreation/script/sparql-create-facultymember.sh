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
############################################################
# Process the input options. Add options as needed.        #
############################################################
# Do help
Help()
{
   # Display Help
   echo "Usage: $0 -e email -f first-name -l last-name [-h help]]"
}
# Get the options
while getopts "he:f:l:" option; do
   case $option in
      h) # display Help
         Help
         exit;;
      e) # Email
         USER_EMAIL=$OPTARG;;
      f) # Enter a Fisrt Name
         USER_FIRST_NAME=$OPTARG;;
      l) # Enter Last Name
         USER_LAST_NAME=$OPTARG;;
     \?) # Invalid option
         echo "Error: Invalid option"
         Help
         exit;;
   esac
done
# Evaluate mandatory options
if [ -z ${USER_EMAIL} ] || [ -z ${USER_FIRST_NAME} ] || [ -z ${USER_LAST_NAME} ] ; then
    echo "Missing arguments"
    Help
    exit 1
fi
############################################################
# Process values 
############################################################

USER_ID=$(echo $USER_EMAIL | tr '.-@' '_')
USER_NAME="$USER_FIRST_NAME, $USER_FIRST_NAME"
echo  "$USER_ID $USER_NAME $USER_LAST_NAME $USER_FIRST_NAME $_USER_EMAIL_" >&2 
sed -e "s|_USER_NAME_|$USER_NAME|g" $RESSOURCES/vivo-template/Person.ttl |\
sed -e "s|_USER_ID_|$USER_ID|g" |\
sed -e "s|_USER_LAST_NAME_|$USER_LAST_NAME|g" |\
sed -e "s|_USER_FIRST_NAME_|$USER_FIRST_NAME|g" |\
sed -e "s|_USER_EMAIL_|$USER_EMAIL|g"

https://api7.dspace.org/server/oai/request?verb=Identify
#_USER_NAME_
#_USER_ID_
#_USER_LAST_NAME_
#_USER_FIRST_NAME_
#_USER_EMAIL_
