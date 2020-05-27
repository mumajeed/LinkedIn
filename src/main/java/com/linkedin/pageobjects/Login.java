package com.linkedin.pageobjects;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class Login {
    WebDriver ldriver;
    public Login(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
@FindBy(id = "username")
    WebElement txtusername;

    @FindBy(id = "password")
    WebElement txtpassword;

    @FindBy(className = "login__form_action_container")
    WebElement btnsignin;

    @FindBy(xpath = "/html/body/nav/a[3]")
    WebElement signin;

    @FindBy(css = "share-box__open")
    WebElement sharebox;

    public void firstbuttonsignin(){

        signin.click();
    }

public void setUserName(String uname){
    try {

        Thread.sleep(500);
        txtusername.sendKeys(uname);
    }
    catch (InterruptedException e)
    {
        System.out.println("Interrupted");
    }


}
public void setpassword(String pwd){

    try {

        Thread.sleep(500);
        txtpassword.sendKeys(pwd);
    }
    catch (InterruptedException e)
    {
        System.out.println("Interrupted");
    }

}


        public void clicklogin () {

        try {

            btnsignin.click();
            Thread.sleep(500);

        }
        catch (InterruptedException e)
            {
                System.out.println("Interrupted");
            }
        }

    public void takescreenshot(){
        File srcfile = ((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
        try{
        FileUtils.copyFile(srcfile, new File("/Users/azarkabeer/Documents/LinkedIn/Screenshots/login.png"));
        }
        catch (IOException e){
        System.out.println(e.getMessage());
        }
}

}




