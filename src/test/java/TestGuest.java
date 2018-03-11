import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {
    private Guest guest;

    @Before
    public void before() { guest = new Guest("Donald Trump");}

    @Test
    public void canGetGuestName() {
        assertEquals("Donald Trump", this.guest.getGuestName());
    }

}
