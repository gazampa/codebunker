#include <stdio.h>
#include <stdlib.h>

void func(void);

int main(void){
	func();
	return 0;
}

void func(){

	int xStack;
	int xArr[10];
	int *i = ( int * ) malloc( sizeof(int) );
	double *d = ( double * ) malloc( sizeof(double) );

	printf("%zu\n", sizeof(xStack));
	rintf("%zu\n", sizeof(xArr));
	printf("%p\n", (void *)(i));
	printf("%zu\n", sizeof(i));
	printf("%p\n", (void *)(d));
	printf("%zu\n", sizeof(d));

	free(i);
	free(d);
}
