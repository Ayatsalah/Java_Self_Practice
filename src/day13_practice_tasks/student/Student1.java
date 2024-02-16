package day13_practice_tasks.student;

public class Student1 extends Student{
    private String studentId;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public Student1(String name, String gender, int age, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, gender, age);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if(studentId==null||studentId.trim().isEmpty()){
            System.out.println("Student Id must not be null or empty.");
            System.exit(1);
        }
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy==null||fieldOfStudy.trim().isEmpty()){
            System.out.println("Field of study must not be null or empty.");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if(schoolName==null||schoolName.trim().isEmpty()){
            System.out.println("School name must not be null or empty.");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return super.toString()+
                "studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                ',';
    }

    public void study(){
        System.out.println(getName()+" " +getSchoolName());
    }
}
/*reate a subclass named "Student" with the following specifications:
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


 */