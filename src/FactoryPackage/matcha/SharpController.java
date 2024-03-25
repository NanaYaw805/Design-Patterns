package FactoryPackage.matcha;

import java.util.HashMap;
import java.util.Map;

public class SharpController extends Controller{

    public void listProducts(){
        Map<String,Object> context = new HashMap<>();
        render("products.html",context);
    }
}
