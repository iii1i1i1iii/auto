package hennessy;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {

    @Test
    public void firstRun()  throws Exception{
        System.setProperty("webdriver.chrome.driver", "/Users/adyax-03/Downloads/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(3000);
        System.out.println("Hello");
        driver.quit();

    }
}
