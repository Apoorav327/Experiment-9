import java.io.File;

public class ChangeFilePermission {
    public static void main(String[] args) {

        File file = new File("C:/Users/Kunal/Downloads/Reading and Communication.pptx");

        if (file.exists()) {

            // Changing permissions
            boolean readable = file.setReadable(true);
            boolean writable = file.setWritable(false);
            boolean executable = file.setExecutable(true);

            System.out.println("Read permission set: " + readable);
            System.out.println("Write permission set (disabled): " + writable);
            System.out.println("Execute permission set: " + executable);

            System.out.println("\nPermissions updated successfully.");

        } else {
            System.out.println("File does not exist.");
        }
    }
}
