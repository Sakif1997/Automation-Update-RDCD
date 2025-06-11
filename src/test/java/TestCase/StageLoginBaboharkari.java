package TestCase;

import Browser.BrowserSetupNew;
import Utilities.LoginPages;
import org.testng.annotations.Test;

import java.io.IOException;

public class StageLoginBaboharkari extends BrowserSetupNew {
    LoginPages login =new LoginPages();
    @Test(description = "login by baboharkari")
    public void Baboharkarilogin() throws InterruptedException, IOException {
        getDriver().get("https://stage-coop.rdcd.gov.bd/login");
        login.loginAsBaboharkari("1676797239");
        Thread.sleep(2000);
    }
}
