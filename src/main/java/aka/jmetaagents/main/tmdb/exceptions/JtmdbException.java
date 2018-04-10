package aka.jmetaagents.main.tmdb.exceptions;

/**
 * The super class for all exceptions in Jtmdb.
 */
public class JtmdbException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Create exception with text/message.
     *
     * @param text text/message
     */
    public JtmdbException(final String text) {
        super(text);
    }

    /**
     * Create exception with text/message and the cause.
     *
     * @param text text/message
     * @param cause the Throwable that caused the exception
     */
    public JtmdbException(final String text, final Throwable cause) {
        super(text, cause);
    }

}
