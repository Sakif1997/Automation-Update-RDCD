package Utilities;

import org.openqa.selenium.By;

public class DuplicateNameApproval extends Methods{
	public By NameClearance_c = By.xpath("//img[@alt='Name Clearance Icon']");
	public By NameClearancePage_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
	public By prathomic_c =By.xpath("//span[contains(text(),'প্রাথমিক')]");
	public By selectBivag_D = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]");
	//খুলনা
	public By selectjela_D = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]");
	//যশোর 
	public By selectoffice_D = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/select[1]");
	//উপজেলা সমবায় অফিস, মণিরামপুর, যশোর
	public By selectCategory_D = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/select[1]");
	//কৃষি বা কৃষক সমবায় সমিতি
	public By SomitiName_in =By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/input[1]");
	//জাগো
	public By SaveButton_c =By.xpath("//button[contains(text(),'সংরক্ষন করুন')]");
	//logout
	public By DUplicateSamiti_w = By.xpath("//span[contains(text(),'সমিতিটির নাম বিদ্যমান রয়েছে')]");
	public By profileicon_c = By.xpath("//button[@aria-label='account of current user']//*[name()='svg']");
	public By Logout_w_c = By.xpath("//div[@id='primary-search-account-menu']//li[@role='menuitem'][contains(text(),'লগ-আউট')]");
	
	public void DupNameApply() throws InterruptedException{
		clickElement(NameClearance_c);
		WaitElementVisible(NameClearancePage_w);
		clickElement(prathomic_c);
		Thread.sleep(2000);
		DropDownSelectByVisibleText(selectBivag_D, "খুলনা");
		DropDownSelectByVisibleText(selectjela_D,"যশোর");
		Thread.sleep(2000);
		DropDownSelectByVisibleText(selectoffice_D, "উপজেলা সমবায় অফিস, মণিরামপুর, যশোর");
		DropDownSelectByVisibleText(selectCategory_D, "কৃষি বা কৃষক সমবায় সমিতি");
		Thread.sleep(2000);
		FieldValue(SomitiName_in,"Ornob");
		//clickElement(SaveButton_c);// change every run
		Thread.sleep(2000);
		 // switch to alert
		WaitElementVisible(DUplicateSamiti_w);
		String alerttext = getText(DUplicateSamiti_w);
		System.out.println(alerttext);
		takeScreenshot("Not allowing same name");
		Thread.sleep(5000);
		
		clickWaitElement(profileicon_c);
		Thread.sleep(2000);
		clickWaitElement(Logout_w_c);

	}

}
