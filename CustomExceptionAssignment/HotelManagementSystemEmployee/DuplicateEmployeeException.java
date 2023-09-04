package CustomExceptionAssignment.HotelManagementSystemEmployee;

class DuplicateEmployeeException extends Exception {
    public DuplicateEmployeeException(String message) {
        super(message);
    }
}