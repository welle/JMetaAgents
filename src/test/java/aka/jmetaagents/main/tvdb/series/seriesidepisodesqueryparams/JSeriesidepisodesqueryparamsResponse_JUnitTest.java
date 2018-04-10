package aka.jmetaagents.main.tvdb.series.seriesidepisodesqueryparams;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;


import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit skeleton for the JSeriesidepisodesqueryparamsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidepisodesqueryparamsResponse.class })
public class JSeriesidepisodesqueryparamsResponse_JUnitTest {

    /**
     * getData with an new JSeriesidepisodesqueryparamsResponse.
     */
    @org.junit.Test
    public void testGetData() {
        // arrange : set up the test
        final JSeriesidepisodesqueryparamsResponse jSeriesidepisodesqueryparamsResponse = mock(JSeriesidepisodesqueryparamsResponse.class);
        assert jSeriesidepisodesqueryparamsResponse != null;

        // act : run the test
        final List result = jSeriesidepisodesqueryparamsResponse.getData();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setData with an new JSeriesidepisodesqueryparamsResponse.
     */
    @org.junit.Test
    public void testSetData() {
        // arrange : set up the test
        final JSeriesidepisodesqueryparamsResponse jSeriesidepisodesqueryparamsResponse = mock(JSeriesidepisodesqueryparamsResponse.class);
        assert jSeriesidepisodesqueryparamsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        jSeriesidepisodesqueryparamsResponse.setData(expectedValue);
        final List<String> result = jSeriesidepisodesqueryparamsResponse.getData();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}