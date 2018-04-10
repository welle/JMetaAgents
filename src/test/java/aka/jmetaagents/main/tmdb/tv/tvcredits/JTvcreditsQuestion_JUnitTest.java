package aka.jmetaagents.main.tmdb.tv.tvcredits;

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
 * JUnit skeleton for the JTvcreditsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvcreditsQuestion.class })
public class JTvcreditsQuestion_JUnitTest {

    /**
     * getTvId with an new JTvcreditsQuestion.
     */
    @org.junit.Test
    public void testGetTvId() {
        // arrange : set up the test
        final JTvcreditsQuestion jTvcreditsQuestion = mock(JTvcreditsQuestion.class);
        assert jTvcreditsQuestion != null;

        // act : run the test
        final Integer result = jTvcreditsQuestion.getTvId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvId with an new JTvcreditsQuestion.
     */
    @org.junit.Test
    public void testSetTvId() {
        // arrange : set up the test
        final JTvcreditsQuestion jTvcreditsQuestion = mock(JTvcreditsQuestion.class);
        assert jTvcreditsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvcreditsQuestion.setTvId(expectedValue);
        final Integer result = jTvcreditsQuestion.getTvId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JTvcreditsQuestion.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JTvcreditsQuestion jTvcreditsQuestion = mock(JTvcreditsQuestion.class);
        assert jTvcreditsQuestion != null;

        // act : run the test
        final String result = jTvcreditsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JTvcreditsQuestion.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JTvcreditsQuestion jTvcreditsQuestion = mock(JTvcreditsQuestion.class);
        assert jTvcreditsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvcreditsQuestion.setLanguage(expectedValue);
        final String result = jTvcreditsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}