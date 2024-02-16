package day11_practice_tasks;

public class PizzaClients {
    public static void main(String[] args) {
        Pizza pizza1=new Pizza("Small",2,2);
        System.out.println("Pizza1 cost= $"+pizza1.calcCost());
        Pizza pizza2=new Pizza("Medium",2,2);
        System.out.println("Pizza2 cost= $"+pizza2.calcCost());
        Pizza pizza3=new Pizza("Large",2,2);
        System.out.println("Pizza3 cost= $"+pizza3.calcCost());

    }
}
