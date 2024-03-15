package step_definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_login_test {
	public WebDriver driver;
	@Given("open the browser and enter the url")
	public void open_the_browser_and_enter_the_url()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@When("login using valid un and pwd")
	public void login_using_valid_un_and_pwd() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Then("check homepage is displayed")
	public void check_homepage_is_displayed() throws InterruptedException
	{
		String title=driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(title, "OrangeHRM");
		Thread.sleep(2000);
		System.out.println("the title is correct");
	}
	@Then("logout and close")
	public void logout_ans_close() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}
