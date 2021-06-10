import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> listOfBedrooms;
    private ArrayList<ConferenceRoom> listOfConferenceRooms;
    private ArrayList<Guest> guests;

    public Hotel(String name, ArrayList listOfBedrooms, ArrayList listOfConferenceRooms, ArrayList guests ){
        this.name = name;
        this.listOfBedrooms = new ArrayList<>();
        this.listOfConferenceRooms = new ArrayList<>();
        this.guests = new ArrayList<>();
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
        return this.guests.size();
    }

    public void addToBedrooms(Bedroom bedroom) {
        this.listOfBedrooms.add(bedroom);

    }

    public void addToConferenceRoomList(ConferenceRoom conferenceRoom) {
        this.listOfConferenceRooms.add(conferenceRoom);
    }
}
