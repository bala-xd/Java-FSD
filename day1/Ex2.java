import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select a traffic light color:");
        System.out.println("1. Red");
        System.out.println("2. Yellow");
        System.out.println("3. Green");
        System.out.print("Enter your choice (1, 2, or 3): ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Stop");
                break;
            case 2:
                System.out.println("Ready");
                break;
            case 3:
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                break;
        }

        sc.close();
    }
}
