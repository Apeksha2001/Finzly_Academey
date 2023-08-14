//Write a Program To print 1 to 100 Odd nos.
package whileLoopExamples;

public class whileLoop3 {
    public static void main(String args[]){
        int i = 1;
        while (i <= 100) {
            if (i % 2==1) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

    }
}
