package day14_practice_tasks.device;

public class Google extends Phone implements Downloadable,AndroidApps {
    public Google(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+ getModel()+ " is downloading the App");

    }
}
/* 'Google':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.


 */
