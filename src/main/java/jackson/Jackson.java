package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import objects.jackson.Option;
import objects.jackson.SupplierOffer;
import orgJson.OrgJson;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Jackson {

    private static final String INPUT = Utils.readInput(OrgJson.INPUT_FILE);

    public static void serialiseToJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<Option> options = new ArrayList<>();
        options.add(new Option("LUXURY", 1234));
        options.add(new Option("STANDARD", 5678));
        SupplierOffer supplierOffer = new SupplierOffer("JOSH", 44, "3.410632,-2.157533", "3.410632,-2.157533", options);

        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(supplierOffer));
    }

    public static void deserialiseToObject() throws JsonProcessingException {
        SupplierOffer supplierOffer = new ObjectMapper().readValue(INPUT, SupplierOffer.class);
        System.out.println(supplierOffer);
    }

    public static void deserialiseToJsonNode() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(INPUT);
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode.get("options")));
    }

    public static void createListFromJsonArrayString() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String optionsString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapper.readTree(INPUT).get("options"));
        List<Option> options = mapper.readValue(optionsString, new TypeReference<List<Option>>() {});
        System.out.println(options);
    }

    public static void createMapFromJsonString() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String supplierOfferString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapper.readTree(INPUT));
        Map<String, Object> map = mapper.readValue(supplierOfferString, new TypeReference<Map<String, Object>>() {});
        System.out.println(map);
    }
}
