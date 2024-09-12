import java.util.Scanner;

public class Ex3 {

    public static int fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static int fibIterative(int n) {
        if (n <= 2) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int fib = 0;
        for (int i = 2; i < n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int fibRecursive = fibRecursive(n);
        System.out.println("The recursive result is: " + fibRecursive);

        int fibIterative = fibIterative(n);
        System.out.println("The iterative result is: " + fibIterative);

        sc.close();
    }
}
