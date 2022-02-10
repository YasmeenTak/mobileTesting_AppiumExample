package AppiumPackage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiautomatorTest extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElementByAndroidUIAutomator("atrribute('value')");
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		
		//Validate clickable feature for all options
		//driver.findElementByAndroidUIAutomator("new UiSelector().property(value)").click();
		//System.out.print(driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").size());


	}
	

}
