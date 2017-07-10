package aka.jmetaagents.main.jallocine.exceptions;

/**
 * The super class for all exceptions in JAllocine.
 */
public class JAllocineException extends Exception {

    private static final long serialVersionUID = 4094193768187718395L;

    /**
     * Create exception with text/message.
     *
     * @param text text/message
     */
    public JAllocineException(final String text) {
        super(text);
    }

    /**
     * Create exception with text/message and the cause.
     *
     * @param text text/message
     * @param cause the Throwable that caused the exception
     */
    public JAllocineException(final String text, final Throwable cause) {
        super(text, cause);
    }

}
