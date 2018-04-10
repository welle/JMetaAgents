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
 * JUnit skeleton for the JMoviesexternalidsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviesexternalidsQuestion.class })
public class JMoviesexternalidsQuestion_JUnitTest {

    /**
     * getMovieId with an new JMoviesexternalidsQuestion.
     */
    @org.junit.Test
    public void testGetMovieId() {
        // arrange : set up the test
        final JMoviesexternalidsQuestion jMoviesexternalidsQuestion = mock(JMoviesexternalidsQuestion.class);
        assert jMoviesexternalidsQuestion != null;

        // act : run the test
        final Integer result = jMoviesexternalidsQuestion.getMovieId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setMovieId with an new JMoviesexternalidsQuestion.
     */
    @org.junit.Test
    public void testSetMovieId() {
        // arrange : set up the test
        final JMoviesexternalidsQuestion jMoviesexternalidsQuestion = mock(JMoviesexternalidsQuestion.class);
        assert jMoviesexternalidsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviesexternalidsQuestion.setMovieId(expectedValue);
        final Integer result = jMoviesexternalidsQuestion.getMovieId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}