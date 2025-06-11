package Utilities;

import org.openqa.selenium.By;

public class ArthikinfoPage extends Methods{
    public By ArthikInfo_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
    public By ShareNumber1_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/input[1] ");
    public By ShareNumber2_in= By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/div[1]/div[1]/input[1]");
    public By ShareNumber3_in= By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[5]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[5]/div[1]/div[1]/input[1]");
    public By ShareNumber4_in= By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[5]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[5]/div[1]/div[1]/input[1]");
    public By ShareNumber5_in= By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[5]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[5]/div[1]/div[1]/input[1]");
    public By ShareNumber6_in= By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[5]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[5]/div[1]/div[1]/input[1]");
    public By Savebutton_c =By.xpath("//button[@aria-label='হালনাগাদ করুন']");

    public void ArthikinfoPage() throws InterruptedException{
        WaitElementVisible(ArthikInfo_w);
        Thread.sleep(2000);
        FieldValue(ShareNumber1_in,"2");
        FieldValue(ShareNumber2_in,"2");
        FieldValue(ShareNumber3_in,"2");
        FieldValue(ShareNumber4_in,"2");
        FieldValue(ShareNumber5_in,"2");
        FieldValue(ShareNumber6_in,"2");
        takeScreenshot("Share Number Information");
        Thread.sleep(2000);
        clickElement(Savebutton_c);
        Thread.sleep(4000);

    }

}
