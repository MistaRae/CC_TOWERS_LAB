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

    @Before
    public void setUp(){
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


}
