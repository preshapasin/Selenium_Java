package cucumber;

import static Util.StaticConstants.project_path;
import static Util.StaticConstants.driver;
import static Util.StaticConstants.actions;
import static Util.StaticConstants.properties;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lombok.extern.slf4j.Slf4j;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"./src/test/resources/features/Luma.feature"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
       // publish = true,
        monochrome = true
)
@Slf4j
public class LumaRunnerTest {

    @BeforeClass
    public static void startDriver() {

        System.setProperty("webdriver.chrome.driver", "./src/Drivers/LinuxChromeDriver/chromedriver");
        driver = new ChromeDriver();
        actions = new Actions(driver);
        login();
    }

    public static void login() {
        log.info("entered into the method");
        driver.get(properties.getPropValues("WEBSITE_HOME"));
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
        driver.findElement(By.id("email")).sendKeys("pizzaspresha@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Czarina#29");
        driver.findElement(By.id("send2")).click();
    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        WebElement profileView = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span"));
        profileView.click();
        Thread.sleep(2000);

        WebElement logOut = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a"));
        logOut.click();
        log.info("Signed out of Luma successfully...");
        Thread.sleep(2000);
        log.info("Browser is closed successfully...");
        driver.close();
        driver.quit();
    }
}
