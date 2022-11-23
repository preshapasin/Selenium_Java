package applicationModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WebElementsDef {

    public String men;
    public String menTops;
    public String menJackets;
    public String menBottom;
    public String category;
    public String pants;
    public String jacketSize;
    public String expectedOrder;
    public String expectedPrice;
    public String jacketColour;
    public String addToCart;
    public String jacketSizeM;
    public String expectedOrderM;
    public String expectedPriceM;
    public String jacketColourR;
    public String addToCartR;
    public String jacketSize33;
    public String expectedOrder33;
    public String expectedPrice33;
    public String jacketColourB;
    public String addToCartB;
    public String showCart;
    public String proceed;
    public String shipMethod;
    public String actualOrder;
    public String actualPrice;
    public String actualOrderM;
    public String actualPriceM;
    public String actualOrder33;
    public String actualPrice33;
    public String placeOrder;
    public String confirmOrder;
    public String confirm1;
    public String confirm2;
    public String confirm3;

    public WebElementsDef() {

        men = "/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/a/span[2]";
        menTops = "//*[@id=\"ui-id-17\"]/span[2]";
        menJackets = "/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/ul/li[1]/ul/li[1]/a/span";
        menBottom = "/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/ul/li[2]/a/span[2]";
        category = "/html/body/div[2]/main/div[3]/div[2]/div/div[2]/div/div[1]/div[1]";
        pants = "/html/body/div[2]/main/div[3]/div[2]/div/div[2]/div/div[1]/div[2]/ol/li[1]/a";
        jacketSize = "option-label-size-143-item-167";
        expectedOrder = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img";
        expectedPrice = "/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[1]/span/span/span[2]/span";
        jacketColour = "option-label-color-93-item-50";
        addToCart = "/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div/div[1]/form/button/span";
        jacketSizeM = "/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[2]/div/div/div[3]/div[1]/div/div[3]";
        expectedOrderM = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/a/span/span/img";
        expectedPriceM = "/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[2]/div/div/div[2]/span/span/span[2]/span";
        jacketColourR = "option-label-color-93-item-58";
        addToCartR = "/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[2]/div/div/div[4]/div/div[1]/form/button/span";
        jacketSize33 = "/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[2]/div[1]/div/div[2]";
        expectedOrder33 = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img";
        expectedPrice33 = "/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[1]/span/span/span[2]/span";
        jacketColourB = "option-label-color-93-item-49";
        addToCartB = "/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div/div[1]/form/button/span";
        showCart = "/html/body/div[2]/header/div[2]/div[1]/a";
        proceed = "top-cart-btn-checkout";
        shipMethod = "//*[@id=\"shipping-method-buttons-container\"]/div/button/span";
        actualOrder = "//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li/div/span/span/img";
        actualPrice = "//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li/div/div/div[1]/div[2]/span/span/span";
        actualOrderM = "//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li[2]/div/span/span/img";
        actualPriceM = "//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li[2]/div/div/div[1]/div[2]/span/span/span";
        actualOrder33 = "//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li[3]/div/span/span/img";
        actualPrice33 = "//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li[3]/div/div/div[1]/div[2]/span/span/span";
        placeOrder = "//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span";
        confirmOrder = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/p[1]/a/strong";
        confirm1 = "/html/body/div[2]/main/div[2]/div[1]/div[2]/div[2]/table/tbody[1]/tr/td[1]/strong";
        confirm2 = "/html/body/div[2]/main/div[2]/div[1]/div[2]/div[2]/table/tbody[2]/tr/td[1]/strong";
        confirm3 = "/html/body/div[2]/main/div[2]/div[1]/div[2]/div[2]/table/tbody[3]/tr/td[1]/strong";
    }
}
