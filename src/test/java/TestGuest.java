import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    Guest spencer;

    @Before
    public void setUp(){
        spencer = new Guest("Spencer");
    }

    @Test
    public void canGetGuestName(){
        assertEquals("Spencer", spencer.getName());
    }

}
