
if [ $# -eq 0 ]
  then	
    echo "No arguments supplied"

  find ./ -type f -name "*.pl" ! -path '*-*' -exec $0 "{}" \;

 
  else

echo swipl -f /dev/null -l ./am2j.pl -- --plfile $1 --dir ../jsrc
swipl -f /dev/null -l ./am2j.pl -- --plfile $1 --dir ../jsrc
# swipl -f /dev/null -l ./am2j.pl -- --plfile $1 --stemmed $PROLOG_FILE --dirname $PROLOG_DIR --tofile $JAVA_FILE

fi

