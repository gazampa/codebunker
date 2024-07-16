Map<String, Maximo_SF_Data_Mapping__mdt> metamap = Maximo_SF_Data_Mapping__mdt.getAll();

for ( String key : metamap.keyset() ){

    System.debug('---' + key + ' : ' + metamap.get(key)) ;

}