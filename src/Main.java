import Proxy.Ebook;
import Proxy.EbookProxy;
import Proxy.Library;
import Proxy.RealEbook;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       var library = new Library();
       String[] fileNames = new String[]{"s","d","d","e"};
       for (var fileName:fileNames){
           library.add(new EbookProxy(fileName));
           library.openEbook("s");
       }

    }





}