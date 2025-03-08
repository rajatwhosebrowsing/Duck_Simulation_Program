//MuteQuack.java
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >> I can't quack!");
    }
}