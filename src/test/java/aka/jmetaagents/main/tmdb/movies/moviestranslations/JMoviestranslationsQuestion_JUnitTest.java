package aka.jmetaagents.main.tmdb.movies.moviestranslations;

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
 * JUnit skeleton for the JMoviestranslationsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviestranslationsQuestion.class })
public class JMoviestranslationsQuestion_JUnitTest {

    /**
     * getMovieId with an new JMoviestranslationsQuestion.
     */
    @org.junit.Test
    public void testGetMovieId() {
        // arrange : set up the test
        final JMoviestranslationsQuestion jMoviestranslationsQuestion = mock(JMoviestranslationsQuestion.class);
        assert jMoviestranslationsQuestion != null;

        // act : run the test
        final Integer result = jMoviestranslationsQuestion.getMovieId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setMovieId with an new JMoviestranslationsQuestion.
     */
    @org.junit.Test
    public void testSetMovieId() {
        // arrange : set up the test
        final JMoviestranslationsQuestion jMoviestranslationsQuestion = mock(JMoviestranslationsQuestion.class);
        assert jMoviestranslationsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviestranslationsQuestion.setMovieId(expectedValue);
        final Integer result = jMoviestranslationsQuestion.getMovieId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}