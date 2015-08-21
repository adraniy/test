import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;


public class ATest {

    private Logger logger;

    @Before
    public void setUp() {
        logger = mock(Logger.class);
        // when(logger.debug("123")).thenReturn();


    }

    @Test
    public void testGetSIdDefaultValue() throws Exception {
        A a = new A();
        assertEquals(999, a.getSId());
        logger.debug("asdasdasd");
        // verify(logger).debug("getSId");
    }

    @Test
    public void testGetSId() throws Exception {
        A a = new A();
        a.setId(3);
        assertEquals(3, a.getSId());
        a.setId(5);
        assertEquals(5, a.getSId());
        logger.debug("as111d");

    }

}