package appTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

//import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TouTiaoTest {
	private static AppiumDriver driver;

	@BeforeClass
	public static void setup() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("automationName", "Appium");
		cap.setCapability("deviceName", "Coolpad 8297");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.1.1");
		cap.setCapability("udid", "96c96c67");
		cap.setCapability("appPackage", "com.daohangforxiuzhuo");
		cap.setCapability("appActivity", "com.browser2345.BrowserActivity");
		cap.setCapability("unicodeKeyboard", "true");
		cap.setCapability("resetKeyboard", "true");
		cap.setCapability("noSign", "true");
		cap.setCapability("newCommandTimeout", "30");
		cap.setCapability("sessionOverride", true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);// 把以上配置传到appium服务端并连接手机
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// 隐式等待

	}

	@Test
	public void test() throws Exception {
		driver.findElementById("com.daohangforxiuzhuo:id/o0").click();
		driver.findElementById("com.daohangforxiuzhuo:id/d7").sendKeys("京东快递");
		driver.findElementById("com.daohangforxiuzhuo:id/d3").click();
		//driver.wait(1000);
		//driver.notify();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Swipe.swipeToUp( driver, 2000);
		System.out.println("SSSSSSSSS");
		Swipe.swipeToUp( driver, 2000);
		System.out.println("SSSSSSSSS");
		//driver.swipe(75, 500, 75, 0, 1);;

	}

	/*@AfterClass
	public static void tearDown() throws Exception {
//		driver.quit();
		driver.closeApp();
	}*/

}
