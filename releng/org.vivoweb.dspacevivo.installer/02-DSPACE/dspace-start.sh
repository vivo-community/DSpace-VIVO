#!/bin/bash

# Description:
# Download and run Dspace with Docker-compose

export SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )"
source $SCRIPT_DIR/../00-env.sh
cd $DEPLOY

git clone https://github.com/DSpace/dspace-angular.git
cd dspace-angular
docker-compose -f docker/docker-compose.yml pull
docker-compose -p d7 -f docker/docker-compose.yml -f docker/docker-compose-rest.yml up -d
