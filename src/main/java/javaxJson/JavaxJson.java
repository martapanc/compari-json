package javaxJson;

import objects.orgJson.Option;
import objects.orgJson.SupplierOffer;
import orgJson.OrgJson;
import utils.Utils;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;

public class JavaxJson {

    public static void createJsonObjectWithBuilder() {
        JsonArray optionArray = Json.createArrayBuilder()
                .add(Json.createObjectBuilder()
                        .add("car_type", "LUXURY_PEOPLE_CARRIER")
                        .add("price", 13612))
                .add(Json.createObjectBuilder()
                        .add("car_type", "PEOPLE_CARRIER")
                        .add("price", 91283))
                .build();

        JsonObject options = Json.createObjectBuilder()
                .add("supplier_name", "JOHN")
                .add("supplier_id", 23)
                .add("options", optionArray)
                .build();

        System.out.println(options);
    }

    public static void createJsonObjectReadingFileWithJsonReader() {
        JsonReader jsonReader = Json.createReader(new StringReader(Utils.readInput(OrgJson.INPUT_FILE)));
        JsonObject jsonObject = jsonReader.readObject();
        jsonReader.close();

        System.out.println(jsonObject);
    }

    public static void createWithJsonGenerator() {
        StringWriter writer = new StringWriter();
        JsonGenerator generator = Json.createGenerator(writer);
        generator
                .writeStartObject()
                .write("supplier_name", "JOHN")
                .write("supplier_id", 23)
                .writeStartArray("options")
                .writeStartObject()
                .write("car_type", "LUXURY_PEOPLE_CARRIER")
                .write("price", 13612)
                .writeEnd()
                .writeStartObject()
                .write("car_type", "EXECUTIVE")
                .write("price", 98234)
                .writeEnd()
                .writeEnd()
                .write("pickup", "3.410632,-2.157533")
                .writeEnd();
        generator.close();

        System.out.println(writer.toString());
    }

    public static void readWithJsonParser() {
        JsonParser parser = Json.createParser(new StringReader(Utils.readInput(OrgJson.INPUT_FILE)));
        while (parser.hasNext()) {
            JsonParser.Event event = parser.next();
            switch (event) {
                case START_ARRAY:
                case END_ARRAY:
                case START_OBJECT:
                case END_OBJECT:
                case VALUE_FALSE:
                case VALUE_NULL:
                case VALUE_TRUE:
                    System.out.println(event.toString());
                    break;
                case KEY_NAME:
                    System.out.print(event.toString() + " " + parser.getString() + " - ");
                    break;
                case VALUE_STRING:
                case VALUE_NUMBER:
                    System.out.println(event.toString() + " " + parser.getString());
                    break;
            }
        }
    }
}
