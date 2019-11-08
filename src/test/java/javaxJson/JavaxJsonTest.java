package javaxJson;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static utils.Utils.printTestDescription;

@RunWith(JUnitPlatform.class)
public class JavaxJsonTest {

    @Test
    @DisplayName("Create JsonArray with Builder")
    public void createJsonArrayWithBuilder(TestInfo testInfo) {
        printTestDescription(testInfo);
        JavaxJson.createJsonObjectWithBuilder();
    }

    @Test
    @DisplayName("Create JsonObject reading a file with JsonReader")
    public void createJsonObjectReadingFileWithJsonReader(TestInfo testInfo) {
        printTestDescription(testInfo);
        JavaxJson.createJsonObjectReadingFileWithJsonReader();
    }

    @Test
    @DisplayName("Create json with JsonGenerator")
    public void createWithJsonGenerator(TestInfo testInfo) {
        printTestDescription(testInfo);
        JavaxJson.createWithJsonGenerator();
    }

    @Test
    @DisplayName("Read with JsonParser")
    public void readWithJsonParser(TestInfo testInfo) {
        printTestDescription(testInfo);
        JavaxJson.readWithJsonParser();
    }
}