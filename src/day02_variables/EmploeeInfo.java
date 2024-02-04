package day02_variables;

public class EmploeeInfo {
    public static void main(String[] args) {
        String employeeName = "Shay";
        int age = 24;
        char gender = 'F';
        String companyName = "Apple Inc";
        String jobTitle = "SDET";
        double yearOfExperience = 2.5;
        double salary = 120000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "B101";

        System.out.println("Employee name: " + employeeName);
        System.out.println("\t\t\t  Gender: " + gender);
        System.out.println("\t\t\t  Age: " + age);
        System.out.println("\t\t\t  Employee ID: " + employeeId);
        System.out.println("\t\t\t  Job title: " + jobTitle);
        System.out.println("\t\t\t  Company name: " + companyName);
        System.out.println("\t\t\t  Full time: " + isFullTime);
        System.out.println("\t\t\t  Years of work experience: " + yearOfExperience +" years");
        System.out.println("\t\t\t  Salary: $" + salary);
        System.out.println("\t\t\t  Married: " + isMarried);

    }
}
//Employee name: Shay
//				Gender: F
//				Age: 24
//				Employee ID: B101
//				Job title: SDET
//				Company name: Apple Inc
//				Full time: true
//				Years of work experience: 2.5 years
//				Salary: $120000.0
//				Married: false