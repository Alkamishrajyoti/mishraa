package pomconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomScript {
	
	//declaration
	@FindBy(id="email")
	private WebElement UName;

	@FindBy(id="pass")
	private WebElement password;	
	

	@FindBy(name="login")
	private WebElement login;
	
	
	//initialization
	public PomScript(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void passData()
	{
		UName.sendKeys("selenium");
	}
	
	public void passData1()
	{
		password.sendKeys("sel@123");
	}
	
	public void login()
	{
		login.click();
	}
}
