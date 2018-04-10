package aka.jmetaagents.main.tvdb.series.seriesidfilterparams;

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
 * JUnit skeleton for the JSeriesidfilterparamsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidfilterparamsResponse.class })
public class JSeriesidfilterparamsResponse_JUnitTest {

    /**
     * getData with an new JSeriesidfilterparamsResponse.
     */
    @org.junit.Test
    public void testGetData() {
        // arrange : set up the test
        final JSeriesidfilterparamsResponse jSeriesidfilterparamsResponse = mock(JSeriesidfilterparamsResponse.class);
        assert jSeriesidfilterparamsResponse != null;

        // act : run the test
        final List result = jSeriesidfilterparamsResponse.getData();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setData with an new JSeriesidfilterparamsResponse.
     */
    @org.junit.Test
    public void testSetData() {
        // arrange : set up the test
        final JSeriesidfilterparamsResponse jSeriesidfilterparamsResponse = mock(JSeriesidfilterparamsResponse.class);
        assert jSeriesidfilterparamsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        jSeriesidfilterparamsResponse.setData(expectedValue);
        final List<String> result = jSeriesidfilterparamsResponse.getData();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}