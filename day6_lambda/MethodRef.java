public class MethodRef {
    public static String formatString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)).append(" ");
        }
        return sb.toString().trim();
    }

    public static boolean check(String uname, String pass) {
        return "bala".equals(uname) && "1234".equals(pass);
    }

    public static int factorial(int n) {
        int result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }

    public static int recursiveFactorial(int n, RecursiveFactorial self) {
        if (n == 0) return 1;
        return n * self.calculate(n - 1, self);
    }
}
