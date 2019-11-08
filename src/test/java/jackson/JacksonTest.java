package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static utils.Utils.printTestDescription;

@RunWith(JUnitPlatform.class)
public class JacksonTest {

    @Test
    @DisplayName("Serialize Java object to Json")
    public void serialiseToJson(TestInfo info) throws JsonProcessingException {
        printTestDescription(info);
        Jackson.serialiseToJson();
    }

    @Test
    @DisplayName("Deserialize Json to Java object")
    public void deserialiseToObject(TestInfo info) throws JsonProcessingException {
        printTestDescription(info);
        Jackson.deserialiseToObject();
    }

    @Test
    @DisplayName("Deserialize Json to JsonNode")
    public void deserialiseToJsonNode(TestInfo info) throws JsonProcessingException {
        printTestDescription(info);
        Jackson.deserialiseToJsonNode();
    }

    @Test
    @DisplayName("Create a List from a JSON Array String")
    public void createListFromJsonArrayString(TestInfo info) throws JsonProcessingException {
        printTestDescription(info);
        Jackson.createListFromJsonArrayString();
    }

    @Test
    @DisplayName("Create a Map from a JSON String")
    public void createMapFromJsonString(TestInfo info) throws JsonProcessingException {
        printTestDescription(info);
        Jackson.createMapFromJsonString();
    }

}