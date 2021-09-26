package LoginConfig;

import LaunchBrowser.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends BrowserConfig {

    public static void Login(){

        WebElement UserID=driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]"));
        UserID.clear();
        UserID.sendKeys("mngr355601");


        WebElement Password=driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("yhEmaqU");


        WebElement LonginBtn=driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        LonginBtn.click();
    }

}
