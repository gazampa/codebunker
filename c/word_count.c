#include <stdio.h>

/** Denis Ritchie's & Brian Kerrighan's word count example **/

#define IN 1
#define OUT 0

main()
{

    const char NEWLINE = '\n';
    const char TAB = '\t';
    char* c = NULL; // int not portable 6.4.4.4.10 - use char *
    int n1, nw, nc, state;

    state = OUT;
    n1 = nw = nc = 0;

    while ( ( *c =  getchar() ) != EOF ) {
        ++nc;
        if ( *c == NEWLINE ){
            ++n1;
        } if ( *c == ' ' || *c == NEWLINE || *c == TAB ) {
            state = OUT;
        } else if ( state == OUT ) {
            state = IN;
            ++nw;
        }
    }

    printf( "%d %d  %d/n", n1, nw, nc );

} 
