package Programming_to_an_interface;

public abstract class Animal {
    private String name;

    public  abstract void walk();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
