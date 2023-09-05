package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutStepOnePage extends Page {
    @FindBy (xpath = "//*[@id='first-name']")
    private WebElement firstName;
    @FindBy (xpath = "//*[@id='last-name']")
    private WebElement lastName;
    @FindBy (xpath = "//*[@id='postal-code']")
    private WebElement zipCode;
    @FindBy (xpath = "//*[@id='continue']")
    private WebElement continueButton;

    public CheckoutStepOnePage fillFirstName(String userFirstName){
        firstName.sendKeys(userFirstName);
        return this;
    }

    public CheckoutStepOnePage fillLastName (String userLastName){
        lastName.sendKeys(userLastName);
        return this;
    }
    public CheckoutStepOnePage fillZipCode (String userZipCode){
        zipCode.sendKeys(userZipCode);
        return this;
    }

    public CheckoutStepOnePage clickContinue (){
        continueButton.click();
        return this;
    }

}
