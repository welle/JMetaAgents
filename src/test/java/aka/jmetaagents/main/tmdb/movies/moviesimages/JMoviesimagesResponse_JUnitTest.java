package aka.jmetaagents.main.tmdb.movies.moviesimages;

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
 * JUnit skeleton for the JMoviesimagesResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviesimagesResponse.class })
public class JMoviesimagesResponse_JUnitTest {

    /**
     * getId with an new JMoviesimagesResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JMoviesimagesResponse jMoviesimagesResponse = mock(JMoviesimagesResponse.class);
        assert jMoviesimagesResponse != null;

        // act : run the test
        final Integer result = jMoviesimagesResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JMoviesimagesResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JMoviesimagesResponse jMoviesimagesResponse = mock(JMoviesimagesResponse.class);
        assert jMoviesimagesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviesimagesResponse.setId(expectedValue);
        final Integer result = jMoviesimagesResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getResults with an new JMoviesimagesResponse.
     */
    @org.junit.Test
    public void testGetResults() {
        // arrange : set up the test
        final JMoviesimagesResponse jMoviesimagesResponse = mock(JMoviesimagesResponse.class);
        assert jMoviesimagesResponse != null;

        // act : run the test
        final List result = jMoviesimagesResponse.getResults();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setResults with an new JMoviesimagesResponse.
     */
    @org.junit.Test
    public void testSetResults() {
        // arrange : set up the test
        final JMoviesimagesResponse jMoviesimagesResponse = mock(JMoviesimagesResponse.class);
        assert jMoviesimagesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Results> expectedValue = new ArrayList<>();
        Results resultsItem = new Results();
        expectedValue.add(resultsItem);
        jMoviesimagesResponse.setResults(expectedValue);
        final List<Results> result = jMoviesimagesResponse.getResults();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}