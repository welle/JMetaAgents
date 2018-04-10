package aka.jmetaagents.main.tvdb.series.seriesidimagesquery;

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
 * JUnit skeleton for the JSeriesidimagesqueryResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidimagesqueryResponse.class })
public class JSeriesidimagesqueryResponse_JUnitTest {

    /**
     * getData with an new JSeriesidimagesqueryResponse.
     */
    @org.junit.Test
    public void testGetData() {
        // arrange : set up the test
        final JSeriesidimagesqueryResponse jSeriesidimagesqueryResponse = mock(JSeriesidimagesqueryResponse.class);
        assert jSeriesidimagesqueryResponse != null;

        // act : run the test
        final List result = jSeriesidimagesqueryResponse.getData();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setData with an new JSeriesidimagesqueryResponse.
     */
    @org.junit.Test
    public void testSetData() {
        // arrange : set up the test
        final JSeriesidimagesqueryResponse jSeriesidimagesqueryResponse = mock(JSeriesidimagesqueryResponse.class);
        assert jSeriesidimagesqueryResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Data> expectedValue = new ArrayList<>();
        Data dataItem = new Data();
        expectedValue.add(dataItem);
        jSeriesidimagesqueryResponse.setData(expectedValue);
        final List<Data> result = jSeriesidimagesqueryResponse.getData();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getErrors with an new JSeriesidimagesqueryResponse.
     */
    @org.junit.Test
    public void testGetErrors() {
        // arrange : set up the test
        final JSeriesidimagesqueryResponse jSeriesidimagesqueryResponse = mock(JSeriesidimagesqueryResponse.class);
        assert jSeriesidimagesqueryResponse != null;

        // act : run the test
        final Errors result = jSeriesidimagesqueryResponse.getErrors();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setErrors with an new JSeriesidimagesqueryResponse.
     */
    @org.junit.Test
    public void testSetErrors() {
        // arrange : set up the test
        final JSeriesidimagesqueryResponse jSeriesidimagesqueryResponse = mock(JSeriesidimagesqueryResponse.class);
        assert jSeriesidimagesqueryResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Errors expectedValue = null;
        jSeriesidimagesqueryResponse.setErrors(expectedValue);
        final Errors result = jSeriesidimagesqueryResponse.getErrors();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}