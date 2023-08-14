//Generate the Series... 0 1 1 2 3 5 8 13 21.
package whileLoopExamples;

public class whileLoop23 {
        public static void main(String[] args) {
            int num1= 0,num2 = 1;
            System.out.print(num1 + " " + num2 + " ");
            int i = 2;
            while (i < 9) {
                int num3=num1+num2;
                System.out.print(num3 + " ");
                num1=num2;
                num2=num3;
                i++;
            }
            System.out.println();
        }
    }


