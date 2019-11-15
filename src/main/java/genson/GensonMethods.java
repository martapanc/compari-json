package genson;

import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;
import objects.genson.Option;
import objects.genson.Person;
import objects.genson.SupplierOffer;
import orgJson.OrgJson;
import utils.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GensonMethods {

    private static final String INPUT = Utils.readInput(OrgJson.INPUT_FILE);
    private static final String PERSON_JSON = "{\"name\": \"Marta\", \"age\": 24, \"address\": {\"building\": 109, \"city\": \"Manchester\"}}";

    public static void serialiseObjectToJson() {
        List<Option> options = new ArrayList<>();
        options.add(new Option("LUXURY", 1234));
        options.add(new Option("STANDARD", 5678));
        SupplierOffer supplierOffer = new SupplierOffer("JOSH", 44, "3.410632,-2.157533", "3.410632,-2.157533", options);

        System.out.println(buildGenson().serialize(supplierOffer));
    }

    public static void serialiseMapToJson() {
        List<Option> options = new ArrayList<>();
        options.add(new Option("LUXURY", 1234));
        options.add(new Option("STANDARD", 5678));

        Map<String, Object> supplierOffer = new HashMap<>();
        supplierOffer.put("name", "ADAM");
        supplierOffer.put("id", 25);
        supplierOffer.put("options", options);

        System.out.println(buildGenson().serialize(supplierOffer));
    }

    public static void deserialiseToObject() {
        Genson g = buildGenson();
        System.out.println(g.deserialize(PERSON_JSON, Person.class));
        System.out.println(g.deserialize(INPUT, SupplierOffer.class));
    }

    public static void deserialiseToMap() {
        Genson g = buildGenson();
        System.out.println(g.deserialize(PERSON_JSON, Map.class));
        System.out.println(g.deserialize(INPUT, Map.class));
    }

    private static Genson buildGenson() {
        return new GensonBuilder()
                .useIndentation(true)
                .useRuntimeType(true)
                .useConstructorWithArguments(true)
                .create();
    }
}
