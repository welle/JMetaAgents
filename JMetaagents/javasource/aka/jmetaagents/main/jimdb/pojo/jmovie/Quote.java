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
public final class Quote {

	@Nullable
    private String qconst;
	@NonNull
    private List<Lines> lines = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public Quote() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param qconstParam String
     * @param linesParam List<Lines>
     */
    public Quote(@Nullable final String qconstParam, @NonNull final List<Lines> linesParam) {
        this.qconst = qconstParam;
        this.lines = linesParam;
    }
    
    /**
     * Get value of qconst.
     *
     * @return String value of qconst
     */
    @Nullable
    public final String getQconst() {
        return this.qconst;
    }
    
    /**
     * Get value of lines.
     *
     * @return List<Lines> value of lines
     */
    @NonNull
    public final List<Lines> getLines() {
        return this.lines;
    }

    
    /**
     * Set value of qconst.
     *
     * @param qconstParam
     */
    public final void setQconst(@Nullable final String qconstParam) {
        this.qconst = qconstParam;
    }
    
    /**
     * Set value of lines.
     *
     * @param linesParam
     */
    public final void getLines(@NonNull final List<Lines> linesParam) {
        this.lines = linesParam;
    }
}
