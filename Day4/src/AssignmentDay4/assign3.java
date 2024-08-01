package AssignmentDay4;

public class CustomException extends Exception {
    private String customMessage;

    public CustomException(String message) {
        this.customMessage = message;
    }

    @Override
    public String getMessage() {
        return "CustomException: " + customMessage;
    }
}

public class assign3 {
    public static void main(String[] args) {
        assign3 test = new assign3();
        
       
        try {
            System.out.println("Starting try block");
            test.callMethodThatThrowsException();
            System.out.println("Ending try block");
        } catch (CustomException e) {
            System.out.println("Starting catch block");
            System.out.println(e.getMessage());
            System.out.println("Ending catch block");
        } finally {
            System.out.println("Finally block: Goodbye!");
        }

       
    }

    public void callMethodThatThrowsException() throws CustomException 
    {	
        System.out.println("Calling methodThatThrowsException");
        methodThatThrowsException();
    }

    public void methodThatThrowsException() throws CustomException {
        throw new CustomException("This is a custom error message");
    }
}
