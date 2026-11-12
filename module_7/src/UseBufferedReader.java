import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class UseBufferedReader {
    public static void main(String[] args) {
        File myTest = new File("module_7/src/file.txt");

        try (BufferedReader inpuStream = new BufferedReader(new FileReader(myTest))) {
            int character;
            while ((character = inpuStream.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }


    }
}
