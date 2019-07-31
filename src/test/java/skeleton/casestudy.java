package skeleton;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy {
	private WebDriver driver;
	
	@Given("user is on the TestMeApp")
	public void user_is_on_the_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc2b-training.pdc2b\\Desktop\\driver\\chromedriver_win32 (3)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}
	
	@When("user clicks on signup button")
	public void user_clicks_on_signup_button() {
		  driver.findElement(By.partialLinkText("SignUp")).click();
	}
	
	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String string) {
		 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
	}

	@When("user enters the firstname {string}")
	public void user_enters_the_firstname(String string) {
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(string);
		  
	}

	@When("user enters the lastname  {string}")
	public void user_enters_the_lastname(String string) {
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(string);
	}

	@When("user enters the password {string}")
	public void user_enters_the_password(String string) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
	}

	@When("user enters the confirmpassword {string}")
	public void user_enters_the_confirmpassword(String string) {
		driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(string);
	}

	@When("user enters the gender {string}")
	public void user_enters_the_gender(String gender) {
		driver.findElement(By.cssSelector("input[name='gender'][value='"+gender+"']")).click();
	}

	@When("user enters the email {string}")
	public void user_enters_the_email(String string) {
		 driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("sanskriti05jha@yahoo.com");
	}

	@When("user enters the mobileno {string}")
	public void user_enters_the_mobileno(String string) {
		driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(string);
	}

	@When("user enters the dateofbirth {string}")
	public void user_enters_the_dateofbirth(String string) {
		 driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(string);
	}

	@When("user enters the address {string}")
	public void user_enters_the_address(String string) {
		driver.findElement(By.xpath(" //*[@id=\"address\"]")).sendKeys(string);
		  
	}

	@When("user enters the securityquestion {int}")
	public void user_enters_the_securityquestion(Integer int1) {
		 Select dd = new Select(driver.findElement(By.name("securityQuestion")));
	      dd.selectByIndex(3);
	}

	@When("user enters the answer {string}")
	public void user_enters_the_answer(String string) {
		 driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(string);
	}

	@Then("user click on register button")
	public void user_click_on_register_button() {
		 driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	}
	
	@When("user clicks on signin button")
	public void user_clicks_on_signin_button() {
		driver.findElement(By.partialLinkText("SignIn")).click();
	}
	
	@When("user enteres  username as {string}")
	public void user_enteres_username_as(String username) {
		driver.findElement(By.name("userName")).sendKeys(username);
	}

	@When("user enters  password as {string}")
	public void user_enters_password_as(String password) {
		 driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("user has done successful login")
	public void user_has_done_successful_login() {
		 driver.findElement(By.name("Login")).click();
	}
	
	
	
	@When("user search for the product")
	public void user_search_for_the_product()  throws InterruptedException {
			WebElement search = driver.findElement(By.xpath("//*[@id='myInput']"));
			 Actions act = new Actions(driver);
			 
			 search.sendKeys("w");
			 search.sendKeys("e");
			 search.sendKeys("a");
			 search.sendKeys("r");
			 
			 Thread.sleep(2000);
			 act
			 .sendKeys(Keys.ARROW_DOWN)
			 .sendKeys(Keys.ARROW_DOWN)
			 .sendKeys(Keys.ARROW_DOWN)
			 .sendKeys(Keys.ENTER)
			 //.click(driver.findElement(By.xpath("//*[@id='myInputautocomplete-list']/div[3]")))
			 .build()
			 .perform();
		}
	
	

	@When("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[2]/center/a")).click();
	}
			 
		
	

	@Then("user is directed to signin page")
	 public void user_is_directed_to_signin_page() {
		
		String t = driver.getTitle();
		Assert.assertEquals("Login", t);
	    
	}

	
	
	@When("user signIn the app")
	public void user_sign_in_the_app() {
		driver.findElement(By.partialLinkText("SignIn")).click();
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	}

	@When("user searches product by one alphabet at a time")
	public void user_searchs_product_by_one_alphabet_at_a_time() {
		WebElement search = driver.findElement(By.xpath("//*[@id='myInput']"));
		// Actions act = new Actions(driver);
		 
		 search.sendKeys("h");
		 search.sendKeys("e");
		 search.sendKeys("a");
		 search.sendKeys("d");
		 
		
	}

	@Then("user gets suggestions from app")
	public void user_should_get_suggestions_from_app() {
		String s = driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div")).getText();
		Assert.assertEquals("Headphone", s);
	}
	
	
	@When("user signin the app")
	public void user_signin_the_app() {
	driver.findElement(By.partialLinkText("SignIn")).click();
	driver.findElement(By.id("userName")).sendKeys("Lalitha");
driver.findElement(By.name("password")).sendKeys("Password123");
	driver.findElement(By.name("Login")).click();
	
	}


	@When("user searches the product and did not add the product in the cart")
	public void user_searchs_for_a_product_and_didn_t_add_product_in_the_cart() {
		
	WebElement search = driver.findElement(By.xpath("//*[@id='myInput']"));
		 Actions act = new Actions(driver);
		 
		
		 search.sendKeys("w");
		 search.sendKeys("e");
		 search.sendKeys("a");
		 search.sendKeys("r");
		 
		 //Thread.sleep(2000);
		 act
		 .sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ENTER)
		 .build()
		 .perform();
	}
	@Then("cart icon is not available")
	public void cart_icon_is_not_available() {
	    Assert.assertTrue(false);
	}
	




}
