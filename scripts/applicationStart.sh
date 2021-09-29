#!/bin/bash
echo "applicationStart"

cd /home/ubuntu/app

echo "--path--"
pwd
ls

java -jar backend-0.0.1-SNAPSHOT.war