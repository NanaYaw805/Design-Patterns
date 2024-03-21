import Programming_to_an_interface.Height;
import Programming_to_an_interface.Human;
import Programming_to_an_interface.Name;
import Programming_to_an_interface.age;

public class StrategyPattern {
    private   String user_name;
    private  String user_age;
    private String user_height;

    public StrategyPattern(String user_name, String user_age,String user_height) {
        this.user_name = user_name;
        this.user_age = user_age;
        this.user_height = user_height;
    }

    public  String getUser_name() {
        Human h1 = new Name();
       return h1.userDetails(user_name);
    }

    public String getUser_age() {
        Human h1 = new age();
        return h1.userDetails(user_age);
    }

    public String getUser_height(){
        Human h1 = new Height();
        return h1.userDetails(user_height);
    }
}
