public class CurrentAccount extends Account {
    private double overdraftLimit = 2000.0;

    public CurrentAccount (int accNum, double balance, Person accHolder) {
        super(accNum, balance, accHolder);
    }


    public CurrentAccount() {
    }

    @Override
    public void withdraw(double amount) {
        if (overdraftLimit <= amount) {
            System.out.println("Overdraft Limit reached for " + super.getAccHolder().getName() + "'s account!");
            System.out.println("Account balance: " + super.getBalance());
            System.out.println("Withdrawal amount: "+ amount +"\n");
        }
        super.withdraw(amount);
        
    }
}
