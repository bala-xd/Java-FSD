package day2_ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

    public static int[] getSorted(int[] arr) {

        int[] reversedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String reversedString = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
            reversedArray[i] = Integer.parseInt(reversedString);
        }

        Arrays.sort(reversedArray);

        return reversedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] sortedArray = getSorted(numbers);

        System.out.println("Sorted array after reversing digits:");
        for (int num : sortedArray) {
            System.out.println(num);
        }

        scanner.close();
    }
}
