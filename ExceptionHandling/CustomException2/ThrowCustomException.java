package ExceptionHandling.CustomException2;

public class ThrowCustomException {
    public static void Number(int number) throws CustomException{
        if(number<0){
            throw new CustomException("Negative Number Are Not Allowed");
        }
        System.out.println("Number: "+number);
    }

    public static void main(String args[]) {
        try{
            Number(4);
            Number(-1);
        }
        catch (CustomException e){
            System.out.println("Custom Exception Caught: "+e.getMessage());
        }

    }

}
