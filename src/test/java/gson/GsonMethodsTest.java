package gson;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

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

    private void printTestDescription(TestInfo testInfo) {
        System.out.println("*** " + testInfo.getDisplayName());
    }

}