package day4_io.com.src;

import java.io.File;
import java.util.Scanner;

public class FileDetails {
    public static void main(String[] args) {
        String path = "day4_io\\com\\src\\";
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        File file = new File(path + fileName + ".txt");

        if (file.exists()) {
            System.out.println("File exists.");

            if (file.canRead()) {
                System.out.println("File is readable.");
            } else {
                System.out.println("File is not readable.");
            }

            if (file.canWrite()) {
                System.out.println("File is writable.");
            } else {
                System.out.println("File is not writable.");
            }

            if (file.isDirectory()) {
                System.out.println("This is a directory.");
            } else if (file.isFile()) {
                System.out.println("This is a regular file.");
                long fileLength = file.length();
                System.out.println("File length: " + fileLength + " bytes");
            } else {
                System.out.println("The file is neither a regular file nor a directory.");
            }

        } else {
            System.out.println("File does not exist.");
        }

        scanner.close();
    }
}
