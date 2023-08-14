//Generate the Series... 8 16 24 32 40 48 56 64 72 80.
package doWhileLoopExamples;

public class loop22 {
    public static void main(String[] args) {
        int i = 8;
        do {
            System.out.print(i + " ");
            i =i+ 8;
        } while (i <= 80);
    }}