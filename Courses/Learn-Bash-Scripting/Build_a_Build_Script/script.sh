#!/bin/bash
echo "Welcome"
firstline=$(head -n 1 source/changelog.md)
read -a splitfirstline <<< $firstline
version=${splitfirstline[1]}
echo "You are building version" $version
echo 'Do you want to continue?'
echo '(Enter "1" for yes | Enter "0" for no)'
read versioncontinue
if [ $versioncontinue == 1 ]
then
echo "OK"
for filename in source/*
do
  echo $filename
  if [ "$filename" == "source/secretinfo.md" ]
  then
 #   echo "Not copying" $filename
 cp source/secretinfo.md build/
   sed -i 's/42/XX/' build/secretinfo.md
    else
      echo "Copying" $filename
      cp $filename build/
      fi
  done
elif [ $versioncontinue == 0 ]
then
echo "Please come back when you are ready"
else
echo "Invalid input. Try again later"
fi
cd build/
#AFTER
echo "Build version $version contains:"
ls
cd ..
