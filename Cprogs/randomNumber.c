
#include <stdio.h>
#include <time.h>
#include <stdlib.h>

#define MAX_RANGE 100

//MAX_RANGE defines the random set 0-MAX_RANGE-1
//MAX_RANGE defines the number of times rand() is called
//Each range ran 10 times and the average frequency was taken
//
//RANGE   100     1000     10000     100000
//AVG     4.1      5.5       6.5        8.1
//
//As the number of random numbers y increases in random set r's range of 0 through y-1; the frequency of random number x increases
//*Is this a cause of seeding by time()?

main() {
   
   int randArray[MAX_RANGE] = {0};
   int highestFrequency = 0;
   int highestFrequencyNumber = 0;

   srand(time(NULL));

   //print random number between 0-99 100 times
   //count the occurence of each number
   //to see how random rand() is
   printf("Print 100 random numbers 0-MAX_RANGE-1\n");
   int x;
   for(x = 0; x < MAX_RANGE; x++) {
      int r = rand() % MAX_RANGE ;
      printf("%d\n", r);

      randArray[r] = randArray[r] + 1;
   }

   printf("Print the number of occurences of each value\n");
   int y;
   for(y = 0; y < MAX_RANGE; y++) {
      printf("%d occured %d times\n",y,randArray[y]);
      if(randArray[y] > highestFrequency) { 
         highestFrequency = randArray[y];
         highestFrequencyNumber = y;
      }
   }

   printf("Highest occurence = %d at %d times\n", highestFrequencyNumber, highestFrequency);
}
