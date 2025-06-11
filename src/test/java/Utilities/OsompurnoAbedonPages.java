package Utilities;

import org.openqa.selenium.By;

public class OsompurnoAbedonPages extends Methods{
    public By SamityBabosthapona_Click = By.xpath("//span[contains(text(),'সমিতি ব্যবস্থাপনা')]");

    public By SamityNibondhon_click = By.xpath("//span[contains(text(),'সমিতি নিবন্ধনের আবেদন')]");
    public By osompurnoButton_c = By.xpath("//span[contains(text(),'অসম্পূর্ণ আবেদন')]");
    public By OsompurnoSamityname_w = By.name("projectId");

    // public By CommityBabosthaponaPage_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");//remove
    public By SodossoPageIcon_c = By.xpath("//a[@href='/coop/samity-management/coop/member-registration']//*[name()='svg']");
    //  public By NextPage_w_c = By.xpath("//button[contains(text(),'পরবর্তী পাতায়')]");

    public void OsompurnoAbedonfirstpageInputs(String OsompurnoSamityName) throws InterruptedException{
        clickWaitElement(SamityBabosthapona_Click);
        clickWaitElement(SamityNibondhon_click);
        clickWaitElement(osompurnoButton_c);
        DropDownSelectByVisibleText(OsompurnoSamityname_w,OsompurnoSamityName);
        WaitElementVisible(CommityBabosthaponaPage_w);
        Thread.sleep(2000);
       // clickElement(SodossoPageIcon_c);

    }
    public By NextPage_w_c = By.xpath("//button[contains(text(),'পরবর্তী পাতায়')]");
    public By CommityBabosthaponaPage_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");//remove
    public void AfterAddMemberPage3() throws InterruptedException{
        //clickElement(SodossoPageIcon_c);
        clickWaitElement(NextPage_w_c);
        WaitElementVisible(CommityBabosthaponaPage_w);
        Thread.sleep(2000);
    }


    public By MemberSelect_d = By.name("organizerp");
    //জিহাদ
   	//নিলা
    //নাইম
    //মোমেন
    //অর্ণব
    //তৌফিক
    public By ConnectionInfo_d = By.name("communicationP");
    //নিলা
    public By CommityMemberNumber_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]");
    //৬ জন//thread

    public By MemberOne_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/select[1]");
    //জিহাদ
    public By MemberTwo_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/select[1]");
    //নিলা
    public By MemberThree_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[1]/select[1]");
    //নাইম
    public By MemberFour_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/div[1]/select[1]");
    //মোমেন
    public By MemberFive_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/div[1]/select[1]");
    //অর্ণব
    public By MemberSix_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/div[1]/div[1]/select[1]");
    //তৌফিক

    public By MemberOnePodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/select[1]");
    //সভাপতি
    public By MemberTwoPodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/select[1]");
    //সহ-সভাপতি
    public By MemberThreePodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/div[1]/div[1]/select[1]");
    //কোষাধ্যক্ষ
    public By MemberFourPodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/div[1]/div[1]/select[1]");
    //ট্রেজারার
    public By MemberFivePodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[3]/div[1]/div[1]/select[1]");
    //সহ-সভাপতি
    public By MemberSixPodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[3]/div[1]/div[1]/select[1]");
    //সদস্য
    public By SaveButton_c = By.xpath("//button[@aria-label='সংরক্ষন করুন']");

    public void ComityPodobiPage() throws InterruptedException{
        DropDownSelectByVisibleText(MemberSelect_d,"জিহাদ");
        DropDownSelectByVisibleText(ConnectionInfo_d,"নিলা");
        DropDownSelectByVisibleText(CommityMemberNumber_d,"৬ জন");
        Thread.sleep(4000);
        DropDownSelectByVisibleText(MemberOne_d,"জিহাদ");
        DropDownSelectByVisibleText(MemberTwo_d,"নিলা");
        DropDownSelectByVisibleText(MemberThree_d,"নাইম");
        DropDownSelectByVisibleText(MemberFour_d,"মোমেন");
        DropDownSelectByVisibleText(MemberFive_d,"অর্ণব");
        DropDownSelectByVisibleText(MemberSix_d,"তৌফিক");
        Thread.sleep(3000);
        DropDownSelectByVisibleText(MemberOnePodobi_d,"সভাপতি");
        DropDownSelectByVisibleText(MemberTwoPodobi_d,"সহ-সভাপতি");
        DropDownSelectByVisibleText(MemberThreePodobi_d,"কোষাধ্যক্ষ");
        DropDownSelectByVisibleText(MemberFourPodobi_d,"ট্রেজারার");
        DropDownSelectByVisibleText(MemberFivePodobi_d,"সহ-সভাপতি");
        DropDownSelectByVisibleText(MemberSixPodobi_d,"সদস্য");
        Thread.sleep(3000);
        clickElement(SaveButton_c);
    }
    public By ArthikInfo_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
    public By ShareNumber1_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/input[1]");
    public By ShareNumber2_in= By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/div[1]/div[1]/input[1]");
    public By ShareNumber3_in= By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[5]/div[1]/div[1]/input[1]");
    public By ShareNumber4_in= By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[5]/div[1]/div[1]/input[1]");
    public By ShareNumber5_in= By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[5]/div[1]/div[1]/input[1]");
    public By ShareNumber6_in= By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[5]/div[1]/div[1]/input[1]");
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
        Thread.sleep(4000);
        clickElement(Savebutton_c);
    }
    public By SamityJomaKoroch_w = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/header[1]/div[1]/div[1]/div[1]/p[1]");
    public void SamityJomaKorochPage() throws InterruptedException{
        WaitElementVisible(SamityJomaKoroch_w);
        Thread.sleep(4000);

    }

    public By joma1_in_enter = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1]");
    //আয়(30000000)
    public By InputMoney1_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/input[1]");
    //"৫০০০"
    public By joma2 = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/input[1]");
    //মেয়াদী জমা(20301027)
    public By InputMoney2_in  = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/input[1]");
    //"৫০০০"
    public By canceloptions1_c = By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]");
    //loop(8times)

    public By khoroch1_in_enter = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1]");
    //এসবিপি ঋণ (10601015)
    public By khorochInputMoney1_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/input[1]");
    //"৫০০০"
    public By Khoroch2_in_enter = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/input[1]");
    //ভাড়া এবং কর(40101043)
    public By KhorochInputMoney2_in  = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/input[1]");
    //"৫০০০"
    public By canceloptions2_c = By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[4]");
    //loop(8times)

    public By SaveToNextPage = By.xpath("//button[@aria-label='সংরক্ষন করুন']");
    public void SamityArthikInfoPage7() throws InterruptedException{
        KeybordInputSelectOption(joma1_in_enter,"আয়(30000000)");
        FieldValue(InputMoney1_in,"৫০০০");
        Thread.sleep(2000);
        KeybordInputSelectOption(joma2,"মেয়াদী জমা(20301027)");
        FieldValue(InputMoney2_in,"৫০০০");
        for(int i=0; i<=7; i++){
            clickElement(canceloptions1_c);
            Thread.sleep(1500);
        }
        KeybordInputSelectOption(khoroch1_in_enter,"এসবিপি ঋণ (10601015)");
        FieldValue(khorochInputMoney1_in,"৫০০০");
        Thread.sleep(2000);
        KeybordInputSelectOption(Khoroch2_in_enter,"ভাড়া এবং কর(40101043)");
        FieldValue(KhorochInputMoney2_in,"৫০০০");
        for(int i=0; i<=7; i++){
            clickElement(canceloptions2_c);
            Thread.sleep(1500);
        }
        clickElement(SaveToNextPage);
        Thread.sleep(2000);

    }

//    public By BudgetYear_s = By.name("budgetYear");
//   // public
//   public By joma1_in_enter = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1]");
//    //আয়(30000000)
//    public By InputMoney1_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/input[1]");
//    //"৫০০০"
//    public By joma2 = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/input[1]");
//    //মেয়াদী জমা(20301027)
//    public By InputMoney2_in  = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/input[1]");
//    //"৫০০০"
//    public By canceloptions1_c = By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]");
//    //loop(8times)td




}
