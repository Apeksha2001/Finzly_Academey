package EggProblem;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
       public static void main(String[] args) {
            long result;
         long mod=1000000007;
            Scanner sc = new Scanner(System.in);


            System.out.println("Enter Number :");
            int number = sc.nextInt();

            long term = 1; // Initialize the first term
            for (int i = 2; i <= number; i++) {
                term = (long) Math.pow(term, i) + term;
                term=term %mod;
            }

         System.out.println("The " + number + "th term is: " + term);
        }

       }




//import java.math.BigInteger;
//
//public class Main {
//    public static void main(String[] args) {
//        BigInteger term = BigInteger.ONE; // Initialize the first term with BigInteger.ONE
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number :");
//        int number = sc.nextInt();
//
//        for (int i = 2; i <= number; i++) {
//            BigInteger iAsBigInt = BigInteger.valueOf(i);
//            term = term.pow(i).add(term); // Calculate the new term using BigInteger methods
//        }
//
//        System.out.println("The " + number + "th term is: " + term);
//
//    }
//}














//            int n = 5; // Change this to the desired term number
//            long result = calculateNthTerm(n);
//            System.out.println("The " + n + "th term is: " + result);
//        }
//
//        public static long calculateNthTerm(int n) {
//
//            long term = 1; // Initialize the first term
//            for (int i = 2; i <= n; i++) {
//                term = (long) Math.pow(term, i) + term;
//            }
//            return term;
//        }


