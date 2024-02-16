package day14_practice_tasks.car;

public class CarClients {
    public static void main(String[] args) {

        Car audi = new Audi("Audi", "A4", 2021, 24_000, "Green");
        Car bmw = new BMW("BMW", "X6", 2018, 20_000, "Blue");
        Car cydeo = new CydeoCar("Cydeo", "Java", 2023, 4500, "Yellow");
        Car honda = new Honda("Honda", "Civic", 2019, 12_000, "White");
        Car mercedes = new Mercedes("Mercedes", "E-Class", 2022, 28_000, "Gray");
        Car nio = new Nio("Nio", "ES7", 2019, 25_000, "Pink");
        Car tesla = new Tesla("Tesla", "Model S", 2020, 38_000, "Red");
        Car toyota = new Toyota(" ", "Yaris", 2021, 15_000, "Black");

        testFunc(audi);
        System.out.println("____________________");
        testFunc(bmw);
        System.out.println("____________________");
        testFunc(cydeo);
        System.out.println("____________________");
        testFunc(honda);
        System.out.println("____________________");
        testFunc(mercedes);
        System.out.println("____________________");
        testFunc(nio);
        System.out.println("____________________");
        testFunc(tesla);
        System.out.println("____________________");
        testFunc(toyota);

    }

    public static void testFunc(Car car) {

        car.start();
        car.drive();
        car.stop();

        if (car instanceof AutoPark) {
            ((AutoPark) car).autoPark();
        }
        if (car instanceof AutoPilot) {
            ((AutoPilot) car).selfDrive();

        }
        if (car instanceof Flyable) {
            ((Flyable) car).fly();
        }

    }
}
/*Create a Class Named 'CarClients':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.


 */