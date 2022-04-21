#!/bin/bash
docker-compose -p d7 -f docker/cli.yml -f ./docker/cli.ingest.yml run --rm dspace-cli
