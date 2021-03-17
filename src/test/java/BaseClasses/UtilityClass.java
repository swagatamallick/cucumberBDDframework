package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UtilityClass extends pageObjects{



    public void launchBrowser(String browser, String website){
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "F:/bin/chromedriver.exe");
            driver = new ChromeDriver();
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--incognito");
//            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//            driver=new ChromeDriver(capabilities);
        }
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        System.out.println("i have launched");
    }
}
