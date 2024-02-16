package day11_practice_tasks.resturant;

public class Server {
   public String name;
   public int employeeID;
   public double hourlyRate;
   public boolean fullTime;

   public void makeOrder(){
      System.out.println(name+" is making an order");
   }
   public void washDishes(){
      System.out.println(name+" is washing the dishes");
   }

   public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
      this.name = name;
      this.employeeID = employeeID;
      this.hourlyRate = hourlyRate;
      this.fullTime = fullTime;
   }

   public String toString() {
      return "Server{" +
              "name='" + name + '\'' +
              ", employeeID=" + employeeID +
              ", hourlyRate=" + hourlyRate +
              ", isFullTime=" + (fullTime?"full-time":"Part-time") +
              '}';
   }
}
/*Create a custom class named Server with similar specifications:

	Attributes:
			name (String)
			employeeID (int)
			hourlyRate (double)
			fullTime (boolean)

	Add A constructor that can set all the fields.

    Actions:
		makeOrder(): prints chef's name + " is making an order"
		washDishes(): prints chef's name + " is washing the dishes"
		toString(): returns a string representation of a Chef, including full-time or part-time status


 */