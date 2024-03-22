package Bridge;

public class sony implements Interface {


    @Override
    public void turnOn() {
        System.out.println("turn on");

    }

    @Override
    public void turnOff() {
        System.out.println("turn off");

    }

    @Override
    public void setChannel(int number) {
        System.out.println("set channel");


    }
}
