package aka.jmetaagents.main.tmdb.tv.tvrecommandations;

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
 * JUnit skeleton for the JTvrecommandationsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvrecommandationsResponse.class })
public class JTvrecommandationsResponse_JUnitTest {

    /**
     * getPage with an new JTvrecommandationsResponse.
     */
    @org.junit.Test
    public void testGetPage() {
        // arrange : set up the test
        final JTvrecommandationsResponse jTvrecommandationsResponse = mock(JTvrecommandationsResponse.class);
        assert jTvrecommandationsResponse != null;

        // act : run the test
        final Integer result = jTvrecommandationsResponse.getPage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPage with an new JTvrecommandationsResponse.
     */
    @org.junit.Test
    public void testSetPage() {
        // arrange : set up the test
        final JTvrecommandationsResponse jTvrecommandationsResponse = mock(JTvrecommandationsResponse.class);
        assert jTvrecommandationsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvrecommandationsResponse.setPage(expectedValue);
        final Integer result = jTvrecommandationsResponse.getPage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTotalPages with an new JTvrecommandationsResponse.
     */
    @org.junit.Test
    public void testGetTotalPages() {
        // arrange : set up the test
        final JTvrecommandationsResponse jTvrecommandationsResponse = mock(JTvrecommandationsResponse.class);
        assert jTvrecommandationsResponse != null;

        // act : run the test
        final Integer result = jTvrecommandationsResponse.getTotalPages();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTotalPages with an new JTvrecommandationsResponse.
     */
    @org.junit.Test
    public void testSetTotalPages() {
        // arrange : set up the test
        final JTvrecommandationsResponse jTvrecommandationsResponse = mock(JTvrecommandationsResponse.class);
        assert jTvrecommandationsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvrecommandationsResponse.setTotalPages(expectedValue);
        final Integer result = jTvrecommandationsResponse.getTotalPages();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getResults with an new JTvrecommandationsResponse.
     */
    @org.junit.Test
    public void testGetResults() {
        // arrange : set up the test
        final JTvrecommandationsResponse jTvrecommandationsResponse = mock(JTvrecommandationsResponse.class);
        assert jTvrecommandationsResponse != null;

        // act : run the test
        final List result = jTvrecommandationsResponse.getResults();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setResults with an new JTvrecommandationsResponse.
     */
    @org.junit.Test
    public void testSetResults() {
        // arrange : set up the test
        final JTvrecommandationsResponse jTvrecommandationsResponse = mock(JTvrecommandationsResponse.class);
        assert jTvrecommandationsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Results> expectedValue = new ArrayList<>();
        Results resultsItem = new Results();
        expectedValue.add(resultsItem);
        jTvrecommandationsResponse.setResults(expectedValue);
        final List<Results> result = jTvrecommandationsResponse.getResults();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTotalResults with an new JTvrecommandationsResponse.
     */
    @org.junit.Test
    public void testGetTotalResults() {
        // arrange : set up the test
        final JTvrecommandationsResponse jTvrecommandationsResponse = mock(JTvrecommandationsResponse.class);
        assert jTvrecommandationsResponse != null;

        // act : run the test
        final Integer result = jTvrecommandationsResponse.getTotalResults();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTotalResults with an new JTvrecommandationsResponse.
     */
    @org.junit.Test
    public void testSetTotalResults() {
        // arrange : set up the test
        final JTvrecommandationsResponse jTvrecommandationsResponse = mock(JTvrecommandationsResponse.class);
        assert jTvrecommandationsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvrecommandationsResponse.setTotalResults(expectedValue);
        final Integer result = jTvrecommandationsResponse.getTotalResults();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}