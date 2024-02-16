package day13_practice_tasks.phone;

public class PhoneClients {
    public static void main(String[] args) {

        Iphone iPhone = new Iphone("Iphone","IPhone 13", "6.2 inches", 700, "Black");
        Samsung samsung = new Samsung("Samsung","Galaxy S20", "6.3 inches", 600, "White");
        Nokia nokia = new Nokia("Nokia","Brick", "2.3 inches", 25, "Blue");


        System.out.println(iPhone);
        iPhone.call("123456789");
        iPhone.text("123456789");
        iPhone.faceTime(1234567);

        System.out.println("-----------------");
        System.out.println(samsung);
        samsung.call("12345678");
        samsung.text("1234567");


        System.out.println("---------------------");
        System.out.println(nokia);
        nokia.text("1234567");
        nokia.call("123456789");


    }
}
/*Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.

 */
