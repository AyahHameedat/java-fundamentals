/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package file;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
    }



    @Test
    @DisplayName("EmptyFile")
    void emptyFile()
    {
        String test = "C:\\Users\\ayoos\\java-fundamentals\\linter\\app\\src\\main\\resources\\emptyFile.js";
        String sol= App.finalSol(test);
        String expected = "";
        assertEquals(expected ,sol);

    }

    @Test
    @DisplayName("NoError")
    void noError()
    {
        String test = "C:\\Users\\ayoos\\java-fundamentals\\linter\\app\\src\\main\\resources\\noError.js";
        String sol= App.finalSol(test);
        String expected = "";
        assertEquals(expected ,sol);

    }



    @Test
    @DisplayName("oneError")
    void oneError()
    {
        String test = "C:\\Users\\ayoos\\java-fundamentals\\linter\\app\\src\\main\\resources\\oneError.js";
        String sol= App.finalSol(test);
        String expected = "Line 5: Missing semicolon.\n";
        assertEquals(expected ,sol);

    }

    @Test
    @DisplayName("fewErrors")
    void fewErrors()
    {
        String test = "C:\\Users\\ayoos\\java-fundamentals\\linter\\app\\src\\main\\resources\\fewErrors.js";
        String sol= App.finalSol(test);
        String expected = "Line 3: Missing semicolon.\nLine 5: Missing semicolon.\n";
        assertEquals(expected ,sol);

    }

    @Test
    @DisplayName("manyErrors")
    void manyErrors()
    {
        String test = "C:\\Users\\ayoos\\java-fundamentals\\linter\\app\\src\\main\\resources\\gates.js";
        String sol= App.finalSol(test);
        String expected = "Line 3: Missing semicolon.\nLine 5: Missing semicolon.\nLine 13: Missing semicolon.\nLine 14: Missing semicolon.\nLine 15: Missing semicolon.\nLine 16: Missing semicolon.\n";
        assertEquals(expected ,sol);

    }

}
