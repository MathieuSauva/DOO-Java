package exo54;

import java.util.Scanner;

public class Swap2Integers{
  public static void main(String[] args){
    //Declare variables
    int number1, number2, swap;

    // Prompt and read inputs as "double"
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the first integer: ");
    number1 = in.nextInt();  // read input as int
    System.out.print("Enter the second integer: ");
    number2 = in.nextInt();
    in.close();

    swap = number2;
    number2 = number1;
    number1 = swap;

    System.out.println("After the swap, first integer is: " + number1 + " second integer is: " + number2);
  }
}
