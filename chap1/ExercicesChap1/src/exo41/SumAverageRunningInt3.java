/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
package exo41;

public class SumAverageRunningInt3 {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;

      int number = LOWERBOUND;         // declare and init loop index variable
      do {
         sum += number;
         ++number;                     // update
      } while (number <= UPPERBOUND);  // test
      // Compute average in double. Beware that int / int produces int!
      double sumToInt = sum;
      average = sumToInt / (UPPERBOUND-LOWERBOUND+1);
      // Print sum and average
      System.out.println("sum : " + sumToInt + " ; " + "average : " + average);
   }
}
