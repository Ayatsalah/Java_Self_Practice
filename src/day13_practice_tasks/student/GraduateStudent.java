package day13_practice_tasks.student;

public class GraduateStudent extends Student1{
    public GraduateStudent(String name, String gender, int age, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, gender, age, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {

        System.out.println("Student "+getName()+" is graduated.");
    }
}
/*Create the following subclasses of the Student class:
   3.1 GraduateStudent:
       - Override the study method.
       - Add any additional fields and methods as necessary.

 */
