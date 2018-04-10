package aka.jmetaagents.main.tvdb.series.seriesidepisodesquery;

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
 * JUnit skeleton for the Links object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Links.class })
public class Links_JUnitTest {

    /**
     * getNext with an new Links.
     */
    @org.junit.Test
    public void testGetNext() {
        // arrange : set up the test
        final Links links = mock(Links.class);
        assert links != null;

        // act : run the test
        final Integer result = links.getNext();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setNext with an new Links.
     */
    @org.junit.Test
    public void testSetNext() {
        // arrange : set up the test
        final Links links = mock(Links.class);
        assert links != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        links.setNext(expectedValue);
        final Integer result = links.getNext();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLast with an new Links.
     */
    @org.junit.Test
    public void testGetLast() {
        // arrange : set up the test
        final Links links = mock(Links.class);
        assert links != null;

        // act : run the test
        final Integer result = links.getLast();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLast with an new Links.
     */
    @org.junit.Test
    public void testSetLast() {
        // arrange : set up the test
        final Links links = mock(Links.class);
        assert links != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        links.setLast(expectedValue);
        final Integer result = links.getLast();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPrevious with an new Links.
     */
    @org.junit.Test
    public void testGetPrevious() {
        // arrange : set up the test
        final Links links = mock(Links.class);
        assert links != null;

        // act : run the test
        final Integer result = links.getPrevious();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPrevious with an new Links.
     */
    @org.junit.Test
    public void testSetPrevious() {
        // arrange : set up the test
        final Links links = mock(Links.class);
        assert links != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        links.setPrevious(expectedValue);
        final Integer result = links.getPrevious();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFirst with an new Links.
     */
    @org.junit.Test
    public void testGetFirst() {
        // arrange : set up the test
        final Links links = mock(Links.class);
        assert links != null;

        // act : run the test
        final Integer result = links.getFirst();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFirst with an new Links.
     */
    @org.junit.Test
    public void testSetFirst() {
        // arrange : set up the test
        final Links links = mock(Links.class);
        assert links != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        links.setFirst(expectedValue);
        final Integer result = links.getFirst();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}