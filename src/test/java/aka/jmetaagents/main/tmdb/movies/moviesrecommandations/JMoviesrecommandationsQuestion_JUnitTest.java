package aka.jmetaagents.main.tmdb.movies.moviesrecommandations;

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
 * JUnit skeleton for the JMoviesrecommandationsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviesrecommandationsQuestion.class })
public class JMoviesrecommandationsQuestion_JUnitTest {

    /**
     * getLanguage with an new JMoviesrecommandationsQuestion.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JMoviesrecommandationsQuestion jMoviesrecommandationsQuestion = mock(JMoviesrecommandationsQuestion.class);
        assert jMoviesrecommandationsQuestion != null;

        // act : run the test
        final String result = jMoviesrecommandationsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JMoviesrecommandationsQuestion.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JMoviesrecommandationsQuestion jMoviesrecommandationsQuestion = mock(JMoviesrecommandationsQuestion.class);
        assert jMoviesrecommandationsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviesrecommandationsQuestion.setLanguage(expectedValue);
        final String result = jMoviesrecommandationsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPage with an new JMoviesrecommandationsQuestion.
     */
    @org.junit.Test
    public void testGetPage() {
        // arrange : set up the test
        final JMoviesrecommandationsQuestion jMoviesrecommandationsQuestion = mock(JMoviesrecommandationsQuestion.class);
        assert jMoviesrecommandationsQuestion != null;

        // act : run the test
        final Integer result = jMoviesrecommandationsQuestion.getPage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPage with an new JMoviesrecommandationsQuestion.
     */
    @org.junit.Test
    public void testSetPage() {
        // arrange : set up the test
        final JMoviesrecommandationsQuestion jMoviesrecommandationsQuestion = mock(JMoviesrecommandationsQuestion.class);
        assert jMoviesrecommandationsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviesrecommandationsQuestion.setPage(expectedValue);
        final Integer result = jMoviesrecommandationsQuestion.getPage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getMovieId with an new JMoviesrecommandationsQuestion.
     */
    @org.junit.Test
    public void testGetMovieId() {
        // arrange : set up the test
        final JMoviesrecommandationsQuestion jMoviesrecommandationsQuestion = mock(JMoviesrecommandationsQuestion.class);
        assert jMoviesrecommandationsQuestion != null;

        // act : run the test
        final Integer result = jMoviesrecommandationsQuestion.getMovieId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setMovieId with an new JMoviesrecommandationsQuestion.
     */
    @org.junit.Test
    public void testSetMovieId() {
        // arrange : set up the test
        final JMoviesrecommandationsQuestion jMoviesrecommandationsQuestion = mock(JMoviesrecommandationsQuestion.class);
        assert jMoviesrecommandationsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviesrecommandationsQuestion.setMovieId(expectedValue);
        final Integer result = jMoviesrecommandationsQuestion.getMovieId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}