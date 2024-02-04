package day10_array_list;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        String str = "JAVAS javas";
        int upper=0,lower=0;

        for (char each : str.toCharArray()) {
            if (Character.isLowerCase(each)) lower++;
            else if (Character.isUpperCase(each)) upper++;

        }

        System.out.println(upper==lower);

    }
}
/*Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true


 */