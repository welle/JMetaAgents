package aka.jmetaagents.main.omdb.exceptions;

/**
 * The super class for all exceptions in Jomdb.
 */
public class JomdbException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Create exception with text/message.
     *
     * @param text text/message
     */
    public JomdbException(final String text) {
        super(text);
    }

    /**
     * Create exception with text/message and the cause.
     *
     * @param text text/message
     * @param cause the Throwable that caused the exception
     */
    public JomdbException(final String text, final Throwable cause) {
        super(text, cause);
    }

}
