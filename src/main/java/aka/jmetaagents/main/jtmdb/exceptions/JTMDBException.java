package aka.jmetaagents.main.jtmdb.exceptions;

/**
 * The super class for all exceptions in JTMDB.
 */
public class JTMDBException extends Exception {

    private static final long serialVersionUID = 2573064477218287550L;

    /**
     * Create exception with text/message.
     *
     * @param text text/message
     */
    public JTMDBException(final String text) {
        super(text);
    }

    /**
     * Create exception with text/message and the cause.
     *
     * @param text text/message
     * @param cause the Throwable that caused the exception
     */
    public JTMDBException(final String text, final Throwable cause) {
        super(text, cause);
    }

}
