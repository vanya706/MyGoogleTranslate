package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class BusinessLogic {
    public static String translate(String src, String dest, String text) {

        String translated;
        String error;

        try {
            Process p = Runtime.getRuntime().exec("python src\\main\\java\\Controller\\TranslateText.py "
                    + src + " " + dest + " \"" + text + "\"");

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            // read the output from the command
            translated = stdInput.lines().collect(Collectors.joining(System.lineSeparator()));
            error = stdError.lines().collect(Collectors.joining(System.lineSeparator()));
        } catch (IOException io){
            translated = "Don't Translated Text, Please Try later!";
        }

        return translated;
    }
}
