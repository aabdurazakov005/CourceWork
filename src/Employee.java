import java.util.Objects;

public class Employee {
    private static int counter = 0;
    private String name;
    private int department;
    private int salary;
    private int id;

    public Employee(String name, int department, int salary) {
        this.id = ++counter;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        if (department >= 1 && department <= 5) {
            this.department = department;
        } else {
            throw new IllegalArgumentException("Отделов только пять.");
        }
    }

    @Override
    public String toString() {
        return "Имя " + this.name + ", отдел " + this.department + ", " + ", зарплата " + this.salary;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }
}
