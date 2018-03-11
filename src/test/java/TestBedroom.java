import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestBedroom {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(BedroomType.DOUBLE, 10);
        guest = new Guest("Robocop");
    }

    @Test
    public void bedroomHasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void bedroomHasNumber() {
        assertEquals(10, bedroom.getRoomNumber());
    }

    @Test
    public void bedroomHasType() {
        assertEquals(BedroomType.DOUBLE, bedroom.getBedroomType());
    }

    @Test
    public void bedroomHasPrice(){
        assertEquals(60, bedroom.getNightlyRate());
    }

    @Test
    public void bedroomIsUnderCapacity() {
        assertTrue(bedroom.roomUnderCapacity());
    }

    @Test
    public void roomIsAtCapacity() {
        bedroom.checkInGuest(guest);
        bedroom.checkInGuest(guest);
        bedroom.checkInGuest(guest);
        assertTrue(bedroom.roomOverCapacity());
    }

    @Test
    public void bedroomHasGuests() {
        ArrayList<Guest> guests = new ArrayList<>();
        assertEquals(guests, bedroom.getGuests());
    }


    @Test
    public void getBedroomGuestCount() {
        bedroom.checkInGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canCheckInGuest() {
        bedroom.checkInGuest(guest);
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void canCheckOutGuest() {
        bedroom.checkInGuest(guest);
        bedroom.checkOutGuest(guest);
        assertEquals(0, bedroom.getGuests().size());
    }

}