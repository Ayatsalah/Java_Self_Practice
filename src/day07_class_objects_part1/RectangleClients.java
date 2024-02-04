package day07_class_objects_part1;

public class RectangleClients {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle1.width = 10.5;
        rectangle1.lenght = 12.5;

        //rectangle2.width = 7.5;
      //  rectangle2.lenght = 20;

        System.out.println("The area is: " + rectangle1.calculateArea());
        System.out.println("The perimeter is: " + rectangle1.calculatePerimeter());


    }
}
