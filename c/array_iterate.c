#include <stdio.h>

int main(void)
{
  char str[] = "loop with\0 a pointer that points to start of array in memory\n";
  char* p;
  int i;

  p = str;

  /* loop until null is found */
  for(i = 0; p[ i ]; i++)
    printf("%c", p[ i ]);

  return 0;
}

