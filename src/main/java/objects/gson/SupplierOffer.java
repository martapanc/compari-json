package objects.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SupplierOffer {

    @SerializedName("supplier_name")
    private String name;
    @SerializedName("supplier_id")
    private int id;
    @SerializedName("pickup")
    private String pickUp;
    @SerializedName("dropoff")
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
}
