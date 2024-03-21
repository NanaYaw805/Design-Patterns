package AdapterPattern;

import AdapterPattern.Avafilters.Caramel;

public class CaramelFilter implements Filter{
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    public void apply(Image image){
        caramel.init();
        caramel.render(image);
    }
}
