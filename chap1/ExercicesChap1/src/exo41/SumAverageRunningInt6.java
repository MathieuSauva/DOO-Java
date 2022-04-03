/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
package exo41;

public class SumAverageRunningInt6 {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;

      // Define variables
      int sumOdd  = 0;   // Accumulating sum of odd numbers
      int sumEven = 0;   // Accumulating sum of even numbers
      int absDiff;       // Absolute difference between the two sums

      // Compute sums
      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
         if (number % 2 != 0) {
            sumOdd += number;
         } else {
            sumEven += number;
         }
      }
      // Compute Absolute Difference
      if (sumOdd > sumEven) {
         absDiff = sumOdd-sumEven;
      } else {
         absDiff = sumEven-sumOdd;
      }
      // OR use one liner conditional expression
      absDiff = (sumOdd > sumEven) ? sumOdd-sumEven : sumEven-sumOdd;
      // Compute average in double. Beware that int / int produces int!
      double sumToInt = sum;
      average = sumToInt / (UPPERBOUND-LOWERBOUND+1);
      // Print sum and average
      System.out.println("sum odd : " + sumOdd);
      System.out.println("sum even : " + sumEven);
      System.out.println("absolute difference : " + absDiff);
   }
}
