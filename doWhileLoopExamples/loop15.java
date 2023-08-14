//Write a Program To print count of odd No 1 to 25 no.
package doWhileLoopExamples;

public class loop15{
    public static void main(String[] args) {
        int i = 1;
        int count=0;
        do {
            if(i%2!=0){
                count++;
            }
            i++;
        } while (i<=25);
        System.out.print("Number of Odd Numbers: "+count);

    }
}