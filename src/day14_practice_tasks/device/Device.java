package day14_practice_tasks.device;

public abstract class Device {
    private final String brand;
    private final String model;
    private double price;
    private String color;
    private final String size;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public String getBrand() {
        if (brand == null || brand.isEmpty()) {
            throw new RuntimeException("The brand must not be null or empty");
        }
        return brand;
    }

//    public void setBrand(String brand) {
//        if(brand == null || brand.isEmpty()){
//            throw new RuntimeException("The brand must not be null or empty");
//        }
//        this.brand = brand;
//    }

    public String getModel() {
        if (model == null || model.isEmpty()) {
            throw new RuntimeException("The model must not be null or empty");
        }
        return model;
    }

//    public void setModel(String model) {
//        if(model == null || model.isEmpty()){
//            throw new RuntimeException("The model must not be null or empty");
//        }
//        this.model = model;
//    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("The price must be greater than zero");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new RuntimeException("The color must not be null or empty");
        }
        this.color = color;
    }

    public String getSize() {
        if (size == null || size.isEmpty()) {
            throw new RuntimeException("The size must not be null or empty");
        }
        return size;
    }

//    public void setSize(String size) {
//        if(size == null || size.isEmpty()){
//            throw new RuntimeException("The size must not be null or empty");
//        }
//        this.size = size;
//    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        this.brand = brand;
        this.model = model;
        setPrice(price);
        setColor(color);
        this.size = size;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
/*Create an Abstract Class Named 'Device':
    - Variables:
        - final brand
        - final model
        - price
        - color
        - final size
        - hasBattery
        - hasPowerButton
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions:
        - brand, model, color, and size must not be null or empty.
        - price must be positive.
    - Abstract Methods:
        - turnOn()
        - turnOff()
    - Non-Abstract Method:
        - toString()


 */