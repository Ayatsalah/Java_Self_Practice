package day14_practice_tasks.car;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0) {throw new RuntimeException("The price must not be negative.");}
        this.price = price;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        if (color==null || color.isEmpty()){throw new RuntimeException("The color must not be null or empty.");}
        this.color = color;
    }

    public void setModel(String model) {
        if (model==null || model.isEmpty()){throw new RuntimeException("The model must not be null or empty.");}
            //this.model = model;
    }
    public void setMake(String make) {
        if (make==null || make.isEmpty()){throw new RuntimeException("The make must not be null or empty.");}
           // this.make = make;
    }
    public void setYear(int year) {
        if (year<1866){throw new RuntimeException("year must not be less than 1886.");}
          //  this.year = year;
    }

    public Car(String make, String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public abstract void start();
    public abstract void drive();
    public void stop(){
        System.out.println(make + " " + model + " is stopped");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*1. Create an Abstract Class Named 'Car':
    - Variables:
        - final make
        - final model
        - final year
        - price
        - color
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions for setting fields:
        - make, model, color must not be null or empty.
        - year must not be less than 1886.
        - price must not be negative.
    - Abstract Methods:
        - start()
        - drive()
    - Non-Abstract Methods:
        - stop()
        - toString()

 */