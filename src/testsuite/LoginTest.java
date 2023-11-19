package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LoginTest extends BaseTest
{
      @Test
      public void userShouldNavigateToLoginPageSuccessfully() throws InterruptedException
      {
          WebElement search =driver.findElement(By.id("small-searchterms"));
          search.sendKeys("Books");
          Thread.sleep(2000);

          driver.navigate().back();

         WebElement loginLink =driver.findElement(By.linkText("Log in"));
         loginLink.click();
         Thread.sleep(2000);

          String expectedText = "Welcome, Please Sign In!";
          WebElement actualTextElement = driver.findElement(By.xpath("//h1"));
          String actualText = actualTextElement.getText();

          Assert.assertEquals("User should navigate to login page successfully" , expectedText , actualText);             //expected=actual
          Thread.sleep(2000);
      }
      @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException
      {
//          driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
//          Thread.sleep(2000);

          WebElement loginLink = driver.findElement(By.linkText("Log in"));
          loginLink.click();
          Thread.sleep(2000);

          WebElement username= driver.findElement(By.name("Email"));
          username.sendKeys("test123@gmail.com");
          Thread.sleep(2000);

          WebElement password= driver.findElement(By.id("Password"));
          password.sendKeys("test123");
          Thread.sleep(2000);

          WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
          loginButton.click();
          Thread.sleep(2000);

          String expectedText1 = "Log out";
         // WebElement actualText1 = driver.findElement(By.linkText("Log out"));
          WebElement actualText1 =driver.findElement(By.xpath("//a[text()='Log out']"));

          String actualTextAfterRun = actualText1.getText();
          Assert.assertEquals( expectedText1 ,  actualTextAfterRun);
      }
      @Test
    public void verifyTheErrorMessage() throws InterruptedException
      {
         // WebElement logOutLink =  driver.findElement(By.xpath("//a[@class='ico-logout']"));
//          WebElement logOutLink =driver.findElement(By.xpath("//a[text()='Log out']"));
//
//          Thread.sleep(2000);
//          logOutLink.click();
//          Thread.sleep(2000);

          WebElement loginLink = driver.findElement(By.linkText("Log in"));
          loginLink.click();
          Thread.sleep(2000);

          WebElement invalidUsername= driver.findElement(By.name("Email"));
          invalidUsername.sendKeys("test1234@gmail.com");
          Thread.sleep(2000);

          WebElement invalidPassword= driver.findElement(By.id("Password"));
          invalidPassword.sendKeys("test1234");
          Thread.sleep(2000);

          WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
          loginButton.click();
          Thread.sleep(2000);

          String expectedErrorMessage = "Login was unsuccessful /n Please correct the errors and try again. No customer account found";
          WebElement actualErrorMessage = driver.findElement(By.xpath("//button[contains(text(), 'Log in')]"));
          String actualMessage = actualErrorMessage.getText();


         Assert.assertEquals("Error message not matched" ,expectedErrorMessage,actualMessage );
      }
}
