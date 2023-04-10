package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = " https://demo.nopcommerce.com/login?returnUrl=%2";
        // Launch the chrome browser

        WebDriver driver = new ChromeDriver();
        // open the Url into browser

        driver.get(baseUrl);

        // get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // get the current url
        System.out.println("Current Url :" + driver.getCurrentUrl());

        // get the page source
        System.out.println("Page source :" + driver.getPageSource());

        // find the login link element
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();

        //Find the email element and type email
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Prime123@gmail.com");

        // find the password field element and type the password
        driver.findElement(By.name("Password")).sendKeys("Prime123@");

        // close the browser
        driver.close();




    }
}
