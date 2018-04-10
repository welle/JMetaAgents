package aka.jmetaagents.main.tvdb.series.seriesidepisodes;

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
 * JUnit skeleton for the JSeriesidepisodesResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidepisodesResponse.class })
public class JSeriesidepisodesResponse_JUnitTest {

    /**
     * getData with an new JSeriesidepisodesResponse.
     */
    @org.junit.Test
    public void testGetData() {
        // arrange : set up the test
        final JSeriesidepisodesResponse jSeriesidepisodesResponse = mock(JSeriesidepisodesResponse.class);
        assert jSeriesidepisodesResponse != null;

        // act : run the test
        final List result = jSeriesidepisodesResponse.getData();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setData with an new JSeriesidepisodesResponse.
     */
    @org.junit.Test
    public void testSetData() {
        // arrange : set up the test
        final JSeriesidepisodesResponse jSeriesidepisodesResponse = mock(JSeriesidepisodesResponse.class);
        assert jSeriesidepisodesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Data> expectedValue = new ArrayList<>();
        Data dataItem = new Data();
        expectedValue.add(dataItem);
        jSeriesidepisodesResponse.setData(expectedValue);
        final List<Data> result = jSeriesidepisodesResponse.getData();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLinks with an new JSeriesidepisodesResponse.
     */
    @org.junit.Test
    public void testGetLinks() {
        // arrange : set up the test
        final JSeriesidepisodesResponse jSeriesidepisodesResponse = mock(JSeriesidepisodesResponse.class);
        assert jSeriesidepisodesResponse != null;

        // act : run the test
        final Links result = jSeriesidepisodesResponse.getLinks();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLinks with an new JSeriesidepisodesResponse.
     */
    @org.junit.Test
    public void testSetLinks() {
        // arrange : set up the test
        final JSeriesidepisodesResponse jSeriesidepisodesResponse = mock(JSeriesidepisodesResponse.class);
        assert jSeriesidepisodesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Links expectedValue = null;
        jSeriesidepisodesResponse.setLinks(expectedValue);
        final Links result = jSeriesidepisodesResponse.getLinks();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getErrors with an new JSeriesidepisodesResponse.
     */
    @org.junit.Test
    public void testGetErrors() {
        // arrange : set up the test
        final JSeriesidepisodesResponse jSeriesidepisodesResponse = mock(JSeriesidepisodesResponse.class);
        assert jSeriesidepisodesResponse != null;

        // act : run the test
        final Errors result = jSeriesidepisodesResponse.getErrors();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setErrors with an new JSeriesidepisodesResponse.
     */
    @org.junit.Test
    public void testSetErrors() {
        // arrange : set up the test
        final JSeriesidepisodesResponse jSeriesidepisodesResponse = mock(JSeriesidepisodesResponse.class);
        assert jSeriesidepisodesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Errors expectedValue = null;
        jSeriesidepisodesResponse.setErrors(expectedValue);
        final Errors result = jSeriesidepisodesResponse.getErrors();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}