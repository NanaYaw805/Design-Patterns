package FactoryPackage;

import FactoryPackage.matcha.Controller;
import FactoryPackage.matcha.MatchaViewEngine;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller {
    public void listProducts(){
        Map<String,Object> coontext = new HashMap<>();
        render("products.html",coontext);
    }

}
