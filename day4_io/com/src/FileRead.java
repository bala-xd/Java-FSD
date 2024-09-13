package day4_io.com.src;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileRead {
    public static void main(String[] args) {
        String file_path = "day4_io\\com\\src\\sample.txt";
        try {
            File obj = new File(file_path);
            Scanner sc = new Scanner(obj);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
