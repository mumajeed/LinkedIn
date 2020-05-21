package com.linkedin.testcases;
import com.linkedin.pageobjects.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_logintest extends Base {

    @Test(enabled = false)
    public void LoginTest(){
        Login lp = new Login(driver);
        lp.firstbuttonsignin();
        lp.setUserName(uname);
        logger.info("Entered username");
        lp.setpassword(pwd);
        logger.info("Entered password");
        lp.clicklogin();
        logger.info("Clicked SignIn");
        System.out.println("Successfully logged in to LinkedIn");
        String Title = driver.getTitle();
        System.out.println("The title of the home page is " +Title);
        Assert.assertEquals(Title,"LinkedIn");
        logger.info("Test Passed");


    }

    @Test
    public void print(){
        System.out.println("You are a rock star Mubeena!!");
    }

    @Test
    public void fail(){
        System.out.println("To check failed test cases");
        Assert.assertEquals(1,2);
    }

}
