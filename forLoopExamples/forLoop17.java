//Generate the Series... 9 18 27 36 45 54 63 72 81 90.
package forLoopExamples;

public class forLoop17 {
    public static void main(String[] args) {
        System.out.print("Series: ");
        for (int i = 9; i <= 90; i =i+9) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}