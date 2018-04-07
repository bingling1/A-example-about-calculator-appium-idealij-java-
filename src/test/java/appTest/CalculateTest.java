package appTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;


public class CalculateTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver driver;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("automationName", "Appium");// appium做自动化
		// cap.setCapability("app", "C:\\software\\jrtt.apk");//安装apk
		// cap.setCapability("browserName", "chrome");//设置HTML5的自动化，打开谷歌浏览器
		cap.setCapability("deviceName", "Coolpad 8297");// 设备名称
		cap.setCapability("platformName", "Android"); // 安卓自动化还是IOS自动化
		cap.setCapability("platformVersion", "6.0.1"); // 安卓操作系统版本
		cap.setCapability("udid", "5361c450"); // 设备的udid (adb devices 查看到的)
		cap.setCapability("appPackage", "com.android.calculator2");// 被测app的包名
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");// 被测app的入口Activity名称
		cap.setCapability("unicodeKeyboard", "True"); // 支持中文输入
		cap.setCapability("resetKeyboard", "True"); // 支持中文输入，必须两条都配置
		cap.setCapability("noSign", "True"); // 不重新签名apk
		cap.setCapability("newCommandTimeout", "30"); // 没有新命令，appium30秒退出
		cap.setCapability("sessionOverride", true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);// 把以上配置传到appium服务端并连接手机
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// 隐式等待
		// 通过resource name定位元素
		driver.findElementById("com.android.calculator2:id/digit1").click();
		driver.findElementById("com.android.calculator2:id/digit9").click();
		driver.findElementById("com.android.calculator2:id/digit3").click();
		driver.findElementById("com.android.calculator2:id/plus").click();
		driver.findElementById("com.android.calculator2:id/digit1").click();
		driver.findElementById("com.android.calculator2:id/digit3").click();
		driver.findElementById("com.android.calculator2:id/digit2").click();
		driver.findElementById("com.android.calculator2:id/equal").click();

	}

}