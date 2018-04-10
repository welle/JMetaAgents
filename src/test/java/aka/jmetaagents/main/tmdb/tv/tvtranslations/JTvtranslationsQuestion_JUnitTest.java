package aka.jmetaagents.main.tmdb.tv.tvtranslations;

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
 * JUnit skeleton for the JTvtranslationsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvtranslationsQuestion.class })
public class JTvtranslationsQuestion_JUnitTest {

    /**
     * getTvId with an new JTvtranslationsQuestion.
     */
    @org.junit.Test
    public void testGetTvId() {
        // arrange : set up the test
        final JTvtranslationsQuestion jTvtranslationsQuestion = mock(JTvtranslationsQuestion.class);
        assert jTvtranslationsQuestion != null;

        // act : run the test
        final Integer result = jTvtranslationsQuestion.getTvId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvId with an new JTvtranslationsQuestion.
     */
    @org.junit.Test
    public void testSetTvId() {
        // arrange : set up the test
        final JTvtranslationsQuestion jTvtranslationsQuestion = mock(JTvtranslationsQuestion.class);
        assert jTvtranslationsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvtranslationsQuestion.setTvId(expectedValue);
        final Integer result = jTvtranslationsQuestion.getTvId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JTvtranslationsQuestion.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JTvtranslationsQuestion jTvtranslationsQuestion = mock(JTvtranslationsQuestion.class);
        assert jTvtranslationsQuestion != null;

        // act : run the test
        final String result = jTvtranslationsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JTvtranslationsQuestion.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JTvtranslationsQuestion jTvtranslationsQuestion = mock(JTvtranslationsQuestion.class);
        assert jTvtranslationsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvtranslationsQuestion.setLanguage(expectedValue);
        final String result = jTvtranslationsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}