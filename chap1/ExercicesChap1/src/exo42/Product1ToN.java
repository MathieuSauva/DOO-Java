package exo42;

public class Product1ToN {
        public static void main (String[] args) {
             // Define variables
            long product = 1;      // The accumulated product, init to 1
            final int LOWERBOUND = 1;
            final int UPPERBOUND = 20;

            int number = LOWERBOUND;

            while(number <= UPPERBOUND){
              product *= number;
              ++number;
            }

            System.out.println("the product between" + LOWERBOUND + " and " + UPPERBOUND + " is " + product);

        }
}

//the product between1 and 10 is 3628800
//the product between1 and 11 is 39916800
//the product between1 and 12 is 479001600
//the product between1 and 13 is 6227020800
//the product between1 and 14 is 87178291200
//the product between1 and 20 is 2432902008176640000
