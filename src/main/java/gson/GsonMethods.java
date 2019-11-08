package gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import objects.gson.Option;
import objects.gson.SupplierOffer;
import orgJson.OrgJson;
import utils.Utils;

import javax.json.Json;
import java.util.ArrayList;
import java.util.List;

public class GsonMethods {

    public static void serialiseToJson() {
        List<Option> options = new ArrayList<>();
        options.add(new Option("LUXURY", 1234));
        options.add(new Option("STANDARD", 5678));
        SupplierOffer supplierOffer = new SupplierOffer("Dave", 2, "1.1,2.2", "3.3,4.4", options);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        printJson(gson.toJson(supplierOffer));
    }

    public static void deserialiseToObject() {
        String input = Utils.readInput(OrgJson.INPUT_FILE);
        Gson gson = new Gson();

        SupplierOffer offer = gson.fromJson(input, SupplierOffer.class);
        printJson(offer);

        List<Option> options = offer.getOptions();
        String optionString = gson.toJson(options);
        List list = gson.fromJson(optionString, List.class);
        printJson(list);

        String singleOptionString = gson.toJson(list.get(0));
        Option option = gson.fromJson(singleOptionString, Option.class);
        printJson(option);
    }

    public static void createWithJsonArrayAndJsonObject() {
        JsonArray options = new JsonArray();
        JsonObject option1 = new JsonObject();
        option1.addProperty("car_type", "STANDARD");
        option1.addProperty("price", 1234);

        JsonObject option2 = new JsonObject();
        option2.addProperty("car_type", "MINIBUS");
        option2.addProperty("price", 5678);

        options.add(option1);
        options.add(option2);

        JsonObject supplierOffer = new JsonObject();
        supplierOffer.addProperty("supplier_name", "DAVE");
        supplierOffer.addProperty("supplier_id", 1);
        supplierOffer.add("options", options);

        printJson(supplierOffer);
    }

    public static void createWithJsonObjectAndParsingFile() {
        JsonObject supplierOffer = new Gson().fromJson(Utils.readInput(OrgJson.INPUT_FILE), JsonObject.class);

        printJson(supplierOffer);
    }

    private static void printJson(String gson) {
        System.out.println(gson);
    }

    private static void printJson(Object object) {
        printJson(object.toString());
    }

    private static void printJson(JsonObject jsonObject) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        printJson(gson.toJson(jsonObject));
    }
}
