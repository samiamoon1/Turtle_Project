package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {
	
	WebDriver driver ;
	
	public GoogleHome (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (name="q")
	
	WebElement searchBox ;
	
//WebElement searchBox = driver.findElement(By.name("q"));
			
public void enterSearch (String string ) {
	searchBox.sendKeys(string);
}
@FindBy(name="btnk")	
WebElement searchBtn;
//WebElement searchBtn = driver.findElement(By.name("btnK"));

//searchBtn.click();
//searchBtn.submit();			

public void clickSearch() {
	searchBtn.submit();
}



}
