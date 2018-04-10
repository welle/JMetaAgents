package aka.jmetaagents.main.tmdb.genres.genresgetmovies;

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
 * JUnit skeleton for the JGenresgetmoviesQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JGenresgetmoviesQuestion.class })
public class JGenresgetmoviesQuestion_JUnitTest {

    /**
     * getIncludeAdult with an new JGenresgetmoviesQuestion.
     */
    @org.junit.Test
    public void testGetIncludeAdult() {
        // arrange : set up the test
        final JGenresgetmoviesQuestion jGenresgetmoviesQuestion = mock(JGenresgetmoviesQuestion.class);
        assert jGenresgetmoviesQuestion != null;

        // act : run the test
        final Boolean result = jGenresgetmoviesQuestion.getIncludeAdult();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setIncludeAdult with an new JGenresgetmoviesQuestion.
     */
    @org.junit.Test
    public void testSetIncludeAdult() {
        // arrange : set up the test
        final JGenresgetmoviesQuestion jGenresgetmoviesQuestion = mock(JGenresgetmoviesQuestion.class);
        assert jGenresgetmoviesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Boolean expectedValue = null;
        jGenresgetmoviesQuestion.setIncludeAdult(expectedValue);
        final Boolean result = jGenresgetmoviesQuestion.getIncludeAdult();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JGenresgetmoviesQuestion.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JGenresgetmoviesQuestion jGenresgetmoviesQuestion = mock(JGenresgetmoviesQuestion.class);
        assert jGenresgetmoviesQuestion != null;

        // act : run the test
        final String result = jGenresgetmoviesQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JGenresgetmoviesQuestion.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JGenresgetmoviesQuestion jGenresgetmoviesQuestion = mock(JGenresgetmoviesQuestion.class);
        assert jGenresgetmoviesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jGenresgetmoviesQuestion.setLanguage(expectedValue);
        final String result = jGenresgetmoviesQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getGenreId with an new JGenresgetmoviesQuestion.
     */
    @org.junit.Test
    public void testGetGenreId() {
        // arrange : set up the test
        final JGenresgetmoviesQuestion jGenresgetmoviesQuestion = mock(JGenresgetmoviesQuestion.class);
        assert jGenresgetmoviesQuestion != null;

        // act : run the test
        final Integer result = jGenresgetmoviesQuestion.getGenreId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGenreId with an new JGenresgetmoviesQuestion.
     */
    @org.junit.Test
    public void testSetGenreId() {
        // arrange : set up the test
        final JGenresgetmoviesQuestion jGenresgetmoviesQuestion = mock(JGenresgetmoviesQuestion.class);
        assert jGenresgetmoviesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jGenresgetmoviesQuestion.setGenreId(expectedValue);
        final Integer result = jGenresgetmoviesQuestion.getGenreId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}