package day6_lambda;

@FunctionalInterface
public interface RecursiveFactorial {
    public int calculate(int num, RecursiveFactorial self);
}
