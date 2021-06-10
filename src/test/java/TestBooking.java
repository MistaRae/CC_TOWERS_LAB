import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestBooking {

    Booking booking1;
    Bedroom bedroom1;
    private ArrayList<Guest> occupants;
    Guest mark;

    @Before
    public void setUp(){
        mark = new Guest("Mark");
        bedroom1 = new Bedroom(occupants,1, RoomType.SINGLE, 10.00);
        booking1 = new Booking(bedroom1, mark, 5);
    }

    @Test
    public void bookingHasBedroom(){
        assertEquals(bedroom1, booking1.getBedroom());
    }

    @Test
    public void bookingHasGuest(){
        assertEquals(mark, booking1.getGuest());
    }

    @Test
    public void canGetBill(){
        assertEquals(50, booking1.getBill(), 0.00);
    }

}
