// Write a Program To print 1 to 100 even nos.
package doWhileLoopExamples;

public class loop4 {
    public static void main(String[] args) {
        int i = 1;
        System.out.print("Even Numbers: ");
        do {
            if(i%2==0){
                System.out.print(i + " ");
            }
            i++;
        } while (i<=100);
    }
}