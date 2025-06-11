package Utilities;

import org.openqa.selenium.By;

import static Browser.BrowserSetupNew.getDriver;


public class ThirdPage extends Methods{
	public By page3_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q'] | //button[contains(text(),'নতুন সদস্য যোগ করুন')]");

	public By NewMemberAddButton_c = By.xpath("//button[contains(text(),'নতুন সদস্য যোগ করুন')]");
	public void page3() throws InterruptedException{
		getDriver().navigate().refresh();
		WaitElementVisible(page3_w);
		Thread.sleep(2000);
		clickWaitElement(NewMemberAddButton_c);
		takeScreenshot("Add member");
	}
	public By NextPage_w_c = By.xpath("//button[contains(text(),'পরবর্তী পাতায়')]");
	public By CommityBabosthaponaPage_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");//remove
	public void AfterAddMemberPage3() throws InterruptedException{
		//clickElement(SodossoPageIcon_c);
		clickWaitElement(NextPage_w_c);
		WaitElementVisible(CommityBabosthaponaPage_w);
		Thread.sleep(2000);
	}
}
