// triggers and classes 
Map<id, ApexTrigger> apexTriggers = new Map<id, apextrigger>([select id, name, LengthWithoutComments from ApexTrigger]);
Map<id, ApexClass> apexClasses = new Map<id, apexclass>([select id, name, LengthWithoutComments from ApexClass]);

Map<String, double> triggers = new Map<String, double>();
Map<String, double> classes = new Map<String, double>();

for ( Id tid : apexTriggers.keyset() ){
  ApexTrigger t = apexTriggers.get(tid);
  system.debug('--- ' + t.name + ' : ' + t.LengthWithoutComments);
}

for ( Id cid : apexClasses.keyset() ){
  ApexClass c = apexClasses.get(cid);
  system.debug('--- ' + c.name + ' : ' + c.LengthWithoutComments);
}