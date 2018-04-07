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
		cap.setCapability("automationName", "Appium");// appium���Զ���
		// cap.setCapability("app", "C:\\software\\jrtt.apk");//��װapk
		// cap.setCapability("browserName", "chrome");//����HTML5���Զ������򿪹ȸ������
		cap.setCapability("deviceName", "Coolpad 8297");// �豸����
		cap.setCapability("platformName", "Android"); // ��׿�Զ�������IOS�Զ���
		cap.setCapability("platformVersion", "6.0.1"); // ��׿����ϵͳ�汾
		cap.setCapability("udid", "5361c450"); // �豸��udid (adb devices �鿴����)
		cap.setCapability("appPackage", "com.android.calculator2");// ����app�İ���
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");// ����app�����Activity����
		cap.setCapability("unicodeKeyboard", "True"); // ֧����������
		cap.setCapability("resetKeyboard", "True"); // ֧���������룬��������������
		cap.setCapability("noSign", "True"); // ������ǩ��apk
		cap.setCapability("newCommandTimeout", "30"); // û�������appium30���˳�
		cap.setCapability("sessionOverride", true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);// ���������ô���appium����˲������ֻ�
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// ��ʽ�ȴ�
		// ͨ��resource name��λԪ��
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