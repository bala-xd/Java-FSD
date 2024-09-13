
import java.util.Scanner;

public class FindPivot {

    public static void findPivot (int[] arr) {
        for (int i = 1; i<arr.length; i++) {
            int leftSum = findSum(arr, 0, i-1);
            int rightSum = findSum(arr, i+1, arr.length-1);
            if (leftSum == rightSum) {
                System.out.println("Pivot element: " + arr[i] + "\nindex: " + i);
                return;
            }
        }
        System.out.println("Theres no pivot element!");
    }

    public static int findSum (int[] arr, int left, int right) {
        int sum = 0;
        for (int i=left; i<=right; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String as[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements: ");
        for (int i=0; i<len; i++) {
            arr[i] = sc.nextInt();
        }
        findPivot(arr);
        sc.close();
    }
}
