package objects.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SupplierOffer {

    @JsonProperty("supplier_name")
    private String name;
    @JsonProperty("supplier_id")
    private int id;
    @JsonProperty("pickup")
    private String pickUp;
    @JsonProperty("dropoff")
    private String dropOff;
    @JsonProperty("options")
    private List<Option> options;

    public SupplierOffer(String name, int id, String pickup, String dropOff, List<Option> options) {
        this.name = name;
        this.id = id;
        this.pickUp = pickup;
        this.dropOff = dropOff;
        this.options = options;
    }

    // Default constructor is necessary for serialization
    public SupplierOffer() {
    }

    @Override
    public String toString() {
        return "SupplierOffer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", pickUp='" + pickUp + '\'' +
                ", dropOff='" + dropOff + '\'' +
                ", options=" + options +
                '}';
    }
}
