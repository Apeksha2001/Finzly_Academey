//Generate the Series... 1 10 100 1000.
package doWhileLoopExamples;

public class loop20 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i + " ");
            i =i*10;
        } while (i <= 1000);
    }}