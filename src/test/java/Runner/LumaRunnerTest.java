package Runner;

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

import static pageObject.StaticConstants.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"./src/test/resources/features/Luma.feature"},
        glue = {"stepDefinition"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true
)
@Slf4j
public class LumaRunnerTest {

    @BeforeClass
    public static void startDriver() {

        System.setProperty("webdriver.chrome.driver", project_path + "//src/Drivers/WindowsChromeDriver/chromedriver");
        driver = new ChromeDriver();
        actions = new Actions(driver);
        login();
    }

    public static void login() {
        log.info("entered into the method");
        driver.get(properties.getPropValues("WEBSITE_HOME"));
        driver.findElement(By.xpath(properties.getPropValues("SIGN_IN"))).click();
        driver.findElement(By.id(properties.getPropValues("EMAIL"))).sendKeys(properties.getPropValues("EMAIL_VAL"));
        driver.findElement(By.id(properties.getPropValues("PASSWORD"))).sendKeys(properties.getPropValues("PASSWORD_VAL"));
        driver.findElement(By.id("send2")).click();
    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        WebElement profileView = driver.findElement(By.xpath(properties.getPropValues("PROFILE")));
        profileView.click();
        Thread.sleep(2000);

        WebElement logOut = driver.findElement(By.xpath(properties.getPropValues("LOGOUT")));
        logOut.click();
        log.info("Signed out of Luma successfully...");
        Thread.sleep(2000);
        log.info("Browser is closed successfully...");
        driver.close();
        driver.quit();
    }
}
