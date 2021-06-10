public class Booking {

    private Bedroom bedroom;
    private int nightsBooked;
    private Guest guest;

    public Booking(Bedroom bedroom,Guest guest, int nightsBooked){
        this.bedroom = bedroom;
        this.guest = guest;
        this.nightsBooked = nightsBooked;

    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNightsBooked() {
        return nightsBooked;
    }

    public Guest getGuest() {
        return this.guest;
    }

    public double getBill() {
        double rate = this.bedroom.getRate();
        return this.nightsBooked * rate;
    }
}


