package gson;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static utils.Utils.printTestDescription;

@RunWith(JUnitPlatform.class)
public class GsonMethodsTest {

    @Test
    @DisplayName("Serialise string to Json format with toJson")
    public void serialiseToJson(TestInfo info) {
        printTestDescription(info);
        GsonMethods.serialiseToJson();
    }

    @Test
    @DisplayName("Deserialise Json string to object with fromJson")
    public void deserialiseToObject(TestInfo info) {
        printTestDescription(info);
        GsonMethods.deserialiseToObject();
    }

    @Test
    @DisplayName("Create a JsonObject manually nesting JsonObjects and JsonArrays")
    public void createWithJsonArrayAndJsonObject(TestInfo info) {
        printTestDescription(info);
        GsonMethods.createWithJsonArrayAndJsonObject();
    }

    @Test
    @DisplayName("Create a JsonObject by parsing a json file")
    public void createWithJsonObjectAndParsingFile(TestInfo info) {
        printTestDescription(info);
        GsonMethods.createWithJsonObjectAndParsingFile();
    }

}