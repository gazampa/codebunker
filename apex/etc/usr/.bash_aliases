#aliases
alias refresh='source ~/.bash_aliases'
alias triggerevent='grep -e " trigger event " *.log > TRIGGER_EVENT.txt'
alias dml='grep -e "DML_BEGIN" *.log | grep -v -e "UOW_EXTRA" > DML.txt'
alias dmlextra='grep -e "DML_BEGIN\|flib->" *.log | grep -v -e "objList->fflib->  ()" > DML_EXTRA.txt'
alias soql='grep -e "SOQL_EXECUTE_BEGIN" *.log > SOQL_MDT.txt'
alias soqlonly='grep -e "SOQL_EXECUTE_BEGIN" *.log | grep -v "__mdt" > SOQL.txt'
alias soqlcnt='grep -e "SOQL_EXECUTE_BEGIN" *.log | grep -v "__mdt" | wc | sed "s/^/soql /g"'
alias soqluniq='cat SOQL.txt | sed -e "s/^.*]|//" | sort | uniq -c | sort -r > SOQL_UNIQUE.txt'
alias soqlwhere='cat SOQL.txt | sed -e "s/^.*from //i" | sort | uniq -c | sort -r > SOQL_WITH_WHERE.txt'
alias soqlonobj='cat SOQL.txt | sed -e "s/^.*from //i" | sed -e "s/where.*$//i" | sort | uniq -c | sort -r > SOQL_ON_OBJECTS.txt'
alias dmlcnt='echo dmls | grep -e "|Type:" *.log | wc | sed "s/^/dml /g"'
alias cus='grep -e "CODE_UNIT_" *.log > CODE_UNITS.txt'
alias meths='grep -e "|METHOD_" *.log > METHODS.txt'
alias dxls='sfdx force:org:list --verbose'
alias dxlsu='sfdx force:org:list --verbose'
alias dxlo='sfdx auth:logout'
alias dxro='sfdx force:apex:execute -f /c/Users/murphw2/code/sfdx/projects/ng-developer/logs/3708/scripts/optimizer_script.txt'
alias dxxa='sfdx force:apex:execute -f anon.apex --loglevel "DEBUG"'
alias dxxl='sfdx force:apex:execute -f anon.apex --loglevel "FATAL" | grep -e "---" | sed -e "s/^.*DEBUG|//"'
alias strip='sed -e "s/^.*---//"'
alias dxc='sfdx force:apex:class:create -d ./force-app/main/default/classes/ -n '
alias dxgetf='sfdx force:source:retrieve -m "ApexClass:'
alias dxget='sfdx force:source:retrieve -x /c/Users/murphw2/code/sfdx/projects/ng-crisdev/package.xml'
#alias dxput='sfdx force:source:deploy -x /c/Users/murphw2/code/sfdx/projects/ng-crisdev/package.xml'
alias dxputf='sfdx force:source:deploy -m "ApexClass:'
alias dxra='sfdx force:apex:test:run'
alias dxrt='sfdx force:apex:test:run --classnames SAF_WorkOrderCreateWSEventLogTest'
alias dxrs='sfdx force:apex:test:run --tests "SAF_WorkOrderHelper_Test.updateEmergencyCase_Test" -r human'
alias dxrsu='sfdx force:apex:test:run -s "SAF_WorkOrders"'
alias dxrtm='sfdx force:apex:test:run -t "SAF_WorkOrderHelper_Test.updateEmergencyCase_Test"'
alias dxrtc='sfdx force:apex:test:run -n '
alias dxrtr='sfdx force:apex:test:report -i '
alias dxla='sfdx force:apex:log:list'
alias dxll='sfdx force:apex:log:list | grep '
alias dxln='sfdx force:apex:log:list | grep '
alias dxlu='sfdx force:apex:log:list -u '
alias dxlg='sfdx force:apex:log:get -d ./logs -u '
alias dxlf='sfdx force:apex:log:get -d ./logs --logid '
alias dxlt="sfdx force:apex:log:tail --color | grep --line-buffered USER_DEBUG | sed -e 's/^.*DEBUG|//'"
alias dxlta='sfdx force:apex:log:tail --color'
alias gdbg="grep --line-buffered USER_DEBUG | sed -e 's/^.*DEBUG|//'"
alias glim='grep -B 1 -A 14 "LIMIT_USAGE_FOR_NS" --color '
alias glimd='grep -A14 "LIMIT_USAGE_FOR_NS|(default)|"'
alias gcus="grep --line-buffered CODE_UNIT_ "
alias gdml="grep --line-buffered DML_BEGIN "
alias gmth="grep --line-buffered METHOD_ENTRY "
alias gsoql="grep --line-buffered 'Number of SOQL queries' "
alias gevt="grep --line-buffered ' trigger event ' "
alias grws="grep -o -E '\w+' "
# alias grwf=" grep -o -E '\w+' upsert_1_soql_less_mdt.log | sort | uniq -ic | sort "
alias dxso='sfdx force:data:soql:query -q '
alias dxan='sfdx force:apex:execute -f ./force-app/main/default/classes/execanon.apex'
alias lsf="find . -maxdepth 1 -type f | sed -e 's/^..//'"
alias lsd="find . -mindepth 1 -maxdepth 1 -type d | sed -e 's/^..//'"
alias lst='ls -lt'
alias lsl='ls -l'
alias lsa='ls -A'
alias lat='ls -at'
alias lsc='ls --color=auto'
alias l='ls -CF --color=auto'
alias ssh-add='ssh-add -t 3600'
alias tcf='tar -cvf'
alias tcz='tar -zcvf'
alias untar='tar -xvf'
alias untarz='tar -zxvf'
alias tls='tar -tvf'
alias tra='tar -rvf'
alias trv='tar tvfW'
alias grepc='grep --color=auto'
alias ssa='source $HOME/scripts/agent-ssh.sh'
alias ssh-add='ssh-add -t 3600'
alias f='sudo find / -name' 
alias jk='javac -classpath $CLASSPATH -d $CLASSES'
alias jj='java -classpath $CLASSPATH'
alias jr='java -jar '
alias ntulp='netstat -tulp'
alias gits='git status'
alias gitl='git log -10'
alias sortn='sort -n -k 1 -t :'
#functions

param_check(){
 if [ $# -eq 0 ]; then
  return;
 fi
 if [ $1 -eq 0 ]; then 
  echo "none";
 else
  echo "some";
 fi
}
tpc(){
 echo $#;
 local params=$(param_check $#);
 if [[ $params == "none" ]]; then
  echo 'no parameters...quitting...';
  return;
 else
  echo 'parameters passed...processing';
 fi
 echo 'finish';
}
dx () {
 sfdx force:apex:execute -f $1 | grep -e "---";
}
dxa () {
 sfdx force:apex:execute -f $1;
}
dxfxa () {
 sfdx force:apex:execute -f anon.apex --loglevel $1;
}
dxfxl () {
 sfdx force:apex:execute -f anon.apex --loglevel $1 | grep -e "---" | sed -e s/^.*---//;
}
dxfrt ()
{
 sfdx force:apex:test:run --classnames $1;
}
dxfget (){
 sfdx force:source:retrieve -m \"ApexClass:$1\";
}
dxfput () {
  sfdx force:source:deploy -m \"ApexClass:$1\";
}
dxfrtm(){
 sfdx force:apex:test:run -t \"$1\";
}
dxflsu(){
  sfdx force:org:display -u $1 --verbose;
}
dxfsoql(){
  echo $1;
  sfdx force:data:soql:query -q $1;  
}
dxfso(){
SOQL_QUERY=$(<this.soql);
echo "$SOQL_QUERY";
sfdx force:data:soql:query -q "$SOQL_QUERY" > results_soql.txt;
#cat results_soql.txt;
}
dxfo(){
  sfdx force:org:open -u $1;
}
logreportf(){
  grep -e " trigger event " $1 > TRIGGER_EVENT.txt;
  grep -e "DML_BEGIN" $1 | grep -v -e "UOW_EXTRA" > DML.txt;
  grep -e "DML_BEGIN\|flib->" $1 | grep -v -e "objList->fflib->  ()" > DML_EXTRA.txt;
  grep -e "SOQL_EXECUTE_BEGIN" $1 > SOQL_MDT.txt;
  grep -e "SOQL_EXECUTE_BEGIN" $1 | grep -v "__mdt" > SOQL.txt;
  grep -e "SOQL_EXECUTE_BEGIN" $1 | grep -v "__mdt" | wc;
  echo dmls | grep -e "|Type:" $1 | wc;
}
logreport(){
  triggerevent;
  dml;
  dmlextra;
  soql;
  soqlonly;
  soqlonobj;
  soqluniq;
  soqlcnt;
  soqlwhere;
  dmlcnt;
  cus;
  meths;
}
soqlcntabove(){
  find ./*.log -type f -size +$1k | xargs grep -e "SOQL_EXECUTE_BEGIN" | grep -v "__mdt" | wc;
}
dellogs(){
  sfdx force:data:soql:query -q "select id from ApexLog where LogUser.Name='$1'" -r "csv" > log_ids.csv;
  sfdx force:data:bulk:delete -s ApexLog -f log_ids.csv;
  rm log_ids.csv;
}
mcd ()
{
  mkdir -p -- "$1" && cd -P -- "$1";
}
ulog ()
{
 sfdx force:apex:log:tail --color | grep --line-buffered USER_DEBUG | sed -e \'s/^.*DEBUG|//\';
}
dxcommaparameters ()
{
 if [ $# -eq 0 ]; then 
  echo "no parameters";
  return 1;
 fi
 arr=("$@");
 local paramList="";
 local loopIndex=0;
 for i in "${arr[@]}"
   do
     if [ $loopIndex -eq 0 ];
     then
      paramList=$i;
     else 
      paramList=$paramList","$i;
     fi
     let loopIndex++;
   done
 echo $paramList;
}

# awk '// {first = $1; $1="";  print $0,first;}'  SOQL_BEGIN_ONLY.txt > SOQL_XLS.txt