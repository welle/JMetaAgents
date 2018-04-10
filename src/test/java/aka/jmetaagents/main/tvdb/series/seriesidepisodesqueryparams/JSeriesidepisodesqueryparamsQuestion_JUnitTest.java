package aka.jmetaagents.main.tvdb.series.seriesidepisodesqueryparams;

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
 * JUnit skeleton for the JSeriesidepisodesqueryparamsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidepisodesqueryparamsQuestion.class })
public class JSeriesidepisodesqueryparamsQuestion_JUnitTest {

    /**
     * getId with an new JSeriesidepisodesqueryparamsQuestion.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JSeriesidepisodesqueryparamsQuestion jSeriesidepisodesqueryparamsQuestion = mock(JSeriesidepisodesqueryparamsQuestion.class);
        assert jSeriesidepisodesqueryparamsQuestion != null;

        // act : run the test
        final Integer result = jSeriesidepisodesqueryparamsQuestion.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JSeriesidepisodesqueryparamsQuestion.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JSeriesidepisodesqueryparamsQuestion jSeriesidepisodesqueryparamsQuestion = mock(JSeriesidepisodesqueryparamsQuestion.class);
        assert jSeriesidepisodesqueryparamsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jSeriesidepisodesqueryparamsQuestion.setId(expectedValue);
        final Integer result = jSeriesidepisodesqueryparamsQuestion.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}