package aka.jmetaagents.main.omdb.movie.moviebysearch;

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
 * JUnit skeleton for the JMoviebysearchQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviebysearchQuestion.class })
public class JMoviebysearchQuestion_JUnitTest {

    /**
     * getY with an new JMoviebysearchQuestion.
     */
    @org.junit.Test
    public void testGetY() {
        // arrange : set up the test
        final JMoviebysearchQuestion jMoviebysearchQuestion = mock(JMoviebysearchQuestion.class);
        assert jMoviebysearchQuestion != null;

        // act : run the test
        final Integer result = jMoviebysearchQuestion.getY();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setY with an new JMoviebysearchQuestion.
     */
    @org.junit.Test
    public void testSetY() {
        // arrange : set up the test
        final JMoviebysearchQuestion jMoviebysearchQuestion = mock(JMoviebysearchQuestion.class);
        assert jMoviebysearchQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviebysearchQuestion.setY(expectedValue);
        final Integer result = jMoviebysearchQuestion.getY();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPage with an new JMoviebysearchQuestion.
     */
    @org.junit.Test
    public void testGetPage() {
        // arrange : set up the test
        final JMoviebysearchQuestion jMoviebysearchQuestion = mock(JMoviebysearchQuestion.class);
        assert jMoviebysearchQuestion != null;

        // act : run the test
        final Integer result = jMoviebysearchQuestion.getPage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPage with an new JMoviebysearchQuestion.
     */
    @org.junit.Test
    public void testSetPage() {
        // arrange : set up the test
        final JMoviebysearchQuestion jMoviebysearchQuestion = mock(JMoviebysearchQuestion.class);
        assert jMoviebysearchQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jMoviebysearchQuestion.setPage(expectedValue);
        final Integer result = jMoviebysearchQuestion.getPage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTitle with an new JMoviebysearchQuestion.
     */
    @org.junit.Test
    public void testGetTitle() {
        // arrange : set up the test
        final JMoviebysearchQuestion jMoviebysearchQuestion = mock(JMoviebysearchQuestion.class);
        assert jMoviebysearchQuestion != null;

        // act : run the test
        final String result = jMoviebysearchQuestion.getTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTitle with an new JMoviebysearchQuestion.
     */
    @org.junit.Test
    public void testSetTitle() {
        // arrange : set up the test
        final JMoviebysearchQuestion jMoviebysearchQuestion = mock(JMoviebysearchQuestion.class);
        assert jMoviebysearchQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchQuestion.setTitle(expectedValue);
        final String result = jMoviebysearchQuestion.getTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}