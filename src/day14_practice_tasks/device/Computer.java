package day14_practice_tasks.device;

public abstract class Computer extends Device {
    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
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

    @Override
    public String toString() {
        return super.toString();
    }
}
/*
Create a Child Abstract Class of Device Named 'Computer':
    - Add extra methods as needed.

 */