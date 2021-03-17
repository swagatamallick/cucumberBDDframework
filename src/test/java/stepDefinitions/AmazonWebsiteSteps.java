package stepDefinitions;

import BaseClasses.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonWebsiteSteps extends UtilityClass {
   // WebDriver driver;
    @Given("Open {string} in {string}")
    public void openTheMentionedWebsiteAndBrowser(String website, String browser) throws InterruptedException{

    launchBrowser(browser,website);

}
    @When("user enters the {string} and {string}")
    public void enterUsernameAndPassword(String userName, String passWord) {

        driver.findElement(By.name("uid")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(passWord);
        driver.findElement(By.name("btnLogin")).click();

    }

    @After public void close_the_browser() {
       driver.quit();
        }

}
