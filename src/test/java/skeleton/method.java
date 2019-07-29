package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class method{
	

public static void login(WebDriver driver) {
	driver.findElement(By.partialLinkText("SignIn")).click();
	 driver.findElement(By.id("userName")).sendKeys("Lalitha");
	  driver.findElement(By.id("password")).sendKeys("password123");
	  driver.findElement(By.name("Login")).click();
}

public static void productselect(WebDriver driver) throws InterruptedException {
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span")).click();
	   
    driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click();
  Thread.sleep(1000);
   driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span")).click();
   
   driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
   driver.findElement(By.partialLinkText("Cart")).click();

	
}

public static void payment(WebDriver driver) {
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
}
}
