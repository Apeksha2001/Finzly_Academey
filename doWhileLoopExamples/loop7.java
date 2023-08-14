//Write a Program To print -45 to +45 nos.  // negative no and positive no
package doWhileLoopExamples;

public class loop7 {
    public static void main(String[] args) {
        int i = -45;
        do {
            System.out.print(i + " ");
            i++;
        }
        while (i <= 45);
    }
}