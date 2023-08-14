//Write a Program To print sum of 1 to 50 Odd nos.
package forLoopExamples;

public class forLoop5 {
    public static void main(String args[]){
        int sum=0;
        for(int i=1;i<=50;i++){
            if(i%2==1){
                sum=sum+i;
            }
        }
        System.out.println("Sum of 50 odd numbers= "+sum);
    }
}

