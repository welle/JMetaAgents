package aka.jmetaagents.main.tvdb.series.seriesidactors;

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
 * JUnit skeleton for the JSeriesidactorsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidactorsResponse.class })
public class JSeriesidactorsResponse_JUnitTest {

    /**
     * getData with an new JSeriesidactorsResponse.
     */
    @org.junit.Test
    public void testGetData() {
        // arrange : set up the test
        final JSeriesidactorsResponse jSeriesidactorsResponse = mock(JSeriesidactorsResponse.class);
        assert jSeriesidactorsResponse != null;

        // act : run the test
        final List result = jSeriesidactorsResponse.getData();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setData with an new JSeriesidactorsResponse.
     */
    @org.junit.Test
    public void testSetData() {
        // arrange : set up the test
        final JSeriesidactorsResponse jSeriesidactorsResponse = mock(JSeriesidactorsResponse.class);
        assert jSeriesidactorsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Data> expectedValue = new ArrayList<>();
        Data dataItem = new Data();
        expectedValue.add(dataItem);
        jSeriesidactorsResponse.setData(expectedValue);
        final List<Data> result = jSeriesidactorsResponse.getData();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getErrors with an new JSeriesidactorsResponse.
     */
    @org.junit.Test
    public void testGetErrors() {
        // arrange : set up the test
        final JSeriesidactorsResponse jSeriesidactorsResponse = mock(JSeriesidactorsResponse.class);
        assert jSeriesidactorsResponse != null;

        // act : run the test
        final Errors result = jSeriesidactorsResponse.getErrors();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setErrors with an new JSeriesidactorsResponse.
     */
    @org.junit.Test
    public void testSetErrors() {
        // arrange : set up the test
        final JSeriesidactorsResponse jSeriesidactorsResponse = mock(JSeriesidactorsResponse.class);
        assert jSeriesidactorsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Errors expectedValue = null;
        jSeriesidactorsResponse.setErrors(expectedValue);
        final Errors result = jSeriesidactorsResponse.getErrors();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}