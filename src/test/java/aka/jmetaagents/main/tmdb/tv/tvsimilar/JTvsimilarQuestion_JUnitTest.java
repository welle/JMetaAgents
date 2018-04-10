package aka.jmetaagents.main.tmdb.tv.tvsimilar;

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
 * JUnit skeleton for the JTvsimilarQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvsimilarQuestion.class })
public class JTvsimilarQuestion_JUnitTest {

    /**
     * getTvId with an new JTvsimilarQuestion.
     */
    @org.junit.Test
    public void testGetTvId() {
        // arrange : set up the test
        final JTvsimilarQuestion jTvsimilarQuestion = mock(JTvsimilarQuestion.class);
        assert jTvsimilarQuestion != null;

        // act : run the test
        final Integer result = jTvsimilarQuestion.getTvId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvId with an new JTvsimilarQuestion.
     */
    @org.junit.Test
    public void testSetTvId() {
        // arrange : set up the test
        final JTvsimilarQuestion jTvsimilarQuestion = mock(JTvsimilarQuestion.class);
        assert jTvsimilarQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvsimilarQuestion.setTvId(expectedValue);
        final Integer result = jTvsimilarQuestion.getTvId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JTvsimilarQuestion.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JTvsimilarQuestion jTvsimilarQuestion = mock(JTvsimilarQuestion.class);
        assert jTvsimilarQuestion != null;

        // act : run the test
        final String result = jTvsimilarQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JTvsimilarQuestion.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JTvsimilarQuestion jTvsimilarQuestion = mock(JTvsimilarQuestion.class);
        assert jTvsimilarQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvsimilarQuestion.setLanguage(expectedValue);
        final String result = jTvsimilarQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPage with an new JTvsimilarQuestion.
     */
    @org.junit.Test
    public void testGetPage() {
        // arrange : set up the test
        final JTvsimilarQuestion jTvsimilarQuestion = mock(JTvsimilarQuestion.class);
        assert jTvsimilarQuestion != null;

        // act : run the test
        final String result = jTvsimilarQuestion.getPage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPage with an new JTvsimilarQuestion.
     */
    @org.junit.Test
    public void testSetPage() {
        // arrange : set up the test
        final JTvsimilarQuestion jTvsimilarQuestion = mock(JTvsimilarQuestion.class);
        assert jTvsimilarQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvsimilarQuestion.setPage(expectedValue);
        final String result = jTvsimilarQuestion.getPage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}