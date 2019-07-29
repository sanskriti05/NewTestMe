package skeleton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	private WebDriver driver;
	@Given("Larry is on login page")
	public void larry_is_on_login_page() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc2b-training.pdc2b\\Desktop\\driver\\chromedriver_win32 (3)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.findElement(By.partialLinkText("SignIn")).click();
	    
	}

	/*@When("Larry enters correct credentials")
	public void larry_enters_correct_credentials() {
		
		 driver.findElement(By.id("userName")).sendKeys("Lalitha");
		  driver.findElement(By.id("password")).sendKeys("password123");*/
		  
	

	@Then("Larry is on the home page")
	public void larry_is_on_the_home_page() {
		 driver.findElement(By.name("Login")).click();
		 String Home =driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[1]/a/span")).getText();
		  Assert.assertEquals(Home , "Home");
	    
	}
	

	@When("Larry increase the headphone quantity by {int}")
	public void larry_increase_the_headphone_quantity_by(int int1) throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc2b-training.pdc2b\\Desktop\\driver\\chromedriver_win32 (3)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		method.login(driver);
		method.productselect(driver);
	   
	 /*  driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span")).click();
	   
	    driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click();
	  
	   driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span")).click();
	   
	   driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	 
	  */
	   String s= Integer.toString(int1);
	   driver.findElement(By.id("quantity_1")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
	   driver.findElement(By.id("quantity_1")).sendKeys(s);
	   
	  
	  
	   
	   
	    
	}

	@When("continue for checkout")
	public void continue_for_checkout() {
		 driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		   
	}

	@When("change the shipping address to a new address as {string}")
	public void change_the_shipping_address_to_a_new_address_as(String string) {
		 driver.findElement(By.xpath("//*[@id=\"choice-dollar\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"add2\"]")).sendKeys("pune");
	}

	@Then("the product should be delivered to the new address")
	public void the_product_should_be_delivered_to_the_new_address() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		method.payment(driver);
		
	    
	}
	
	int numberOfProducts;
	@When("user search the below producs:")
	public void user_search_the_below_producs(io.cucumber.datatable.DataTable dataTable) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc2b-training.pdc2b\\Desktop\\driver\\chromedriver_win32 (3)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");	
	 method.login(driver);
	  List<String> products=dataTable.asList();
	  for(String eachProduct:products) {
		  driver.findElement(By.id("myInput")).sendKeys(eachProduct);
		  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		  try {
			  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
			  numberOfProducts++;
			  
		  }catch(Exception e) {
			  
		  }
		  driver.findElement(By.linkText("Home")).click();
	  }
	}

//	@Then("products should be added to cart if available")
//	public void products_should_be_added_to_cart_if_available() {
//	    WebElement countofProduct=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/b"));
//	    		String countofProducts=countofProduct.getText();
//	    int countProduct   = Integer.parseInt(countofProducts);
//	    Assert.assertEquals(countofProducts, numberOfProducts);
	    
//	}



}
