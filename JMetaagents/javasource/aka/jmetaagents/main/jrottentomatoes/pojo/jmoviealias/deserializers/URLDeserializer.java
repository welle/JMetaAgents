package aka.jmetaagents.main.jrottentomatoes.pojo.jmoviealias.deserializers;

import java.io.IOException;

import java.net.URI;
import java.net.URISyntaxException;
 
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
public final class URLDeserializer extends JsonDeserializer<URI> {

    @Override
    public final URI deserialize(final JsonParser jsonparser, final DeserializationContext deserializationcontext) throws IOException, JsonProcessingException {
		try {
			final String uriStr = jsonparser.getText();
			final URI uri = new URI(uriStr);
			return uri;
		} catch (final URISyntaxException e) {
			// Nothing to do
		}
        return null;
    }
}