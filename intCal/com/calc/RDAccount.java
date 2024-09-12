package intCal.com.calc;

public class RDAccount extends Account {
    private int noOfMonths;
    private double monthlyAmount;
    private int ageOfACHolder;


    public RDAccount() {
    }

    public int getNoOfMonths() {
        return this.noOfMonths;
    }

    public void setNoOfMonths(int noOfMonths) {
        this.noOfMonths = noOfMonths;
    }

    public double getMonthlyAmount() {
        return this.monthlyAmount;
    }

    public void setMonthlyAmount(double monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
    }

    public int getAgeOfACHolder() {
        return this.ageOfACHolder;
    }

    public void setAgeOfACHolder(int ageOfACHolder) {
        this.ageOfACHolder = ageOfACHolder;
    }
    
    public boolean isSenior(){
        return ageOfACHolder >= 60;
    }

    @Override
    public double calculateInterest() {
        double interestRate = 0;

        if (noOfMonths <= 6) {
            interestRate = isSenior() ? 0.075 : 0.08;
        } else if (noOfMonths <= 9) {
            interestRate = isSenior() ? 0.0775 : 0.0825;
        } else if (noOfMonths <= 12) {
            interestRate = isSenior() ? 0.08 : 0.085;
        } else if (noOfMonths <= 15) {
            interestRate = isSenior() ? 0.0825 : 0.0875;
        } else if (noOfMonths <= 18) {
            interestRate = isSenior() ? 0.085 : 0.09;
        } else if (noOfMonths <= 21) {
            interestRate = isSenior() ? 0.0875 : 0.0925;
        } else {
            System.out.println("Invalid data!");
        }

        setInterestRate(interestRate);
        double rByn = interestRate/12;
        return Math.ceil((monthlyAmount) * (Math.pow(1+rByn,noOfMonths)-1)/rByn) -(noOfMonths*monthlyAmount);
    }
}
