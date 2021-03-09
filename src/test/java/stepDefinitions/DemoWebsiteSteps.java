package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebsiteSteps {
    WebDriver driver;
    @Given("Open demo website in {string} browser")
    public void Open_website_in_browser(String string) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:/bin/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/v3/");

        Thread.sleep(10000);
        System.out.println("i have launched");
    }
    @When("the user name is {string} and password  is {string}")
    public void the_user_name_is_and_password_is(String userName, String passWord) {
        driver.findElement(By.name("uid")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(passWord);
        driver.findElement(By.name("btnLogin")).click();

    }
    @And("close the browser")
    public void close_the_browser() {
       // driver.quit();
        }

}
