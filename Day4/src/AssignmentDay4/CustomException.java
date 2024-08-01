package AssignmentDay4;

public class CustomException extends Exception 
{
    private String customMessage;

    public CustomException(String message)
    {
        this.customMessage = message;
    }

    @Override
    public String getMessage() {
        return "CustomException: " + customMessage;
    }
}

