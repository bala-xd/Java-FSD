public class LambdaCLass {
    public static void main(String as[]) {
        // Question 1
        XPowerY power = (x,y) -> (Math.pow(x,y));
        
        double a = 8;
        double b = 3;
        System.out.println(power.calculate(a, b) + "\n");

        // Question 2
        FormatString fs = (s) -> {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<s.length(); i++) {
                sb.append(s.charAt(i) + " ");
            }
            return sb.toString();
        };

        String s = "JAVA";
        System.out.println(fs.format(s) + "\n");

        // Question 3
        String name = "bala";
        String password = "1234";
        CheckCreditials cc = (uname, pass) -> {
            return (uname == name) && (pass == password);
        };

        System.out.println(cc.check("bala", "4321"));
        System.out.println(cc.check("bala", "1234") + "\n");

        // Question 4
        Factorial fact = (n) -> {
            int result = 1;
            while(true) {
                if (n==0) return result;
                else {
                    result *= n;
                    n -= 1;
                }
            }
        };

        RecursiveFactorial rf = (n,self) -> {
            if (n==0) return 1;
            return n * (self.calculate(n-1, self));
        };

        System.out.println(fact.calculate(5));
        System.out.println(rf.calculate(5, rf));
    }
}
