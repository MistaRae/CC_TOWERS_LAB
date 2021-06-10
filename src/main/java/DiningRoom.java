import java.util.ArrayList;

public class DiningRoom extends Room {

    private String name;
    private int capacity;


    public DiningRoom(ArrayList occupants, String name, int capacity){
         super(occupants);
         this.name = name;
         this.capacity = capacity;
    }

    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }

}
