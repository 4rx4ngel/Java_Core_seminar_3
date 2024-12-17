import java.time.LocalDate;
import java.util.List;

public class Manager extends Employee {

    public Manager(String name, LocalDate birthDate, String position, double salary) {
        super(name, birthDate, position, salary);
    }

    public static void increaseSalary(List<Employee> employees, double percentage) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                double currentSalary = employee.getSalary();
                double newSalary = currentSalary * (1 + percentage / 100);
                employee.setSalary(newSalary);
            }
        }
    }
}