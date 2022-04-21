#!/bin/bash
docker-compose -p d7 -f docker/docker-compose.yml -f docker/docker-compose-rest.yml down
