#include <stdio.h>

#define LOWER  0
#define UPPER  300
#define STEP   20

/** Denis Ritchie's and Brin Kerrighan's temp converter **/

main()
{

    int fahr, celsius;

    fahr = LOWER;

    for ( fahr = LOWER; fahr <= UPPER; fahr = fahr + STEP ) {
        printf( "%d\t%d\n", fahr, celsius );
    }

}

//    while ( fahr <= UPPER ) {
//        celsius = 5 * ( fahr - 32 ) / 9;
//        printf( "%d\t%d\n", fahr, celsius );
//        fahr = fahr + STEP;
//    }
