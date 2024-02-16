package day11_practice_tasks;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;
    public int price;

    public int calcCost(){
        switch (size){
            case ("Small")->price=10;
            case("Medium")->price=12;
            case ("Large")->price=14;
        }

        int cost=price+(numberOfCheeseTopping*2)+(numberOfPepperoniTopping*2);
        return cost;


    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", price=" + price +
                "total price= "+calcCost()+
                '}';
    }
}
/* Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.

 */
