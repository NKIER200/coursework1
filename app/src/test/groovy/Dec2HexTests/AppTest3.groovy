/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
package Dec2HexTests


import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void InputValidation() {

        assertEquals("Hexadecimal representation is: non existant, please enter a number", Dec2Hex.HexConvert(new String[] {"a"}));

    }
}
