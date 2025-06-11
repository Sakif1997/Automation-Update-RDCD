package TestCase;

import org.testng.annotations.Test;

import Browser.BrowserSetupNew;
import Utilities.LoginPages;
import Utilities.NameApprovalPage;

public class SamityAcceptance extends BrowserSetupNew{
	LoginPages login =new LoginPages();
	NameApprovalPage NMP = new NameApprovalPage();
	@Test(description = "নতুন সমিতি অনুমোদন By উপজেলা সমবায় অফিসার")
	public void NewSamityNameApproval() throws InterruptedException{
		//getDriver().get("https://stage-coop.rdcd.gov.bd/login");
		getDriver().get("http://10.11.200.30:3050/login");
		login.LoginByUser();
		Thread.sleep(2000);
		NMP.NameApproveSamity();
	}
}
