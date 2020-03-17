package exception;

public class InvalidDataException extends RuntimeException {
    public InvalidDataException(String message, Exception ex){
        super(message, ex);
    }

    public InvalidDataException(String message){
        super(message);
    }
}
