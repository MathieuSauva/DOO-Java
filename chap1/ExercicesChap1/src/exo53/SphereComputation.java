package exo53;

import java.util.Scanner;

public class SphereComputation{
  public static void main(String[] args){
    // Declare variables
    double radius, surfaceArea, volume;  // inputs and results - all in double

    // Prompt and read inputs as "double"
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    radius = in.nextDouble();  // read input as double
    in.close();

    // Compute in "double"
    surfaceArea = 4.0 * Math.PI * radius * radius;
    volume = 4.0 /3.0 * Math.PI * radius * radius * radius;   // But this does not work in programming?! Why?

    // Print results using printf() with the following format specifiers:
    //   %.2f for a double with 2 decimal digits
    //   %n for a newline
    System.out.printf("Surface Area is: %.2f%n", surfaceArea);
    System.out.printf("Volume is: %.2f%n", volume);

  }
}
