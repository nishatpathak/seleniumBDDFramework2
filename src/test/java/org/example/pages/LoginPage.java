package org.example.pages;
import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends DriverManager {
    @FindBy(css = ".ico-login")//demo nopcommerce login btn
    public WebElement loginBtn;
    public void clickOnLoginBtn() {
        loginBtn.click();
    }
    @FindBy (id= "Email")
    public WebElement enterEmail;
    public void enterUserName(String username){
        enterEmail.sendKeys(username);
    }

    @FindBy(id = "Password")
    public WebElement enterPassword;
    public void enterPassword(String password){
        enterPassword.sendKeys(password);
    }
    @FindBy(xpath = "//*[@class='button-1 login-button']")//click login after password
    public WebElement clickLogin;
    public void enterLogin(){
        clickLogin.click();
    }
    @FindBy(className="ico-logout")
    public WebElement seeLogout;
    public void visibleLogout(){
        seeLogout.getText();
    }

}

