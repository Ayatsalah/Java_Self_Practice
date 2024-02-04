package day07_class_objects_part1;

public class Item {
    public String itemName;
    public double unitPrice;
    public int quantity;

    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
    public double calcCost(){
        return unitPrice * quantity;
    }
}
/*

            calcCost(): calculates the total cost of the item.
            toString(): returns a string representation of the Item object with the full information of the item,
            including the total cost calculated by calcCost.


      Create another class named ItemClients, create multiple item objects, and test each function of the item object.


 */