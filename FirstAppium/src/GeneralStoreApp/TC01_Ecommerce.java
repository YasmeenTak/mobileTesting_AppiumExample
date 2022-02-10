package GeneralStoreApp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC01_Ecommerce extends GeneralStoreApp.Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*
		 * 	  XPath Syntax
		 *   //tagName[@attribute='value']
		 */
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Yasmeen");

		
	}

}
