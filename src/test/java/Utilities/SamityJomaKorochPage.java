package Utilities;

import org.openqa.selenium.By;

public class SamityJomaKorochPage extends Methods{
    public By SamityJomaKoroch_w = By.xpath("//span[contains(text(),'জমা সমূহ')]");
    public void Samity_JomaKorochPage() throws InterruptedException{
        WaitElementVisible(SamityJomaKoroch_w);
        Thread.sleep(4000);

    }
}
