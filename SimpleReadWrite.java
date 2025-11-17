import java.io.*;

public class SimpleReadWrite {
    public static void main(String[] args) {

        try {
            // Writing to file
            FileWriter fw = new FileWriter("C:\\Users\\Apoorav\\Downloads\\Reading and Communication.txt");
            fw.write("Hello! This is a simple file write example.");
            fw.close();

            System.out.println("Data written successfully.");

            // Reading from file
            FileReader fr = new FileReader("C:\\Users\\Apoorav\\Downloads\\Reading and Communication.txt");

            int ch;
            System.out.print("File Content: ");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}