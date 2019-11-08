package orgJson;

import objects.orgJson.Option;
import objects.orgJson.SupplierOffer;
import org.json.JSONArray;
import org.json.JSONObject;
import utils.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrgJson {

    public static final String INPUT_FILE = "src/main/resources/input.json";

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

    // Construct a JSONObject from an Object using bean getters
    public static void serialiseObjectToJson() {
        List<Option> options = new ArrayList<>();
        options.add(new Option("LUXURY", 1234));
        options.add(new Option("STANDARD", 5678));
        SupplierOffer supplierOffer = new SupplierOffer("Dave", 2, "1.1,2.2", "3.3,4.4", options);
        JSONObject object = new JSONObject(supplierOffer);
        printJson(object);
    }

    // Construct a JSONObject from an subset of a JSONObject
    public static void createJSONObjectFromSubset() {
        JSONObject object = new JSONObject(Utils.readInput(INPUT_FILE));
        JSONObject subset = new JSONObject(object, new String[]{"options"});

        printJson(subset);
    }

    // Construct a JSONObject from a map
    public static void createJSONObjectFromMap() {
        Map<String, String> map = new HashMap<>();
        map.put("supplier_name", "Dave");
        map.put("supplier_id", "1");

        printJson(new JSONObject(map));
    }

    public static void deserialiseJSONObjectToObject() {
        // org.json does not provide such functionality directly.
        // The indirect way of doing it would be to retrieve each value from the JSON and perform custom deserialization
        // on that value before assigning it to an object field.
    }

    private static void printJson(JSONObject object) {
        System.out.println(object.toString(2));
    }
}
