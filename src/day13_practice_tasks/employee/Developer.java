package day13_practice_tasks.employee;

public class Developer extends Employee {
    public String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.trim().isEmpty()) {
            throw new RuntimeException("Programming language cannot be null, empty or blank.");
        }

        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {

        System.out.println(getJobTitle() + " " + getName() + " is coding in " + getProgrammingLanguage());
    }

    public Developer(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName, String programmingLanguage) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
        setProgrammingLanguage(programmingLanguage);
    }
}
/*Create the following subclasses of Employee:

   2.2 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".

   2.3 Teacher:
       - work(): Displays "[name] is teaching".

   2.4 Driver:
       - work(): Displays "[name] is driving".

   - Add any additional fields or methods as necessary.


 */