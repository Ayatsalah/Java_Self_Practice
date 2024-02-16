package day13_practice_tasks.employee;

public class Person {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.err.println("The name can not be null, empty or blank.");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.err.println("The age must be greater than zero.");
            System.exit(1);
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == null || gender.trim().isEmpty()) {
            System.err.println("Gender can not be null, empty or blank.");
            System.exit(1);
        }
        this.gender = gender;
    }

    public Person(String name, int age, String gender) {
       setName(name);
        setAge(age);
        setGender(gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
