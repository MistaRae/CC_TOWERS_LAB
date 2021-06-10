import java.util.ArrayList;

public abstract class Room {

    private static ArrayList<Guest> occupants;

    public Room(ArrayList<Guest> occupants){
        this.occupants = occupants;
    }

    public static void addGuestToOccupants(Guest guest) {
        occupants.add(guest);
    }

    public int getNumOfOccupants() {
        return occupants.size();
    }
}
