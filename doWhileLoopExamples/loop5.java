// Write a Program To print sum of 1 to 50 Odd nos.
package doWhileLoopExamples;

public class loop5 {
    public static void main(String[] args) {
        int i = 1;
        int sum=0;
        do {
            if(i%2!=0){
               sum=sum+i;
            }
            i++;
        } while (i<=50);
        System.out.print("Sum : "+sum);
    }
}