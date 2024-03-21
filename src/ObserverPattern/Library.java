package ObserverPattern;

public class Library implements Observer{
    @Override
    public void update() {
        System.out.println("The library has more books!");
    }
}
