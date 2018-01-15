#!/bin/sh

git config --global user.email "charlottewelle@yahoo.fr"
git config --global user.name "Welle Charlotte" 
cd /home/travis/repository
git init
git remote add origin https://welle:$GITHUB_API_KEY@github.com/welle/maven-repository.git
git add .
git commit -m "Travis build $TRAVIS_BUILD_NUMBER pushed [skip ci] "
git fetch
git merge origin/master -X ours --allow-unrelated-histories
git push -fq origin master > /dev/null
echo -e "Done\n"