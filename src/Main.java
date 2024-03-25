import Proxy.Ebook;
import Proxy.EbookProxy;
import Proxy.Library;
import Proxy.RealEbook;
import SingletonPattern.ConfigManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name","Nana Yaw");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
       }

    }





