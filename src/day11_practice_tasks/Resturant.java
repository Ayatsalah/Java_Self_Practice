package day11_practice_tasks;
import day11_practice_tasks.Server.*;
import day11_practice_tasks.Chef.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Resturant {

    public String Owner;
    public String Location;
    public int numberOfStars;
    ArrayList<Server> serverList=new ArrayList<>();

    ArrayList<Chef> chefList=new ArrayList<>();

    public Resturant(String owner, String location, int numberOfStars) {
        this.Owner = owner;
        this.Location = location;
        this.numberOfStars = numberOfStars;
    }

    public String toString() {
        return "Resturant{" +
                "Owner='" + Owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", numberOfChefs= "+ chefList.size()+
                 ", numberOfServers= "+ serverList.size()+
                '}';
    }


    public void hireServer(Server server){

        serverList.add(server);
    }
   public void hireServer(Server[] servers){

        serverList.addAll(Arrays.asList(servers));
   }


    public void hireChef(Chef chef){
        chefList.add(chef);
    }
    public void hireChef(Chef[] chefs){
        chefList.addAll(Arrays.asList(chefs));
    }
   public void terminateChef(int employeeID){
        chefList.removeIf(p->p.employeeID==employeeID);
   }
   public void terminateServer(int employeeID){
        serverList.removeIf(p1->p1.employeeID==employeeID);
   }
}

/*Create a custom class named Restaurant with the following specifications:

	Attributes:
			Owner (String)
			Location (String)
			numberOfStars (int)
			Servers (ArrayList of Server objects)
			Chefs (ArrayList of Chef objects)

	Add a constructor that sets the owner, location, and number of stars.

	Actions:
		hireServer(Server server): adds a server object to the Servers ArrayList
		hireServer(Server[] servers): adds an array of Server objects to the Servers ArrayList
		hireChef(Chef chef): adds a chef object to the Chefs ArrayList
		hireChef(Chef[] chefs): adds an array of Chef objects to the Chefs ArrayList
		terminateChef(int employeeID): removes the chef with the matching ID from the Chefs ArrayList
		terminateServer(int employeeID): removes the server with the matching ID from the Servers ArrayList
		toString(): returns a string representation of the Restaurant object, including the number of Servers and Chefs alongside other information

 */
