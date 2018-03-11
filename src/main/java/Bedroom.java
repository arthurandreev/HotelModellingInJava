import java.util.ArrayList;

public class Bedroom extends Room {
    private BedroomType bedroomType;
    private int nightlyRate;
    private int roomNumber;

    public Bedroom(BedroomType bedroomType, int roomNumber) {
        super(bedroomType.getCapacity());
        this.bedroomType = bedroomType;
        this.nightlyRate = bedroomType.getPrice();;
        this.roomNumber = roomNumber;
    }

    //getters
    public int getNightlyRate() {
        return this.nightlyRate;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public BedroomType getBedroomType() {
        return this.bedroomType;
    }
}

