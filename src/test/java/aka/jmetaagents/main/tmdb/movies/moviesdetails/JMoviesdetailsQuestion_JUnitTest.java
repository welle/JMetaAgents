package aka.jmetaagents.main.tmdb.movies.moviesdetails;

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
 * JUnit skeleton for the JMoviesdetailsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviesdetailsQuestion.class })
public class JMoviesdetailsQuestion_JUnitTest {

    /**
     * getLanguage with an new JMoviesdetailsQuestion.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JMoviesdetailsQuestion jMoviesdetailsQuestion = mock(JMoviesdetailsQuestion.class);
        assert jMoviesdetailsQuestion != null;

        // act : run the test
        final String result = jMoviesdetailsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JMoviesdetailsQuestion.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JMoviesdetailsQuestion jMoviesdetailsQuestion = mock(JMoviesdetailsQuestion.class);
        assert jMoviesdetailsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesdetailsQuestion.setLanguage(expectedValue);
        final String result = jMoviesdetailsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getMovieId with an new JMoviesdetailsQuestion.
     */
    @org.junit.Test
    public void testGetMovieId() {
        // arrange : set up the test
        final JMoviesdetailsQuestion jMoviesdetailsQuestion = mock(JMoviesdetailsQuestion.class);
        assert jMoviesdetailsQuestion != null;

        // act : run the test
        final Integer result = jMoviesdetailsQuestion.getMovieId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setMovieId with an new JMoviesdetailsQuestion.
     */
    @org.junit.Test
    public void testSetMovieId() {
        // arrange : set up the test
        final JMoviesdetailsQuestion jMoviesdetailsQuestion = mock(JMoviesdetailsQuestion.class);
        assert jMoviesdetailsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviesdetailsQuestion.setMovieId(expectedValue);
        final Integer result = jMoviesdetailsQuestion.getMovieId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}