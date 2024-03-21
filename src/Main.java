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

      storeCreditCard(new CompressedCloudStream(new EncryptedCloudStream(new CloudStream())));
    }




    public static void storeCreditCard(Stream stream)
    {

        stream.write("1314-365365-363546-4764654");

    }
}