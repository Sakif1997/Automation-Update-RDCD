package Utilities;

import org.openqa.selenium.By;

public class LoginPages extends Methods{
	//For Baboharkari
	public By Onbord_w = By.xpath("(//img[@alt='Logo'])[1]");
	public By Username_in = By.xpath("//input[@id='username']");
	public By Password_in = By.xpath("//input[@id='password']");
	public By Dropdown_c = By.name("componentName");
	public By Baboharkari_w_c =By.xpath("//span[contains(text(),'ব্যবহারকারী')]");
	//public By RadioButton_c = By.xpath("//span[contains(text(),'ব্যবহারকারী')]");
	public By DoptorField_w = By.xpath("(//span[contains(text(),'দপ্তরের নাম')])[1]");
	public By Dropdown= By.name("doptorId");
	public By loginButton = By.xpath("//button[contains(text(),'প্রবেশ করুন')]");
	public By LandHomepage_w = By.xpath("//img[@alt='Site Logo']");
	
	//User Elements
	//public By UserLandhomepage_E = By.xpath("//p[contains(text(),'নিবন্ধন প্রদান')]");
	
	
	//login by baboharkari
	public void loginAsBaboharkari(String id) throws InterruptedException{
		WaitElementVisible(Onbord_w);
		//FieldValue(Username_in, "01686026037");//LOcalhost
		FieldValue(Username_in, id);//stage server
		FieldValue(Password_in,"123");
		Thread.sleep(2000);
		DropDownSelectByVisibleText(Dropdown_c, "কোপ");
		clickWaitElement(Baboharkari_w_c);
		WaitElementVisible(DoptorField_w);
		Thread.sleep(2000);
		DropDownSelectByVisibleText(Dropdown, "সমবায় অধিদপ্তর");
		takeScreenshot("login");
		clickElement(loginButton);
		WaitElementVisible(LandHomepage_w);	
	}
	
	//Login By user
	public void LoginByUser() throws InterruptedException{
		WaitElementVisible(Onbord_w);
		FieldValue(Username_in, "200000071781");
		FieldValue(Password_in,"123");
		Thread.sleep(2000);
		DropDownSelectByVisibleText(Dropdown_c, "কোপ");
		Thread.sleep(2000);
		takeScreenshot("login");
		clickElement(loginButton);
		//WaitElementVisible(UserLandhomepage_E);
	}

}