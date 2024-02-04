package day07_class_objects_part1;

public class Address {
    public int buildingNumber;
    public String street;
    public String city;
    public String state;
    public String zipcode;
    public void display() {
        System.out.println(buildingNumber + " " + street + "\n" + city + " " + state + ", " + zipcode);
    }

   public String toString() {
        return "Address{" +
                "buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipcode + '\'' +
                '}';
    }

   }

