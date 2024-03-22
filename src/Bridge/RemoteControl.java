package Bridge;

//Basic Remote Control(turnOn, turnOff)
//Advanced Remote Control (Set Chanel)
//Movie Remote Control(play,pause,remind)
public  class RemoteControl {
    protected Interface device;

    public RemoteControl(Interface device) {
        this.device = device;
    }

    public void turnOn(){
        device.turnOn();
    }

    public void turnOff(){
        device.turnOff();
    }



}
