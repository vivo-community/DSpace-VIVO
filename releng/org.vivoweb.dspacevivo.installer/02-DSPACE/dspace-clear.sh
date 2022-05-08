#!/bin/bash

# Description: clean up unused volumes
# 

export SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )"
source $SCRIPT_DIR/../00-env.sh
cd $DEPLOY

cd dspace-angular
docker volume rm $(docker volume ls -q)
