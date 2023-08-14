//Generate the series... 3 6 9 12 15 18 21 24 27 30.
package doWhileLoopExamples;

public class loop25 {
    public static void main(String[] args) {
        int i = 3;
        do {
            System.out.print(i + " ");
            i =i+ 3;
        } while (i <= 30);
    }
}
