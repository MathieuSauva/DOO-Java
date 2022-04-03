package exo44;

public class ComputePI {
        public static void main(String[] args){
          double sum = 0.0;
          int MAX_DENOMINATOR = 1000;   // Try 10000, 100000, 1000000
          for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
                // denominator = 1, 3, 5, 7, ..., MAX_DENOMINATOR
             if (denominator % 4 == 1) {
                sum += (1.0 / denominator);
             } else if (denominator % 4 == 3) {
                sum -= (1.0 / denominator);
             } else {   // remainder of 0 or 2
                System.out.println("Impossible!!!");
             }
          }
          double PI = sum * 4;

          System.out.println("PI = " + PI);
        }
}
