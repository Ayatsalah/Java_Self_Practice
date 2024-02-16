package day13_practice_tasks.phone;

public class Nokia extends Phone{
    public Nokia(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }
}

/*Create a class named 'Nokia' with these specifications:
   Attributes:
       - Same as IPhone.

   Encapsulation:
       - Same conditions as IPhone.

   Constructor:
       - Same as IPhone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Nokia object.

 */