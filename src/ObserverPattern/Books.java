package ObserverPattern;

public class Books implements Observer{
    @Override
    public void update() {
        System.out.println("A book was added!");
    }
}
