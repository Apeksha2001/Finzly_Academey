// Generate the Series... 1  3  6  10  15  21  28  36  45.
package forLoopExamples;

public class forLoop21 {
    public static void main(String[] args) {
        System.out.print("Series: ");
        int num=1;
        for (int i = 1; i <= 9; i++) {
            System.out.print(num + " ");
            num=num+i+1;
        }
    }
}