package AssignmentDay4;

public class TestCustomException {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom error message");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
