package orgJson;

import objects.Option;
import objects.SupplierOffer;
import org.json.JSONArray;
import org.json.JSONObject;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class OrgJson {

    private static final String INPUT_FILE = "src/main/resources/input.json";

    public static void createJSONObject() {
        JSONObject object = new JSONObject();
        object.put("supplier_name", "Mark");
        object.put("supplier_id", 1);

        JSONArray options = new JSONArray();
        options.put(new JSONObject().put("car_type", "PEOPLE_CARRIER").put("price", 12345))
                .put(new JSONObject().put("car_type", "MINIBUS").put("price", 23623));
        object.put("options", options);
        printJson(object);
    }

    public static void readAndParseString() {
        printJson(new JSONObject(Utils.readInput(INPUT_FILE)));
    }

    public static void readParseAndManipulateContent() {
        JSONObject object = new JSONObject(Utils.readInput(INPUT_FILE));
        object.put("pickup", "1.0,1.0");
        object.getJSONArray("options").remove(2);
        object.getJSONArray("options");
        object.getJSONArray("options").put(new JSONObject().put("car_type", "MINIBUS").put("price", 23623));
        printJson(object);
    }

    public static void serialiseObjectToJson() {
        List<Option> options = new ArrayList<>();
        options.add(new Option("LUXURY", 1234));
        options.add(new Option("STANDARD", 5678));
        SupplierOffer supplierOffer = new SupplierOffer("Dave", 2, "1.1,2.2", "3.3,4.4", options);
        JSONObject object = new JSONObject(supplierOffer);
        printJson(object);
    }

    private static void printJson(JSONObject object) {
        System.out.println(object.toString(2));
    }
}
