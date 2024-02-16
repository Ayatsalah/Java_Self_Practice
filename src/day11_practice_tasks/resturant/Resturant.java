package day11_practice_tasks.resturant;

import java.util.ArrayList;
import java.util.Arrays;

public class Resturant {

    public String Owner;
    public String Location;
    public int numberOfStars;
    public ArrayList<Server> serverList;
    public ArrayList<Chef> chefList;

    public Resturant(String owner, String location, int numberOfStars) {
        this.Owner = owner;
        this.Location = location;
        this.numberOfStars = numberOfStars;
        serverList=new ArrayList<>();
        chefList=new ArrayList<>();
    }

    public String toString() {
        return "Resturant{" +
                "Owner='" + Owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", numberOfChefs= " + chefList.size() +
                ", numberOfServers= " + serverList.size() +
                '}';
    }


    public void hireServer(Server server) {

        serverList.add(server);
    }

    public void hireServer(Server[] servers) {

        this.serverList.addAll(Arrays.asList(servers));
    }


    public void hireChef(Chef chef) {
        chefList.add(chef);
    }

    public void hireChef(Chef[] chefs) {
        this.chefList.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID) {
        chefList.removeIf(p -> p.employeeID == employeeID);
    }

    public void terminateServer(int employeeID) {
        serverList.removeIf(p1 -> p1.employeeID == employeeID);
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
