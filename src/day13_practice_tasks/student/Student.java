package day13_practice_tasks.student;

public class Student {
    private String name;
    private int age;
    private String gender;


    public Student(String name, String gender, int age) {
        setName(name);
        setGender(gender);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null || name.trim().isEmpty())
        {
            System.out.println("The name cannot be null or empty. ");
        System.exit(1);}
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.out.println("The age must be greater than zero");
            System.exit(1);
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender==null || gender.trim().isEmpty())
        {
            System.out.println("The gender cannot be null or empty. ");
            System.exit(1);}

        this.gender = gender;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ',';
    }
}
/*Student Task Requirements:
1. Create a class named "Student" with the following specifications:
   Attributes:
       - name: String
       - age: int
       - gender: String

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Actions:
       - toString(): Prints the information of the Student object.

2. Create a subclass named "Student" with the following specifications:
   Attributes:
       - studentId: String
       - fieldOfStudy: String
       - grade: char
       - schoolName: String

   Encapsulation:
       - Same as previous tasks.

   Actions:
       - study(): Displays a message stating the student's name and school.
       - toString(): Prints the information of the Student object (including all attributes).

3. Create the following subclasses of the Student class:
   3.1 GraduateStudent:
       - Override the study method.
       - Add any additional fields and methods as necessary.

   3.2 UndergraduateStudent:
       - Same as GraduateStudent.

   3.3 CydeoStudent:
       - Additional Attributes:
           - batchNumber: int
           - groupNumber: int
           - programmingLanguage: String
       - Encapsulation:
           - Same as previous tasks.
       - Constructor:
           - Same as previous tasks.
       - Actions:
           - Override the study method.
           - Override the toString method.

4. Create a class named "StudentClients":
   - Create multiple objects representing different students.
   - Test the methods and attributes of each object.





 */