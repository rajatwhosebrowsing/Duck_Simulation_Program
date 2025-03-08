//MallardDuck.java
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior = new Swim();
    }

    @Override
    public void display() {
        System.out.println("I look like a Mallard Duck.");
    }
}