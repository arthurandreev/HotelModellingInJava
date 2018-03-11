import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestConferenceRoom {
    ConferenceRoom room;
    Guest guest;

    @Before
    public void before() {
        room = new ConferenceRoom(100, "Loch Fyne", 75 );
        guest = new Guest("Chicken Colonel");
    }

    @Test
    public void roomHasCapacity() {
        assertEquals(100, room.getCapacity());
    }

    @Test
    public void roomHasName(){
        assertEquals("Loch Fyne", room.getName());
    }

    @Test
    public void roomHasPrice() {
        assertEquals(75, room.getPrice());
    }

    @Test
    public void roomHasGuests() {
        ArrayList<Guest> guests = new ArrayList<>();
        assertEquals(guests, room.getGuests());
    }

    @Test
    public void getGuestCount() {
        for (int i = 0; i < 100; i++) {
            room.checkInGuest(guest);
        }
        assertEquals(100, room.guestCount());
    }

    @Test
    public void roomIsUnderCapacity() {
        for (int i = 0; i < 99; i++) {
            room.checkInGuest(guest);
        }
        assertTrue(room.roomUnderCapacity());
    }

    @Test
    public void roomIsOverCapacity() {
        for (int i = 0; i < 101; i++) {
            room.checkInGuest(guest);
        }
        assertTrue(room.roomOverCapacity());
    }

        @Test
        public void canCheckInGuest() {
            room.checkInGuest(guest);
            room.checkInGuest(guest);
            room.checkInGuest(guest);
            assertEquals(3, room.getGuests().size());
        }

        @Test
        public void canCheckOutGuest() {
            room.checkInGuest(guest);
            room.checkInGuest(guest);
            room.checkOutGuest(guest);
            assertEquals(1, room.getGuests().size());
        }
    }
