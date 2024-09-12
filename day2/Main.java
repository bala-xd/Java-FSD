public class Main {
    public static void main(String[] args) {
        Person smith = new Person("Smith", 23);
        Person kathy = new Person("Kathy", 25);

        Account smithAcc = new Account();
        Account kathyAcc = new Account();

        smithAcc.setAccNum(123);
        smithAcc.setAccHolder(smith);
        smithAcc.setBalance(2000.0);

        kathyAcc.setAccNum(124);
        kathyAcc.setBalance(3000.0);
        kathyAcc.setAccHolder(kathy);

        System.out.println("Initial Smith's balance: " + smithAcc.getBalance());
        System.out.println("Initial kathy's balance: " + kathyAcc.getBalance() + "\n");

        smithAcc.deposit(2000.0);
        kathyAcc.withdraw(2000.0);

        System.out.println("\nSmith's balance: " + smithAcc.getBalance());
        System.out.println("kathy's balance: " + kathyAcc.getBalance() + "\n");

        SavingsAccount smithSav = new SavingsAccount(101,2000.0,smith);
        smithSav.withdraw(1500);

        CurrentAccount kathyCur = new CurrentAccount(101,3000.0,kathy);
        kathyCur.withdraw(2000);

        System.out.println("\nSmith's Savings balance: " + smithSav.getBalance());
        System.out.println("kathy's Current balance: " + kathyCur.getBalance());
    }
}
