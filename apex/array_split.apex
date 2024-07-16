Integer[] arrInt = new Integer[25];

system.debug('--- ' + arrInt);

for (Integer i = 0; i < 25; i++){
    arrInt[i] = Integer.valueOF(Math.random()*100);
}

system.debug('--- ' + arrInt);
integer count = 0;
splitArray(0, arrInt.size(), 'first');

static void splitArray(integer low, integer high, String order){
    system.debug('--- ' + order + ' : ' + low + ' : ' + high + ' : ' + count);
    count++;
    integer midpoint = low + ( high-low) / 2;
    if ( low < high ){
        splitArray(low, midpoint, 'lower');
        splitArray(midpoint+1, high, 'upper');
    }
}
