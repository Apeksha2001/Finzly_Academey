
//Write a Program To print 1 to 100  even nos.
package whileLoopExamples;

public class whileLoop4 {
    public static void main(String args[]){
        int i = 1;
        while (i <= 100) {
            if (i % 2==0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

    }
}
