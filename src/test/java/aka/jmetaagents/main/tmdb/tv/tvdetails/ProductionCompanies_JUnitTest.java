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
 * JUnit skeleton for the ProductionCompanies object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ ProductionCompanies.class })
public class ProductionCompanies_JUnitTest {

    /**
     * getLogoPath with an new ProductionCompanies.
     */
    @org.junit.Test
    public void testGetLogoPath() {
        // arrange : set up the test
        final ProductionCompanies productionCompanies = mock(ProductionCompanies.class);
        assert productionCompanies != null;

        // act : run the test
        final String result = productionCompanies.getLogoPath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLogoPath with an new ProductionCompanies.
     */
    @org.junit.Test
    public void testSetLogoPath() {
        // arrange : set up the test
        final ProductionCompanies productionCompanies = mock(ProductionCompanies.class);
        assert productionCompanies != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        productionCompanies.setLogoPath(expectedValue);
        final String result = productionCompanies.getLogoPath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new ProductionCompanies.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final ProductionCompanies productionCompanies = mock(ProductionCompanies.class);
        assert productionCompanies != null;

        // act : run the test
        final String result = productionCompanies.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new ProductionCompanies.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final ProductionCompanies productionCompanies = mock(ProductionCompanies.class);
        assert productionCompanies != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        productionCompanies.setName(expectedValue);
        final String result = productionCompanies.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new ProductionCompanies.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final ProductionCompanies productionCompanies = mock(ProductionCompanies.class);
        assert productionCompanies != null;

        // act : run the test
        final Integer result = productionCompanies.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new ProductionCompanies.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final ProductionCompanies productionCompanies = mock(ProductionCompanies.class);
        assert productionCompanies != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        productionCompanies.setId(expectedValue);
        final Integer result = productionCompanies.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOriginCountry with an new ProductionCompanies.
     */
    @org.junit.Test
    public void testGetOriginCountry() {
        // arrange : set up the test
        final ProductionCompanies productionCompanies = mock(ProductionCompanies.class);
        assert productionCompanies != null;

        // act : run the test
        final String result = productionCompanies.getOriginCountry();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOriginCountry with an new ProductionCompanies.
     */
    @org.junit.Test
    public void testSetOriginCountry() {
        // arrange : set up the test
        final ProductionCompanies productionCompanies = mock(ProductionCompanies.class);
        assert productionCompanies != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        productionCompanies.setOriginCountry(expectedValue);
        final String result = productionCompanies.getOriginCountry();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}