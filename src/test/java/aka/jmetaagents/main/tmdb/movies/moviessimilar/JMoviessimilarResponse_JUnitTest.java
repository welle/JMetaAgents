package aka.jmetaagents.main.tmdb.movies.moviessimilar;

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
 * JUnit skeleton for the JMoviessimilarResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviessimilarResponse.class })
public class JMoviessimilarResponse_JUnitTest {

    /**
     * getPage with an new JMoviessimilarResponse.
     */
    @org.junit.Test
    public void testGetPage() {
        // arrange : set up the test
        final JMoviessimilarResponse jMoviessimilarResponse = mock(JMoviessimilarResponse.class);
        assert jMoviessimilarResponse != null;

        // act : run the test
        final Integer result = jMoviessimilarResponse.getPage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPage with an new JMoviessimilarResponse.
     */
    @org.junit.Test
    public void testSetPage() {
        // arrange : set up the test
        final JMoviessimilarResponse jMoviessimilarResponse = mock(JMoviessimilarResponse.class);
        assert jMoviessimilarResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviessimilarResponse.setPage(expectedValue);
        final Integer result = jMoviessimilarResponse.getPage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTotalPages with an new JMoviessimilarResponse.
     */
    @org.junit.Test
    public void testGetTotalPages() {
        // arrange : set up the test
        final JMoviessimilarResponse jMoviessimilarResponse = mock(JMoviessimilarResponse.class);
        assert jMoviessimilarResponse != null;

        // act : run the test
        final Integer result = jMoviessimilarResponse.getTotalPages();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTotalPages with an new JMoviessimilarResponse.
     */
    @org.junit.Test
    public void testSetTotalPages() {
        // arrange : set up the test
        final JMoviessimilarResponse jMoviessimilarResponse = mock(JMoviessimilarResponse.class);
        assert jMoviessimilarResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviessimilarResponse.setTotalPages(expectedValue);
        final Integer result = jMoviessimilarResponse.getTotalPages();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getResults with an new JMoviessimilarResponse.
     */
    @org.junit.Test
    public void testGetResults() {
        // arrange : set up the test
        final JMoviessimilarResponse jMoviessimilarResponse = mock(JMoviessimilarResponse.class);
        assert jMoviessimilarResponse != null;

        // act : run the test
        final List result = jMoviessimilarResponse.getResults();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setResults with an new JMoviessimilarResponse.
     */
    @org.junit.Test
    public void testSetResults() {
        // arrange : set up the test
        final JMoviessimilarResponse jMoviessimilarResponse = mock(JMoviessimilarResponse.class);
        assert jMoviessimilarResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Results> expectedValue = new ArrayList<>();
        Results resultsItem = new Results();
        expectedValue.add(resultsItem);
        jMoviessimilarResponse.setResults(expectedValue);
        final List<Results> result = jMoviessimilarResponse.getResults();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTotalResults with an new JMoviessimilarResponse.
     */
    @org.junit.Test
    public void testGetTotalResults() {
        // arrange : set up the test
        final JMoviessimilarResponse jMoviessimilarResponse = mock(JMoviessimilarResponse.class);
        assert jMoviessimilarResponse != null;

        // act : run the test
        final Integer result = jMoviessimilarResponse.getTotalResults();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTotalResults with an new JMoviessimilarResponse.
     */
    @org.junit.Test
    public void testSetTotalResults() {
        // arrange : set up the test
        final JMoviessimilarResponse jMoviessimilarResponse = mock(JMoviessimilarResponse.class);
        assert jMoviessimilarResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviessimilarResponse.setTotalResults(expectedValue);
        final Integer result = jMoviessimilarResponse.getTotalResults();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}