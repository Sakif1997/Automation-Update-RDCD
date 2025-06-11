package Utilities;
import static Browser.BrowserSetupNew.getDriver;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.Random;
import java.util.UUID;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



import io.qameta.allure.Allure;
public class Methods {
		public WebElement getElement(By locator) {
			//import static Wppool.AssignmentWP.BrowserSetup.getDriver;
			return getDriver().findElement(locator);//driver = getDriver();
		}
		public void clickElement(By locator) {

			getElement(locator).click();
		}

		public void FieldValue(By locator,String text)
		{
			getElement(locator).sendKeys(text);
		}

		public void WaitElementVisible(By locator) {
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		public String getText(By locator) {
			WebElement element =getElement(locator);
			return element.getText();
			
		}
		public String randomName1() {
			int desiredLength = 5;
			String random = UUID.randomUUID()
			                    .toString()
			                    .substring(0, desiredLength);
			return random;
		}
		public String randomName2() {
			String random = UUID.randomUUID().toString();
			return random;
		}
	public static String generateRandomID() {
		Random random = new Random();
		int idLength = random.nextInt(10) + 1; // Generate a random length between 1 and 10
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < idLength; i++) {
			stringBuilder.append(random.nextInt(10)); // Append a random digit (0-9)
		}
		return stringBuilder.toString();
	}

	public void clickWaitElement(By locator) {
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
			WebElement waitelement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			waitelement.click();
		}
		public void Hover(By locator) {
			Actions action = new Actions(getDriver());
			//action.moveToElement(driver.findElement(locator)).perform();
			action.moveToElement(getElement(locator)).perform();;
		}
		public void ScrollUp() {
			JavascriptExecutor js =(JavascriptExecutor)getDriver();
			js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		}
		JavascriptExecutor js;
		public void ScrollDown() {
			js = (JavascriptExecutor)getDriver();
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		public void ScrollDownByPageElem(By locator){
			js = (JavascriptExecutor)getDriver();
			// Scrolling down the page till the element is found
			js.executeScript("arguments[0].scrollIntoView();", locator);

		}
		public void DropDownSelectElement(By locator, int serialnumber) {
			Select	select = new Select(getElement(locator));
			select.selectByIndex(serialnumber);//
		}
		public void SelectByVissibleTxt(By locator, String text) {
			Select	select = new Select(getElement(locator));
			select.selectByVisibleText(text);
		}
		public void dropDownSelectByVisibleTextDiv(By dropdownLocator, String text) {
		    WebElement dropdown = getElement(dropdownLocator);
		    dropdown.click();  // Click on the div to open the dropdown

		    // Locate the option based on its text
		    By optionLocator = By.xpath(".//div[text()='" + text + "']");
		    WebElement option = dropdown.findElement(optionLocator);
		    option.click();
		}
		
		public void DropDownSelectByVisibleText(By locator, String text) {
			WebElement dropDownField = getElement(locator);
			Select select = new Select(dropDownField);
			select.selectByVisibleText(text);
		}
		public void AleartMessage() {
			  String alertMessage= getDriver().switchTo().alert().getText();		
		      System.out.println(alertMessage);
		}
	    public void clickDropdownOption(By dropdownLocator) {
	        // Click on the div to open the dropdown
	        WebElement dropdown = getDriver().findElement(dropdownLocator);
	        dropdown.click();
	        Actions action = new Actions(getDriver()); 
	        action.keyDown(Keys.ENTER);
	        action.build().perform();
	    }
	    public void DropDownSelectKeybord(By locator, int n) {
	    	clickElement(locator);
	    	Actions action = new Actions(getDriver());
	    	for(int i=0; i<n; i++) {
	    		action.keyDown(Keys.ARROW_DOWN);
	    	}
	    	//action.keyDown(Keys.ARROW_DOWN);
	    	//action.keyDown(Keys.ARROW_DOWN);
	        action.keyDown(Keys.ENTER);
	        action.build().perform();
	    }
	    public void getAlertMessage() {
	    	String alertMessage= getDriver().switchTo().alert().getText(); // capture alert message
	    	System.out.println(alertMessage);// Print Alert Message
	    }
		//for allure report
			public void takeScreenshot(String name) {
				Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
			}
		public void KeybordInputSelectOption(By locator,String text){
			clickElement(locator);
			FieldValue(locator, text);
			Actions action = new Actions(getDriver());
			action.keyDown(Keys.ARROW_DOWN);
			action.keyDown(Keys.ENTER);
			action.build().perform();
		}
		

		public void Checkbox(By locator){
			if (!getElement(locator).isSelected()){
				// If not selected, click the checkbox
				clickElement(locator);
				//System.out.println("Checkbox was not selected, now clicked.");
			} else {
				// If already selected, do nothing
				//System.out.println("Checkbox is already selected, no action taken.");
			}

		}
			
}
