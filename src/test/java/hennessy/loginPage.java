package hennessy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class loginPage {

    @Test
    public void firstRun()  throws Exception{
        System.setProperty("webdriver.chrome.driver", "/Users/adyax-03/Downloads/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(2000);
        WebElement serchField = driver.findElement(By.id("lst-ib"));
        serchField.sendKeys("Funny pugs");
        Thread.sleep(4000);
        WebElement sButton = driver.findElement(By.xpath("//*[@id=\"sbtc\"]/div[2]/div[2]/div[1]/div/ul/li[11]/div/span[1]/span/input"));
//        Actions builder = new Actions(driver);
//        builder.moveToElement(sButton).build().perform();
//        builder.click().perform();
        sButton.click();
        Thread.sleep(2000);
        System.out.println("Hello");
        driver.quit();

    }
}
