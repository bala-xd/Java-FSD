package day2_ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

    public static void getSecondSmallest(int[] array) {
        Arrays.sort(array);

        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > smallest) {
                System.out.println("The second smallest element is: " + array[i]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        getSecondSmallest(array);

        scanner.close();
    }
}
