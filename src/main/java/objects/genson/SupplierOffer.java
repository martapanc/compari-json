package objects.genson;

import com.owlike.genson.annotation.JsonProperty;

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
    private List<Option> options;

    public SupplierOffer(String name, int id, String pickup, String dropOff, List<Option> options) {
        this.name = name;
        this.id = id;
        this.pickUp = pickup;
        this.dropOff = dropOff;
        this.options = options;
    }

    @Override
    public String toString() {
        return "SupplierOffer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", pickup='" + pickUp + '\'' +
                ", dropOff='" + dropOff + '\'' +
                ", options=" + options +
                '}';
    }

    public List<Option> getOptions() {
        return options;
    }
}
