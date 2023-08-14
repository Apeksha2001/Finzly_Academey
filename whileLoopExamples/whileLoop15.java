// Write a Program To print count of odd No 1 to 25 no.
package whileLoopExamples;

public class whileLoop15{
    public static void main(String args[]){
        int count=0;
        int i=1;
        while(i<=25)
        {
            if(i%2==1){
                count++;
            }
            i++;
        }
        System.out.println("Number of odd  number= "+count);
    }
}
