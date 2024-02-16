package day11_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ResturantClients {
    public static void main(String[] args) {
        Resturant rest1=new Resturant("adam","Birmingham",5);
        Server server1=new Server("john",123,19,true);
        Chef chef1=new Chef("Shaheen",456,20,false);

       // Resturant rest2=new Resturant("Ali", "London",4);


        Server[] serverList={new Server("Ali",123,25_000,true),
                new Server("John",456,27_000,false)};
        ArrayList<Server> servers=new ArrayList<>();
        servers.addAll(Arrays.asList(serverList));



        Chef[] chefList={new Chef("Adam",789,30_000,true),
                new Chef("Hasan",456,29_000,false)};
       ArrayList<Chef> chefs=new ArrayList<>();
       chefs.addAll(Arrays.asList(chefList));


        System.out.println(servers);
        System.out.println(chefs);

    }
}
/*
Create a class named LocalRestaurant with a main method:
	Create a Restaurant object
	Create an array of servers and chefs with their information set
	Add the initial servers and chefs to the respective ArrayLists in the Restaurant object
	Print the whole restaurant's information

 */