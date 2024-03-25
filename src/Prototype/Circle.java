package Prototype;

public class Circle implements Component{
    private int radius;
    @Override
    public void render() {
        System.out.println("Rendering a circle");
    }

    @Override
    public Component clone() {
        Circle target = new Circle();
        target.setRadius(radius);
        return target;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
