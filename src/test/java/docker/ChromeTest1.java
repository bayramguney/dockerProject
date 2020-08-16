package docker;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;

public class ChromeTest1 {
@Test
    public void test() throws MalformedURLException {
    DesiredCapabilities dc=new DesiredCapabilities();
    dc.setBrowserName(BrowserType.CHROME);
    URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, dc);
        driver.get("https://www.apple.com");
        System.out.println(driver.getTitle());
    }
}