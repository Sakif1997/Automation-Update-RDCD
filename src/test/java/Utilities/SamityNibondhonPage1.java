package Utilities;

import org.openqa.selenium.By;

public class SamityNibondhonPage1 extends Methods{
	public By SamityNibondhon_click = By.xpath("//span[contains(text(),'সমিতি নিবন্ধনের আবেদন')]");
	public By NotunAbedon_c = By.xpath("//span[contains(text(),'নতুন আবেদন')]");
	public By Prathomic_c = By.xpath("//input[@value='P']");
	public By SamityNameSelect_DropdownSelect = By.name("samityName");
	//Foysal
	public By Union_dropdown = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/select[1]");
	//মণিরামপুর                             /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/select[1]
	public By gram_in = By.name("samityDetailsAddress");
	public By gram_dropdown = By.name("memberAreaType");
	//জেলা
	//public By Union1_dropdown = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/select[1]");
	//মণিরামপুর                              /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/select[1]
	     //  public By gram1_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/input[1]");
	//মনিরামপুর
	public By SameELakaInput_click = By.xpath("//input[@name='onChecked']");
	public By SamityTarik_click_input = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]");
	//30224
	public By VortiFee_input = By.name("memberAdmissionFee");
	//2000
	public By ShareShonkha_input = By.name("noOfShare");
	//12000
	public By SharePrice_input = By.name("sharePrice");
	//2000
	public By sharesell_input = By.name("soldShare");
	//public By Bikritoshare_input = By.name("soldShare");
	public By mobileNumber_input = By.name("mobile");
	//01390743818
	public By songostha_dropdown = By.name("enterprisingId");
//	//মৎস্য অধিদপ্তর
	public By SaveButton_click = By.xpath("//button[@aria-label='সংরক্ষন করুন ও পরবর্তী পাতায়']");
	
	
	
	
	public By osompurnoButton_c = By.xpath("//span[contains(text(),'অসম্পূর্ণ আবেদন')]");
	public By OsompurnoSamityname_w = By.name("projectId");
	public void OsompurnoAbedonfirstpageInputs(String OsompurnoSamityName) throws InterruptedException{
		clickElement(SamityNibondhon_click);
		clickWaitElement(osompurnoButton_c);
		//
		DropDownSelectByVisibleText(OsompurnoSamityname_w,OsompurnoSamityName);
	
	}
	public By page2_w = By.xpath("//span[@class='doc-title']");
	public By SaveButton_c = By.xpath("//button[@aria-label='সংরক্ষন করুন']");
	public void Page2() throws InterruptedException{
		WaitElementVisible(page2_w);
		ScrollDown();
		clickElement(SaveButton_c);
	}
	
	public By page3_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
	public By NewMemberAddButton_c = By.xpath("//button[contains(text(),'নতুন সদস্য যোগ করুন')]");
	public void page3() throws InterruptedException{
		WaitElementVisible(page3_w);
		Thread.sleep(2000);
		clickElement(NewMemberAddButton_c);
	}
}


