package jsonSimple;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static utils.Utils.printTestDescription;

@RunWith(JUnitPlatform.class)
public class JsonSimpleTest {

    @Test
    @DisplayName("Serialize Java object to Json")
    public void serialiseToJson(TestInfo info) {
        printTestDescription(info);
        JsonSimple.serialiseObjectToJson();
    }

    @Test
    @DisplayName("Deserialize Json to Java object")
    public void deserialiseToObject(TestInfo info) {
        printTestDescription(info);
        JsonSimple.deserialiseToObject();
    }
}