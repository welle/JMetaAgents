package aka.jmetaagents.main.tvdb.series.seriesidimages;

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
 * JUnit skeleton for the JSeriesidimagesResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidimagesResponse.class })
public class JSeriesidimagesResponse_JUnitTest {

    /**
     * getData with an new JSeriesidimagesResponse.
     */
    @org.junit.Test
    public void testGetData() {
        // arrange : set up the test
        final JSeriesidimagesResponse jSeriesidimagesResponse = mock(JSeriesidimagesResponse.class);
        assert jSeriesidimagesResponse != null;

        // act : run the test
        final Data result = jSeriesidimagesResponse.getData();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setData with an new JSeriesidimagesResponse.
     */
    @org.junit.Test
    public void testSetData() {
        // arrange : set up the test
        final JSeriesidimagesResponse jSeriesidimagesResponse = mock(JSeriesidimagesResponse.class);
        assert jSeriesidimagesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Data expectedValue = null;
        jSeriesidimagesResponse.setData(expectedValue);
        final Data result = jSeriesidimagesResponse.getData();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}