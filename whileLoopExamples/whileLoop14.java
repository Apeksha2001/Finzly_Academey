// Write a Program To print count of even No 1 to 25 no.
package whileLoopExamples;

public class whileLoop14 {
    public static void main(String args[]){
        int count=0;
        int i=1;
        while(i<=25)
        {
            if(i%2==0){
                count++;
            }
            i++;
        }
        System.out.println("Number of even  number= "+count);
    }
}
