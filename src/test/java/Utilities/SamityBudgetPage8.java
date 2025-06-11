package Utilities;

import org.openqa.selenium.By;

public class SamityBudgetPage8 extends Methods{
    public By BudgetYear_s = By.name("budgetYear");
    // ২০২৪-২০২৫
    public By joma1_in_enter = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1]");
    //আয়(30000000)
    public By InputMoney1_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/input[1]");
    //"৫০০০"
    public By joma2 = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/input[1]");
    //মেয়াদী জমা(20301027)
    public By InputMoney2_in  = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/input[1]");
    //"৫০০০"
    public By canceloptions1_c = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/button[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/button[1]/*[name()='svg'][1]");
    //loop(8times)

    public By khoroch1_in_enter = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1]");
    //এসবিপি ঋণ (10601015)
    public By khorochInputMoney1_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/input[1]");
    //"৫০০০"
    public By Khoroch2_in_enter = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/input[1]");
    //ভাড়া এবং কর(40101043)
    public By KhorochInputMoney2_in  = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/input[1]");
    //"৫০০০"
    public By canceloptions2_c = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/button[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/button[1]/*[name()='svg'][1]");
    //loop(8times)


    ///////////////////////////////////////////////
    public By BudgetYear2_s = By.name("budgetFYear");
    // ২০২৪-২০২৫
    public By joma11_in_enter = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1]");
    //আয়(30000000)
    public By InputMoney11_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/input[1]");
    //"৫০০০"
    public By joma22 = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/input[1]");
    //মেয়াদী জমা(20301027)
    public By InputMoney22_in  = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/input[1]");
    //"৫০০০"
    public By canceloptions11_c = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/button[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/button[1]");
    //loop(8times)

    public By khoroch11_in_enter = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1]");
    //এসবিপি ঋণ (10601015)
    public By khorochInputMoney11_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/input[1]");
    //"৫০০০"
    public By Khoroch22_in_enter = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/input[1]");
    //ভাড়া এবং কর(40101043)
    public By KhorochInputMoney22_in  = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/input[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/input[1]");
    //"৫০০০"
    public By canceloptions22_c = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/button[1] | /html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/button[1]/*[name()='svg'][1]");

    public By SaveToNextPage_c = By.xpath("//button[@aria-label='সংরক্ষন করুন']");
    public By NextPage_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");

    public void BudgeSelection() throws InterruptedException{
        DropDownSelectByVisibleText(BudgetYear_s,"২০২৪-২০২৫");
        KeybordInputSelectOption(joma1_in_enter,"আয়(30000000)");
        FieldValue(InputMoney1_in,"২০০০");
        //Thread.sleep(2000);
        KeybordInputSelectOption(joma2,"মেয়াদী জমা(20301027)");
        FieldValue(InputMoney2_in,"২০০০");
        for(int i=0; i<=6; i++){
            clickElement(canceloptions1_c);
            Thread.sleep(1000);
        }
        KeybordInputSelectOption(khoroch1_in_enter,"এসবিপি ঋণ (10601015)");
        FieldValue(khorochInputMoney1_in,"২০০০");
        //Thread.sleep(2000);
        KeybordInputSelectOption(Khoroch2_in_enter,"ভাড়া এবং কর(40101043)");
        FieldValue(KhorochInputMoney2_in,"২০০০");
        for(int i=0; i<=6; i++){
            clickElement(canceloptions2_c);
            Thread.sleep(1000);
        }
        //clickElement(SaveToNextPage);
        Thread.sleep(2000);
        //WaitElementVisible(SaveToNextPage);
        DropDownSelectByVisibleText(BudgetYear2_s,"২০২৩-২০২৪");
        KeybordInputSelectOption(joma11_in_enter,"আয়(30000000)");
        FieldValue(InputMoney11_in,"২০০০");
        //Thread.sleep(2000);
        KeybordInputSelectOption(joma22,"মেয়াদী জমা(20301027)");
        FieldValue(InputMoney22_in,"২০০০");
        for(int i=0; i<=6; i++){
            clickElement(canceloptions11_c);
            Thread.sleep(1000);
        }
        KeybordInputSelectOption(khoroch11_in_enter,"এসবিপি ঋণ (10601015)");
        FieldValue(khorochInputMoney11_in,"২০০০");
        //Thread.sleep(2000);
        KeybordInputSelectOption(Khoroch22_in_enter,"ভাড়া এবং কর(40101043)");
        FieldValue(KhorochInputMoney22_in,"২০০০");
        for(int i=0; i<=6; i++){
            clickElement(canceloptions22_c);
            Thread.sleep(1000);
        }
        takeScreenshot("joma - khoroch");
        //clickElement(SaveToNextPage);
        Thread.sleep(2000);
        ScrollDown();
        clickElement(SaveToNextPage_c);
        WaitElementVisible(NextPage_w);
        Thread.sleep(2000);

    }


}
