package aka.jmetaagents.main.tmdb.movies.moviesalternativetitles;

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
 * JUnit skeleton for the JMoviesalternativetitlesQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviesalternativetitlesQuestion.class })
public class JMoviesalternativetitlesQuestion_JUnitTest {

    /**
     * getCountry with an new JMoviesalternativetitlesQuestion.
     */
    @org.junit.Test
    public void testGetCountry() {
        // arrange : set up the test
        final JMoviesalternativetitlesQuestion jMoviesalternativetitlesQuestion = mock(JMoviesalternativetitlesQuestion.class);
        assert jMoviesalternativetitlesQuestion != null;

        // act : run the test
        final String result = jMoviesalternativetitlesQuestion.getCountry();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCountry with an new JMoviesalternativetitlesQuestion.
     */
    @org.junit.Test
    public void testSetCountry() {
        // arrange : set up the test
        final JMoviesalternativetitlesQuestion jMoviesalternativetitlesQuestion = mock(JMoviesalternativetitlesQuestion.class);
        assert jMoviesalternativetitlesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesalternativetitlesQuestion.setCountry(expectedValue);
        final String result = jMoviesalternativetitlesQuestion.getCountry();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getMovieId with an new JMoviesalternativetitlesQuestion.
     */
    @org.junit.Test
    public void testGetMovieId() {
        // arrange : set up the test
        final JMoviesalternativetitlesQuestion jMoviesalternativetitlesQuestion = mock(JMoviesalternativetitlesQuestion.class);
        assert jMoviesalternativetitlesQuestion != null;

        // act : run the test
        final Integer result = jMoviesalternativetitlesQuestion.getMovieId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setMovieId with an new JMoviesalternativetitlesQuestion.
     */
    @org.junit.Test
    public void testSetMovieId() {
        // arrange : set up the test
        final JMoviesalternativetitlesQuestion jMoviesalternativetitlesQuestion = mock(JMoviesalternativetitlesQuestion.class);
        assert jMoviesalternativetitlesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviesalternativetitlesQuestion.setMovieId(expectedValue);
        final Integer result = jMoviesalternativetitlesQuestion.getMovieId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}