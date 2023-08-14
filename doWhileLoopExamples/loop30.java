//Generate the Series... 6 12 18 24 30 36 42 48 54 60.
package doWhileLoopExamples;

public class loop30 {
    public static void main(String[] args) {
        int i = 6;
        do {
            System.out.print(i + " ");
            i =i+ 6;
        } while (i <= 60);
    }

}