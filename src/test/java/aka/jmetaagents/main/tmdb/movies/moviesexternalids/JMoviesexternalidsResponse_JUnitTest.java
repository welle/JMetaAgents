package aka.jmetaagents.main.tmdb.movies.moviesexternalids;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;


import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit skeleton for the JMoviesexternalidsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviesexternalidsResponse.class })
public class JMoviesexternalidsResponse_JUnitTest {

    /**
     * getImdbId with an new JMoviesexternalidsResponse.
     */
    @org.junit.Test
    public void testGetImdbId() {
        // arrange : set up the test
        final JMoviesexternalidsResponse jMoviesexternalidsResponse = mock(JMoviesexternalidsResponse.class);
        assert jMoviesexternalidsResponse != null;

        // act : run the test
        final String result = jMoviesexternalidsResponse.getImdbId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbId with an new JMoviesexternalidsResponse.
     */
    @org.junit.Test
    public void testSetImdbId() {
        // arrange : set up the test
        final JMoviesexternalidsResponse jMoviesexternalidsResponse = mock(JMoviesexternalidsResponse.class);
        assert jMoviesexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesexternalidsResponse.setImdbId(expectedValue);
        final String result = jMoviesexternalidsResponse.getImdbId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JMoviesexternalidsResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JMoviesexternalidsResponse jMoviesexternalidsResponse = mock(JMoviesexternalidsResponse.class);
        assert jMoviesexternalidsResponse != null;

        // act : run the test
        final Integer result = jMoviesexternalidsResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JMoviesexternalidsResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JMoviesexternalidsResponse jMoviesexternalidsResponse = mock(JMoviesexternalidsResponse.class);
        assert jMoviesexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviesexternalidsResponse.setId(expectedValue);
        final Integer result = jMoviesexternalidsResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTwitterId with an new JMoviesexternalidsResponse.
     */
    @org.junit.Test
    public void testGetTwitterId() {
        // arrange : set up the test
        final JMoviesexternalidsResponse jMoviesexternalidsResponse = mock(JMoviesexternalidsResponse.class);
        assert jMoviesexternalidsResponse != null;

        // act : run the test
        final String result = jMoviesexternalidsResponse.getTwitterId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTwitterId with an new JMoviesexternalidsResponse.
     */
    @org.junit.Test
    public void testSetTwitterId() {
        // arrange : set up the test
        final JMoviesexternalidsResponse jMoviesexternalidsResponse = mock(JMoviesexternalidsResponse.class);
        assert jMoviesexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesexternalidsResponse.setTwitterId(expectedValue);
        final String result = jMoviesexternalidsResponse.getTwitterId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFacebookId with an new JMoviesexternalidsResponse.
     */
    @org.junit.Test
    public void testGetFacebookId() {
        // arrange : set up the test
        final JMoviesexternalidsResponse jMoviesexternalidsResponse = mock(JMoviesexternalidsResponse.class);
        assert jMoviesexternalidsResponse != null;

        // act : run the test
        final String result = jMoviesexternalidsResponse.getFacebookId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFacebookId with an new JMoviesexternalidsResponse.
     */
    @org.junit.Test
    public void testSetFacebookId() {
        // arrange : set up the test
        final JMoviesexternalidsResponse jMoviesexternalidsResponse = mock(JMoviesexternalidsResponse.class);
        assert jMoviesexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesexternalidsResponse.setFacebookId(expectedValue);
        final String result = jMoviesexternalidsResponse.getFacebookId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getInstagramId with an new JMoviesexternalidsResponse.
     */
    @org.junit.Test
    public void testGetInstagramId() {
        // arrange : set up the test
        final JMoviesexternalidsResponse jMoviesexternalidsResponse = mock(JMoviesexternalidsResponse.class);
        assert jMoviesexternalidsResponse != null;

        // act : run the test
        final String result = jMoviesexternalidsResponse.getInstagramId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setInstagramId with an new JMoviesexternalidsResponse.
     */
    @org.junit.Test
    public void testSetInstagramId() {
        // arrange : set up the test
        final JMoviesexternalidsResponse jMoviesexternalidsResponse = mock(JMoviesexternalidsResponse.class);
        assert jMoviesexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesexternalidsResponse.setInstagramId(expectedValue);
        final String result = jMoviesexternalidsResponse.getInstagramId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}