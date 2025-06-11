package TestCase;

import Browser.BrowserSetupNew;
import Utilities.ManualSamityCreationPage;
import Utilities.ManualSamityLogin;
import org.testng.annotations.Test;

import java.awt.*;

public class ManualSamityCreateTest extends BrowserSetupNew {
    ManualSamityLogin login = new ManualSamityLogin();
    ManualSamityCreationPage mcp = new ManualSamityCreationPage();
    @Test
    public void ManualSamity() throws InterruptedException, AWTException {
        getDriver().get("http://10.11.200.30:3050/login");
        login.LoginByManualUser();
        //for(int i=0; i<=50; i++) {
           // mcp.SamityOnlineForManual("Manual Samity"+i+"-22/4/2024");
        mcp.SamityOnlineForManual("Manual By law -23/4/2024");
        // Thread.sleep(2000);
       // }
    }
}
