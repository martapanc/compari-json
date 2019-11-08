package objects.jackson;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Option {

    private String carType;
    private long price;

    public Option(String carType, long price) {
        this.carType = carType;
        this.price = price;
    }

    public Option() {}

    @Override
    public String toString() {
        return "Option{" +
                "carType='" + carType + '\'' +
                ", price=" + price +
                '}';
    }

    @JsonGetter("car_type")
    public String getCarType() {
        return carType;
    }

    @JsonGetter("price")
    public long getPrice() {
        return price;
    }
}
