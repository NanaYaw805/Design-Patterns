package FlyweightPattern;

public class PointIcon {
    private final PointType type; //once you initialize in a constructor , we do not want to change the data type

    public PointType getType() {
        return type;
    }

    private final  byte[] icon;

    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }
}
