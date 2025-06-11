package Utilities;

import MemberInformationCOOP.UploadMethod;
import org.openqa.selenium.By;

import java.awt.*;

import static Browser.BrowserSetupNew.getDriver;

public class SamityDocumentPage9 extends Methods {
    public By page9_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
    public By DocumentType_s = By.name("documentTypeId");
    //সাংগঠনিক সভার রেজুলেশন
    //অফিস ভাড়ার চুক্তিপত্র
    //চালান কপি
    public By DocumentReferrence_in = By.name("docReferenceNo");
    public By MeyadStart_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]");
    //22012024
    public By MeyadEnd_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]");
    //23012025
    public By DocumentPic_c = By.xpath("//span[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium btn btn-primary css-1hw9j7s']");
    public By SaveButton_c = By.xpath("//button[@aria-label='সংরক্ষন করুন']");
    //3times
    public By NextPage_c = By.xpath("//button[contains(text(),'পরবর্তী পাতায়')]");
    public By Page10_v = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");

    UploadMethod up = new UploadMethod();
    public void DocumentAttachments() throws InterruptedException, AWTException {
        //সাংগঠনিক সভার রেজুলেশন
        DropDownSelectByVisibleText(DocumentType_s,"সাংগঠনিক সভার রেজুলেশন");
        FieldValue(DocumentReferrence_in,"112233445566");
        FieldValue(MeyadStart_in,"22012024");
        FieldValue(MeyadEnd_in,"23012025");
        Thread.sleep(2000);
        clickElement(DocumentPic_c);
        Thread.sleep(2000);
        up.Upload("E:\\Eclipse Files\\RDCD\\Upload_Images\\Document.png");
        Thread.sleep(3000);
        clickElement(SaveButton_c);
        WaitElementVisible(page9_w);


        //অফিস ভাড়ার চুক্তিপত্র
        getDriver().navigate().refresh();
        Thread.sleep(2000);
        DropDownSelectByVisibleText(DocumentType_s,"অফিস ভাড়ার চুক্তিপত্র");
        FieldValue(DocumentReferrence_in,"112233445566");
        FieldValue(MeyadStart_in,"22012024");
        FieldValue(MeyadEnd_in,"23012025");
        Thread.sleep(2000);
        clickElement(DocumentPic_c);
        Thread.sleep(2000);
        up.Upload("E:\\Eclipse Files\\RDCD\\Upload_Images\\Document.png");
        Thread.sleep(2000);
        clickElement(SaveButton_c);
        Thread.sleep(4000);
        WaitElementVisible(page9_w);


        //চালান কপি
        getDriver().navigate().refresh();
        Thread.sleep(2000);
        DropDownSelectByVisibleText(DocumentType_s,"চালান কপি");
        FieldValue(DocumentReferrence_in,"112233445566");
        FieldValue(MeyadStart_in,"22012024");
        FieldValue(MeyadEnd_in,"23012025");
        Thread.sleep(2000);
        clickElement(DocumentPic_c);
        Thread.sleep(2000);
        up.Upload("E:\\Eclipse Files\\RDCD\\Upload_Images\\Document.png");
        Thread.sleep(2000);
        takeScreenshot("Document Inclusion");
        clickElement(SaveButton_c);
        Thread.sleep(4000);
        WaitElementVisible(page9_w);

        clickElement(NextPage_c);
        Thread.sleep(2000);
        WaitElementVisible(Page10_v);
    }

}
