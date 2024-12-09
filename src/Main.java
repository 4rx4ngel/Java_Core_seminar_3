import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Employee employee_1 = new Employee("Сергей",
                LocalDate.of(1989, 12, 30),
                "Слесарь",
                800);
        Employee employee_2 = new Employee("Владимир",
                LocalDate.of(1994, 5, 12),
                "Продавец",
                1000);
        Employee employee_3 = new Manager("Александр",
                LocalDate.of(1978, 3, 23),
                "Руководитель",
                1800);

        List<Employee> employees = List.of(employee_1, employee_2, employee_3);
        System.out.println("Вывод информации о сотрудниках: ");
        for (Employee employee: employees) {
            System.out.println(employee);
        }

        Manager.increaseSalary(employees, 5);
        System.out.println("\nВывод информации о сотрудниках после повышения зарплаты: ");
        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }
}