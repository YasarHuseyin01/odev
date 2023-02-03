package odev.pages;

import odev.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BlueRentalHomePage {
    public BlueRentalHomePage(){        //constructor
        PageFactory.initElements(Driver.getDriver(),this);
    }

  @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement loginLink;

    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;

    @FindBy(name = "car")
    public WebElement selectACar;

    @FindBy(name = "pickUpLocation")
    public WebElement pickup;

    @FindBy(name = "dropOfLocation")
    public WebElement dropOfLocation;

    @FindBy(name = "pickUpDate")
    public WebElement pickUpDate;

    @FindBy(name = "pickUpTime")
    public WebElement pickUpTime;

    @FindBy(name = "dropOffDate")
    public WebElement dropOffDate;

    @FindBy(name = "dropOffTime")
    public WebElement dropOffTime;

    @FindBy(xpath = " //button[contains(text(),'CONTINUE')]")
    public WebElement continuoReservation;

    @FindBy(xpath = " //div[contains(text(),'login')]")
    public WebElement firstLogin;










}








