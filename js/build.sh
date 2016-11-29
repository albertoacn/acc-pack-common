#!/bin/bash
set -e
<<<<<<< HEAD
task="$1"
reltype="$2"

if [[ "$task" == "-np" && "$reltype" != "patch" && "$reltype" != "minor" && "$reltype" != "major" ]];
then
	echo Invalid second parameter.  Please specify 'patch', 'minor' or 'major'.
	exit 1
fi
=======
>>>>>>> upstream/sdk-wrapper

if [[ -d src ]]
then
	gulp dist
	gulp zip
<<<<<<< HEAD
=======
  cd dist

>>>>>>> upstream/sdk-wrapper
else
	echo "Please run this script from 'JS'."
	exit 1
fi
<<<<<<< HEAD

if [[ $task == "-np" ]]
then
	npm version $reltype
	git add .
	git commit -m "New build. Bump npm version."
	npm publish
fi
=======
>>>>>>> upstream/sdk-wrapper
