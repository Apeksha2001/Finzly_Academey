
//Write a Program To print sum of odd and even no.
package whileLoopExamples;

public class whileLoop9 {
        public static void main(String args[]){
        int i = 1;
        int sumEven=0;
        int sumOdd=0;
        while (i <= 100) {
            if (i % 2==0) {
                sumEven=sumEven+i;
            }else {
                sumOdd=sumOdd+i;
            }
            i++;
        }
            System.out.println("Sum of even number= "+sumEven);
            System.out.println("Sum of odd number= "+sumOdd);

    }
    }