package aka.jmetaagents.main.tmdb.movies.moviesdetails;

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
 * JUnit skeleton for the ProductionCountries object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ ProductionCountries.class })
public class ProductionCountries_JUnitTest {

    /**
     * getIso31661 with an new ProductionCountries.
     */
    @org.junit.Test
    public void testGetIso31661() {
        // arrange : set up the test
        final ProductionCountries productionCountries = mock(ProductionCountries.class);
        assert productionCountries != null;

        // act : run the test
        final String result = productionCountries.getIso31661();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setIso31661 with an new ProductionCountries.
     */
    @org.junit.Test
    public void testSetIso31661() {
        // arrange : set up the test
        final ProductionCountries productionCountries = mock(ProductionCountries.class);
        assert productionCountries != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        productionCountries.setIso31661(expectedValue);
        final String result = productionCountries.getIso31661();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new ProductionCountries.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final ProductionCountries productionCountries = mock(ProductionCountries.class);
        assert productionCountries != null;

        // act : run the test
        final String result = productionCountries.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new ProductionCountries.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final ProductionCountries productionCountries = mock(ProductionCountries.class);
        assert productionCountries != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        productionCountries.setName(expectedValue);
        final String result = productionCountries.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}