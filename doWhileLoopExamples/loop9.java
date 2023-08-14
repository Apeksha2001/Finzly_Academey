// Write a Program To print sum of odd and even no.
package doWhileLoopExamples;

public class loop9 {
    public static void main(String[] args) {
        int i = 1;
        int evenSum=0;
        int oddSum=0;
        do {
            if(i%2==0){
                evenSum=evenSum+i;

            }else{
                oddSum=oddSum+i;
            }
            i++;
        }
        while (i <= 100);
        System.out.println("Even Sum: "+evenSum);
        System.out.println("Odd Sum: "+oddSum);
    }
}