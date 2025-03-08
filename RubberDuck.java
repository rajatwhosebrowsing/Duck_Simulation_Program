//RubberDuck.java
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new NotFly();
        quackBehavior = new Squeak();
        swimBehavior = new Float();
    }

    @Override
    public void display() {
        System.out.println("I look like a Rubber Duck.");
    }
}