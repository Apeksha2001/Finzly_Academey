package ExceptionHandling.CustomException;

public class CustomEx {

    void m1() throws ApekshaNotFoundException {
        throw new ApekshaNotFoundException() ;
    }

    public static void main(String args[]){
        CustomEx customEx=new CustomEx();
        try {

            customEx.m1();
        }catch (ApekshaNotFoundException e){
            System.out.println("Custom Exception Caught");
        }
    }
}
