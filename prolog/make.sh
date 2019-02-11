#!/bin/bash

echo "$0 $@"
stty sane
export JSRCDIR=../jsrc-out

if [ $# -eq 0 ]
  then
    
    (cls 2>/dev/null)
    clear
    echo "No arguments supplied outping to $JSRCDIR"
    echo ""
    #find $JSRCDIR -name "*.java" -delete -print
    echo ""
    find -name "*.am" -delete -print
    echo ""
    find ./tests -type f -name "*.pl" ! -path '*-*' -exec $0 "{}" \;
    $0 ./cyclic_io.pl
    #find ./library -type f -name "*.pl" ! -path '*-*' ! -path '*/http/*' ! -path '*/pldoc/*'  ! -path '*/doc_*'  ! -path '*/semweb/*' -exec $0 "{}" \;
    #find ./boot -type f -name "*.pl" ! -path '*-*' -exec $0 "{}" \;
    find ./builtin -type f -name "*.pl" ! -path '*-*' -exec $0 "{}" \;
    find ./bench -type f -name "*.pl" ! -path '*-*' -exec $0 "{}" \;
    # $0 ./am2j.pl
    # $0 ./pl2am.pl
   
 
  else

    export BCMD="swipl -l ./am2j.pl -- --plfile $1 --dir $JSRCDIR"	  
    echo "$BCMD"
    stty sane
    $BCMD
    stty sane

#swipl -f /dev/null -l ./am2j.pl -- --plfile $1 --dir ../jsrc
# swipl -f /dev/null -l ./am2j.pl -- --plfile $1 --stemmed $PROLOG_FILE --dirname $PROLOG_DIR --tofile $JAVA_FILE

fi

