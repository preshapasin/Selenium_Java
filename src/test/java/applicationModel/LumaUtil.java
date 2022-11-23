package applicationModel;

import static applicationModel.StaticConstants.*;

import java.util.List;
import Util.WaitUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
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
    WaitUtil waiting;

    public LumaUtil() {
        webDef = new WebElementsDef();
    }

    public void mainCategoryMethod()  {

        log.info("Hover over the main category");
        waiting.isPageLoaded();
        WebElement men = driver.findElement(By.xpath(webDef.men));
        actions.moveToElement(men);
        actions.build().perform();
    }

    public void clothingTypeMethod() {

        
        WebElement menTops = driver.findElement(By.xpath(webDef.menTops));
        actions.moveToElement(menTops);
        actions.build().perform();

        WebElement menJackets = driver.findElement(By.xpath(webDef.menJackets));
        actions.moveToElement(menJackets);
        actions.click().build().perform();
    }

    public void clothingTypePants() throws InterruptedException {

        WebElement menBottoms = driver.findElement(By.xpath(webDef.menBottom));
        menBottoms.click();

        Thread.sleep(5000);
        WebElement cat = driver.findElement(By.xpath(webDef.category));
        cat.click();
        WebElement menPants = driver.findElement(By.xpath(webDef.pants));
        menPants.click();
    }

    public void sizeColourJackets(List<List<String>> data) {
        log.info("Select size and colour of product");

        String s = data.get(0).get(0);
        String blue = data.get(0).get(1);
        String m = data.get(1).get(0);
        String red = data.get(1).get(0);

        waiting.isPageLoaded();
        WebElement jacketSize = driver.findElement(By.id(webDef.jacketSize));
        expectedOrder = driver.findElement(By.xpath(webDef.expectedOrder));
        expectedPrice = driver.findElement(By.xpath(webDef.expectedPrice));
        expected = expectedOrder.getAttribute("alt");
        priceExp = expectedPrice.getText();
        if (!(jacketSize.getText() == s)) {
            jacketSize.click();
        }
        waiting.isPageLoaded();
        WebElement jacketColour = driver.findElement(By.id(webDef.jacketColour));
        if (!(jacketColour.getAttribute("option-label") == blue)) {
            jacketColour.click();
        }
        WebElement addToCart = driver.findElement(By.xpath(webDef.addToCart));
        addToCart.click();

        waiting.isPageLoaded();
        WebElement jacketSizeM = driver.findElement(By.xpath(webDef.jacketSizeM));
        expectedOrderM = driver.findElement(By.xpath(webDef.expectedOrderM));
        expectedPriceM = driver.findElement(By.xpath(webDef.expectedPriceM));
        expectedM = expectedOrderM.getAttribute("alt");
        priceExpM = expectedPriceM.getText();
        waiting.isPageLoaded();
        if (!(jacketSizeM.getText() == m)) {
            jacketSizeM.click();
        }

        WebElement jacketColourR = driver.findElement(By.id(webDef.jacketColourR));
        if (!(jacketColourR.getAttribute("option-label") == red)) {
            jacketColourR.click();
        }
        waiting.isPageLoaded();
        WebElement addToCartR = driver.findElement(By.xpath(webDef.addToCartR));
        addToCartR.click();
    }

    public void sizeColourPants(List<List<String>> datap) {
        log.info("Select size and colour of product");

        String size = datap.get(0).get(0);
        String black = datap.get(0).get(1);

        waiting.isPageLoaded();
        WebElement jacketSize33 = driver.findElement(By.xpath(webDef.jacketSize33));
        expectedOrder33 = driver.findElement(By.xpath(webDef.expectedOrder33));
        expectedPrice33 = driver.findElement(By.xpath(webDef.expectedPrice33));
        expected33 = expectedOrder33.getAttribute("alt");
        priceExp33 = expectedPrice33.getText();
        waiting.isPageLoaded();
        if (!(jacketSize33.getText() == size)) {
            jacketSize33.click();
        }

        WebElement jacketColourB = driver.findElement(By.id(webDef.jacketColourB));
        if (!(jacketColourB.getAttribute("option-label") == black)) {
            jacketColourB.click();
        }

        waiting.isPageLoaded();
        WebElement addToCartB = driver.findElement(By.xpath(webDef.addToCartB));
        addToCartB.click();
    }

    public void proceedToCheckout() throws InterruptedException {

        waiting.isPageLoaded();
        WebElement showCart = driver.findElement(By.xpath(webDef.showCart));
        showCart.click();
        WebElement proceed = driver.findElement(By.id(webDef.proceed));
        proceed.click();
        Thread.sleep(25000);
    }

    public void selectShippingMethod() throws InterruptedException {

        WebElement shipMethod = driver.findElement(By.xpath(webDef.shipMethod));
        shipMethod.click();
        Thread.sleep(10000);
    }

    public void verifyOrderSum() {

//        WebElement arrowDrop = driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/div/div[1]"));
//        arrowDrop.click();
        WebElement actualOrder = driver.findElement(By.xpath(webDef.actualOrder));
        String actual = actualOrder.getAttribute("alt");
        WebElement actualPrice = driver.findElement(By.xpath(webDef.actualPrice));
        String priceAct = actualPrice.getText();

        WebElement actualOrderM = driver.findElement(By.xpath(webDef.actualOrderM));
        String actualM = actualOrderM.getAttribute("alt");
        WebElement actualPriceM = driver.findElement(By.xpath(webDef.actualPriceM));
        String priceActM = actualPriceM.getText();

        WebElement actualOrder33 = driver.findElement(By.xpath(webDef.actualOrder33));
        String actual33 = actualOrder33.getAttribute("alt");
        WebElement actualPrice33 = driver.findElement(By.xpath(webDef.actualPrice33));
        String priceAct33 = actualPrice33.getText();

        log.info(expected, actual);
        log.info(priceExp, priceAct);
        log.info(expectedM, actualM);
        log.info(priceExpM, priceActM);
        log.info(expected33, actual33);
        log.info(priceExp33, priceAct33);

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(priceExp, priceAct);

        Assert.assertEquals(expectedM, actualM);
        Assert.assertEquals(priceExpM, priceActM);

        Assert.assertEquals(expected33, actual33);
        Assert.assertEquals(priceExp33, priceAct33);
        waiting.isPageLoaded();
    }

    public void placeTheOrder() throws InterruptedException {

        WebElement placeOrder = driver.findElement(By.xpath(webDef.placeOrder));
        placeOrder.click();
        Thread.sleep(5000);
    }

    public void verifyMyOrder() throws InterruptedException {

        WebElement confirmOrder = driver.findElement(By.xpath(webDef.confirmOrder));
        confirmOrder.click();
        Thread.sleep(5000);

        WebElement confirm1 = driver.findElement(By.xpath(webDef.confirm1));
        String order1 = confirm1.getText();

        WebElement confirm2 = driver.findElement(By.xpath(webDef.confirm2));
        String order2 = confirm2.getText();

        WebElement confirm3 = driver.findElement(By.xpath(webDef.confirm3));
        String order3 = confirm3.getText();

        Assert.assertEquals(expected.trim(), order1);
        Assert.assertEquals(expectedM.trim(), order2);
        Assert.assertEquals(expected33.trim(), order3);
    }
}
