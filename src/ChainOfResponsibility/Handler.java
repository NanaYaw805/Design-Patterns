package ChainOfResponsibility;

public abstract class Handler {
   //Because each handler needs to maintain a reference to the next handler
    //in the chain
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request){
        if(doHandle(request))
            return;
        if (next != null)
            next.handle(request);
    }

    public abstract boolean doHandle(HttpRequest request);


}
