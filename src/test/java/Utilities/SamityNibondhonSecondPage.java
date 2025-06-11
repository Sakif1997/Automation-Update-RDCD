package Utilities;

import org.openqa.selenium.By;

public class SamityNibondhonSecondPage extends Methods {
	public By secondPage_w = By.xpath("//span[@class='doc-title");
	public By nextPage_c = By.xpath("//button[contains(text(),'পরবর্তী পাতায়')]");
	
	public void secondPageDone() throws InterruptedException{
		Thread.sleep(2000);
		//WaitElementVisible(secondPage_w);
		ScrollDown();
		clickElement(nextPage_c);
	}
}
