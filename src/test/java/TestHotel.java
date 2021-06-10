import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestHotel {

    private Hotel hotel;
    private String name;
    private ArrayList<Bedroom> listOfBedrooms;
    private ArrayList<ConferenceRoom> listOfConferenceRooms;
    private ArrayList<Guest> guests;
    private ArrayList<Booking> bookings;
    private HashMap<String, DiningRoom> diningRooms;
    private Bedroom bedroom1;
    private ConferenceRoom conferenceRoom1;
    private ArrayList<Guest> occupants;
    private Guest guest1;
    private Guest guest2;
    private DiningRoom diningRoom1;


    @Before
    public void setUp(){
        occupants = new ArrayList<>();
        conferenceRoom1 = new ConferenceRoom(occupants,5, "Winchester" );
        bedroom1 = new Bedroom(occupants,1,RoomType.SINGLE, 10.00);
        listOfBedrooms = new ArrayList<>();
        listOfConferenceRooms = new ArrayList<>();
        guests = new ArrayList<>();
        bookings = new ArrayList<>();
        hotel = new Hotel("The Ritz", listOfBedrooms, listOfConferenceRooms, guests, bookings, diningRooms);
        guest1 = new Guest ("Barry");
        guest2 = new Guest ("Jo");
        diningRoom1 = new DiningRoom(occupants,"restaurant", 50);

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
    public void hotelCanAddToConferenceRoomList(){
        hotel.addToConferenceRoomList(conferenceRoom1);
        assertEquals(1, hotel.getConferenceRoomCount());
    }

    @Test
    public void hotelCanAddToGuestsList(){
        hotel.addToGuestList(guest1);
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

    @Test
    public void canMakeNewBooking(){
        Booking newBooking = hotel.bookRoom(bedroom1,guest1,5);
        assertEquals(5, newBooking.getNightsBooked());
        assertEquals(1, hotel.getNumOfBookings());
    }

    @Test
    public void DiningRoomsStartsEmpty(){
        assertEquals(0, hotel.getNumOfDiningRooms());
    }

    @Test
    public void canAddToDiningRooms(){
        hotel.addToDiningRooms(diningRoom1);
        assertEquals(1, hotel.getNumOfDiningRooms());
    }

}
