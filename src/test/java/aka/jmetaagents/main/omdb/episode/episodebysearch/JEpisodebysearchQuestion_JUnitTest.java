package aka.jmetaagents.main.omdb.episode.episodebysearch;

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
 * JUnit skeleton for the JEpisodebysearchQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JEpisodebysearchQuestion.class })
public class JEpisodebysearchQuestion_JUnitTest {

    /**
     * getY with an new JEpisodebysearchQuestion.
     */
    @org.junit.Test
    public void testGetY() {
        // arrange : set up the test
        final JEpisodebysearchQuestion jEpisodebysearchQuestion = mock(JEpisodebysearchQuestion.class);
        assert jEpisodebysearchQuestion != null;

        // act : run the test
        final Integer result = jEpisodebysearchQuestion.getY();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setY with an new JEpisodebysearchQuestion.
     */
    @org.junit.Test
    public void testSetY() {
        // arrange : set up the test
        final JEpisodebysearchQuestion jEpisodebysearchQuestion = mock(JEpisodebysearchQuestion.class);
        assert jEpisodebysearchQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jEpisodebysearchQuestion.setY(expectedValue);
        final Integer result = jEpisodebysearchQuestion.getY();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPage with an new JEpisodebysearchQuestion.
     */
    @org.junit.Test
    public void testGetPage() {
        // arrange : set up the test
        final JEpisodebysearchQuestion jEpisodebysearchQuestion = mock(JEpisodebysearchQuestion.class);
        assert jEpisodebysearchQuestion != null;

        // act : run the test
        final Integer result = jEpisodebysearchQuestion.getPage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPage with an new JEpisodebysearchQuestion.
     */
    @org.junit.Test
    public void testSetPage() {
        // arrange : set up the test
        final JEpisodebysearchQuestion jEpisodebysearchQuestion = mock(JEpisodebysearchQuestion.class);
        assert jEpisodebysearchQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jEpisodebysearchQuestion.setPage(expectedValue);
        final Integer result = jEpisodebysearchQuestion.getPage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTitle with an new JEpisodebysearchQuestion.
     */
    @org.junit.Test
    public void testGetTitle() {
        // arrange : set up the test
        final JEpisodebysearchQuestion jEpisodebysearchQuestion = mock(JEpisodebysearchQuestion.class);
        assert jEpisodebysearchQuestion != null;

        // act : run the test
        final String result = jEpisodebysearchQuestion.getTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTitle with an new JEpisodebysearchQuestion.
     */
    @org.junit.Test
    public void testSetTitle() {
        // arrange : set up the test
        final JEpisodebysearchQuestion jEpisodebysearchQuestion = mock(JEpisodebysearchQuestion.class);
        assert jEpisodebysearchQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchQuestion.setTitle(expectedValue);
        final String result = jEpisodebysearchQuestion.getTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}