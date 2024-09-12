public class Account {
    private long accNum;
    private double balance;
    private Person accHolder;



    public Account(long accNum, double balance, Person accHolder) {
        this.accNum = accNum;
        this.balance = balance;
        this.accHolder = accHolder;
        System.out.println("Account has been created for "+ accHolder.getName() + "...");
    }
    

    public Account() {
        balance = 500;
    }    

    public long getAccNum() {
        return this.accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getAccHolder() {
        return this.accHolder;
    }

    public void setAccHolder(Person accHolder) {
        this.accHolder = accHolder;
        System.out.println("Account has been created for "+ accHolder.getName()+"...");
    }

    public void deposit (double amount){
        balance += amount;
        System.out.println("Rs."+amount + "/- has been Deposited to " + accHolder.getName() + "'s account Successfully!");
    }

    public void withdraw (double amount) {
        balance -= amount;
        System.out.println("Rs."+amount + "/- has been Withdrawn from " + accHolder.getName() + "'s account Successfully!");
    }


    @Override
    public String toString() {
        return "{" +
            " accNum='" + getAccNum() + "'" +
            ", balance='" + getBalance() + "'" +
            ", accHolder='" + getAccHolder() + "'" +
            "}";
    }

}
