import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestConferenceRoom  {

    ConferenceRoom conferenceRoom;
    Guest mark;
    ArrayList<Guest> occupants;

    @Before
    public void setUp(){
        mark = new Guest("Mark");
        occupants = new ArrayList<>();
        conferenceRoom = new ConferenceRoom(occupants,10, "Business Suite" );
    }

    @Test
    public void canGetOccupants(){
        assertEquals(0, conferenceRoom.getNumOfOccupants());
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals(10,conferenceRoom.getCapacity());
    }

    @Test
    public void canGetName(){
        assertEquals("Business Suite", conferenceRoom.getName());
    }

    @Test
    public void canCheckInToConferenceRoom(){

    }





}
