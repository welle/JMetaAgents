package aka.jmetaagents.main.tmdb.find.findbytvdbid;

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
 * JUnit skeleton for the JFindbytvdbidResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JFindbytvdbidResponse.class })
public class JFindbytvdbidResponse_JUnitTest {

    /**
     * getPersonResults with an new JFindbytvdbidResponse.
     */
    @org.junit.Test
    public void testGetPersonResults() {
        // arrange : set up the test
        final JFindbytvdbidResponse jFindbytvdbidResponse = mock(JFindbytvdbidResponse.class);
        assert jFindbytvdbidResponse != null;

        // act : run the test
        final List result = jFindbytvdbidResponse.getPersonResults();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPersonResults with an new JFindbytvdbidResponse.
     */
    @org.junit.Test
    public void testSetPersonResults() {
        // arrange : set up the test
        final JFindbytvdbidResponse jFindbytvdbidResponse = mock(JFindbytvdbidResponse.class);
        assert jFindbytvdbidResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        jFindbytvdbidResponse.setPersonResults(expectedValue);
        final List<String> result = jFindbytvdbidResponse.getPersonResults();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getMovieResults with an new JFindbytvdbidResponse.
     */
    @org.junit.Test
    public void testGetMovieResults() {
        // arrange : set up the test
        final JFindbytvdbidResponse jFindbytvdbidResponse = mock(JFindbytvdbidResponse.class);
        assert jFindbytvdbidResponse != null;

        // act : run the test
        final List result = jFindbytvdbidResponse.getMovieResults();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setMovieResults with an new JFindbytvdbidResponse.
     */
    @org.junit.Test
    public void testSetMovieResults() {
        // arrange : set up the test
        final JFindbytvdbidResponse jFindbytvdbidResponse = mock(JFindbytvdbidResponse.class);
        assert jFindbytvdbidResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<MovieResults> expectedValue = new ArrayList<>();
        MovieResults movieResultsItem = new MovieResults();
        expectedValue.add(movieResultsItem);
        jFindbytvdbidResponse.setMovieResults(expectedValue);
        final List<MovieResults> result = jFindbytvdbidResponse.getMovieResults();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTvResults with an new JFindbytvdbidResponse.
     */
    @org.junit.Test
    public void testGetTvResults() {
        // arrange : set up the test
        final JFindbytvdbidResponse jFindbytvdbidResponse = mock(JFindbytvdbidResponse.class);
        assert jFindbytvdbidResponse != null;

        // act : run the test
        final List result = jFindbytvdbidResponse.getTvResults();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvResults with an new JFindbytvdbidResponse.
     */
    @org.junit.Test
    public void testSetTvResults() {
        // arrange : set up the test
        final JFindbytvdbidResponse jFindbytvdbidResponse = mock(JFindbytvdbidResponse.class);
        assert jFindbytvdbidResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        jFindbytvdbidResponse.setTvResults(expectedValue);
        final List<String> result = jFindbytvdbidResponse.getTvResults();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTvEpisodeResults with an new JFindbytvdbidResponse.
     */
    @org.junit.Test
    public void testGetTvEpisodeResults() {
        // arrange : set up the test
        final JFindbytvdbidResponse jFindbytvdbidResponse = mock(JFindbytvdbidResponse.class);
        assert jFindbytvdbidResponse != null;

        // act : run the test
        final List result = jFindbytvdbidResponse.getTvEpisodeResults();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvEpisodeResults with an new JFindbytvdbidResponse.
     */
    @org.junit.Test
    public void testSetTvEpisodeResults() {
        // arrange : set up the test
        final JFindbytvdbidResponse jFindbytvdbidResponse = mock(JFindbytvdbidResponse.class);
        assert jFindbytvdbidResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        jFindbytvdbidResponse.setTvEpisodeResults(expectedValue);
        final List<String> result = jFindbytvdbidResponse.getTvEpisodeResults();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTvSeasonResults with an new JFindbytvdbidResponse.
     */
    @org.junit.Test
    public void testGetTvSeasonResults() {
        // arrange : set up the test
        final JFindbytvdbidResponse jFindbytvdbidResponse = mock(JFindbytvdbidResponse.class);
        assert jFindbytvdbidResponse != null;

        // act : run the test
        final List result = jFindbytvdbidResponse.getTvSeasonResults();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvSeasonResults with an new JFindbytvdbidResponse.
     */
    @org.junit.Test
    public void testSetTvSeasonResults() {
        // arrange : set up the test
        final JFindbytvdbidResponse jFindbytvdbidResponse = mock(JFindbytvdbidResponse.class);
        assert jFindbytvdbidResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        jFindbytvdbidResponse.setTvSeasonResults(expectedValue);
        final List<String> result = jFindbytvdbidResponse.getTvSeasonResults();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}