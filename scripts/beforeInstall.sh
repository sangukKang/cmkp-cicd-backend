#!/bin/bash
echo "beforeInstall"

pkill -9 java

if [ -d "/home/ubuntu/source" ]
then
   echo exist directory
   rm -rf /home/ubuntu/source/*
else
   echo not exist directory
   mkdir -p /home/ubuntu/source
fi

if [ -d "/home/ubuntu/app" ]
then
   echo exist directory
   rm -rf /home/ubuntu/app/*
else
   echo not exist directory
   mkdir -p /home/ubuntu/app
fi