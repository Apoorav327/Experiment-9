import java.io.*;

public class ReadFileLineByLine {
    public static void main(String[] args) {

        try {
            // File path
            BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\Apoorav\\Downloads\\Reading and Communication.txt")
            );

            String line;

            System.out.println("File Content:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);  // Print each line
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}