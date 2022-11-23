package cucumber;

import static applicationModel.StaticConstants.*;

import java.util.List;
import applicationModel.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Slf4j
public class LumaSteps {

    LumaUtil util;
    WebElementsDef def;

    public LumaSteps() {
        util = new LumaUtil();
        def = new WebElementsDef();
    }

    @Given("the customer is a registered logged in user on Luma website")
    public void confirmLogin() {
        log.info("Login is successful on the Luma website");
    }

    @When("the customer checks the Men's clothing section")
    public void mainCategory() {
        util.mainCategoryMethod();
    }

    @And("the customer selects Jackets from Tops section")
    public void topsJackets() {
        log.info("Click on the clothing type");
        util.clothingTypeMethod();
    }

    @And("they select size and colour of the jackets")
    public void sizeColorTable(DataTable dt) {
        log.info("Select size and colour of product - Jackets");
        List<List<String>> data = dt.asLists();
        util.sizeColourJackets(data);
    }

    @And("the customer selects Pants from Bottoms section")
    public void bottomPants() throws InterruptedException {
        log.info("Click on the clothing type");
        WebElement mens = driver.findElement(By.xpath(def.men));
        actions.moveToElement(mens);
        actions.build().perform();
        util.clothingTypePants();
    }

    @And("they select size and colour of the pants")
    public void sizeColor(DataTable dtp) {
        log.info("Select size and colour of product - Pants");
        List<List<String>> datap = dtp.asLists();
        util.sizeColourPants(datap);
    }

    @And("the customer proceed to checkout")
    public void proceedCheckout() throws InterruptedException {
        log.info("Add I proceed to checkout");
        util.proceedToCheckout();
    }

    @And("then select the shipping method")
    public void selectShipping() throws InterruptedException {
        log.info("Select the shipping method");
        util.selectShippingMethod();
    }

    @And("choose the address for delivery")
    public void selectAddress() {
        log.info("Select the address for delivery.");
    }

    @And("the customer verifies the order summary")
    public void verifyOrderSummary() {
        log.info("Verify order");
        util.verifyOrderSum();
    }

    @And("they place the order")
    public void placeOrder() throws InterruptedException {
        log.info("Selected the place order button...");
        util.placeTheOrder();
    }

    @Then("the order is visible under My Orders")
    public void verifyOrder() throws InterruptedException {
        log.info("Verify order under My orders");
        util.verifyMyOrder();
    }
}
