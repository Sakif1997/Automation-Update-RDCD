package TestCase;

import Browser.BrowserSetupNew;
import Utilities.LoginPages;
import Utilities.NameApprovalPage;
import org.testng.annotations.Test;

public class StageServerSamityAcceptance extends BrowserSetupNew {
    LoginPages login =new LoginPages();
    NameApprovalPage NMP = new NameApprovalPage();
    @Test(description = "নতুন সমিতি অনুমোদন By উপজেলা সমবায় অফিসার")
    public void NewSamityNameApproval() throws InterruptedException{
        getDriver().get("https://stage-coop.rdcd.gov.bd/login");
        //getDriver().get("http://10.11.200.30:3090/login");
        login.LoginByUser();
        Thread.sleep(2000);
        NMP.NameApproveSamity();
    }
}
