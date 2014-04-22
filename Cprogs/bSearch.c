#include <stdio.h>

/*functions*/
int getInput(int highValue);
int bSearch(int sKey, int low, int high);

/*globals*/
int NUMBERS[] = {10,12,31,49,52,64,76,80,91,100,101,120,135,144,151,168,177,185,197,206,254,264,254};

int main() 
{
   //get last position of array
   int high = sizeof(NUMBERS) / sizeof(NUMBERS[0]) - 1;
   int key = getInput(NUMBERS[high]);
   int result = bSearch(key, 0, high);
   
   if(result == 1)
   {
      printf("found %d\n", key);
   }else
   {
      printf("not found %d\n", key);
   }
   
   return 0;
}

int getInput(int highValue) 
{
   char userInput[2];

   printf("Please enter a number 1-%d\n", highValue);
   scanf("%s", userInput);
   return atoi(userInput);
}

int bSearch(int sKey, int low, int high)
{  
   int result = 0; 
   int half = (high+low) / 2;
   printf("%d\n", half);

   if(sKey == NUMBERS[half])
   {
      result = 1;
   }
   else if(sKey < NUMBERS[half])
   {
      result = bSearch(sKey, low, half-1);
   }
   else
   {
      result = bSearch(sKey, half+1, high);
   }
   
   return result;
}

