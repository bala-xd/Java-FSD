package day2_ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

    public static String[] sortStrings(String[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int splitIndex = (n + 1) / 2;

        for (int i = 0; i < splitIndex; i++) {
            arr[i] = arr[i].toUpperCase();
        }
        for (int i = splitIndex; i < n; i++) {
            arr[i] = arr[i].toLowerCase();
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] strings = new String[size];
        System.out.println("Enter " + size + " strings:");

        for (int i = 0; i < size; i++) {
            strings[i] = scanner.nextLine();
        }

        String[] sortedTransformedArray = sortStrings(strings);

        System.out.println("Transformed array:");
        for (String str : sortedTransformedArray) {
            System.out.println(str);
        }

        scanner.close();
    }
}

