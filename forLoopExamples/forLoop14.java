
//Write a Program To print count of even No 1 to 25 no.
package forLoopExamples;

public class forLoop14 {
    public static void main(String args[]){
        int count=0;
        for(int i=1;i<=25;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("Number of even  number= "+count);
    }
}
