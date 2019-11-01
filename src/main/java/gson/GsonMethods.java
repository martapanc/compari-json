package gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import objects.gson.Option;
import objects.gson.SupplierOffer;
import orgJson.OrgJson;
import utils.Utils;

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

        printJson(gson.fromJson(input, SupplierOffer.class));
    }

    private static void printJson(String gson) {
        System.out.println(gson);
    }

    private static void printJson(Object gson) {
        System.out.println(gson.toString());
    }
}
