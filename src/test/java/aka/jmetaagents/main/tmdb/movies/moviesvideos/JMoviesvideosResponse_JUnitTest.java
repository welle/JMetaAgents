package aka.jmetaagents.main.tmdb.movies.moviesvideos;

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
 * JUnit skeleton for the JMoviesvideosResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviesvideosResponse.class })
public class JMoviesvideosResponse_JUnitTest {

    /**
     * getBackdrops with an new JMoviesvideosResponse.
     */
    @org.junit.Test
    public void testGetBackdrops() {
        // arrange : set up the test
        final JMoviesvideosResponse jMoviesvideosResponse = mock(JMoviesvideosResponse.class);
        assert jMoviesvideosResponse != null;

        // act : run the test
        final List result = jMoviesvideosResponse.getBackdrops();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBackdrops with an new JMoviesvideosResponse.
     */
    @org.junit.Test
    public void testSetBackdrops() {
        // arrange : set up the test
        final JMoviesvideosResponse jMoviesvideosResponse = mock(JMoviesvideosResponse.class);
        assert jMoviesvideosResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Backdrops> expectedValue = new ArrayList<>();
        Backdrops backdropsItem = new Backdrops();
        expectedValue.add(backdropsItem);
        jMoviesvideosResponse.setBackdrops(expectedValue);
        final List<Backdrops> result = jMoviesvideosResponse.getBackdrops();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPosters with an new JMoviesvideosResponse.
     */
    @org.junit.Test
    public void testGetPosters() {
        // arrange : set up the test
        final JMoviesvideosResponse jMoviesvideosResponse = mock(JMoviesvideosResponse.class);
        assert jMoviesvideosResponse != null;

        // act : run the test
        final List result = jMoviesvideosResponse.getPosters();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPosters with an new JMoviesvideosResponse.
     */
    @org.junit.Test
    public void testSetPosters() {
        // arrange : set up the test
        final JMoviesvideosResponse jMoviesvideosResponse = mock(JMoviesvideosResponse.class);
        assert jMoviesvideosResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Posters> expectedValue = new ArrayList<>();
        Posters postersItem = new Posters();
        expectedValue.add(postersItem);
        jMoviesvideosResponse.setPosters(expectedValue);
        final List<Posters> result = jMoviesvideosResponse.getPosters();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JMoviesvideosResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JMoviesvideosResponse jMoviesvideosResponse = mock(JMoviesvideosResponse.class);
        assert jMoviesvideosResponse != null;

        // act : run the test
        final Integer result = jMoviesvideosResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JMoviesvideosResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JMoviesvideosResponse jMoviesvideosResponse = mock(JMoviesvideosResponse.class);
        assert jMoviesvideosResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviesvideosResponse.setId(expectedValue);
        final Integer result = jMoviesvideosResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}