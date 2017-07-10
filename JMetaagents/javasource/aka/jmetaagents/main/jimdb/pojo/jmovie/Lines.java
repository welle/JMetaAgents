package aka.jmetaagents.main.jimdb.pojo.jmovie;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Lines {

	@Nullable
    private String quote;
	@NonNull
    private List<Chars> chars = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public Lines() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param quoteParam String
     * @param charsParam List<Chars>
     */
    public Lines(@Nullable final String quoteParam, @NonNull final List<Chars> charsParam) {
        this.quote = quoteParam;
        this.chars = charsParam;
    }
    
    /**
     * Get value of quote.
     *
     * @return String value of quote
     */
    @Nullable
    public final String getQuote() {
        return this.quote;
    }
    
    /**
     * Get value of chars.
     *
     * @return List<Chars> value of chars
     */
    @NonNull
    public final List<Chars> getChars() {
        return this.chars;
    }

    
    /**
     * Set value of quote.
     *
     * @param quoteParam
     */
    public final void setQuote(@Nullable final String quoteParam) {
        this.quote = quoteParam;
    }
    
    /**
     * Set value of chars.
     *
     * @param charsParam
     */
    public final void getChars(@NonNull final List<Chars> charsParam) {
        this.chars = charsParam;
    }
}
