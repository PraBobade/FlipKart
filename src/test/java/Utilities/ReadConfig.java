package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties pro;

    public ReadConfig() {
        File src = new File("./Configuration/config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public String getUrl(){
        String url = pro.getProperty("baseURL");
        return url;
    }
    public String getChromeDriverPath(){
        String Chrome = pro.getProperty("Chrome");
        return Chrome;
    }
    public String getIEDriverPath(){
        String FireFox = pro.getProperty("InternetExplorer");
        return FireFox;
    }
    public String getEdgeDriverPath(){
        String Edge = pro.getProperty("Edge");
        return Edge;
    }
    public String getFireFoxDriverPath(){
        String fire = pro.getProperty("FireFox");
        return fire;
    }
    public String GetBrowser(){
        String browser = pro.getProperty("BrowserName");
        return browser;
    }
}
