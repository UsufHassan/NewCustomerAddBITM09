package DataProviderTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.naming.Name;

public class RegistrationAutomation {

    public static WebDriver driver;

    @BeforeClass
    public static void Launch_Chrom(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/register");
    }

    @AfterClass
    public static void close_Chrome(){driver.close();}

    @DataProvider(name = "RegistrationInvalidData")

    public Object[][] data(){
        Object[][] data=new Object[2][6];

        data[0][0]="Usuf1";
        data[0][1]="Hassan";
        data[0][2]="hassan@gmail.com";
        data[0][3]="01720003210";
        data[0][4]="1234567";
        data[0][5]="1234567";

        data[1][0]="Usuf1";
        data[1][1]="6Hassan";
        data[1][2]="hassan@gmail.com";
        data[1][3]="01720003210";
        data[1][4]="1234567";
        data[1][5]="1234567";

    return data;
    }


    @Test(dataProvider = "RegistrationInvalidData")
    public static void Register(String DP_FName,String DP_LName,String DP_Email,String DP_TNumber,String DP_Pass,String DP_PassC){

        WebElement fName=driver.findElement(By.id("input-firstname"));
        fName.clear();
        fName.sendKeys(DP_FName);

        WebElement lName=driver.findElement(By.id("input-lastname"));
        lName.clear();
        lName.sendKeys(DP_LName);

        WebElement email=driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys(DP_Email);

        WebElement phone=driver.findElement(By.id("input-telephone"));
        phone.clear();
        phone.sendKeys(DP_TNumber);

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.sendKeys(DP_Pass);

        WebElement Cpass=driver.findElement(By.id("input-confirm"));
        Cpass.sendKeys(DP_PassC);

        WebElement check=driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)"));
        check.click();

        WebElement regBtn=driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        regBtn.click();

        String expected_title="Your Account Has Been Created!";
        String actual_title=driver.getTitle();

        if(expected_title.equals(actual_title)){
            System.out.println("Account Has been Created");
        }
        else {
            System.out.println("Account Not Created");
        }


    }



}
