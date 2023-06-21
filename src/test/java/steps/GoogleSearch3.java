package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleHome;

public class GoogleSearch3 extends GoogleBase {
	
	GoogleHome gh ; 
	
	@Given("I am on the google homepage")
public void i_am_on_the_google_homepage() {
	
	launchBrowser()	;
		
	}
    

@When("I enter search {string}")
public void i_enter_Search (String string ) {
	
	
	gh = new GoogleHome(driver) ; 
	gh.enterSearch(string);
	
	
	
	
	
}

@When("I click on the google search button")
public void i_click_on_the_google_search_button() {

      gh.clickSearch();
	
}
   

@Then("I recieve related search result")
public void i_recieve_related_search_result() {
  
WebElement resultStats; 
resultStats= driver.findElement(By.id("result-stats"));

String result = resultStats.getText();

System.out.println("================================");
System.out.println("result");
System.out.println("================================");








}

}