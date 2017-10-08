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

	printf("%d\n", sizeof(xStack));
	rintf("%d\n", sizeof(xArr));
	printf("%p\n", (void *)(i));
	printf("%d\n", sizeof(i));
	printf("%p\n", (void *)(d));
	printf("%d\n", sizeof(d));

	free(i);
	free(d);
}
