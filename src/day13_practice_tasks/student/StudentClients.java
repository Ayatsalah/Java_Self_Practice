package day13_practice_tasks.student;

public class StudentClients {
    public static void main(String[] args) {
        GraduateStudent student1 = new GraduateStudent("Ali", "Male", 25, "123", "Science", 'A', "Cydeo");
        UnderGraduate student2= new UnderGraduate("Safa","Female",20,"456","Pharmacy",'A',"SCGSG");
        CydeoStudent student3=new CydeoStudent("Hasan","Male",42,"789","SDET",'B',"Cydeo",30,7,"Java");
        System.out.println(student1);
        System.out.println("---------------");
        System.out.println(student2);
        System.out.println("---------------");
        System.out.println(student3);
        System.out.println("---------------");
        student1.study();
        student2.study();
        student3.study();


    }
}
/*
Create a class named "StudentClients":
   - Create multiple objects representing different students.
   - Test the methods and attributes of each object.

 */
