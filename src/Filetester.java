
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Filetester {
    public static void main(String[] args) {
        try {
            String filePath = "file.txt";

            Stream<String> lines = Files.lines(Paths.get(filePath));

            lines.forEach(line -> {
                System.out.println(line);
            });

            lines.close();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
