package jsonIo;

import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;
import objects.orgJson.Option;
import objects.orgJson.SupplierOffer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonIo {

    public static void serialiseToJson() {
        List<Option> options = new ArrayList<>();
        options.add(new Option("LUXURY", 1234));
        options.add(new Option("STANDARD", 5678));
        SupplierOffer supplierOffer = new SupplierOffer("JOSH", 44, "3.410632,-2.157533", "3.410632,-2.157533", options);

        String json = JsonWriter.objectToJson(supplierOffer, createPrettyPrintingArgs());
        System.out.println(json);
    }

    public static void deserialiseToObject() {
        // To be parsed correctly, the json string needs to have the Object type as property
        String supplierOfferString = "{\"@type\":\"objects.orgJson.SupplierOffer\",\"name\":\"JOSH\",\"id\":44,\"pickup\":\"3.410632,-2.157533\"," +
                "\"dropOff\":\"3.410632,-2.157533\",\"options\":{\"@type\":\"java.util.ArrayList\",\"@items\":[{\"@type\":\"objects.orgJson.Option\"," +
                "\"carType\":\"LUXURY\",\"price\":1234},{\"@type\":\"objects.orgJson.Option\",\"carType\":\"STANDARD\",\"price\":5678}]}}";

        SupplierOffer supplierOffer = (SupplierOffer) JsonReader.jsonToJava(supplierOfferString, createPrettyPrintingArgs());
        System.out.println(supplierOffer);
    }

    private static Map<String, Object> createPrettyPrintingArgs() {
        Map<String, Object> argsMap = new HashMap<>();
        argsMap.put(JsonWriter.PRETTY_PRINT, "true");
        argsMap.put(JsonWriter.TYPE, "false");
        return argsMap;
    }
}
