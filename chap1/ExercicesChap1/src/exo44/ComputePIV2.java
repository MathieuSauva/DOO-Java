package exo44;

public class ComputePIV2 {
        public static void main(String[] args){
          int MAX_TERM = 10000;  // number of terms used in computation
          double sum = 0.0;
          for (int term = 1; term <= MAX_TERM; term++) {  // term = 1, 2, 3, ..., MAX_TERM
                // term = 1, 2, 3, 4, ..., MAX_TERM
             if (term % 2 == 1) {  // odd term number: add
                sum += 1.0 / (term * 2 - 1);
             } else {              // even term number: subtract
                sum -= 1.0 / (term * 2 - 1);
             }
          }
          double PI = sum * 4;
          double compareValue = (PI / Math.PI) * 100;

          System.out.println("PI = " + PI);
          System.out.println("compare of math.pi and PI obtained = " + compareValue);
        }
}
