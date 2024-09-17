import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamClass {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Aarav", 55000));
        employees.add(new Employee(2, "Divya", 62000));
        employees.add(new Employee(3, "Vihaan", 48000));
        employees.add(new Employee(4, "Isha", 51000));
        employees.add(new Employee(5, "Arjun", 60000));
        employees.add(new Employee(6, "Ananya", 57000));
        employees.add(new Employee(7, "Kabir", 54000));
        employees.add(new Employee(8, "Sneha", 53000));
        employees.add(new Employee(9, "Reyansh", 49000));
        employees.add(new Employee(10, "Mira", 55000));

        Optional<Employee> maxSalary = employees.stream()
                .reduce((e1, e2) -> e1.getEsalary() > e2.getEsalary() ? e1 : e2);

        maxSalary.ifPresent(System.out::println);

        employees.stream()
                .sorted((e1, e2) -> e2.getEsalary() - e1.getEsalary()).limit(3)
                .forEach(System.out::println);
    }
}
