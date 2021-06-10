public class Bedroom {

    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int roomNumber, RoomType roomType){
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
}
