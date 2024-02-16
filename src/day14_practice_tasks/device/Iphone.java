package day14_practice_tasks.device;

public class Iphone extends Phone implements Downloadable,AppleApps {
    public Iphone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+ getModel()+ " is downloading the App");
    }
}
/*Create the Following Subclasses of Phone:
    - 'Iphone':
        - Extends Phone class.
        - Implements Downloadable & AppleApps interfaces.

 */