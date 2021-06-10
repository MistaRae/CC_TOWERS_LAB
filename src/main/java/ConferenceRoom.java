import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private int capacity;
    private String name;

    public ConferenceRoom(ArrayList occupants, int capacity, String name){
        super(occupants);
        this.capacity = capacity;
        this.name = name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getName() {
        return this.name;
    }

    public void addGuestToConferenceRoomOccupants(Guest guest) {
        addGuestToOccupants(guest);
    }

    public void removeGuestFromConferenceRoomOccupants(Guest guest) {
        removeGuestFromOccupants(guest);
    }
}
