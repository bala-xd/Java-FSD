package day2_ex;

import java.util.Scanner;

public class Ex4 {

    public static int[] modifyArray(int[] arr) {

        int n = arr.length;
        int[] tempArray = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == tempArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                tempArray[uniqueCount++] = arr[i];
            }
        }

        int[] uniqueArray = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueArray[i] = tempArray[i];
        }

        for (int i = 0; i < uniqueArray.length - 1; i++) {
            for (int j = i + 1; j < uniqueArray.length; j++) {
                if (uniqueArray[i] < uniqueArray[j]) {
                    int temp = uniqueArray[i];
                    uniqueArray[i] = uniqueArray[j];
                    uniqueArray[j] = temp;
                }
            }
        }

        return uniqueArray;
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

        int[] modifiedArray = modifyArray(numbers);

        System.out.println("Array after removing duplicates and sorting in descending order:");
        for (int num : modifiedArray) {
            System.out.println(num);
        }

        scanner.close();
    }
}
