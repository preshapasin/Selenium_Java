package applicationModel;

import Util.FetchProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class StaticConstants {
    public static final String project_path = System.getProperty("user.dir");
    public static WebDriver driver;
    public static Actions actions;
    public static FetchProperties properties = new FetchProperties();
    public static String expected33;
    public static String priceExp33;
    public static String expectedM;
    public static String priceExpM;
    public static String expected;
    public static String priceExp;
}
