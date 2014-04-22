
#include <stdio.h>
#include <string.h>

#define STRINGSIZE 20

main() {
   char firstName[STRINGSIZE];
   
   printf("Enter in your first name. \n");

   fgets(firstName, STRINGSIZE, stdin);
   //strip newline from fgets
   char* n1 = strchr(firstName, '\n');
   if(n1) *n1 = 0;

   printf("You entered %s.\n", firstName);
   
}
