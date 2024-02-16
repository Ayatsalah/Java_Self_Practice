package day11_practice_tasks.resturant;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalResturant {
    public static void main(String[] args) {
        Resturant rest1=new Resturant("Adam","Birmingham",5);

        Server[] serverList={new Server("Ali",123,25_000,true),
                new Server("John",456,27_000,false)};

        Chef[] chefList={new Chef("Adam",789,30_000,true),
                new Chef("Hasan",456,29_000,false)};

       rest1.hireServer(serverList);
       rest1.hireChef(chefList);
        System.out.println(rest1);



    }
}
/*
Create a class named LocalRestaurant with a main method:
	Create a Restaurant object
	Create an array of servers and chefs with their information set
	Add the initial servers and chefs to the respective ArrayLists in the Restaurant object
	Print the whole restaurant's information

 */