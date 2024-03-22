package FacadePattern;

public class NotificationService {
    public void send(String message, String target){
        var server = new NotificationServer();
        var connection = server.connect("165.324.345.345");
        var authToken =server.authenticate("appID","key");
        server.send(authToken,new Message(message),target);
        connection.disconnect();

        //When any of the classes changes in the future , this is where they will all change

        /* this class was created to solve the problem here.....
             //The problem with this method of design is that the moment we
        //want to send a notification to our users , we have to follow all these steps
        //the facade pattern solves this problem
        //our classes are coupled to main class.
        //NotificationService
         */
    }
}
