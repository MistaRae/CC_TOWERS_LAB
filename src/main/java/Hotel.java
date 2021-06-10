import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> listOfBedrooms;
    private ArrayList<ConferenceRoom> listOfConferenceRooms;
    private ArrayList<Guest> listOfGuests;

    public Hotel(String name, ArrayList listOfBedrooms, ArrayList listOfConferenceRooms, ArrayList guests ){
        this.name = name;
        this.listOfBedrooms = new ArrayList<>();
        this.listOfConferenceRooms = new ArrayList<>();
        this.listOfGuests = new ArrayList<>();
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
}
