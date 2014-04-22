
#import "Fraction.h"
#import <stdio.h>

@implementation Fraction
-(void) print {
   printf("%i/%i", numerator, denominator);
}

-(void) setNumerator: (int) n {
   numerator = n;
}

-(void) setDenominator: (int) d {
   denominator = d;
}

-(int) getNumerator {
   return numerator;
}

-(int) getDenominator {
   return denominator;
}
@end
