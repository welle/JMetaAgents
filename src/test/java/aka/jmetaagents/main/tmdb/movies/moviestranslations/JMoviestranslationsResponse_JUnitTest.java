package aka.jmetaagents.main.tmdb.movies.moviestranslations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;


import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit skeleton for the JMoviestranslationsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviestranslationsResponse.class })
public class JMoviestranslationsResponse_JUnitTest {

    /**
     * getTranslations with an new JMoviestranslationsResponse.
     */
    @org.junit.Test
    public void testGetTranslations() {
        // arrange : set up the test
        final JMoviestranslationsResponse jMoviestranslationsResponse = mock(JMoviestranslationsResponse.class);
        assert jMoviestranslationsResponse != null;

        // act : run the test
        final List result = jMoviestranslationsResponse.getTranslations();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTranslations with an new JMoviestranslationsResponse.
     */
    @org.junit.Test
    public void testSetTranslations() {
        // arrange : set up the test
        final JMoviestranslationsResponse jMoviestranslationsResponse = mock(JMoviestranslationsResponse.class);
        assert jMoviestranslationsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Translations> expectedValue = new ArrayList<>();
        Translations translationsItem = new Translations();
        expectedValue.add(translationsItem);
        jMoviestranslationsResponse.setTranslations(expectedValue);
        final List<Translations> result = jMoviestranslationsResponse.getTranslations();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JMoviestranslationsResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JMoviestranslationsResponse jMoviestranslationsResponse = mock(JMoviestranslationsResponse.class);
        assert jMoviestranslationsResponse != null;

        // act : run the test
        final Integer result = jMoviestranslationsResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JMoviestranslationsResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JMoviestranslationsResponse jMoviestranslationsResponse = mock(JMoviestranslationsResponse.class);
        assert jMoviestranslationsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviestranslationsResponse.setId(expectedValue);
        final Integer result = jMoviestranslationsResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}