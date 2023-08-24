package ExceptionHandling;

public class DivideByZero {
    public static void main(String args[]){

        try{
            System.out.println(0.1/0);         //Answer = infinity

            //When you perform the division 0.1 / 0, you are dividing a positive non-zero floating-point
            // number (0.1) by zero. According to the IEEE 754 standard, this operation yields a special value,
            // which is positive infinity. Infinity represents a value that is larger than any finite number.

            System.out.println(1/0); //this throw an  exception
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero error");
        }
        finally{
            System.out.println("...");
        }
    }
}
