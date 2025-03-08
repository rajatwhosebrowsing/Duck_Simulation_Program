//Main.java
// Name: [Rajat Dwivedi]
// PRN: [23070126100]
// Batch: [AIML B]

public class Main {
    public static void main(String[] args) {
        // Create instances of different ducks
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        // Test behaviors for each duck
        System.out.println("Mallard Duck:");
        testDuck(mallard);

        System.out.println("\nRedhead Duck:");
        testDuck(redhead);

        System.out.println("\nRubber Duck:");
        testDuck(rubber);

        System.out.println("\nDecoy Duck:");
        testDuck(decoy);
    }

    // Function to test and display all behaviors of a duck
    private static void testDuck(Duck duck) {
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.performSwim();
    }
}