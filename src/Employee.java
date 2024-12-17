import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Employee {

    private String name;
    private LocalDate birthDate;
    private String post;
    private double salary;

    public Employee() {
    }

    public Employee(String name, LocalDate birthDate, String post, double salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int protoComparator(LocalDate date1, LocalDate date2) {
        return date1.compareTo(date2);
    }

    @Override
    public String toString() {
        return "Сотрудник: " + name +
                ", дата рождения: " + birthDate +
                ", зарплата: " + salary +
                "$, должность: " + post;
    }


}