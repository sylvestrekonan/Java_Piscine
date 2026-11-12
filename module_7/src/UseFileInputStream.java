import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class UseFileInputStream {
    public static void main(String[] args) {
        File myTest = new File("module_7/src/file.txt");

        try (FileInputStream inputStream = new FileInputStream(myTest)) {
            byte[] fileContent = inputStream.readAllBytes();
            for (int i = 0; i < fileContent.length; i++) {
                System.out.print((char) fileContent[i]);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("file not found");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }

    }
}
