package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import javax.swing.*;

import static Browser.BrowserSetupNew.getDriver;

public class CommityBabosthaponaPage extends Methods{

    public By MemberSelect_d = By.name("organizerp");
    //জিহাদ
    //নিলা
    //নাইম
    //মোমেনq
    //অর্ণব
    //তৌফিক
    public By ConnectionInfo_d = By.name("communicationP");
    //নিলা
    public By CommityMemberNumber_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]");
    //৬ জন//thread
    public By MemberAddButton_c =By.xpath("//button[contains(text(),'সদস্য ও পদবি যোগ করুন')]");
    public By PopUpAddMember_w = By.xpath("//span[contains(text(),'সমিতির সদস্য কি?')]");
    public By MemberOfSamity_c = By.xpath("(//input[@aria-label='controlled'])[2]");
    public By MemberDropdown_d = By.name("memberId");
    public By CommitteeRole_d = By.name("committeeRoleId");
    public By MemberSaveAndAddButton_c = By.cssSelector(".MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeSmall.MuiButton-containedSizeSmall.btn.btn-save.css-1lpukdo");
    public By SaveButton_c = By.xpath("//button[@aria-label='সংরক্ষন করুন'] | //button[@aria-label='হালনাগাদ করুন']");


    public By MemberOne_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/select[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/select[1]");
    //জিহাদ
    public By MemberTwo_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/select[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/select[1]");
    //নিলা
    public By MemberThree_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[1]/select[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[1]/select[1]");
    //নাইম
    public By MemberFour_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/div[1]/select[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/div[1]/select[1]");
    //মোমেন
    public By MemberFive_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/div[1]/select[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/div[1]/select[1]");
    //অর্ণব
    public By MemberSix_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/div[1]/div[1]/select[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/div[1]/div[1]/select[1]");
    //তৌফিক

    public By MemberOnePodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/select[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/select[1]");
    //সভাপতি
    public By MemberTwoPodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/select[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/select[1]");
    //সহ-সভাপতি
    public By MemberThreePodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/div[1]/div[1]/select[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/div[1]/div[1]/select[1]");
    //কোষাধ্যক্ষ
    public By MemberFourPodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/div[1]/div[1]/select[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/div[1]/div[1]/select[1]");
    //ট্রেজারার
    public By MemberFivePodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[3]/div[1]/div[1]/select[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[3]/div[1]/div[1]/select[1]");
    //সহ-সভাপতি
    public By MemberSixPodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[3]/div[1]/div[1]/select[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[3]/div[1]/div[1]/select[1]");
    //সদস্য
    //public By SaveButton_c = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/button[2] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/button[2]");

    public By SamityNationalButton_c =By.xpath("//input[@aria-label='controlled']");
    public By natinalSamityPersonSelect_drop =By.name("signingp");

    public By clickanything = By.xpath("//*[name()='path' and contains(@d,'M20 4H4c-1')]");
    public void ComityPodobiPage() throws InterruptedException{
       // Thread.sleep(4000);
        getDriver().navigate().refresh();
//        ScrollDown();
//        ScrollUp();
         Thread.sleep(4000);

        DropDownSelectByVisibleText(MemberSelect_d,"জিহাদ");
        DropDownSelectByVisibleText(ConnectionInfo_d,"নিলা");
        clickElement(SamityNationalButton_c);//change
        DropDownSelectByVisibleText(natinalSamityPersonSelect_drop,"অর্ণব");//change
// Example arrays for member names and roles
        String[] memberNames = {"জিহাদ", "নিলা", "নাইম", "মোমেন", "অর্ণব", "তৌফিক"};
        String[] memberRoles = {"চেয়ারম্যান ", "কোষাধ্যক্ষ", "সদস্য", "সদস্য, ব্যবস্থাপনা কমিটি", "প্রচার সম্পাদক", "যুগ্ম সম্পাদক"};

        DropDownSelectByVisibleText(CommityMemberNumber_d, "৬ জন");
        clickWaitElement(MemberAddButton_c);

        for (int i = 0; i < 6; i++) {
            WaitElementVisible(PopUpAddMember_w);
            clickElement(MemberOfSamity_c);
            Thread.sleep(2000);
            DropDownSelectByVisibleText(MemberDropdown_d, memberNames[i]);
            DropDownSelectByVisibleText(CommitteeRole_d, memberRoles[i]);
            clickElement(MemberSaveAndAddButton_c);
            if (i < 5) { // Only for the first 5, last one is Save
                WaitElementVisible(MemberAddButton_c);
                clickWaitElement(MemberAddButton_c);
            }
        }
        clickElement(SaveButton_c);







//        Thread.sleep(4000);
//       ScrollDown();
//        DropDownSelectByVisibleText(MemberOne_d,"জিহাদ");
//        DropDownSelectByVisibleText(MemberTwo_d,"নিলা");
//        DropDownSelectByVisibleText(MemberThree_d,"নাইম");
//        DropDownSelectByVisibleText(MemberFour_d,"মোমেন");
//        DropDownSelectByVisibleText(MemberFive_d,"অর্ণব");
//        DropDownSelectByVisibleText(MemberSix_d,"তৌফিক");
//        Thread.sleep(3000);
//        DropDownSelectByVisibleText(MemberOnePodobi_d,"সভাপতি");
//        DropDownSelectByVisibleText(MemberTwoPodobi_d,"সহ-সভাপতি");
//        DropDownSelectByVisibleText(MemberThreePodobi_d,"কোষাধ্যক্ষ");
//        DropDownSelectByVisibleText(MemberFourPodobi_d,"ট্রেজারার");
//        DropDownSelectByVisibleText(MemberFivePodobi_d,"সহ-সভাপতি");
//        Thread.sleep(2000);
//        DropDownSelectByVisibleText(MemberSixPodobi_d,"সদস্য");
//        takeScreenshot("Members DScrollDown()esignation");
//        Thread.sleep(2000);
//        clickElement(clickanything);
//        //Thread.sleep(10000);
//
////
////        clickElement(SamityNationalButton_c);
////        DropDownSelectByVisibleText(natinalSamityPersonSelect_drop,"অর্ণব");
//
//
//
//       // DropDownSelectByVisibleText(natinalSamityPersonSelect_drop,"অর্ণব");
//        //DropDownSelectByVisibleText(CommityMemberNumber_d,"৬ জন");
//        //ScrollDownByPageElem(SaveButton_c);
//     // clickElement(SaveButton_c);
//        clickWaitElement(SaveButton_c);
    }
}
