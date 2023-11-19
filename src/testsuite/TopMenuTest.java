package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest
{

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() throws InterruptedException
    {
       WebElement computersTopMenuTab = driver.findElement(By.xpath("(//a)[6]"));
        computersTopMenuTab.click();
        Thread.sleep(3000);

        Assert.assertEquals("Computers","Computers");
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() throws InterruptedException
    {

        WebElement electronicsTopMenuTab = driver.findElement(By.xpath("(//a)[10]"));
        electronicsTopMenuTab .click();
        Thread.sleep(3000);

        Assert.assertEquals("Electronics","Electronics");
   }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() throws InterruptedException
    {
        WebElement apparelTopMenuTab = driver.findElement(By.xpath("(//a)[14]"));
        apparelTopMenuTab.click();
        Thread.sleep(3000);

        Assert.assertEquals("Apparel" , "Apparel");
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() throws InterruptedException
    {
        WebElement digitalDownloadsTopMenuTab = driver.findElement(By.xpath("(//a)[18]"));
        digitalDownloadsTopMenuTab.click();
        Thread.sleep(3000);

        Assert.assertEquals("Digital downloads" , "Digital downloads");
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() throws InterruptedException
    {
        WebElement booksTopMenuTab = driver.findElement(By.xpath("(//a)[19]"));
        booksTopMenuTab.click();
        Thread.sleep(3000);

        Assert.assertEquals("Books" , "Books");
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() throws InterruptedException
    {
        WebElement jewelryTopMenuTab = driver.findElement(By.xpath("(//a)[20]"));
        jewelryTopMenuTab.click();
        Thread.sleep(3000);

        Assert.assertEquals("Jewelry" , "Jewelry");
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() throws InterruptedException
    {
        WebElement giftCardsTopMenuTab = driver.findElement(By.xpath("(//a)[21]"));
        giftCardsTopMenuTab.click();
        Thread.sleep(3000);

        Assert.assertEquals("Gift Cards" , "Gift Cards");
    }
}
