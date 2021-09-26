package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfig {
    public static WebDriver driver;

    public static void launch_Chrome() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void Launch_Firefox(){

        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();
    }


    public static void open_URL(String URL){
        driver.get(URL);
    }

    public static void Close_Chrome(){
        driver.close();
    }

    //public static void Close_FireFox(){driver.close();}

   // public static void quit_Chrome(){driver.quit();}

  //  public static void quit_FireFox(){driver.quit();}

}


