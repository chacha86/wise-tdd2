import org.example.App;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class MockApp {
    static PrintStream origin = System.out;
    public static String run(String input) {

        Scanner scanner = customScanner(input+"\n");
        ByteArrayOutputStream outputStream = setCustomOut();

        App app = new App(scanner);
        app.run();

        clearCustomOut();

        return outputStream.toString().stripIndent();
    }

    private static void clearCustomOut() {
        System.setOut(origin);
    }

    public static Scanner customScanner(String input) {
        Scanner scanner = new Scanner(input);
        return scanner;
    }
    public static ByteArrayOutputStream setCustomOut() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream customOut = new PrintStream(outputStream);
        System.setOut(customOut);

        return outputStream;
    }

}
