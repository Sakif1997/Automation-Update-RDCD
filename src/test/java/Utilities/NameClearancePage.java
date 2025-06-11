package Utilities;


import org.openqa.selenium.By;
public class NameClearancePage extends Methods{
	public By SamityBabosthapona_Click = By.xpath("//span[contains(text(),'সমিতি ব্যবস্থাপনা')]");
	public By NameClearance_c = By.xpath("//img[@alt='Name Clearance Icon']");
	public By NameClearancePage_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");

	public By prathomic_c =By.xpath("//span[contains(text(),'প্রাথমিক')]");
	public By selectBivag_D = By.name("division");
	//খুলনা
	public By selectjela_D = By.name("district");
	//যশোর 
	public By selectoffice_D = By.name("upazila");
	//উপজেলা সমবায় অফিস, মণিরামপুর, যশোর
	public By selectCategory_D = By.name("samityTypeId");
	//কৃষি বা কৃষক সমবায় সমিতি
	public By SomitiName_in =By.name("samityName");
	//জাগো
	public By SaveButton_c =By.xpath("//button[contains(text(),'আবেদন দাখিল')]");
	//logout
	public By DUplicateSamiti_w = By.xpath("//span[contains(text(),'সমিতিটির নাম বিদ্যমান রয়েছে')]");
	//public By profileicon_c = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[3]/span[1]/*[name()='svg'][1]/*[name()='path'][1]");

	public By profileicon_c = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[4]/*[name()='svg'][1]");
	public By Logout_w_c = By.xpath("//div[@id='primary-search-account-menu']//li[@role='menuitem'][contains(text(),'লগ-আউট')]");
	//NameclearanceTest.java
	public void NameClearanceApply(String SamityName) throws InterruptedException{
        //getDriver().navigate().refresh();
		clickWaitElement(SamityBabosthapona_Click);
		clickWaitElement(NameClearance_c);
		WaitElementVisible(NameClearancePage_w);
		Thread.sleep(2000);
		clickElement(prathomic_c);
		Thread.sleep(2000);
		DropDownSelectByVisibleText(selectBivag_D, "খুলনা");
		//Thread.sleep(2000);
		DropDownSelectByVisibleText(selectjela_D,"যশোর");
		Thread.sleep(2000);
		DropDownSelectByVisibleText(selectoffice_D, "উপজেলা সমবায় অফিস, মণিরামপুর, যশোর");
		Thread.sleep(2000);
		DropDownSelectByVisibleText(selectCategory_D, "কৃষি বা কৃষক সমবায় সমিতি");
		Thread.sleep(2000);
		FieldValue(SomitiName_in, SamityName);//have to change
		//takeScreenshot("completion of name enter");
		clickElement(SaveButton_c);
		takeScreenshot("completion of name enter");
		Thread.sleep(2000);// use to delay
		//clickWaitElement(profileicon_c);
		//Thread.sleep(2000);
		//clickElement(Logout_w_c);
		//Alert alert = getDriver().switchTo().alert();
		//String alert01 = alert.getText();
		//System.out.println(alert01);
		//AleartMessage();
		//String Alert = getDriver
		//clickWaitElement(profileicon_c);
		//Thread.sleep(2000);
		//clickWaitElement(Logout_w_c);
	}


	

}
