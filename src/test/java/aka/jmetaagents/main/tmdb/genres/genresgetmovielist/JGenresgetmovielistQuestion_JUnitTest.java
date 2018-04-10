package aka.jmetaagents.main.tmdb.genres.genresgetmovielist;

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
 * JUnit skeleton for the JGenresgetmovielistQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JGenresgetmovielistQuestion.class })
public class JGenresgetmovielistQuestion_JUnitTest {

    /**
     * getLanguage with an new JGenresgetmovielistQuestion.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JGenresgetmovielistQuestion jGenresgetmovielistQuestion = mock(JGenresgetmovielistQuestion.class);
        assert jGenresgetmovielistQuestion != null;

        // act : run the test
        final String result = jGenresgetmovielistQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JGenresgetmovielistQuestion.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JGenresgetmovielistQuestion jGenresgetmovielistQuestion = mock(JGenresgetmovielistQuestion.class);
        assert jGenresgetmovielistQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jGenresgetmovielistQuestion.setLanguage(expectedValue);
        final String result = jGenresgetmovielistQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}