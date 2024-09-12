package intCal.com.calc;

public class SBAccount extends Account {

    private String accountType;
    
    public SBAccount() {
    }


    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public double calculateInterest() {
        return accountType.equalsIgnoreCase("Nri") ? 
            getAmount()*0.06 : getAmount()*0.04 ;
    }
}
