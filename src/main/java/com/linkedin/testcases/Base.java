package com.linkedin.testcases;
import com.linkedin.utlities.ReadConfig;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class Base {
    ReadConfig readconfig = new ReadConfig();

    public String baseurl = readconfig.geturl();
    public String uname = readconfig.getusername();
    public String pwd = readconfig.getpassword();
    public static WebDriver driver;
    public static Logger logger;


    @BeforeClass
    @Parameters("browser")
    public void setup(String br){
        logger = Logger.getLogger("LinkedIn");
        PropertyConfigurator.configure("log4j.properties");

        if (br.equals("chrome")){
            System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
            driver = new ChromeDriver();
        }
        else if (br.equals("firefox")){
            System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxpath());
            driver = new FirefoxDriver();
        }
        driver.get(baseurl);
        logger.info("URL Accessed");

    }
    @AfterClass
    public void closebrowser(){
        driver.quit();
    }

}
