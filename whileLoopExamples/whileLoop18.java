//Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10.
package whileLoopExamples;

public class whileLoop18 {
        public static void main(String[] args) {
            int i = 1;
            while (i <= 10) {
                if (i % 2 == 0) {
                    System.out.print(-i + " ");
                } else {
                    System.out.print(i + " ");
                }
                i++;
            }
            System.out.println();
        }
    }

