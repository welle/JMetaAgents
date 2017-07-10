package aka.jmetaagents.main.jimdb.exceptions;

/**
 * The super class for all exceptions in JImdb.
 */
public class JIMDBException extends Exception {

    private static final long serialVersionUID = 3664259146436839201L;

    /**
     * Create exception with text/message.
     *
     * @param text text/message
     */
    public JIMDBException(final String text) {
        super(text);
    }

    /**
     * Create exception with text/message and the cause.
     *
     * @param text text/message
     * @param cause the Throwable that caused the exception
     */
    public JIMDBException(final String text, final Throwable cause) {
        super(text, cause);
    }

}
