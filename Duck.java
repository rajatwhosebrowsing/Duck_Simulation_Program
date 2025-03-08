//Duck.java
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    public Duck() {}

    // Abstract method for displaying the duck's appearance
    public abstract void display();

    // Delegate flying behavior to FlyBehavior
    public void performFly() {
        flyBehavior.fly();
    }

    // Delegate quacking behavior to QuackBehavior
    public void performQuack() {
        quackBehavior.quack();
    }

    // Delegate swimming behavior to SwimBehavior
    public void performSwim() {
        swimBehavior.swim();
    }

    // Setters to dynamically change behaviors
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void setSwimBehavior(SwimBehavior sb) {
        this.swimBehavior = sb;
    }
}