package day07_class_objects_part1;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.name = "Adam";
        employee1.age = 30;
        employee1.gender = 'M';
        employee1.jobTitle = "Manager";
        employee1.salary = 30000;

        employee2.name = "Yulia";
        employee2.age = 29;
        employee2.gender = 'F';
        employee2.salary = 110_000;
        employee2.jobTitle = "SDET";

        employee1.work();
        employee2.work();


    }
}
