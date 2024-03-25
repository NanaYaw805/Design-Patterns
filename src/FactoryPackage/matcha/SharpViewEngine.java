package FactoryPackage.matcha;

import javax.swing.text.View;
import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "rendered by Sharp";
    }
}
