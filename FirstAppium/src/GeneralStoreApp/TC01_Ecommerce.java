package GeneralStoreApp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC01_Ecommerce extends GeneralStoreApp.Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*
		 * XPath Syntax //tagName[@attribute='value']
		 */
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Yasmeen");
		// To hide the keyboard
		driver.hideKeyboard();
		driver.findElementByXPath("//*[@text='Female']").click();
		driver.findElementById("android:id/text1").click();
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Egypt\"))");
		// driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new
		// UiSelector().scrollable(true).instance(0)).scrollIntoView(new
		// UiSelector().textMatches(\"" + containedText + "\").instance(0))"));
		driver.findElementByXPath("//*[@text='Egypt']").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		String toastMessage = driver.findElement(By.xpath("//android.widget.Tost[1]")).getAttribute("name");
		System.out.println(toastMessage);
		//bring attribute name to for toast message to have the content 

	}

}
