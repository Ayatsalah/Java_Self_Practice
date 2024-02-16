package day11_practice_tasks;

public class CydeoStudentClients {
    public static void main(String[] args) {
        CydeoStudents student1=new CydeoStudents("Ayat",43,123,'A',33,3);
        student1.study();
        student1.attendClass();
        student1.printSchoolName();
        student1.printProgLanguage();
        CydeoStudents student2= new CydeoStudents("Rabee",43,133,'A',33,3);
        student2.study();
        student2.attendClass();
        student2.printSchoolName();
        student2.printProgLanguage();
        System.out.println(student1);
        System.out.println(student2);
    }
}
