package objects.genson;

public class Address {
    private int building;
    private String city;

    public Address(int building, String city) {
        this.building = building;
        this.city = city;
    }

//    public void setBuilding(int building) {
//        this.building = building;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }

    @Override
    public String toString() {
        return "Address{" +
                "building=" + building +
                ", city='" + city + '\'' +
                '}';
    }
}
