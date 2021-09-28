#!/bin/bash
echo "afterInstall"

cd /home/ubuntu/source

if [ $? -eq 0  ]
then
  gradle build -x test

  if [ $? -eq 0  ]
  then
    cp -r build/libs/* /home/ubuntu/app
  else
    echo "gradle build fail"
  fi

else
  echo "gradle install fail"
fi