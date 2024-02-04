package day10_array_list;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {

        String str = "Wooden Spoon123!";
        String letters = "", digits = "", specialChars = "";

        char[] ch=str.toCharArray();

        for (char c : ch) { if (Character.isLetter(c))

            letters += c;

        else if (Character.isDigit(c))
            digits += c;

        else  {
            specialChars += c;
        }

        }

        System.out.println("letters = \"" + letters + "\";");
        System.out.println("Digits = \"" + digits + "\";");
        System.out.println("specialChars = \"" + specialChars + "\";");



    }
}
/*1. Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";

 */
