package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static pageObject.StaticConstants.driver;

/**
 * Usage is to pause the execution for the mentioned time. The wait time is in milliseconds.
 */

public class WaitUtil {

    public static void waitTime(int timeInMilliSeconds) {
        try {
            Thread.sleep(timeInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void isPageLoaded() {
        waitTime(2000);

        WebElement load = driver.findElement(By.xpath("/html/body/div[1]/div/p"));
        if (!(load.isDisplayed())) {
            waitTime(2000);
        }
    }
}
