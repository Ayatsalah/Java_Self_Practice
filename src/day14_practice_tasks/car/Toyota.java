package day14_practice_tasks.car;

public class Toyota extends Car {

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " is started");

    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving");

    }

    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }
}
