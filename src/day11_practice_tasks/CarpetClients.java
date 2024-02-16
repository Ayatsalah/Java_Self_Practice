package day11_practice_tasks;

public class CarpetClients {
    public static void main(String[] args) {
        Carpet carpet1=new Carpet(2,3,4,false);
        System.out.println("The cost for carpet1 is: $"+carpet1.calCost());
        Carpet carpet2=new Carpet(3,4,5,true);
        System.out.println("The cost for carpet2 is: $"+carpet2.calCost());
    }
    }

