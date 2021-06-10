import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;
//    private ArrayList<Guest> occupants;
//    private occupants = new ArrayList<>();


    public Bedroom(ArrayList occupants, int roomNumber, RoomType roomType){
        super(occupants);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public RoomType getRoomTypeFromEnum() {
        return this.roomType;
    }

    public int getCapacityFromEnum() {
        return this.roomType.getCapacity();
    }

    public void addGuestToBedroomOccupants(Guest guest) {
        addGuestToOccupants(guest);

    }
    public void removeGuestFromBedroomOccupants(Guest guest){
        removeGuestFromOccupants(guest);
    }
}
