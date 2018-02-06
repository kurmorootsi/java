package exceptions;


public class StackEmptyException extends ArrayIndexOutOfBoundsException {

    public StackEmptyException(String message) {
        super(message);
    }
}
