package ExceptionHandling;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            validateAge(-8);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void validateAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
        System.out.println("Age is valid");
    }
}
