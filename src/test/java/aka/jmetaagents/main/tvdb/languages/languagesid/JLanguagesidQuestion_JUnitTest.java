package aka.jmetaagents.main.tvdb.languages.languagesid;

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
 * JUnit skeleton for the JLanguagesidQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JLanguagesidQuestion.class })
public class JLanguagesidQuestion_JUnitTest {

    /**
     * getId with an new JLanguagesidQuestion.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JLanguagesidQuestion jLanguagesidQuestion = mock(JLanguagesidQuestion.class);
        assert jLanguagesidQuestion != null;

        // act : run the test
        final Integer result = jLanguagesidQuestion.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JLanguagesidQuestion.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JLanguagesidQuestion jLanguagesidQuestion = mock(JLanguagesidQuestion.class);
        assert jLanguagesidQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jLanguagesidQuestion.setId(expectedValue);
        final Integer result = jLanguagesidQuestion.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}