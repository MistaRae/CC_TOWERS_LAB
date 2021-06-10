import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> listOfBedrooms;
    private ArrayList<ConferenceRoom> listOfConferenceRooms;
    private ArrayList<Guest> listOfGuests;
    private ArrayList<Booking> listOfBookings;
    private HashMap<String, DiningRoom> diningRooms;


    public Hotel(String name, ArrayList listOfBedrooms, ArrayList listOfConferenceRooms, ArrayList guests, ArrayList listOfBookings, HashMap diningRooms){
        this.name = name;
        this.listOfBedrooms = new ArrayList<>();
        this.listOfConferenceRooms = new ArrayList<>();
        this.listOfGuests = new ArrayList<>();
        this.listOfBookings = new ArrayList<>();
        this.diningRooms = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public int getBedroomCount() {
        return this.listOfBedrooms.size();
    }

    public int getConferenceRoomCount() {
        return this.listOfConferenceRooms.size();
    }

    public int getGuestCount() {
        return this.listOfGuests.size();
    }

    public void addToBedrooms(Bedroom bedroom) {
        this.listOfBedrooms.add(bedroom);

    }

    public void addToConferenceRoomList(ConferenceRoom conferenceRoom) {
        this.listOfConferenceRooms.add(conferenceRoom);
    }

    public void addToGuestList(Guest guest) {
        this.listOfGuests.add(guest);
    }

    public void checkIn(Bedroom bedroom, Guest guest) {
        int bedroomCapacity = bedroom.getCapacityFromEnum();
        int bedroomOccupants = bedroom.getNumOfOccupants();
        for (Bedroom room : listOfBedrooms) {
            if (room == bedroom && bedroomOccupants < bedroomCapacity){
                bedroom.addGuestToBedroomOccupants(guest);
            }
        }

    }
    public void checkOut(Bedroom bedroom, Guest guest){
        bedroom.removeGuestFromBedroomOccupants(guest);


    }

    public void checkInToConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        int conferenceRoomCapacity = conferenceRoom.getCapacity();
        int conferenceRoomOccupants = conferenceRoom.getNumOfOccupants();
        for (ConferenceRoom room : listOfConferenceRooms) {
            if (room == conferenceRoom && conferenceRoomOccupants < conferenceRoomCapacity){
                conferenceRoom.addGuestToConferenceRoomOccupants(guest);
            }
        }
    }

    public void checkOutOfConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.removeGuestFromConferenceRoomOccupants(guest);
    }

    public Booking bookRoom(Bedroom bedroom, Guest guest, int nightsBooked) {
        Booking newBooking = new Booking(bedroom, guest, nightsBooked);
        this.listOfBookings.add(newBooking);
        return newBooking;
    }

    public int getNumOfBookings() {
        return listOfBookings.size();
    }

    public int getNumOfDiningRooms() {
        return diningRooms.size();
    }

    public void addToDiningRooms(DiningRoom diningRoom) {
        String key = diningRoom.getName();
        diningRooms.put(key, diningRoom);
    }
}
