package day13_practice_tasks.employee;

public class EmployeeClients {
    public static void main(String[] args) {

        Tester tester = new Tester("Ali", 32, "Male", "123", "Tester", 35000,"Google");
        Developer developer = new Developer("Adam", 40, "Male", "456", "Developer",80000, "Amazon","Java");
        Teacher teacher = new Teacher("Rachel", 30, "Female", "789", "Teacher", 30000,"Cydeo");
        Driver driver = new Driver("Richard", 45, "Male", "147","Driver", 45000,"Amazon");

        tester.work();

        developer.work();

        teacher.work();

        driver.work();

    }
}
