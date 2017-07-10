package aka.jmetaagents.main.jrottentomatoes.exceptions;

/**
 * The super class for all exceptions in JRottenTomatoes.
 */
public class JRottenTomatoesException extends Exception {

    private static final long serialVersionUID = 4959616966104107742L;

    /**
     * Create exception with text/message.
     *
     * @param text text/message
     */
    public JRottenTomatoesException(final String text) {
        super(text);
    }

    /**
     * Create exception with text/message and the cause.
     *
     * @param text text/message
     * @param cause the Throwable that caused the exception
     */
    public JRottenTomatoesException(final String text, final Throwable cause) {
        super(text, cause);
    }

}
