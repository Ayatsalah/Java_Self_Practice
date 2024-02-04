package day02_variables;

public class StudentInfo {
    public static void main(String[] args) {
        String studentName = "Josh Steven",gender = "Male",schoolName = "MIT",studentId = "A125",gradeLevel = "Undergraduate";
        int age = 22;
        double gpa = 2.8;
        System.out.println("The student's name is " + studentName);
        System.out.println("Gender is " + gender);
        System.out.println("Age is " + age + " years old");
        System.out.println("The school's name is " + schoolName);
        System.out.println("Grade level is " + gradeLevel);
        System.out.println(studentName + "'s " + " GPA is " + gpa);
    }
}
