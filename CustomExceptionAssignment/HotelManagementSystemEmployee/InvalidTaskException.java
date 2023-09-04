package CustomExceptionAssignment.HotelManagementSystemEmployee;

class InvalidTaskException extends Exception {
    public InvalidTaskException(String message) {
        super(message);
    }
}