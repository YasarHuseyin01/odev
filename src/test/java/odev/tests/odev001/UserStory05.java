package odev.tests.odev001;

import com.github.javafaker.Faker;
import odev.pages.BlueRentalHomePage;
import odev.pages.BlueRentalLoginPage;
import odev.utilities.ConfigReader;
import odev.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory05 {

    //Name:US101201_Negative_Login
    //Description:
    //Geçerli giriş yapmadan rezervasyon yapamamalı
    //Acceptance Criteria:
    //Kullanici arac bilgilerini girip CONTINUE RESERVATION butonuna tikladiginda
    //Ve giris yapilmadiginda
    //Hata mesaji almali : Please first login
    //Giris yapildiginda hata mesaji alınmamalı

    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;
    Select select;
    Faker faker;

    @Test
    public void US101201_Negative_Login() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

        blueRentalHomePage=new BlueRentalHomePage();
        blueRentalLoginPage=new BlueRentalLoginPage();
        select=new Select(blueRentalHomePage.selectACar);
        faker=new Faker();
        select.selectByValue("5");
        blueRentalHomePage.pickup.sendKeys(faker.address().country(), Keys.ENTER);
        blueRentalHomePage.dropOfLocation.sendKeys(faker.address().city(),Keys.ENTER);
//        blueRentalHomePage.pickUpDate.sendKeys(faker.date().toString());
//        blueRentalHomePage.pickUpTime.sendKeys(faker.date().toString());
//        blueRentalHomePage.dropOffDate.sendKeys(faker.date().toString());
//        blueRentalHomePage.dropOffTime.sendKeys(faker.date().toString());
        blueRentalHomePage.continuoReservation.click();

        System.out.println(blueRentalHomePage.continuoReservation.getText());
        Assert.assertTrue(blueRentalHomePage.continuoReservation.isDisplayed());


//        Thread.sleep(2000);
//        Driver.closeDriver();
















    }
}
