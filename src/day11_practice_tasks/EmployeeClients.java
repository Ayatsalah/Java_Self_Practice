package day11_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Adam", 30, 'M', "Engineer", 2500);
        employee1.work();
        Employee employee2 = new Employee("Arthur", 32, 'M', "Accountant", 2000);
        employee2.work();
        System.out.println(employee1);
        System.out.println(employee2);

    }
}
