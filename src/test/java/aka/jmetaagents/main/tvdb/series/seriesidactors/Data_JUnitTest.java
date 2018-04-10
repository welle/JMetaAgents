package aka.jmetaagents.main.tvdb.series.seriesidactors;

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
 * JUnit skeleton for the Data object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Data.class })
public class Data_JUnitTest {

    /**
     * getImage with an new Data.
     */
    @org.junit.Test
    public void testGetImage() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getImage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImage with an new Data.
     */
    @org.junit.Test
    public void testSetImage() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setImage(expectedValue);
        final String result = data.getImage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLastUpdated with an new Data.
     */
    @org.junit.Test
    public void testGetLastUpdated() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getLastUpdated();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLastUpdated with an new Data.
     */
    @org.junit.Test
    public void testSetLastUpdated() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setLastUpdated(expectedValue);
        final String result = data.getLastUpdated();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRole with an new Data.
     */
    @org.junit.Test
    public void testGetRole() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getRole();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRole with an new Data.
     */
    @org.junit.Test
    public void testSetRole() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setRole(expectedValue);
        final String result = data.getRole();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImageAdded with an new Data.
     */
    @org.junit.Test
    public void testGetImageAdded() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getImageAdded();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImageAdded with an new Data.
     */
    @org.junit.Test
    public void testSetImageAdded() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setImageAdded(expectedValue);
        final String result = data.getImageAdded();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImageAuthor with an new Data.
     */
    @org.junit.Test
    public void testGetImageAuthor() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getImageAuthor();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImageAuthor with an new Data.
     */
    @org.junit.Test
    public void testSetImageAuthor() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setImageAuthor(expectedValue);
        final Integer result = data.getImageAuthor();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSortOrder with an new Data.
     */
    @org.junit.Test
    public void testGetSortOrder() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getSortOrder();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSortOrder with an new Data.
     */
    @org.junit.Test
    public void testSetSortOrder() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setSortOrder(expectedValue);
        final Integer result = data.getSortOrder();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new Data.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final String result = data.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new Data.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        data.setName(expectedValue);
        final String result = data.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new Data.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new Data.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setId(expectedValue);
        final Integer result = data.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSeriesId with an new Data.
     */
    @org.junit.Test
    public void testGetSeriesId() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        final Integer result = data.getSeriesId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeriesId with an new Data.
     */
    @org.junit.Test
    public void testSetSeriesId() {
        // arrange : set up the test
        final Data data = mock(Data.class);
        assert data != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        data.setSeriesId(expectedValue);
        final Integer result = data.getSeriesId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}