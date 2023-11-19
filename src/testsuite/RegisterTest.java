package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest
{
   @Test
   public void userShouldNavigateToRegisterPageSuccessful() throws InterruptedException
   {
    WebElement registerLink = driver.findElement(By.xpath("(//a)[1]"));
     registerLink.click();
     Thread.sleep(3000);

       Assert.assertEquals("Register" , "Register");
   }
    @Test
    public void userShouldRegisterAccountSuccessfully() throws InterruptedException
    {
        WebElement femaleRadioButton = driver.findElement(By.id("gender-female"));
        femaleRadioButton.click();
        Thread.sleep(3000);

        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Sita");
        Thread.sleep(3000);

        WebElement lastName = driver.findElement(By.name("LastName"));
        lastName .sendKeys("Ram");
        Thread.sleep(3000);

        WebElement dropdownDay = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Select s1 = new Select(dropdownDay);                          //Object creation
        s1.selectByVisibleText("13");                                //action by Any one of select methods
        Thread.sleep(3000);

        WebElement monthDropdown = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        Select s2 = new Select(monthDropdown);
        s2.selectByValue("11");
        Thread.sleep(3000);

        WebElement yearDropdown = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        Select s3= new Select(yearDropdown);
        s3.selectByIndex(72);
        Thread.sleep(3000);

        WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
        email .sendKeys("RamLakshman1234@gmail.com");
        Thread.sleep(3000);

        WebElement password = driver.findElement(By.xpath("(//input[@data-val='true'])[5]"));
        password.sendKeys("Sita54321");
        Thread.sleep(3000);

        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys("Sita54321");
        Thread.sleep(3000);

        WebElement registerButton = driver.findElement(By.xpath("//button[@class='button-1 register-next-step-button']"));
        registerButton .click();
        Thread.sleep(3000);

        Assert.assertEquals("Your registration completed" , "Your registration completed");

    }
}
