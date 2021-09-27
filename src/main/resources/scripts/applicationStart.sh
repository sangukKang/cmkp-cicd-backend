#!/bin/bash
echo "applicationStart"

cd '/home/ec2-user/app'
nohup java -jar backend-0.0.1-SNAPSHOT.war