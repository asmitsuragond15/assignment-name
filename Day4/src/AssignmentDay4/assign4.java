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

public class assign4 {
    public static void main(String[] args) {
        assign4 test = new assign4();
    
     
        try {
            System.out.println("Starting try block with System.exit(0)");
            System.exit(0);
            System.out.println("This won't be printed");
        } finally {
            System.out.println("Finally block after System.exit(0): Goodbye!");
        }
        
    }

 
}
