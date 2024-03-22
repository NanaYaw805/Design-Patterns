package FacadePattern;

public class NotificationServer {
    //this class describes the series of steps we need to follow to send our notification
    //contains a connection object that we will later use to connect to our server
    //authenticate(appID,key) ->AuthToken
    //send(authToken, ,essage,target)
    //conn.desconnect()

    public Connection connect(String ipAddress) {
        return new Connection();
    }

    public AuthToken authenticate(String appID,String key){
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target)
    {
        System.out.println("Sending a message");
    }


}
