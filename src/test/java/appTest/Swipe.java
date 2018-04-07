package appTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Swipe {
	/**
     * This Method for swipe up
     * 
     * @author Young
     * @param driver
     * @param during
     */
    public static void swipeToUp(AppiumDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);
        // wait for page loading
    }

    /**
     * This Method for swipe down
     * 
     * @author Young
     * @param driver
     * @param during
     */
    public static void swipeToDown(AppiumDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
        // wait for page loading
    }

    /**
     * This Method for swipe Left
     * 
     * @author Young
     * @param driver
     * @param during
     */
    public static void swipeToLeft(AppiumDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);
        // wait for page loading
    }

    /**
     * This Method for swipe Right
     * 
     * @author Young
     * @param driver
     * @param during
     */
    public static void swipeToRight(AppiumDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
        // wait for page loading
    }
}
