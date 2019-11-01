package objects;

import java.util.List;

public class SupplierOffer {

    private String name;
    private int id;
    private String pickup;
    private String dropOff;
    private List<Option> options;

    public SupplierOffer(String name, int id, String pickup, String dropOff, List<Option> options) {
        this.name = name;
        this.id = id;
        this.pickup = pickup;
        this.dropOff = dropOff;
        this.options = options;
    }
}
