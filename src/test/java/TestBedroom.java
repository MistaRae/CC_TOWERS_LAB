import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBedroom {

    Bedroom bedroom;

    @Before
    public void setUp(){
        bedroom = new Bedroom(1, RoomType.SINGLE);
    }

    @Test
    public void canGetRoomNum(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.SINGLE, bedroom.getRoomTypeFromEnum());
    }

    @Test
    public void canGetRoomTypeCpacity(){
        assertEquals(1, bedroom.getCapacityFromEnum());
    }

}
