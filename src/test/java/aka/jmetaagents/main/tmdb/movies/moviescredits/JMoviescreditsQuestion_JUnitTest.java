package aka.jmetaagents.main.tmdb.movies.moviescredits;

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
 * JUnit skeleton for the JMoviescreditsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviescreditsQuestion.class })
public class JMoviescreditsQuestion_JUnitTest {

    /**
     * getMovieId with an new JMoviescreditsQuestion.
     */
    @org.junit.Test
    public void testGetMovieId() {
        // arrange : set up the test
        final JMoviescreditsQuestion jMoviescreditsQuestion = mock(JMoviescreditsQuestion.class);
        assert jMoviescreditsQuestion != null;

        // act : run the test
        final Integer result = jMoviescreditsQuestion.getMovieId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setMovieId with an new JMoviescreditsQuestion.
     */
    @org.junit.Test
    public void testSetMovieId() {
        // arrange : set up the test
        final JMoviescreditsQuestion jMoviescreditsQuestion = mock(JMoviescreditsQuestion.class);
        assert jMoviescreditsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviescreditsQuestion.setMovieId(expectedValue);
        final Integer result = jMoviescreditsQuestion.getMovieId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}