package Utilities;

import org.openqa.selenium.By;

public class SamityNibondhonFirstPage extends Methods{
	public By SamityBabosthapona_Click = By.xpath("//span[contains(text(),'সমিতি ব্যবস্থাপনা')]");
	public By SamityNibondhon_click = By.xpath("//span[contains(text(),'সমিতি নিবন্ধনের আবেদন')]");
	//public By NotunAbedon_c = By.xpath("//span[contains(text(),'নতুন আবেদন')]");
	public By Prathomic_c = By.xpath("//input[@value='P']");
	public By SamityNameSelect_DropdownSelect = By.name("samityName");

	//Foysal
	public By Union_dropdown = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/select[1] |  /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/select[1]");
	//মণিরামপুর                           
	public By gram_in = By.name("samityDetailsAddress");
	public By gram_dropdown = By.name("memberAreaType");
	//জেলা
	public By gram1_dropdown = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/select[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/select[1]");
	//মণিরামপুর                              /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/select[1]
	public By gram1_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/input[1]");
	//মনিরামপুর
	public By SameELakaInput_click = By.xpath("//input[@name='onChecked']");
	public By SamityTarik_click_input = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]");
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
	public By ProkolpoName_dropdown = By.name("projectId");
	//সার্বিক গ্রাম উন্নয়ন কর্মসূচি-৩য় পর্যায় (সিভিডিপি-৩) শীর্ষক প্রকল্প
	public By SaveButton_click = By.xpath("//button[@aria-label='সংরক্ষন করুন ও পরবর্তী পাতায়']");
	
	
	public By secondPageicon_c = By.xpath("//div[@class='css-kmnk85']");

//	public By secondPage_w = By.xpath("//span[@class='doc-title");
	public By nextPage_c = By.xpath("//button[@aria-label='হালনাগাদ করুন']");
//	
	public void firstpageInputs(String SamityName) throws InterruptedException{
		clickWaitElement(SamityBabosthapona_Click);
		clickWaitElement(SamityNibondhon_click);
		//clickWaitElement(NotunAbedon_c);
		Thread.sleep(2000);
		clickElement(Prathomic_c);
		
		////////////////////////Customize this name to Find Samity/////////////////////////
		Thread.sleep(2000);

		DropDownSelectByVisibleText(SamityNameSelect_DropdownSelect, SamityName);
		//		DropDownSelectByVisibleText(SamityNameSelect_DropdownSelect, "সমিতি ২");

		//		DropDownSelectByVisibleText(SamityNameSelect_DropdownSelect, "সমিতি ৩");

		
		Thread.sleep(2000);
		DropDownSelectByVisibleText(Union_dropdown, "মণিরামপুর");
		FieldValue(gram_in, "মণিরামপুর");
		DropDownSelectByVisibleText(gram_dropdown, "গ্রাম/মহল্লা/ওয়ার্ড");
		Thread.sleep(1000);
		FieldValue(gram1_dropdown, "মণিরামপুর");
		FieldValue(gram1_in, "মনিরামপুর");
		clickElement(SameELakaInput_click);
		Thread.sleep(2000);
		ScrollDown();
		clickElement(SamityTarik_click_input);
		FieldValue(SamityTarik_click_input, "01012023");
		FieldValue(VortiFee_input, "2000");
		FieldValue(ShareShonkha_input, "12");
		FieldValue(SharePrice_input, "100");
		Thread.sleep(2000);
		FieldValue(sharesell_input, "12");
		FieldValue(mobileNumber_input,"01390743818");
		Thread.sleep(2000);
		//DropDownSelectByVisibleText(songostha_dropdown, "মৎস্য অধিদপ্তর");
		DropDownSelectByVisibleText(songostha_dropdown, "পল্লী উন্নয়ন ও সমবায় বিভাগ");
		DropDownSelectByVisibleText(ProkolpoName_dropdown,"সার্বিক গ্রাম উন্নয়ন কর্মসূচি-৩য় পর্যায় (সিভিডিপি-৩) শীর্ষক প্রকল্প");
		Thread.sleep(10000);

		takeScreenshot("First Page");
		clickElement(SaveButton_click);
		//Thread.sleep(2000);
		//clickElement(secondPageicon_c);
		//Thread.sleep(3000);
		//ScrollDown();

//		WaitElementVisible(secondPage_w);
//		ScrollDown();
		//clickElement(nextPage_c);
	
	}

}
