package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacedbookLogIn extends CommonAPI {

    @Test
    public void Test1(){
        //WebDriver driver = new ChromeDriver();
        driver.findElement(By.id("email")).sendKeys("apurba_yusuf@hotmail.com");
        driver.findElement(By.id("pass")).sendKeys("12345abcde");
        driver.findElement(By.id("loginbutton")).click();
    }
}
