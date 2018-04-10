package aka.jmetaagents.main.tmdb.tv.tvexternalids;

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
 * JUnit skeleton for the JTvexternalidsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvexternalidsQuestion.class })
public class JTvexternalidsQuestion_JUnitTest {

    /**
     * getTvId with an new JTvexternalidsQuestion.
     */
    @org.junit.Test
    public void testGetTvId() {
        // arrange : set up the test
        final JTvexternalidsQuestion jTvexternalidsQuestion = mock(JTvexternalidsQuestion.class);
        assert jTvexternalidsQuestion != null;

        // act : run the test
        final Integer result = jTvexternalidsQuestion.getTvId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvId with an new JTvexternalidsQuestion.
     */
    @org.junit.Test
    public void testSetTvId() {
        // arrange : set up the test
        final JTvexternalidsQuestion jTvexternalidsQuestion = mock(JTvexternalidsQuestion.class);
        assert jTvexternalidsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvexternalidsQuestion.setTvId(expectedValue);
        final Integer result = jTvexternalidsQuestion.getTvId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JTvexternalidsQuestion.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JTvexternalidsQuestion jTvexternalidsQuestion = mock(JTvexternalidsQuestion.class);
        assert jTvexternalidsQuestion != null;

        // act : run the test
        final String result = jTvexternalidsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JTvexternalidsQuestion.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JTvexternalidsQuestion jTvexternalidsQuestion = mock(JTvexternalidsQuestion.class);
        assert jTvexternalidsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvexternalidsQuestion.setLanguage(expectedValue);
        final String result = jTvexternalidsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}