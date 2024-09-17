package day6_lambda;

@FunctionalInterface
public interface CheckCreditials {
    Boolean check (String uname, String pass);
}
