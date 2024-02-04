package day07_class_objects_part1;

public class Rectangle {
    public double width;
    public double lenght;

    public double calculateArea() {
        double result = (width * lenght);
        return result;
    }

    public double calculatePerimeter() {
        double result = 2 * (width + lenght);
        return result;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }
}

