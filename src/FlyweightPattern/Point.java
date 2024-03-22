package FlyweightPattern;

public class Point {

    //with the flyweight pattern you conserve memory
    //flyweight is an object that we can share
    //To implement the flyweight , separate the data you want to share from the ones you dont want to share
    private int x;
    private int y;
    private PointIcon pointIcon;


    public Point(int x, int y, PointIcon pointIcon) {
        this.x = x;
        this.y = y;
        this.pointIcon = pointIcon;

    }

    public void draw(){
        //Nana Yaw, remember you are defining a placeholder for a string here
        System.out.printf("%s at (%d, %d) ", pointIcon.getType(),x,y);
    }
}
