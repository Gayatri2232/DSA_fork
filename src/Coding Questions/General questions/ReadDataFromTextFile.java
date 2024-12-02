import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {
        // Approach 1: Using FileReader and BufferedReader
        System.out.println("Approach 1: Using FileReader and BufferedReader");
        FileReader fr = new FileReader("C:\\Users\\location\\test.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

        // Approach 2: Using Scanner and File
        System.out.println("\nApproach 2: Using Scanner and File");
        File file1 = new File("C:\\Users\\location\\test.txt");
        Scanner scanner1 = new Scanner(file1);
        while (scanner1.hasNextLine()) {
            System.out.println(scanner1.nextLine());
        }
        scanner1.close();

        // Approach 3: Using Scanner with Delimiter "\\Z"
        System.out.println("\nApproach 3: Using Scanner with Delimiter \"\\Z\"");
        File file2 = new File("C:\\Users\\location\\test.txt");
        Scanner scanner2 = new Scanner(file2);
        scanner2.useDelimiter("\\Z");
        System.out.println(scanner2.next());
        scanner2.close();
    }
}
