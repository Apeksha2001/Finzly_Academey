//Generate the Series... 0 1 1 2 3 5 8 13 21.
package doWhileLoopExamples;

public class loop23 {
    public static void main(String[] args) {
        int a=0,b=1,fib,i=1;
        do {
            System.out.print(a + " ");
            fib = a + b;
            a = b;
            b = fib;
            i++;
        }
        while (i <= 9);
    }
}
