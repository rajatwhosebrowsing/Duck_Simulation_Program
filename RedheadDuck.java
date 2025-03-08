//RedheadDuck.java
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new Fly();
        quackBehavior = new Quack();
        swimBehavior = new Swim();
    }

    @Override
    public void display() {
        System.out.println("I look like a Redhead Duck.");
    }
}