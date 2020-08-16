import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class dockerWithFirefox {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities ds=new DesiredCapabilities();
        ds.setBrowserName(BrowserType.FIREFOX);
        URL url =new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver=new RemoteWebDriver(url,ds);
        driver.get("http://www.google.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.quit();
    }

}
