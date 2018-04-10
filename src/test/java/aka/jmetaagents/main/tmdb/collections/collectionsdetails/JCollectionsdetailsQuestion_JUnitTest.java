package aka.jmetaagents.main.tmdb.collections.collectionsdetails;

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
 * JUnit skeleton for the JCollectionsdetailsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JCollectionsdetailsQuestion.class })
public class JCollectionsdetailsQuestion_JUnitTest {

    /**
     * getCollectionId with an new JCollectionsdetailsQuestion.
     */
    @org.junit.Test
    public void testGetCollectionId() {
        // arrange : set up the test
        final JCollectionsdetailsQuestion jCollectionsdetailsQuestion = mock(JCollectionsdetailsQuestion.class);
        assert jCollectionsdetailsQuestion != null;

        // act : run the test
        final Integer result = jCollectionsdetailsQuestion.getCollectionId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCollectionId with an new JCollectionsdetailsQuestion.
     */
    @org.junit.Test
    public void testSetCollectionId() {
        // arrange : set up the test
        final JCollectionsdetailsQuestion jCollectionsdetailsQuestion = mock(JCollectionsdetailsQuestion.class);
        assert jCollectionsdetailsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jCollectionsdetailsQuestion.setCollectionId(expectedValue);
        final Integer result = jCollectionsdetailsQuestion.getCollectionId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JCollectionsdetailsQuestion.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JCollectionsdetailsQuestion jCollectionsdetailsQuestion = mock(JCollectionsdetailsQuestion.class);
        assert jCollectionsdetailsQuestion != null;

        // act : run the test
        final String result = jCollectionsdetailsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JCollectionsdetailsQuestion.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JCollectionsdetailsQuestion jCollectionsdetailsQuestion = mock(JCollectionsdetailsQuestion.class);
        assert jCollectionsdetailsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCollectionsdetailsQuestion.setLanguage(expectedValue);
        final String result = jCollectionsdetailsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}