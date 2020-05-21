package com.linkedin.utlities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties pro;
    public ReadConfig(){
        File src = new File("./Configuration/config.properties");
        try{
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        }
        catch(Exception e){
            System.out.println("Exception is: "+ e.getMessage());

        }
    }

    public String geturl(){
        String url = pro.getProperty("baseurl");
        return url;
    }

    public String getusername(){
        String uname = pro.getProperty("username");
        return uname;
    }
    public String getpassword(){
        String password = pro.getProperty("pwd");
        return password;
    }

    public String getchromepath(){
        String chromepath = pro.getProperty("chromepath");
        return  chromepath;
    }
    public String getfirefoxpath(){
        String firefoxpath = pro.getProperty("firefoxpath");
        return firefoxpath;
    }
}

