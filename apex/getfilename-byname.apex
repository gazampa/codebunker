List<ApexClass> classes = [select name from ApexClass where name like 'GBE%_Test%'];

for ( ApexClass cl : classes ){

    System.debug('<runTest>' + cl.name + '</runTest>');

}

System.debug('no of tests : ' + classes.size());

//grep runTest null | sed -e 's/^.*DEBUG|//'
