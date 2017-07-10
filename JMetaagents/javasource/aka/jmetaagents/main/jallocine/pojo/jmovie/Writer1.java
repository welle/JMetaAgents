package aka.jmetaagents.main.jallocine.pojo.jmovie;

import java.net.URI;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jallocine.pojo.jmovie.deserializers.URLDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Writer1 {

	@Nullable
    private String code;
	@Nullable
    private String name;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI avatar;

	/**
     * Empty Constructor.
     */
    public Writer1() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam String
     * @param nameParam String
     * @param avatarParam URI
     */
    public Writer1(@Nullable final String codeParam, @Nullable final String nameParam, @Nullable final URI avatarParam) {
        this.code = codeParam;
        this.name = nameParam;
        this.avatar = avatarParam;
    }
    
    /**
     * Get value of code.
     *
     * @return String value of code
     */
    @Nullable
    public final String getCode() {
        return this.code;
    }
    
    /**
     * Get value of name.
     *
     * @return String value of name
     */
    @Nullable
    public final String getName() {
        return this.name;
    }
    
    /**
     * Get value of avatar.
     *
     * @return URI value of avatar
     */
    @Nullable
    public final URI getAvatar() {
        return this.avatar;
    }

    
    /**
     * Set value of code.
     *
     * @param codeParam
     */
    public final void setCode(@Nullable final String codeParam) {
        this.code = codeParam;
    }
    
    /**
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final String nameParam) {
        this.name = nameParam;
    }
    
    /**
     * Set value of avatar.
     *
     * @param avatarParam
     */
    public final void setAvatar(@Nullable final URI avatarParam) {
        this.avatar = avatarParam;
    }
}
