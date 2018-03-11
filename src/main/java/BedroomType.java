public enum BedroomType {
    SINGLE(1, 40),
    DOUBLE(2, 60);

    private int capacity;
    private int price;

    BedroomType(int capacity, int price){
        this.capacity = capacity;
        this.price = price;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPrice() {
        return this.price;
    }
}
