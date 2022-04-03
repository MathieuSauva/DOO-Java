/**
 * Print first 20 Tribonacci numbers and their average
 */
package exo1210;

public class Tribonacci {
   public static void main (String[] args) {
      int n = 4;          // The index n for F(n), starting from n=3, as n=1 and n=2 are pre-defined
      int tn;             // F(n) to be computed
      int tnMinus1 = 1;   // F(n-1), init to F(2)
      int tnMinus2 = 1;   // F(n-2), init to F(1)
      int tnMinus3 = 2;
      int nMax = 20;      // maximum n, inclusive
      int sum = tnMinus1 + tnMinus2;  // Need sum to compute average
      double average;

      System.out.println("The first " + nMax + " Fibonacci numbers are:");
      System.out.print(" " + tnMinus1);
      System.out.print(" " + tnMinus2);
      System.out.print(" " + tnMinus3);


      while (n <= nMax) {  // n starts from 3
            // n = 3, 4, 5, ..., nMax
         // Compute F(n), print it and add to sum
         tn = tnMinus1 + tnMinus2 + tnMinus3;
         sum += tn;
         // Increment the index n and shift the numbers for the next iteration
         ++n;

         if( tnMinus2 > 1 ){
            tnMinus3 = tnMinus2;
         }
         tnMinus2 = tnMinus1;
         tnMinus1 = tn;

         System.out.print(" " + tn);
      }

      // Compute and display the average (=sum/nMax).
      // Beware that int/int gives int.
      double sumToDouble = sum;
      average = (sumToDouble / nMax);
      System.out.println();
      System.out.println("average = " + average);

   }
}
