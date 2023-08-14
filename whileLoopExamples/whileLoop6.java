//Write a Program To print sum of 1 to 50 EVEN nos
package whileLoopExamples;

public class whileLoop6 {
    public static void main(String args[]){
        int i = 1;
        int sum=0;
        while (i <= 50) {
            if (i % 2==0) {
                sum=sum+i;
            }
            i++;
        }
        System.out.println("Sum of Even number between 1 to 50= "+sum);

    }
}