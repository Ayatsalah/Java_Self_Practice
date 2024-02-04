package day07_class_objects_part1;

public class AddressClients {
    public static void main(String[] args) {
        Address address1 = new Address();

        address1.buildingNumber = 7925;
        address1.street = "Jones Branch Dr";
        address1.city = "Mclean";
        address1.state = "VA";
        address1.zipcode = "22012";

        //System.out.println(address1);

        address1.display();
    }
}
/*
                        7925 Jones Branch Dr
                        McLean Va, 22012

 */