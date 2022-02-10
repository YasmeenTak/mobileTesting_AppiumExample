package AppiumPackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
		// TODO Auto-generated method stub
		File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		if (device.equals("emulator")) {
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "YasoEmulator");
		} else if (device.equals("real")) {
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Mi Note 10 Lite");
		}
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		// UI Automator -> Android Apps
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomator2");
		cap.setCapability(AndroidMobileCapabilityType.ADB_EXEC_TIMEOUT, "90000");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		return driver;
	}

}
