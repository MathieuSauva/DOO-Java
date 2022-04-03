package exo53;

import java.util.Scanner;

public class CylinderComputation{
  public static void main(String[] args){
    // Declare variables
    double radius, height, baseArea, surfaceArea, volume;  // inputs and results - all in double

    // Prompt and read inputs as "double"
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    radius = in.nextDouble();
    System.out.print("Enter the height: ");
    height = in.nextDouble();  // read input as double
    in.close();

    // Compute in "double"
    baseArea = Math.PI * radius * radius;
    surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
    volume = baseArea * height;

    // Print results using printf() with the following format specifiers:
    //   %.2f for a double with 2 decimal digits
    //   %n for a newline
    System.out.printf("Surface Area is: %.2f%n", baseArea);
    System.out.printf("Volume is: %.2f%n", surfaceArea);
    System.out.printf("Volume is: %.2f%n", volume);
  }
}
