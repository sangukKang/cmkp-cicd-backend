#!/bin/bash
echo "applicationStart"

cd /home/ubuntu/app

echo "--path--"
pwd
ls

nohup java -Xms1024m -Xmx2048m -jar backend-0.0.1-SNAPSHOT.war  </dev/null &>/dev/null &