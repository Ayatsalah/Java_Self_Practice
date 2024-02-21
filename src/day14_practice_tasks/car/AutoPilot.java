package day14_practice_tasks.car;

public interface AutoPilot extends AutoPark {

    boolean HAS_AUTO_PILOT=true;

    void selfDrive();
}
/*Create a Child Interface of AutoPark Named 'AutoPilot':
    - Note: Use the 'extends' keyword for inheritance.
    - Variables:
        - hasAutoPilot
    - Abstract Method:
        - selfDrive()

 */