package TestCase;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Browser.BrowserSetupNew;
import MemberInformationCOOP.MemberFive;
import MemberInformationCOOP.MemberFour;
import MemberInformationCOOP.MemberOne;
import MemberInformationCOOP.MemberSix;
import MemberInformationCOOP.MemberThree;
import MemberInformationCOOP.MemberTwo;
import Utilities.Methods;
import Utilities.SamityNibondhonPage1;
;
public class SamityNibondhonPage1Test extends BrowserSetupNew{
	public By CommityPage = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
	public By SodossoNibondhon_c = By.xpath("//button[@aria-label='আগের পাতায়']");
	public By SodossoNibondhonPage_c =By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
	public By NewMemberAddButton_c = By.xpath("//button[contains(text(),'নতুন সদস্য যোগ করুন')]");
	public By NibondhonPage_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
	
	MemberOne mOne = new MemberOne();
	MemberTwo mtwo =new MemberTwo();
	MemberThree mthree = new MemberThree();
	MemberFour mFour = new MemberFour();
	MemberFive mFIve = new MemberFive();
	MemberSix mSix =new MemberSix();

	LoginBaboharkari log = new LoginBaboharkari();
	SamityNibondhonPage1 smp = new SamityNibondhonPage1();
	Methods method = new Methods();
	MemberOne m1 =new MemberOne();
	@Test(description ="Samity Nibondhon first Page" )
	public void logged() throws InterruptedException, IOException, AWTException {
		log.Baboharkarilogin();
		//smp.firstpageInputs();
		
		
		
		
		
		
		
		
		
		
		////////////Samity Name Input\\\\\\\\\\\\\\\\\\\\
		
		smp.OsompurnoAbedonfirstpageInputs("Samity Name");
		
		
		
		//smp.Page2();
		//smp.page3();
		//m1.addMember();
		method.WaitElementVisible(CommityPage);
		//Thread.sleep(4000);

		method.ScrollDown();
		Thread.sleep(4000);

		method.clickElement(SodossoNibondhon_c);
		Thread.sleep(2000);
		method.WaitElementVisible(SodossoNibondhonPage_c);
		method.clickElement(NewMemberAddButton_c);
		method.WaitElementVisible(NibondhonPage_w);
		
		mtwo.addMember();	
		mthree.addMember();
		mFour.addMember();
		mFIve.addMember();
		mSix.addMember();
		
		
	}
}
