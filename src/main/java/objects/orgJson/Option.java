package objects.orgJson;

public class Option {

    String carType;
    private long price;

    public Option(String carType, long price) {
        this.carType = carType;
        this.price = price;
    }

    public String getCarType() {
        return carType;
    }

    public long getPrice() {
        return price;
    }
}
