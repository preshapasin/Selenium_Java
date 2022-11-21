package cucumber;

import static Util.StaticConstants.*;

import Util.LumaUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Slf4j
public class LumaSteps {

    LumaUtil util;

    public LumaSteps() {
        util = new LumaUtil();
    }

    @Given("I am an existing logged in user of Luma website")
    public void confirmLogin() {
        log.info("Login is successful on the Luma website");
    }

    @When("I hover to {string}")
    public void mainCategory(String mainType) throws InterruptedException {

        util.mainCategoryMethod(mainType);
    }

    @And("I hover on the {string} category")
    public void subCategory(String subType) throws InterruptedException {
        log.info("Hover over the sub category");
        util.subCategoryMethod(subType);
    }

    @And("I click on the {string} category")
    public void typeCategory(String clothingType) throws InterruptedException {
        log.info("Click on the clothing type");
        util.clothingTypeMethod(clothingType);
    }

    @And("I select {string} and {string} of one product")
    public void sizeColorCategory(String sizes, String colour) throws InterruptedException {
        log.info("Select size and colour of product");
        util.sizeColorMethod(sizes, colour);

    }

    @And("I proceed to checkout")
    public void proceedCheckout() throws InterruptedException {
        log.info("Add I proceed to checkout");
        Thread.sleep(2000);
        WebElement showCart = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a"));
        showCart.click();
        WebElement proceed = driver.findElement(By.id("top-cart-btn-checkout"));
        proceed.click();
        Thread.sleep(25000);
    }

    @And("I select the shipping method")
    public void selectShipping() throws InterruptedException {
        log.info("Select the shipping method");
        WebElement shipMethod = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span"));
        shipMethod.click();
        Thread.sleep(10000);
    }

    @And("verify the order summary")
    public void verifyOrderSummary() throws InterruptedException {
        log.info("Verify order");
//        WebElement arrowDrop = driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/div/div[1]"));
//        arrowDrop.click();
        WebElement actualOrder = driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li/div/span/span/img"));
        String actual = actualOrder.getAttribute("alt");
        WebElement actualPrice = driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li/div/div/div[1]/div[2]/span/span/span"));
        String priceAct = actualPrice.getText();

        WebElement actualOrderM = driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li[2]/div/span/span/img"));
        String actualM = actualOrderM.getAttribute("alt");
        WebElement actualPriceM = driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li[2]/div/div/div[1]/div[2]/span/span/span"));
        String priceActM = actualPriceM.getText();

        WebElement actualOrder33 = driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li[3]/div/span/span/img"));
        String actual33 = actualOrder33.getAttribute("alt");
        WebElement actualPrice33 = driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li[3]/div/div/div[1]/div[2]/span/span/span"));
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
        Thread.sleep(2000);
    }

    @And("I place the order")
    public void placeOrder() throws InterruptedException {
        log.info("Selected the place order button...");
        WebElement placeOrder = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span"));
        placeOrder.click();
        Thread.sleep(5000);
    }

    @Then("my order is visible under My Orders")
    public void verifyOrder() throws InterruptedException {
        log.info("Verify order under My orders");
        WebElement confirmOrder = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/p[1]/a/strong"));
        confirmOrder.click();
        Thread.sleep(5000);

        WebElement confirm1 = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[2]/div[2]/table/tbody[1]/tr/td[1]/strong"));
        String order1 = confirm1.getText();

        WebElement confirm2 = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[2]/div[2]/table/tbody[2]/tr/td[1]/strong"));
        String order2 = confirm2.getText();

        WebElement confirm3 = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[2]/div[2]/table/tbody[3]/tr/td[1]/strong"));
        String order3 = confirm3.getText();

        Assert.assertEquals(expected.trim(), order1);
        Assert.assertEquals(expectedM.trim(), order2);
        Assert.assertEquals(expected33.trim(), order3);
    }
}
