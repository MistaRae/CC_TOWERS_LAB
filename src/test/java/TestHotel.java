import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestHotel {

    private Hotel hotel;
    private String name;
    private ArrayList<Bedroom> listOfBedrooms;
    private ArrayList<ConferenceRoom> listOfConferenceRooms;
    private ArrayList<Guest> guests;
    private Bedroom bedroom1;
    private ConferenceRoom conferenceRoom1;
    private ArrayList<Guest> occupants;

    @Before
    public void setUp(){
        occupants = new ArrayList<>();
        conferenceRoom1 = new ConferenceRoom(occupants,5, "Winchester" );
        bedroom1 = new Bedroom(1,RoomType.SINGLE);
        listOfBedrooms = new ArrayList<>();
        listOfConferenceRooms = new ArrayList<>();
        guests = new ArrayList<>();
        hotel = new Hotel("The Ritz", listOfBedrooms, listOfConferenceRooms, guests );
    }

    @Test
    public void hotelHasAName(){
        assertEquals("The Ritz", hotel.getName());
    }

    @Test
    public void hotelBedroomListThatStartsEmpty(){
        assertEquals(0, hotel.getBedroomCount());
    }

    @Test
    public void hotelConferenceRoomListStartEmpty(){
        assertEquals(0, hotel.getConferenceRoomCount());
    }

    @Test
    public void hotelStartsWithNoGuests(){
        assertEquals(0, hotel.getGuestCount());
    }

    @Test
    public void hotelCanAddToBedroomsList(){
        hotel.addToBedrooms(bedroom1);
        assertEquals(1, hotel.getBedroomCount());
    }

    @Test
    public void hotelCanAddtoConferenceRoomList(){
        hotel.addToConferenceRoomList(conferenceRoom1);
        assertEquals(1, hotel.getConferenceRoomCount());
    }

//    @Test
//    public void hotelCanAddToGuestsList(){
//        hotel.
//    }

}
