package Utilities;

import org.openqa.selenium.By;
import static Browser.BrowserSetupNew.*;
public class NibondhonRequestPage10 extends Methods{
    public By ChalanNum_in = By.name("invoiceNo");
    public By ChalanDate_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[11]/div[1]/div[3]/div[2]/div[1]/div[1]/input[1]");
    public By SonodRequestTo_cl = By.xpath("//span[contains(text(),'উপজেলা অফিসের মাধ্যমে')]");
    public By AgreeButton_c = By.xpath("//div[@class='MuiStack-root css-u4p24i']");
    public By FinalRequestSend_c = By.xpath("//button[@aria-label='আবেদনের চূড়ান্ত জমা']");
   // public By CompletionPage_w = By.xpath("//div[@class='MuiTypography-root MuiTypography-h6 MuiTypography-gutterBottom css-vaks4k']");


    public void FinalPage() throws InterruptedException{
        //getDriver().navigate().refresh();
        Thread.sleep(2000);
        ScrollDown();
        Thread.sleep(2000);
        FieldValue(ChalanNum_in,"112233445566");
        FieldValue(ChalanDate_in,"23022024");
        Thread.sleep(2000);
        clickElement(SonodRequestTo_cl);
        clickElement(AgreeButton_c);
        Thread.sleep(2000);
        takeScreenshot("Final Page for Submittion");
        clickElement(FinalRequestSend_c);
        //WaitElementVisible(CompletionPage_w);
        Thread.sleep(2000);
    }
}
