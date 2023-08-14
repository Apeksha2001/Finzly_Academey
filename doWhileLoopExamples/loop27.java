//Generate the Series... 4 8 12 16 20 24 28 32 36 40.
package doWhileLoopExamples;

public class loop27 {
    public static void main(String[] args) {
        int i = 4;
        do {
            System.out.print(i + " ");
            i =i+ 4;
        } while (i <= 40);
    }
}