package Bridge;

public class AdvancedRemoteControl extends RemoteControl{
    public AdvancedRemoteControl(Interface device){
        super(device);
    }
    public  void setChannel(int number){
        device.setChannel(number);
    }
}
