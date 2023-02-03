package odev.tests.odev001;

import com.github.javafaker.Faker;
import odev.pages.BlueRentalHomePage;
import odev.pages.BlueRentalLoginPage;
import odev.utilities.ConfigReader;
import odev.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory04 {

    //Name:US101122_Negative_Login
    //Description:
    //Geçerli email uzantısı olmadan kullanıcı girişi yapılamamalı
    //Acceptance Criteria:
    //Kullanici geçersiz email uzantısı yazdiginda, hata mesajini almalı
    //Error Message: email must be a valid email
    //Dogru email uzantisi girildiğinde hata mesajı alınmamalı
    //https://email-verify.my-addr.com/list-of-most-popular-email-domains.php


    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;


    @Test
    public void US101122_Negative_Login() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage=new BlueRentalHomePage();
        blueRentalLoginPage=new BlueRentalLoginPage();
        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.email.sendKeys(ConfigReader.getProperty("wrong_email"));
        blueRentalLoginPage.password.sendKeys(ConfigReader.getProperty("admin_password"));
        blueRentalLoginPage.loginButton.click();
        System.out.println("invalid email message : "+blueRentalLoginPage.invalidEmailMessage.getText());
        Assert.assertEquals("email must be a valid email",blueRentalLoginPage.invalidEmailMessage.getText());
//        Assert.assertTrue(blueRentalLoginPage.invalidEmailMessage.isDisplayed()); //test passed
        Thread.sleep(3000);
        Driver.getDriver().navigate().refresh();
        blueRentalLoginPage.email.sendKeys(ConfigReader.getProperty("admin_email"));
        blueRentalLoginPage.password.sendKeys(ConfigReader.getProperty("admin_password"));
        blueRentalLoginPage.loginButton.click();
        Assert.assertTrue(blueRentalHomePage.userID.isDisplayed());

        Thread.sleep(3000);
        Driver.closeDriver();





    }
}
