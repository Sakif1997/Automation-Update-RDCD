package Utilities;

import org.openqa.selenium.By;

public class Nibondhon2ndPage extends Methods {
	public By secondPage_w = By.xpath("//div[@class='ql-toolbar ql-snow']");
	public By nextPage_c = By.xpath("//button[contains(text(),'পরবর্তী পাতায়')]");
	
	public void secondPageDone() throws InterruptedException{
		Thread.sleep(2000);
		//ScrollDown();

		WaitElementVisible(secondPage_w);
		ScrollDown();
		takeScreenshot("Second Page");
		clickElement(nextPage_c);
	}
}