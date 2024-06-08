package ErrorHandling;

public class SyntaxError extends  IllegalArgumentException{
    public SyntaxError(String message) {
        super(message);
    }

}
