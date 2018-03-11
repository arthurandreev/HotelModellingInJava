import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestDiningRoom {
    DiningRoom room;
    Guest guest;

    @Before
    public void before() {
        room = new DiningRoom("Isle of Skye", 50);
        guest = new Guest("Banki Moon");
    }

    @Test
    public void roomHasName(){
        assertEquals("Isle of Skye", room.getName());
    }

    @Test
    public void roomHasCapacity() {
        assertEquals(50, room.getCapacity());
    }

    @Test
    public void roomHasGuests() {
        ArrayList<Guest> guests = new ArrayList<>();
        assertEquals(guests, room.getGuests());
    }

    @Test
    public void getGuestCount() {
        for (int i = 0; i < 50; i++) {
            room.checkInGuest(guest);
        }
        assertEquals(50, room.guestCount());
    }

    @Test
    public void roomIsUnderCapacity() {
        for (int i = 0; i < 49; i++) {
            room.checkInGuest(guest);
        }
        assertTrue(room.roomUnderCapacity());
    }

    @Test
    public void roomIsOverCapacity() {
        for (int i = 0; i < 51; i++) {
            room.checkInGuest(guest);
        }
        assertTrue(room.roomOverCapacity());
    }

    @Test
    public void canCheckInGuest() {
        room.checkInGuest(guest);
        room.checkInGuest(guest);
        assertEquals(2, room.getGuests().size());
    }

    @Test
    public void canCheckOutGuest() {
        room.checkInGuest(guest);
        room.checkInGuest(guest);
        room.checkInGuest(guest);
        room.checkOutGuest(guest);
        assertEquals(2, room.getGuests().size());
    }

}
