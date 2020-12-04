package Controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static Controller.BusinessLogic.translate;
import static org.junit.jupiter.api.Assertions.*;

public class BusinessLogicTest {

    @Test
    public void translateTest(){

        String from_lang = "en";
        String to_lang = "uk";
        String text = "Hello World!";
        String result = "Привіт Світ!";

        assertEquals(translate(from_lang, to_lang, text), result);
    }
}
