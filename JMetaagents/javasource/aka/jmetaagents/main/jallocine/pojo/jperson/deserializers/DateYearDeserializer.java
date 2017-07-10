package aka.jmetaagents.main.jallocine.pojo.jperson.deserializers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
public final class DateYearDeserializer extends JsonDeserializer<Date> {

    @Override
    public final Date deserialize(final JsonParser jsonparser, final DeserializationContext deserializationcontext) throws IOException, JsonProcessingException {
        final SimpleDateFormat format = new SimpleDateFormat("yyyy");
        final String date = jsonparser.getText();
        try {
            return format.parse(date);
        } catch (final ParseException e) {
            // nothing to do
        }

        return null;
    }
}