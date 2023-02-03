package MavenBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicsLauchingBrowserTest {
	@Test
public void maven() {
	WebDriverManager.chromedriver().setup();//insteadof setproperty
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
String parentwindow = driver.getWindowHandle();
driver.switchTo().newWindow(WindowType.TAB);//transfer the control to next webpage
driver.get("https://www.selenium.dev/");
driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://in.via.com/");
driver.switchTo().window(parentwindow);
driver.manage().window().minimize();//selenium 4 we can minimize


}
}
