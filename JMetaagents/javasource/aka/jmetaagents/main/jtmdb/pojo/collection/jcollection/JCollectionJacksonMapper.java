package aka.jmetaagents.main.jtmdb.pojo.collection.jcollection;

import java.io.IOException;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */
public final class JCollectionJacksonMapper {

    /**
     * Method to deserialize JSON content into a non-container type.
     *
     * @param jsonString
     *            JSon string to be deserialize.
     * @return JCollection.
     * @throws IOException
     * @throws JsonParseException
     *             when non-well-formed content (content that does not conform
     *             to JSON syntax as per specification) is encountered.
     */
    @Nullable
    public static JCollection readValue(@NonNull final String jsonString) throws JsonParseException, IOException {
        JCollection result = null;

        if (jsonString.trim().length() > 0) {
            final ObjectMapper objectMapper = new ObjectMapper();
            final JsonFactory jsonFactory = new JsonFactory();

            final JsonParser jp = jsonFactory.createParser(jsonString);
            result = objectMapper.readValue(jp, JCollection.class);
        }

        return result;
    }

    /**
     * Method that can be used to serialize given object as a JSon String.
     *
     * @param object
     *            Object to be serialize.
     * @return JSon String.
     * @throws IOException
     *             signal fatal problems with mapping of content.
     */
    @Nullable
    public static String writeValue(@NonNull final JCollection object) throws IOException {
        final ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.writeValueAsString(object);
    }
}