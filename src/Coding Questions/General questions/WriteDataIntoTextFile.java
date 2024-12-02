import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
    public static void main(String[] args) throws IOException {
        // Create a FileWriter to specify the file location
        FileWriter fw = new FileWriter("C:\\Users\\location\\test123.txt");

        // Wrap FileWriter in BufferedWriter for efficient writing
        BufferedWriter bw = new BufferedWriter(fw);

        // Write multiple lines of text to the file
        bw.write("This is the first line.\n");    // Adds a newline character (\n)
        bw.write("This is the second line.\n");
        bw.write("This is the final line.");

        // Print a confirmation message (optional)
        System.out.println("Finished writing!");

        // Close the BufferedWriter to release system resources
        bw.close();
    }
}