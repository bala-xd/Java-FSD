package intCal.com.calc;

public abstract class Account {
    private double interestRate;
    private double amount;

    public Account(double interestRate, double amount) {
        this.interestRate = interestRate;
        this.amount = amount;
    }

    public Account() {
    }


    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    abstract double calculateInterest();
}
