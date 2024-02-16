package day13_practice_tasks.phone;

public class Phone {
    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public Phone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            System.err.println("Brand cannot be null, empty or blank.");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            System.err.println("Model cannot be null, empty, or blank.");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Price must be greater than zero.");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            System.err.println("Color cannot be null, empty, or blank.");
            System.exit(1);
        }
        this.color = color;
    }

    public void call(String phoneNumber) {
        System.out.println("Calling the number " + phoneNumber);
    }

    public void text(String phoneNumber) {
        System.out.println("Texting to the number " + phoneNumber);
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

/*Create a custom class named 'IPhone' with these specifications:
   Attributes:
       - brand: String
       - model: String
       - size: String
       - price: double
       - color: String

   Encapsulation:
       - All fields must be private with getters and setters.
       Conditions for Encapsulation:
           - The 'brand', 'model', and 'color' must not be null, empty, or blank.
           - The 'price' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - faceTime(phoneNumber): Display "facetiming with the number [phoneNumber]".
       - toString(): Prints the information of the IPhone object.

 */

