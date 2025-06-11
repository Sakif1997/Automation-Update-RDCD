package TestCase;

import Browser.BrowserSetupNew;
import MemberInformationCOOP.*;
import Utilities.*;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class OsompurnoAbedon extends BrowserSetupNew {
    LoginBaboharkari log = new LoginBaboharkari();
    StageLoginBaboharkari logstage = new StageLoginBaboharkari();



    OsompurnoAbedonPages oap = new OsompurnoAbedonPages();
    SamityBudgetPage8 oap1 = new SamityBudgetPage8();
    SamityDocumentPage9 oap2 = new SamityDocumentPage9();
    NibondhonRequestPage10 oap10 = new NibondhonRequestPage10();
    ThirdPage p3 = new ThirdPage();

    MemberOne mOne = new MemberOne();
    MemberTwo mtwo =new MemberTwo();
    MemberThree mthree = new MemberThree();
    MemberFour mFour = new MemberFour();
    MemberFive mFIve = new MemberFive();
    MemberSix mSix =new MemberSix();

    CommityBabosthaponaPage p4 = new CommityBabosthaponaPage();

    ArthikinfoPage p5 = new ArthikinfoPage();
    SamityJomaKorochPage p6 = new SamityJomaKorochPage();
    SamityMoneyExchangeInfoPage7 p7 = new SamityMoneyExchangeInfoPage7();
    SamityBudgetPage8 p8 = new SamityBudgetPage8();
    SamityDocumentPage9 p9 = new SamityDocumentPage9();
    NibondhonRequestPage10 p10 = new NibondhonRequestPage10();

    @Test
    public void Osompurno() throws InterruptedException, IOException, AWTException {
       // log.Baboharkarilogin();//for local server
      logstage.Baboharkarilogin();//for stage server

        oap.OsompurnoAbedonfirstpageInputs("Stage server flow সমিতি 000");//connect
       // oap.AfterAddMemberPage3();
       // oap.ComityPodobiPage();
       // oap.ArthikinfoPage();
       //// oap.SamityJomaKorochPage();
        //oap.SamityArthikInfoPage7();
        //oap1.BudgeSelection();
//        p3.page3();
//        mOne.addMember();
//        p3.page3();
//        mtwo.addMember();
//        p3.page3();
//        mthree.addMember();
//        p3.page3();
//        mFour.addMember();
//        p3.page3();
//        mFIve.addMember();
//        getDriver().navigate().refresh();

//        p3.page3();
//        mSix.addMember();
//        getDriver().navigate().refresh();
//        p3.AfterAddMemberPage3();

//        p4.ComityPodobiPage();
//        p5.ArthikinfoPage();
//        p6.Samity_JomaKorochPage();
//        Thread.sleep(2000);
//        p7.SamityArthikInfoPage7();
        p8.BudgeSelection();
        p9.DocumentAttachments();
        p10.FinalPage();
    }
}

