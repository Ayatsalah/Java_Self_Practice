package day14_practice_tasks.car;

public class CydeoCar extends Car implements AutoPark,AutoPilot,Flyable{
    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" has auto park");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" has self drive");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " is started");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving");

    }

    @Override
    public void fly() {
        System.out.println(getMake()+" "+ getModel()+" is flying");
    }
}
