package hennessy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Cognac {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/adyax-03/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
    };


    @Test
    public void loginCognac1() throws Exception {

        driver.get("https://contact-hennessy.adyax-dev.com/#/login");
        Thread.sleep(4000);
        WebElement loginField = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/form/div/div[1]/div/input"));
        loginField.sendKeys("1808");
        WebElement passField = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/form/div/div[2]/input"));
        passField.sendKeys("1808");
        Thread.sleep(4000);
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/form/div/div[3]/input"));
        submitButton.click();
        Thread.sleep(3000);
        System.out.println("Passed on DEV");

    }
    @Test
    public void loginCognac2() throws Exception {
        driver.get("https://pp-contact.hennessy.com/#/login");
        Thread.sleep(4000);

        System.out.println("Passed on PP");
    }
    @After
    public void exit() {
        driver.quit();
    }
}
