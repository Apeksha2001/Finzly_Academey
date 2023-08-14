// Generate the Series... 7 14 21 28 35 42 49 56 63 70.
package doWhileLoopExamples;

public class loop26 {
    public static void main(String[] args) {
        int i = 7;
        do {
            System.out.print(i + " ");
            i =i+ 7;
        } while (i <= 70);
    }
}
