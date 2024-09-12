package intCal.com.calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterestMain {

    private static final Scanner sc = new Scanner(System.in);

    private static <T extends Number> void validatePositive(T number) {
        if (number.doubleValue() < 0)
            throw new InputMismatchException("Number must be positive!");
    }

    private static double validateAmount(String prompt) {
        Double amount;
        while (true){
            try{
                System.out.println("\n" + prompt);
                amount = sc.nextDouble();
                validatePositive(amount);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input... Try again!");
                sc.nextLine();
            }
        }
        return amount;
    }

    public static int displayOptions() {
        System.out.println("Select the option: \n" + 
                        "1. Interest Calculator -SB \n" +
                        "2. Interest Calculator -FD \n" +
                        "3. Interest Calculator -RD \n" +
                        "4. Exit "); 
        
        return sc.nextInt();
    }

    public static void handleSB() {
        SBAccount sb = new SBAccount();
        
        sb.setAmount(validateAmount("Enter the Average amount in your account: "));

        System.out.println("Enter the Account Type: ");
        sb.setAccountType(sc.next());
        
        System.out.println("Interest gained: " + sb.calculateInterest());
    }

    public static void handleFD() {
        FDAccount fd = new FDAccount();

        fd.setAmount(validateAmount("Enter the FD amount: "));
        
        System.out.println("Enter the number of days: ");
        fd.setNoOfDays(sc.nextInt());
        
        System.out.println("Enter your age: ");
        fd.setAgeOfACHolder(sc.nextInt());
        
        System.out.println("Interest gained: " + fd.calculateInterest());
    }
    
    public static void handleRD() {
        RDAccount rd = new RDAccount();
        
        rd.setMonthlyAmount(validateAmount("Enter the Monthly Deposit amount: "));
        
        System.out.println("Enter the maturity period: ");
        rd.setNoOfMonths(sc.nextInt());
        
        System.out.println("Enter your age: ");
        rd.setAgeOfACHolder(sc.nextInt());
        // rd.setMonthlyAmount(1000);
        // rd.setNoOfMonths(12);
        // rd.setAgeOfACHolder(61);
        System.out.println("Interest gained: " + rd.calculateInterest());
    }

    public static void main(String[] args) {
        int choice;
        do { 
            choice = displayOptions();; 
            switch (choice) {
                case 1:
                    handleSB();
                    break;

                case 2:
                    handleFD();
                    break;

                case 3:
                    handleRD();
                    break;

                case 4:
                    System.out.println("\nExiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }

        } while (choice != 4); 

        sc.close();  
    }
}
