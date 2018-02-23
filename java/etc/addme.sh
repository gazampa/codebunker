#!/bin/bash
d=`pwd`

echo current directory is $d
echo current path is $PATH

x=`grep -o "$d" <<< $PATH`

if [[ ! -z  $x  ]]; then
    echo "path is already there"
else
    echo "adding path..."
    PATH=$d:$PATH
    echo $PATH
fi
