package WebTestingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMainDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Beck\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://students.cs.ndsu.nodak.edu/~myronovy/pizza/rb_pizza.html");
        driver.quit();
    }
}
