public class SavingsAccount extends Account {
    private final double minBal = 500;

    public SavingsAccount (int accNum, double balance, Person accHolder) {
        super(accNum, balance, accHolder);
    }


    public SavingsAccount() {
    }


    @Override
    public void withdraw(double amount) {
        if ((super.getBalance()-amount) < minBal) {
            System.out.println("Minimum balance should be more than 500 for withdrawal process for " + super.getAccHolder().getName() + "'s account!");
            System.out.println("Account balance: " + super.getBalance());
            System.out.println("Withdrawal amount: "+ amount +"\n");
            return;
        }
        super.withdraw(amount);
    }
}
