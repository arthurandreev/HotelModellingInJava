import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guests;

    //constructor
    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    //getters
    public int getCapacity() {
        return this.capacity;
    }

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public int guestCount() {
        return this.guests.size();
    }

    public boolean roomUnderCapacity() {
        return this.guests.size() < this.capacity;
    }

    public boolean roomOverCapacity() {
        return this.guests.size() > this.capacity;
    }

    public void checkInGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void checkOutGuest(Guest guest) {
        this.guests.remove(guest);
    }
}


