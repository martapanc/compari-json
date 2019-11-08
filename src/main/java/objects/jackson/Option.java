package objects.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Option {

    @JsonProperty("car_type")
    String carType;
    @JsonProperty("price")
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
}
