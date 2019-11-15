package genson;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static utils.Utils.printTestDescription;

@RunWith(JUnitPlatform.class)
public class GensonMethodsTest {

    @Test
    @DisplayName("Serialize Java object to Json")
    public void serialiseToJson(TestInfo info) {
        printTestDescription(info);
        GensonMethods.serialiseObjectToJson();
    }

    @Test
    @DisplayName("Serialize Map to Json")
    public void serialiseMapToJson(TestInfo info) {
        printTestDescription(info);
        GensonMethods.serialiseMapToJson();
    }

    @Test
    @DisplayName("Deserialize Json to Java object")
    public void deserialiseToObject(TestInfo info) {
        printTestDescription(info);
        GensonMethods.deserialiseToObject();
    }

    @Test
    @DisplayName("Deserialize Json to Map")
    public void deserialiseToMap(TestInfo info) {
        printTestDescription(info);
        GensonMethods.deserialiseToMap();
    }
}