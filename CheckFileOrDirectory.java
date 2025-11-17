import java.io.File;
import java.util.Scanner;

public class CheckFileOrDirectory {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file/directory path: ");
        System.out.println("Apoorav 24csu327");

        String path = sc.nextLine();  // User enters path

        File file = new File(path);   // Create File object from user input

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("It is a file.");
            } else if (file.isDirectory()) {
                System.out.println("It is a directory.");
            }
        } else {
            System.out.println("The specified path does not exist.");
        }

        sc.close();
    }
}