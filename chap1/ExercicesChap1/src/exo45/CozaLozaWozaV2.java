package exo45;

public class CozaLozaWozaV2 {   // Save as "CozaLozaWoza.java"
   public static void main(String[] args) {
      final int LOWERBOUND = 1, UPPERBOUND = 110;
      boolean printed;
      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
        printed = false;  // init before processing each number
        // Print "Coza" if number is divisible by 3
        if ( number % 3 == 0 ) {
           System.out.print( "Coza" );
           printed = true;   // processed!
        }
        // Print "Loza" if number is divisible by 5
        if ( number % 5 == 0 ) {
           System.out.print( "Loza" );
           printed = true;   // processed!
        }
        // Print "Woza" if number is divisible by 7
        if ( number % 7 == 0 ) {
           System.out.print( "Woza" );
           printed = true;   // processed!
        }
        // Print the number if it has not been processed
        if (!printed) {
           System.out.print(number);
        }
        // After processing the number, print a newline if it is divisible by 11;
        // else, print a space
        if ( number % 11 == 0 ) {
           System.out.println();  // print newline
        } else {
           System.out.print(" ");  // print a space
        }
      }
   }
}
