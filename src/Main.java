import java.net.URI;
import java.net.URISyntaxException;

/**
 * Програма кодує текст в ASCII кодування
 */

public class Main {
    public static void main(String[] args) throws URISyntaxException {

        String textToConvert = "Україна";

        URI uri = new URI(textToConvert);

        System.out.println(uri.toASCIIString());

    }
}
