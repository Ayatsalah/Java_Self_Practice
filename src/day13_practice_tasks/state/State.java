package day13_practice_tasks.state;

public class State {
    private String name;
    private String abbreviation;
    private String politicalParty;
    private String governor;
    private String senator;
    private int population;

    public State(String abbreviation, String politicalParty, String governor, String senator, int population) {
        setName(getClass().getSimpleName());
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.err.println("Name must not be null, empty or blank.");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null || abbreviation.trim().isEmpty()) {
            System.err.println("Abbreviation must not be null, empty or blank.");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null || politicalParty.trim().isEmpty()) {
            System.err.println("Political Party must not be null, empty or blank.");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor == null || governor.trim().isEmpty()) {
            System.err.println("Governor must not be null, empty or blank.");
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator == null || senator.trim().isEmpty()) {
            System.err.println("Senator must not be null, empty or blank.");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population<=0){
            System.err.println("Population must be greater than zero.");
            System.exit(1);
        }
        this.population = population;
    }

    public State() {
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
               // "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
/*State Task Requirements:
1. Create a class named 'State' with the following specifications:
   Attributes:
       - name: String
       - abbreviation: String
       - politicalParty: String
       - Governor: String
       - senator: String
       - population: int

   Encapsulation Requirements:
       - Ensure attributes are private with getters and setters.
       - Conditions for Encapsulation:
           - 'name', 'abbreviation', 'politicalParty', 'Governor', and 'senator' must not be null, empty, or blank.
           - 'population' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Methods:
       - toString(): Prints the information of the State object.


 */
