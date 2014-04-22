
#import <stdio.h>
#import "Add.h"

int main(int argc, const char *argv[]) {

   //Create new instance
   Add *add = [[Add alloc] init];

   int answer;
   int x = 1;
   answer = [add addOne: x];

   printf("%d\n", x);
   printf("Answer = %d\n",answer);

   //free memory
   [add release];

   return 0;
}
