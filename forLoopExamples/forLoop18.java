//Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10.
package forLoopExamples;

public class forLoop18 {
    public static void main(String args[]){
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }

    }

}
