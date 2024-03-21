import ChainOfResponsibility.*;
import CompositePattern.Group;
import CompositePattern.Shape;
import ObserverPattern.Books;
import ObserverPattern.DataSource;
import ObserverPattern.Library;
import Programming_to_an_interface.Animal;
import Programming_to_an_interface.Cat;
import TemplateMethodPattern.GenerateReportTax;
import TemplateMethodPattern.TransferMoneyTask;
import VisitorPattern.AnchorNode;
import VisitorPattern.HeadingNode;
import VisitorPattern.HighLightOperation;
import VisitorPattern.HtmlDocument;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       var group1 = new Group();
       group1.add(new Shape());
       group1.add(new Shape());

       var group2 = new Group();
        group2.add(new Shape());
        group2.add(new Shape());

        var group = new Group();
        group.add(group1);
        group.add(group2);
        group.render(); 


    }
}