
#include <stdio.h>

main() {
   int *ptr;
   int value = 1;

   //print address of ptr
   printf("Address of 'ptr' = %d\n", &ptr);

   //print address of value
   printf("Address of 'value' = %d\n", &value);

   //ptr now has the address of value
   printf("Assign address of 'value' to 'ptr'\n");
   ptr = &value;
   printf("Value of 'ptr' = %d\n", ptr);

   //dereference print the value at ptr
   printf("Value @ 'ptr' = %d\n", *ptr);
}
