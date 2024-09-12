package intCal.com.calc;

public class FDAccount extends Account {
    int noOfDays;
    int ageOfACHolder;


    public FDAccount(int noOfDays, int ageOfACHolder) {
        this.noOfDays = noOfDays;
        this.ageOfACHolder = ageOfACHolder;
    }


    public FDAccount() {
    }


    public int getNoOfDays() {
        return this.noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
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
        double amt = getAmount();
        double interestRate = 0;

        if (amt < 10000000) {
            if (7 <= noOfDays && noOfDays <= 14) {
                interestRate = isSenior() ? 0.05 : 0.045;
            } else if (15 <= noOfDays && noOfDays <= 29) {
                interestRate = isSenior() ? 0.0525 : 0.0475;
            } else if (30 <= noOfDays && noOfDays <= 45) {
                interestRate = isSenior() ? 0.06 : 0.055;
            } else if (46 <= noOfDays && noOfDays <= 60) {
                interestRate = isSenior() ? 0.075 : 0.07;
            } else if (61 <= noOfDays && noOfDays <= 184) {
                interestRate = isSenior() ? 0.08 : 0.075;
            } else if (185 <= noOfDays && noOfDays <= 365) {
                interestRate = isSenior() ? 0.085 : 0.08;
            } else {
                System.out.println("Invalid data!");
            }
        } 
        
        else {
            if (7 <= noOfDays && noOfDays <= 14) {
                interestRate = 0.065;
            } else if (15 <= noOfDays && noOfDays <= 29) {
                interestRate = 0.0675;
            } else if (30 <= noOfDays && noOfDays <= 45) {
                interestRate = 0.0675;
            } else if (46 <= noOfDays && noOfDays <= 60) {
                interestRate = 0.08;
            } else if (61 <= noOfDays && noOfDays <= 184) {
                interestRate = 0.085;
            } else if (185 <= noOfDays && noOfDays <= 365) {
                interestRate = 0.10;
            } else {
                System.out.println("Invalid data!");
            }
        }

        setInterestRate(interestRate);
        return amt*interestRate;
    }
}
