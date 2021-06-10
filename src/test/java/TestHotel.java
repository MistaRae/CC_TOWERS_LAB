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
    private Guest guest1;
    private Guest guest2;

    @Before
    public void setUp(){
        occupants = new ArrayList<>();
        conferenceRoom1 = new ConferenceRoom(occupants,5, "Winchester" );
        bedroom1 = new Bedroom(occupants,1,RoomType.SINGLE);
        listOfBedrooms = new ArrayList<>();
        listOfConferenceRooms = new ArrayList<>();
        guests = new ArrayList<>();
        hotel = new Hotel("The Ritz", listOfBedrooms, listOfConferenceRooms, guests );
        guest1 = new Guest ("Barry");
        guest2 = new Guest ("Jo");
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

    @Test
    public void hotelCanAddToGuestsList(){
        hotel.addtoGuestList(guest1);
        assertEquals(1, hotel.getGuestCount());
    }

    @Test
    public void hotelCanAddToGuest(){
        hotel.addToBedrooms(bedroom1);
        hotel.checkIn(bedroom1, guest1);
        hotel.checkIn(bedroom1, guest2);
        assertEquals(1, bedroom1.getNumOfOccupants());
    }
    @Test
    public void hotelCanRemoveGuestFromBedroom(){
        hotel.addToBedrooms(bedroom1);
        hotel.checkIn(bedroom1, guest1);
        hotel.checkOut(bedroom1, guest1);
        assertEquals(0, bedroom1.getNumOfOccupants());
    }

   @Test
   public void hotelCanCheckInToConferenceRoom(){
        hotel.addToConferenceRoomList(conferenceRoom1);
        hotel.checkInToConferenceRoom(conferenceRoom1, guest1);
        assertEquals(1, conferenceRoom1.getNumOfOccupants());
   }

   @Test
    public void hotelCanCheckOutOfConferenceRoom(){
        hotel.addToConferenceRoomList(conferenceRoom1);
        hotel.checkInToConferenceRoom(conferenceRoom1, guest1);
        hotel.checkOutOfConferenceRoom(conferenceRoom1, guest1);
        assertEquals(0, conferenceRoom1.getNumOfOccupants());
   }

}
