import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();
        int sum = 0;
        
        for (int cur=1; cur<=num; cur++) {
            if (cur % 3 == 0 || cur % 5 == 0) {
                sum += cur;
            }
        }
        System.out.println("The sum is: " + sum);
        sc.close();
    }
}
