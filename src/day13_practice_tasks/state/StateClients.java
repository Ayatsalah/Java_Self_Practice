package day13_practice_tasks.state;

public class StateClients {
    public static void main(String[] args) {

        Virginia virginia = new Virginia("VR","Republican", "Glenn Youngkin", "Tim Kaine", 8535519);
        California california = new California("FL","Democratic", "Gavin Newsom", "Alex Padilla", 39538223);
        Texas texas = new Texas("TX","Republican", "Greg Abbott", "John Cornyn", 29145505);
        Florida florida = new Florida( "VA","Republican", "Ron DeSantis", "Marco Rubio", 21538187);


        System.out.println(virginia);

        System.out.println(california);

        System.out.println(texas);

        System.out.println(florida);


    }
}
/*Create a class named 'StateClients':
   - Create multiple objects representing different states.
   - Test the methods and variables of each object.


 */
