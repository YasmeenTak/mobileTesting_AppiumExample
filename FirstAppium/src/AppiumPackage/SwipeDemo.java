package AppiumPackage;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeDemo extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		//driver.findElementByXPath("*[@content-desc='9']").click();
		driver.findElementByAccessibilityId("9").click();
		TouchAction t = new TouchAction(driver);
		// Long Press on element //2.move to another element and you release
		WebElement firstEle = driver.findElementByXPath("*[@content-desc='15']");
		WebElement secondEle = driver.findElementByXPath("*[@content-desc='45']");
		
//		Actions actions = new Actions(driver);
//		AndroidElement formHour = driver.findElementByAccessibilityId("10");
//		AndroidElement toHour = driver.findElementByAccessibilityId("2");
//		actions.dragAndDrop(formHour, toHour).build().perform();
		
		t.longPress(longPressOptions().withElement(element(firstEle)).withDuration(ofSeconds(2)))
				.moveTo(element(secondEle)).release().perform();
	}

}
