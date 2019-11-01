package objects.gson;

import com.google.gson.annotations.SerializedName;

public class Option {

    @SerializedName("car_type")
    private String carType;
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
