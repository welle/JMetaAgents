package aka.jmetaagents.main.omdb.series.seriesbysearch;

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
 * JUnit skeleton for the JSeriesbysearchQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesbysearchQuestion.class })
public class JSeriesbysearchQuestion_JUnitTest {

    /**
     * getY with an new JSeriesbysearchQuestion.
     */
    @org.junit.Test
    public void testGetY() {
        // arrange : set up the test
        final JSeriesbysearchQuestion jSeriesbysearchQuestion = mock(JSeriesbysearchQuestion.class);
        assert jSeriesbysearchQuestion != null;

        // act : run the test
        final Integer result = jSeriesbysearchQuestion.getY();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setY with an new JSeriesbysearchQuestion.
     */
    @org.junit.Test
    public void testSetY() {
        // arrange : set up the test
        final JSeriesbysearchQuestion jSeriesbysearchQuestion = mock(JSeriesbysearchQuestion.class);
        assert jSeriesbysearchQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jSeriesbysearchQuestion.setY(expectedValue);
        final Integer result = jSeriesbysearchQuestion.getY();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPage with an new JSeriesbysearchQuestion.
     */
    @org.junit.Test
    public void testGetPage() {
        // arrange : set up the test
        final JSeriesbysearchQuestion jSeriesbysearchQuestion = mock(JSeriesbysearchQuestion.class);
        assert jSeriesbysearchQuestion != null;

        // act : run the test
        final Integer result = jSeriesbysearchQuestion.getPage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPage with an new JSeriesbysearchQuestion.
     */
    @org.junit.Test
    public void testSetPage() {
        // arrange : set up the test
        final JSeriesbysearchQuestion jSeriesbysearchQuestion = mock(JSeriesbysearchQuestion.class);
        assert jSeriesbysearchQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jSeriesbysearchQuestion.setPage(expectedValue);
        final Integer result = jSeriesbysearchQuestion.getPage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTitle with an new JSeriesbysearchQuestion.
     */
    @org.junit.Test
    public void testGetTitle() {
        // arrange : set up the test
        final JSeriesbysearchQuestion jSeriesbysearchQuestion = mock(JSeriesbysearchQuestion.class);
        assert jSeriesbysearchQuestion != null;

        // act : run the test
        final String result = jSeriesbysearchQuestion.getTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTitle with an new JSeriesbysearchQuestion.
     */
    @org.junit.Test
    public void testSetTitle() {
        // arrange : set up the test
        final JSeriesbysearchQuestion jSeriesbysearchQuestion = mock(JSeriesbysearchQuestion.class);
        assert jSeriesbysearchQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbysearchQuestion.setTitle(expectedValue);
        final String result = jSeriesbysearchQuestion.getTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}