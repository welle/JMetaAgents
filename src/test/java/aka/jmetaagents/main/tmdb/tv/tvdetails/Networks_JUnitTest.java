package aka.jmetaagents.main.tmdb.tv.tvdetails;

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
 * JUnit skeleton for the Networks object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Networks.class })
public class Networks_JUnitTest {

    /**
     * getName with an new Networks.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final Networks networks = mock(Networks.class);
        assert networks != null;

        // act : run the test
        final String result = networks.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new Networks.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final Networks networks = mock(Networks.class);
        assert networks != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        networks.setName(expectedValue);
        final String result = networks.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new Networks.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final Networks networks = mock(Networks.class);
        assert networks != null;

        // act : run the test
        final Integer result = networks.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new Networks.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final Networks networks = mock(Networks.class);
        assert networks != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        networks.setId(expectedValue);
        final Integer result = networks.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}