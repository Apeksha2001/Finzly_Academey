//Write a Program To print count of even No 1 to 25 no.
package doWhileLoopExamples;

public class loop14 {
    public static void main(String[] args) {
        int i = 1;
        int count=0;
        do {
            if(i%2==0){
                count++;
            }
            i++;
        } while (i<=25);
        System.out.print("Number of Even Numbers: "+count);

    }
}