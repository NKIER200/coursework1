/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
package Dec2HexTest2;


import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest2 {
    @Test
    public void InputValida2on() {
//This tests to make sure that with no input the coce still runs and displays the correct message to the user. Asking for an input.
        assertEquals("nothing was input, try again with an input", Dec2Hex.hexi(new String[0] ));

    }
}

