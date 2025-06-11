package Utilities;

import MemberInformationCOOP.UploadMethod;

import org.openqa.selenium.By;

import java.awt.*;

public class ManualSamityCreationPage extends Methods{
    public By LandingPage_w = By.xpath(" //div[@class='subHeading MuiBox-root css-0']//span[contains(text(),'সেবাসমূহ')]");

    public By SamityBabosthaponaOption_cl = By.xpath("//span[contains(text(),'সমিতি ব্যবস্থাপনা')]");
    public By SamityOnlinekoron_w_c = By.xpath("//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][contains(text(),'সমিতি অনলাইনকরন')]");
    public By Primary_c = By.xpath("//span[contains(text(),'প্রাথমিক')]");
    public By SamityNameField_in = By.name("samityName");
    //userinput
    public By SamityCreationDate_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]");
    //18022024
    public By SamityNibondhonDate_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]");
    //18032024
    public By SamityCode_in= By.name("samityCode");
    //randominput
    public By SamityDhoron_drop = By.name("samityTypeId");
    //কৃষি বা কৃষক সমবায় সমিতি
    public By UddogiSongostha_drop = By.name("enterprisingOrg");
    //স্ব উদ্যোগ
    public By KarjokorButton_c = By.xpath("//label[@class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-1wvj5am']//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-9l3uo3'][contains(text(),'কার্যকর')]");
    public By Union_drop = By.name("uniThanaPawIdType");
    //মণিরামপুর
    public By location_input = By.name("villageArea");

    public By Union1_drop = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/select[1]");
    //মণিরামপুর
    public By DetailinputAddress_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/input[1]");

    public By SameArea_c = By.xpath("//input[@name='onChecked']");
    //
    public By AuthorizedPersonName_in = By.name("authorizedPersonName");
    //সাকিফ
    public By AuthorizedPersonNID_in = By.name("authorizedPersonNid");
    //১২৩৬৬৬৮৯৬৪৪৫৬২২৩৬
    public By AuthorizedPersonPhoneNum_in = By.name("authorizedPersonmobile");
    //০১৩৫৮৮৪৪২২১

    public By DocumentNumber_in = By.name("documentNumber");
    public By FileAdd_folderupload_c = By.xpath("//label[contains(text(),'সংযুক্ত করুন')]");
    public By kormokortaPodobi_drop = By.name("officerId");
    //সহকারী পরিদর্শক - মোঃ রফিকুজ্জামান
    public By Savebutton = By.xpath("//button[contains(text(),'সংরক্ষন করুন')]");
    //UploadMethod upload = new UploadMethod();
    //UploadMethod upload = new UploadMethod();
    public void SamityOnlineForManual(String SamityName) throws InterruptedException, AWTException {
        WaitElementVisible(LandingPage_w);
        clickElement(SamityBabosthaponaOption_cl);
        clickWaitElement(SamityOnlinekoron_w_c);
        clickWaitElement(Primary_c);
        FieldValue(SamityNameField_in, SamityName);
        FieldValue(SamityCreationDate_in, "18022024");
        FieldValue(SamityNibondhonDate_in, "18032024");
        Thread.sleep(2000);

        FieldValue(SamityCode_in,generateRandomID());
        DropDownSelectByVisibleText(SamityDhoron_drop,"কৃষি বা কৃষক সমবায় সমিতি");
        DropDownSelectByVisibleText(UddogiSongostha_drop,"স্ব উদ্যোগ");
        clickElement(KarjokorButton_c);
        DropDownSelectByVisibleText(Union_drop, "মণিরামপুর");
        FieldValue(location_input, "মণিরামপুর");
        DropDownSelectByVisibleText(Union1_drop,"মণিরামপুর");
        FieldValue(DetailinputAddress_in,"মণিরামপুর");
        Thread.sleep(2000);
        clickElement(SameArea_c);
        FieldValue(AuthorizedPersonName_in, "সাকিফ");
        FieldValue(AuthorizedPersonNID_in,"১২৩৬৬৬৮৯৬৪৪৫৬২২৩৬");
        FieldValue(AuthorizedPersonPhoneNum_in,"০১৩৫৮৮৪৪২২১");

        FieldValue(DocumentNumber_in,"12121212");
        clickElement(FileAdd_folderupload_c);
        Thread.sleep(2000);
        UploadMethod.Upload("E:\\Eclipse Files\\RDCD\\Upload_Images\\document.png");
        Thread.sleep(2000);
        DropDownSelectByVisibleText(kormokortaPodobi_drop,"সহকারী পরিদর্শক - মোঃ রফিকুজ্জামান");
        clickElement(Savebutton);


    }

}
