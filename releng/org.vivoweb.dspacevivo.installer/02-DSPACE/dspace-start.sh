#!/bin/bash

git clone https://github.com/DSpace/dspace-angular.git
cd dspace-angular
docker-compose -f docker/docker-compose.yml pull
docker-compose -p d7 -f docker/docker-compose.yml -f docker/docker-compose-rest.yml up -d
