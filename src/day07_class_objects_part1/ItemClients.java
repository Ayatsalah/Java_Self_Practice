package day07_class_objects_part1;

public class ItemClients {
    public static void main(String[] args) {
        Item item1=new Item();
        Item item2=new Item();

        item1.itemName="Apple";
        item1.unitPrice=1.5;
        item1.quantity=5;

        item2.itemName="Banana";
        item2.unitPrice=1;
        item2.quantity=10;


        System.out.println(item1.calcCost());
        System.out.println(item2.calcCost());

    }
}
