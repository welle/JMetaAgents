package aka.jmetaagents.main.tvdb.series.seriesidepisodes;

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
 * JUnit skeleton for the JSeriesidepisodesQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidepisodesQuestion.class })
public class JSeriesidepisodesQuestion_JUnitTest {

    /**
     * getId with an new JSeriesidepisodesQuestion.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JSeriesidepisodesQuestion jSeriesidepisodesQuestion = mock(JSeriesidepisodesQuestion.class);
        assert jSeriesidepisodesQuestion != null;

        // act : run the test
        final Integer result = jSeriesidepisodesQuestion.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JSeriesidepisodesQuestion.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JSeriesidepisodesQuestion jSeriesidepisodesQuestion = mock(JSeriesidepisodesQuestion.class);
        assert jSeriesidepisodesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jSeriesidepisodesQuestion.setId(expectedValue);
        final Integer result = jSeriesidepisodesQuestion.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAcceptLanguage with an new JSeriesidepisodesQuestion.
     */
    @org.junit.Test
    public void testGetAcceptLanguage() {
        // arrange : set up the test
        final JSeriesidepisodesQuestion jSeriesidepisodesQuestion = mock(JSeriesidepisodesQuestion.class);
        assert jSeriesidepisodesQuestion != null;

        // act : run the test
        final String result = jSeriesidepisodesQuestion.getAcceptLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAcceptLanguage with an new JSeriesidepisodesQuestion.
     */
    @org.junit.Test
    public void testSetAcceptLanguage() {
        // arrange : set up the test
        final JSeriesidepisodesQuestion jSeriesidepisodesQuestion = mock(JSeriesidepisodesQuestion.class);
        assert jSeriesidepisodesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidepisodesQuestion.setAcceptLanguage(expectedValue);
        final String result = jSeriesidepisodesQuestion.getAcceptLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}