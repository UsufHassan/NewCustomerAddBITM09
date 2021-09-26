package NewCustomerAdd;

import LoginConfig.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CustomerCreate extends Login {
    public static void CreateCustomer() {

        WebElement NewCustomer = driver.findElement(By.cssSelector("body > div:nth-child(3) > div > ul > li:nth-child(2) > a"));
        NewCustomer.click();

        // Customer Name

        WebElement CustomerName=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        CustomerName.clear();
        CustomerName.sendKeys("Usuf");

        // Gender:

        WebElement Gender=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        // Date Of Birth:

        WebElement DOB=driver.findElement(By.cssSelector("#dob"));
        DOB.clear();
        DOB.sendKeys("02/28/1992");

        // Address:

        WebElement address=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        address.clear();
        address.sendKeys("2 Ishakha Avenue,Sector-6,Uttara");


        // City:

        WebElement city=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        city.clear();
        city.sendKeys("Dhaka");

        //State:

        WebElement state=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        state.clear();
        state.sendKeys("UTTARA");

        // Pin:

        WebElement pin=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        pin.clear();
        pin.sendKeys("12345678");

        // Telephone Number:

        WebElement phoneNumber=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        phoneNumber.clear();
        phoneNumber.sendKeys("01722376320");

        // E-mail:

        WebElement email=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        email.clear();
        email.sendKeys("hassan3573@gmail.com");

        // Submit:

        WebElement submitBtn=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        submitBtn.click();


        // Verification

        String Expected_URL="http://demo.guru99.com/V1/html/insrtCustomer.php";
        String Actual_URL=driver.getCurrentUrl();

        if (Expected_URL.equals(Actual_URL)) {

            System.out.println("Account Submit Successfully . Test Case Passed.");
        }

        else {
            System.out.println("Test Case Failed");
        }




    }
}
