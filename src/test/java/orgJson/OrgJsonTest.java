package orgJson;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static utils.Utils.printTestDescription;

@RunWith(JUnitPlatform.class)
public class OrgJsonTest {

    @Test
    @DisplayName("Create a complex JSONObject and print it")
    public void testCreateJSONObject(TestInfo testInfo) {
        printTestDescription(testInfo);
        OrgJson.createJSONObject();
    }

    @Test
    @DisplayName("Read Json file, parse it to JSONObject and print it")
    public void readAndParseString(TestInfo testInfo) {
        printTestDescription(testInfo);
        OrgJson.readAndParseString();
    }

    @Test
    @DisplayName("Read Json file, parse it to JSONObject, add and remove content and print it")
    public void readParseAndManipulateContent(TestInfo testInfo) {
        printTestDescription(testInfo);
        OrgJson.readParseAndManipulateContent();
    }

    @Test
    @DisplayName("Construct a JSONObject from an Object using bean getters")
    public void serialiseObjectToJson(TestInfo testInfo) {
        printTestDescription(testInfo);
        OrgJson.serialiseObjectToJson();
    }

    @Test
    @DisplayName("Construct a JSONObject from a subset of another JSONObject.")
    public void createJSONObjectFromSubset(TestInfo testInfo) {
        printTestDescription(testInfo);
        OrgJson.createJSONObjectFromSubset();
    }

    @Test
    @DisplayName("Construct a JSONObject from a Map.")
    public void createJSONObjectFromMap(TestInfo testInfo) {
        printTestDescription(testInfo);
        OrgJson.createJSONObjectFromMap();
    }
}
