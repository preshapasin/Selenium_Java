package Util;

import static Util.StaticConstants.*;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Slf4j
public class LumaUtil {

    WebElement expectedOrder;
    WebElement expectedPrice;
    WebElement expectedOrderM;
    WebElement expectedPriceM;
    WebElement expectedOrder33;
    WebElement expectedPrice33;
    WebElementsDef webDef;

    public LumaUtil() {
        webDef = new WebElementsDef();
    }

    public void mainCategoryMethod(String mainType) throws InterruptedException {

        log.info("Hover over the main category");
        Thread.sleep(2000);
        String type = mainType;
        switch (type) {
            case "Men":
                actions.moveToElement(webDef.men);
                Thread.sleep(2000);
                actions.build().perform();
                break;
        }
    }

    public void subCategoryMethod(String subType) throws InterruptedException {

        Thread.sleep(2000);
        String type = subType;
        switch (type) {
            case "Tops":
                actions.moveToElement(webDef.menTops);
                Thread.sleep(2000);
                actions.build().perform();
                break;

            case "Bottoms":
                actions.moveToElement(webDef.menBottoms);
                Thread.sleep(2000);
                actions.build().perform();
                break;
        }
    }

    public void clothingTypeMethod(String clothingType) throws InterruptedException {

        Thread.sleep(2000);
        String type = clothingType;
        switch (type) {
            case "Jackets":
                Thread.sleep(2000);
                actions.moveToElement(webDef.menJackets);
                actions.click().build().perform();
                break;

            case "Pants":
                Thread.sleep(2000);
                actions.moveToElement(webDef.menPants);
                actions.click().build().perform();
                break;
        }
    }

    public void sizeColorMethod(String sizes, String colour) throws InterruptedException {

        Thread.sleep(2000);
        String size = sizes;
        switch (size) {
            case "S":
                Thread.sleep(2000);
                WebElement jacketSize = driver.findElement(By.id("option-label-size-143-item-167"));
                expectedOrder = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img"));
                expectedPrice = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[1]/span/span/span[2]/span"));
                expected = expectedOrder.getAttribute("alt");
                priceExp = expectedPrice.getText();
                Thread.sleep(2000);
                jacketSize.click();
                break;

            case "M":
                Thread.sleep(2000);
                WebElement jacketSizeM = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[2]/div/div/div[3]/div[1]/div/div[3]"));
                expectedOrderM = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/a/span/span/img"));
                expectedPriceM = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[2]/div/div/div[2]/span/span/span[2]/span"));
                expectedM = expectedOrderM.getAttribute("alt");
                priceExpM = expectedPriceM.getText();
                Thread.sleep(2000);
                jacketSizeM.click();
                break;

            case "33":
                Thread.sleep(2000);
                WebElement jacketSize33 = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[2]/div[1]/div/div[2]"));
                expectedOrder33 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img"));
                expectedPrice33 = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[1]/span/span/span[2]/span"));
                expected33 = expectedOrder33.getAttribute("alt");
                priceExp33 = expectedPrice33.getText();
                Thread.sleep(2000);
                jacketSize33.click();
                break;
        }
        String color = colour;
        switch (color) {
            case "Blue":
                Thread.sleep(2000);
                WebElement jacketColour = driver.findElement(By.id("option-label-color-93-item-50"));
                Thread.sleep(2000);
                jacketColour.click();
                Thread.sleep(2000);
                WebElement addToCart = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div/div[1]/form/button/span"));
                addToCart.click();
                Thread.sleep(2000);
                break;

            case "Red":
                Thread.sleep(2000);
                WebElement jacketColourR = driver.findElement(By.id("option-label-color-93-item-58"));
                Thread.sleep(2000);
                jacketColourR.click();
                Thread.sleep(2000);
                WebElement addToCartR = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[2]/div/div/div[4]/div/div[1]/form/button/span"));
                addToCartR.click();
                Thread.sleep(2000);
                break;

            case "Black":
                Thread.sleep(2000);
                WebElement jacketColourB = driver.findElement(By.id("option-label-color-93-item-49"));
                Thread.sleep(2000);
                jacketColourB.click();
                Thread.sleep(2000);
                WebElement addToCartB = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div/div[1]/form/button/span"));
                addToCartB.click();
                Thread.sleep(2000);
                break;
        }
    }

}
