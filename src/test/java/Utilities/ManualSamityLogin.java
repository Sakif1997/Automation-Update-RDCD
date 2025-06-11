package Utilities;

import org.openqa.selenium.By;

public class ManualSamityLogin extends Methods{
    public By Onbord_w = By.xpath("(//img[@alt='Logo'])[1]");
    public By Username_in = By.xpath("//input[@id='username']");
    public By Password_in = By.xpath("//input[@id='password']");
    public By Dropdown_c = By.name("componentName");
    public By loginButton = By.xpath("//button[contains(text(),'প্রবেশ করুন')]");
    public By LandHomepage_w = By.xpath("//img[@alt='Site Logo']");

    //User Elements
    public By UserLandhomepage_E = By.xpath("//p[contains(text(),'নিবন্ধন প্রদান')]");

    public void LoginByManualUser() throws InterruptedException{
        WaitElementVisible(Onbord_w);
        FieldValue(Username_in, "200000071938");
        FieldValue(Password_in,"123");
        Thread.sleep(2000);
        DropDownSelectByVisibleText(Dropdown_c, "কোপ");
        Thread.sleep(2000);
        takeScreenshot("login");
        clickElement(loginButton);
        WaitElementVisible(UserLandhomepage_E);
    }
}
