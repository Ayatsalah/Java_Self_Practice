package day14_practice_tasks.device;

public abstract class Phone extends Device {
    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" "+getModel()+" is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" "+getModel()+" is turned off");

    }
    public void call(long phoneNum){
        System.out.println(getBrand()+ " "+getModel()+" calling "+ phoneNum);
    };
    public void text(long phoneNum){
        System.out.println(getBrand()+ " "+getModel()+" texting "+ phoneNum);
    };

    @Override
    public String toString() {
        return super.toString();
    }
}


   /*

    @Override
    public String toString() {
        return "Phone{}";
    }

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

}
/*Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()

 */
