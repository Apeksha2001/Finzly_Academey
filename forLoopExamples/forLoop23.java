// Generate the Series... 0 1 1 2 3 5 8 13 21.
package forLoopExamples;

public class forLoop23 {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int num3;
        System.out.print("Series: ");
        for (int i = 1; i <=9; i++) {
            System.out.print(num1 + " ");
            num3=num1+num2;
            num1=num2;
            num2=num3;
        }
    }
}