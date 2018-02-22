#!/bin/bash
d=`pwd`

echo current directory is $d
echo current path is $PATH

x=`echo $PATH | grep -o "$d"`

if [[ ! -z  $x  ]]; then
    echo "path is already there"
else
    echo "adding path..."
    export PATH=$d:$PATH
    echo $PATH
fi
