import java.io.*;
import java.util.*;

class RootOfNumber {

  static double root(double x, int n) {
    // Checking the edge cases
    if(n==0)
      return 1.000;
    if(n==1)
      return x;
    
    // Initialzing the range at start.
    double low = 0;
    double high = x;
    double mid;
    
    // Binary search approach. Iterative fashion
    while(low<=high) {
      mid = (low + (high - low)/2);
      mid = Math.round(mid * 1000.0) / 1000.0;    // Rounding mid to three decimal places
      
      double tempRes = 1.0000;
      for(int i=n; i>0; i--)
        tempRes*= mid;          // multiply mid n times to get the nth square. So, mid will be Nth root of x
      
      if(tempRes == x)
        return mid;             // Result found, return it
      
      else if(tempRes > x)
        high = mid - 0.001;     // Discard the upper half when our tempRes is greater than x
      else
        low = mid + 0.001;      // Discard the upper half when our tempRes is greater than x
    }
    return Math.round(high * 1000.0)/1000.0;  // Loop ends, return high after rounding to 3 decimal places
  }

  public static void main(String[] args) {

  }

}
