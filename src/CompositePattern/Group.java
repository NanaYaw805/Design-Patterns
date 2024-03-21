package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Object> object = new ArrayList<>();

    public void add(Object shape){
        object.add(shape);
    }

    public void render(){
        for (var shape:object){
            if (shape instanceof Shape)
                ((Shape) shape).render();
            else
                ((Group) shape).render();
        }
    }
}
