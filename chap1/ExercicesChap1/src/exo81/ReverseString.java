package exo81;

import java.util.Scanner;

public class ReverseString{
  public static void main(String[] args){
    String text;

    Scanner in = new Scanner(System.in);  // Scan the keyboard
    System.out.print("Enter text: ");  // No newline for prompting message
    text = in.next();
    in.close();

    for(int cpt = text.length()-1; cpt >= 0; cpt--){
      System.out.print(text.charAt(cpt));
    }
    System.out.println();
  }
}
