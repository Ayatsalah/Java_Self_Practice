package day14_practice_tasks.device;

public class DeviceShop {
    public static void main(String[] args) {
        
        PersonalComputer laptop=new Laptop("Hp","",500,"Grey","17 inches",true,true);

        PersonalComputer desktop=new Desktop("Dell","",1000,"Black","19 inches",false,true);

        Phone samsung=new Samsung("Samsung", "S24", 980, "White", "Ultra", true, true);
        Phone iphone = new Iphone("Apple", "iphone 15", 800, "Pink", "Pro", true, true);
        Phone google=new Google("Google", "Pixel", 800, "Green", "large", true, true);

        System.out.println(laptop);
        System.out.println(desktop);
        System.out.println(samsung);
        System.out.println(iphone);
        System.out.println(google);

        samsung.call(123456789);
        samsung.text(123456789);
        samsung.turnOn();
        samsung.turnOff();
    }



}
/*Create a Class Named 'DeviceShop':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.


 */
