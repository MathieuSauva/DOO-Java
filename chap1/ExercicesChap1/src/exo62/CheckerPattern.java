package exo62;

import java.util.Scanner;

public class CheckerPattern{
  public static void main(String[] args){
    int size;

    Scanner in = new Scanner(System.in);  // Scan the keyboard for input
    System.out.print("Enter the size: "); // Read next input as "int"
    size = in.nextInt();
    in.close();  // Close Scanner
    // Outer loop to print each of the rows
    // Outer loop to print each of the rows
    for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
       // Inner loop to print each of the columns of a particular row
       for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
          if ((row % 2) == 0) {   // row 2, 4, 6, ...
             System.out.print( " #" );
          }
          else {
            System.out.print( "# " );   // Use print() without newline inside the inner loop  
          }

       }
       // Print a newline after printing all the columns
       System.out.println();
    }
  }
}
