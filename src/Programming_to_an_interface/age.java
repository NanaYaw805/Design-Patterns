package Programming_to_an_interface;

public class age implements Human{
    @Override
    public String userDetails(String human) {
        System.out.println("This is the user age "+human);
        return human;
    }
}
