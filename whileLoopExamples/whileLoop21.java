//Generate the Series... 1  3  6  10  15  21  28  36  45
package whileLoopExamples;

public class whileLoop21 {
    public static void main(String args[]){
        int i=1;
        int num=1;
        while (num<=45){
            System.out.print(num+" ");
            num=num+i+1;
            i++;

        }
    }
}