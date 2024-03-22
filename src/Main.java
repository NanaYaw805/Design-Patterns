import AdapterPattern.Avafilters.Caramel;
import AdapterPattern.CaramelFilter;
import AdapterPattern.Image;
import AdapterPattern.ImageView;
import AdapterPattern.VividFilter;
import ChainOfResponsibility.*;
import CompositePattern.Group;
import CompositePattern.Shape;
import Decorator.CloudStream;
import Decorator.CompressedCloudStream;
import Decorator.EncryptedCloudStream;
import Decorator.Stream;
import FacadePattern.Message;
import FacadePattern.NotificationServer;
import FacadePattern.NotificationService;
import FlyweightPattern.Point;
import FlyweightPattern.PointIconFactory;
import FlyweightPattern.PointService;
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

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Point> the_point = new PointService(new PointIconFactory()).getPoints();
        for (var p:the_point){
            p.draw();
        }



    }





}