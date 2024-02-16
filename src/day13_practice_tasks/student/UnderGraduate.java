package day13_practice_tasks.student;

public class UnderGraduate extends Student1{
    public UnderGraduate(String name, String gender, int age, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, gender, age, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {

        System.out.println("Student "+getName()+" is studying.");
    }
}
/*UndergraduateStudent:
       - Same as GraduateStudent.

 */