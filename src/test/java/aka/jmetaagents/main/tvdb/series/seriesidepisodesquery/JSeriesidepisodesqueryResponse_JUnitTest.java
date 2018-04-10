package aka.jmetaagents.main.tvdb.series.seriesidepisodesquery;

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
 * JUnit skeleton for the JSeriesidepisodesqueryResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidepisodesqueryResponse.class })
public class JSeriesidepisodesqueryResponse_JUnitTest {

    /**
     * getData with an new JSeriesidepisodesqueryResponse.
     */
    @org.junit.Test
    public void testGetData() {
        // arrange : set up the test
        final JSeriesidepisodesqueryResponse jSeriesidepisodesqueryResponse = mock(JSeriesidepisodesqueryResponse.class);
        assert jSeriesidepisodesqueryResponse != null;

        // act : run the test
        final List result = jSeriesidepisodesqueryResponse.getData();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setData with an new JSeriesidepisodesqueryResponse.
     */
    @org.junit.Test
    public void testSetData() {
        // arrange : set up the test
        final JSeriesidepisodesqueryResponse jSeriesidepisodesqueryResponse = mock(JSeriesidepisodesqueryResponse.class);
        assert jSeriesidepisodesqueryResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Data> expectedValue = new ArrayList<>();
        Data dataItem = new Data();
        expectedValue.add(dataItem);
        jSeriesidepisodesqueryResponse.setData(expectedValue);
        final List<Data> result = jSeriesidepisodesqueryResponse.getData();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLinks with an new JSeriesidepisodesqueryResponse.
     */
    @org.junit.Test
    public void testGetLinks() {
        // arrange : set up the test
        final JSeriesidepisodesqueryResponse jSeriesidepisodesqueryResponse = mock(JSeriesidepisodesqueryResponse.class);
        assert jSeriesidepisodesqueryResponse != null;

        // act : run the test
        final Links result = jSeriesidepisodesqueryResponse.getLinks();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLinks with an new JSeriesidepisodesqueryResponse.
     */
    @org.junit.Test
    public void testSetLinks() {
        // arrange : set up the test
        final JSeriesidepisodesqueryResponse jSeriesidepisodesqueryResponse = mock(JSeriesidepisodesqueryResponse.class);
        assert jSeriesidepisodesqueryResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Links expectedValue = null;
        jSeriesidepisodesqueryResponse.setLinks(expectedValue);
        final Links result = jSeriesidepisodesqueryResponse.getLinks();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getErrors with an new JSeriesidepisodesqueryResponse.
     */
    @org.junit.Test
    public void testGetErrors() {
        // arrange : set up the test
        final JSeriesidepisodesqueryResponse jSeriesidepisodesqueryResponse = mock(JSeriesidepisodesqueryResponse.class);
        assert jSeriesidepisodesqueryResponse != null;

        // act : run the test
        final Errors result = jSeriesidepisodesqueryResponse.getErrors();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setErrors with an new JSeriesidepisodesqueryResponse.
     */
    @org.junit.Test
    public void testSetErrors() {
        // arrange : set up the test
        final JSeriesidepisodesqueryResponse jSeriesidepisodesqueryResponse = mock(JSeriesidepisodesqueryResponse.class);
        assert jSeriesidepisodesqueryResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Errors expectedValue = null;
        jSeriesidepisodesqueryResponse.setErrors(expectedValue);
        final Errors result = jSeriesidepisodesqueryResponse.getErrors();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}