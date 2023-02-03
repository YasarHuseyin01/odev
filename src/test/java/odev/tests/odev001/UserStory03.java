package odev.tests.odev001;

import odev.pages.BlueRentalHomePage;
import odev.pages.BlueRentalLoginPage;
import odev.utilities.ConfigReader;
import odev.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory03 {

    //Name: US100402_Negative_Login
    //Description:
    //Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapılamamalı
    //Acceptance Criteria:
    //Kullanici dogru email ve yanlis sifre girildiginde, hata mesajini alınmalı
    //Hata Mesaji: /Bad credentials
    //Test Data:
    //Customer email: jack@gmail.com
    //Customer password: fakepass
    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;

    @Test
    public void US100402_Negative_Login() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage=new BlueRentalHomePage();
        blueRentalLoginPage=new BlueRentalLoginPage();
        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.email.sendKeys(ConfigReader.getProperty("admin_email"));
        blueRentalLoginPage.password.sendKeys(ConfigReader.getProperty("fake_password"));
        blueRentalLoginPage.loginButton.click();
        blueRentalLoginPage.errorMessage.getText();
        assert blueRentalLoginPage.errorMessage.isDisplayed();
        Thread.sleep(3000);
        Driver.closeDriver();














    }
}
