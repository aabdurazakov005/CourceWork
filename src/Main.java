public class Main {
    public static Employee createEmployee(String name, int department, int salary) {
        Employee employee = new Employee(name, department, salary);
        return employee;
    }


    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = createEmployee("Ivanov Ivan Ivanovich", 1, 65200);
        employees[1] = createEmployee("Sidorov Andrey Petrovich", 3, 81400);
        employees[2] = createEmployee("Ivashenko Alyona Dmitrievna", 5, 79900);
        employees[3] = createEmployee("Chernushevich Dmitriy Sergeevich", 4, 110560);
        employees[4] = createEmployee("Puzanov Artyom Urievich", 2, 99600);
        employees[5] = createEmployee("Petrov Gennadiy Semenovich", 3, 73000);
        employees[6] = createEmployee("Ottoy Tatiana Sergeevna", 1, 66345);
        employees[7] = createEmployee("Ismailov Batyr Rasulovich", 5, 150394);
        employees[8] = createEmployee("Ibragimov Murad Gasanovich", 4, 55534);
        employees[9] = createEmployee("Rzaeva Aida Rashidovna", 2, 88790);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println(" ");
        int total = calculateAllSalary(employees);
        System.out.println("Общая сумма зарплат: " + total);
        System.out.println(" ");
        Employee minSalaryEmployee = findEmployeeMinSalary(employees);
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee);
        System.out.println(" ");
        Employee maxSalaryEmployee = findEmployeeMaxSalary(employees);
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee);
        System.out.println(" ");
        double averageSalary = calculateAverageSalary(employees);
        System.out.println("Среднее значение зарплат: " + averageSalary);
        System.out.println(" ");
        printEmployeeFullNames(employees);
    }

    public static int calculateAllSalary(Employee[] employees) {
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }

    public static Employee findEmployeeMinSalary(Employee[] employees) {
        if (employees.length == 0) return null;
        Employee minSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalaryEmployee.getSalary())
                minSalaryEmployee = employees[i];
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeMaxSalary(Employee[] employees) {
        if (employees.length == 0) return null;
        Employee maxSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalaryEmployee.getSalary())
                maxSalaryEmployee = employees[i];
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary(Employee[] employees) {
        if (employees.length == 0) return 0;
        return calculateAllSalary(employees) / employees.length;
    }
    public static void printEmployeeFullNames(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }
}