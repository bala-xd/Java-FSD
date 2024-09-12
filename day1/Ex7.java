import java.util.Scanner; 

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        checkIncreasing(num);
        sc.close();
    }

    public static void checkIncreasing(int num) {
        int prev = num%10;
        while (num!=0) {
            num = num/10;
            int cur = num%10;
            if (prev<cur) {
                System.out.println("Not an Increasing number!");
                return;
            }
            prev = cur;
        }
        System.out.println("Its an Increasing number!");
    }
}