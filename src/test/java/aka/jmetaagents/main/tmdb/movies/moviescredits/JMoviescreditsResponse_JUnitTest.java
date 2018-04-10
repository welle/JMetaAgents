package aka.jmetaagents.main.tmdb.movies.moviescredits;

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
 * JUnit skeleton for the JMoviescreditsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviescreditsResponse.class })
public class JMoviescreditsResponse_JUnitTest {

    /**
     * getCast with an new JMoviescreditsResponse.
     */
    @org.junit.Test
    public void testGetCast() {
        // arrange : set up the test
        final JMoviescreditsResponse jMoviescreditsResponse = mock(JMoviescreditsResponse.class);
        assert jMoviescreditsResponse != null;

        // act : run the test
        final List result = jMoviescreditsResponse.getCast();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCast with an new JMoviescreditsResponse.
     */
    @org.junit.Test
    public void testSetCast() {
        // arrange : set up the test
        final JMoviescreditsResponse jMoviescreditsResponse = mock(JMoviescreditsResponse.class);
        assert jMoviescreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Cast> expectedValue = new ArrayList<>();
        Cast castItem = new Cast();
        expectedValue.add(castItem);
        jMoviescreditsResponse.setCast(expectedValue);
        final List<Cast> result = jMoviescreditsResponse.getCast();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JMoviescreditsResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JMoviescreditsResponse jMoviescreditsResponse = mock(JMoviescreditsResponse.class);
        assert jMoviescreditsResponse != null;

        // act : run the test
        final Integer result = jMoviescreditsResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JMoviescreditsResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JMoviescreditsResponse jMoviescreditsResponse = mock(JMoviescreditsResponse.class);
        assert jMoviescreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviescreditsResponse.setId(expectedValue);
        final Integer result = jMoviescreditsResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}