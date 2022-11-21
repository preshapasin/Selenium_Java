package Util;

import static Util.StaticConstants.driver;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Slf4j
public class WebElementsDef {

    public WebElement men;
    public WebElement menTops;
    WebElement menBottoms;
    WebElement menJackets;
    WebElement menPants;

    public WebElementsDef() {

        men = driver.findElement(By.id("ui-id-5"));
        menTops = driver.findElement(By.id("ui-id-17"));
        menBottoms = driver.findElement(By.id("ui-id-18"));
        menJackets = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/ul/li[1]/ul/li[1]/a/span"));
        menPants = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/ul/li[2]/ul/li[1]/a/span"));
    }
}
