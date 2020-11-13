#!/bin/bash
docker build -t springboot-docker /usr/local/jenkins/springboot-docker
docker stop springboot-docker
docker rm springboot-docker
docker run -d -p 8096:8080 --name springboot-docker --restart=always -e env="dev"  springboot-docker