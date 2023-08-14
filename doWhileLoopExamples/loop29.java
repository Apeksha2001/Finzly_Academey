//Generate the Series... 1 2 3 4 5 4 3 2 1.
package doWhileLoopExamples;

public class loop29 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i + " ");
            i ++;
        } while (i <= 4);
        int i1 = 4;
        do {
            System.out.print(i + " ");
            i --;
        } while (i >=1);
    }

}