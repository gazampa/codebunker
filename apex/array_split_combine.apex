Integer[] arrInt = new Integer[25];
Integer[] tmpArr = new Integer[25];

system.debug('--- ' + arrInt);

for (Integer i = 0; i < 25; i++){
    arrInt[i] = Integer.valueOF(Math.random()*100);
}

system.debug('--- ' + arrInt);
integer count = 0;
integer lvl = 0;
splitArray(0, arrInt.size()-1, 'first', lvl);
system.debug('--- finished' + arrInt);

static void splitArray(integer low, integer high, String order, integer lvl){
    system.debug('--- ' + count  + ' : ' +  order + ' : ' + low + ' : ' + high + ' : ' + lvl + ' : [ ' + numbers[low] + ' ] : [ ' + numbers[high] + ' ]');
    count++; lvl++;
    integer midpoint = low + ( high-low) / 2;
    if ( low < high ){
        splitArray(low, midpoint, 'lower', lvl);
        splitArray(midpoint+1, high, 'upper', lvl);
        combine(low, midpoint, high);
    }
}

static void combine( integer low, integer mid, integer high){
    system.debug('--- combining ' + low + ' : ' + mid + ' : ' + high );
    for (integer i = low; i <= high; i++ ){
        tmpArr[i] = arrInt[i];
    }

    integer ilow = low;
    integer jmid = mid + 1;
    integer klow = low;
    // copy smallest from left or right back to original <-- use a results array or save space
    while ( ilow <=mid && jmid <= high ){
        if ( tmpArr[ilow] <= tmpArr[jmid]){
            arrInt[klow] = tmpArr[ilow];
            iLow++;
        } else {
            arrInt[klow] = tmpArr[jmid];
            jmid++;
        }
        klow++;
    }
    while ( ilow <=mid ){
        arrInt[klow] = tmpArr[ilow];
        klow++;ilow++;
    }

}