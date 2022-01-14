package StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    WebDriver driver = null;

    @Given("I open the login page")
    public void i_open_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "/Users/gandaria/IdeaProjects/Selenium_SauceDemoEcommerce/Drivers/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

    }

    @When("I input valid username and password")
    public void i_input_valid_username_and_password() {
       driver.findElement(By.id("user-name")).sendKeys("standard_user");
       driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
       driver.findElement(By.id("login-button")).click();
    }

    @Then("I log in successfully")
    public void i_log_in_successfully() {
        driver.findElement(By.className("shopping_cart_link")).isDisplayed();
        driver.close();
        driver.quit();
    }

}

