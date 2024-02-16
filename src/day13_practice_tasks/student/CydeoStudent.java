package day13_practice_tasks.student;

public class CydeoStudent extends Student1{

    private int batchNumber,groupNumber;
    private String programmingLanguage;

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }


    public CydeoStudent(String name, String gender, int age, String studentId, String fieldOfStudy, char grade, String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, gender, age, studentId, fieldOfStudy, grade, schoolName);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    @Override
    public void study() {

        System.out.println("Cydeo student "+getName()+" is studying.");
    }

    @Override
    public String toString() {
        return super.toString()+
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
/*CydeoStudent:
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

 */