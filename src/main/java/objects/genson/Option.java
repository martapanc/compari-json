package objects.genson;


import com.owlike.genson.annotation.JsonProperty;

public class Option {

    @JsonProperty("car_type")
    private String carType;
    @JsonProperty("price")
    private long price;

    public Option(String carType, long price) {
        this.carType = carType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Option{" +
                "car_type='" + carType + '\'' +
                ", price=" + price +
                '}';
    }
}
