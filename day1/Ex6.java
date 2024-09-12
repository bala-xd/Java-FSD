import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();
        int sumOfSquares = 0;
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sumOfSquares += i * i;
            sum += i;
        }
        int squareOfSum = sum * sum;
        System.out.println("The difference is " + Math.abs(sumOfSquares - squareOfSum));
        sc.close();
    }
}
