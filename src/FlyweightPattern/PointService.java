package FlyweightPattern;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory pointIcon;

    public PointService(PointIconFactory pointIcon) {
        this.pointIcon = pointIcon;
    }

    public List<Point> getPoints(){
        List<Point> points = new ArrayList<>();
        var point = new Point(1,2,pointIcon.getPointIcon(PointType.CAFE));
        points.add(point);


        return points;

    }
}
