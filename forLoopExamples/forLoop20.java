// Generate the Series... 1 10 100 1000
package forLoopExamples;

public class forLoop20 {
    public static void main(String[] args) {
        System.out.print("Series: ");
        for (int i = 1; i <= 1000; i =i*10) {
            System.out.print(i + " ");
        }
    }
}