package StepDefinition;
import java.awt.Button;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YocketAutomation {
	WebDriver driver = null;
	WebElement element = null;

	@SuppressWarnings("deprecation")
	@Given("user launches browser")
	public void user_launches_browser() {
		//launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\git\\yocket-assignment-script\\yocket-assgn\\src\\main\\resources\\drivers\\chromedriver103\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@When("user navigates to yocket homepage")
	public void user_navigates_to_yocket_homepage() throws InterruptedException {
		//navigate to yocket homepage
		driver.manage().deleteAllCookies();
		driver.navigate().to(
				"https://yocket.com/");

		Thread.sleep(2000); // Adding a hard wait for page to load
	}
	@And("user enters country name and major")
	public void user_enters_country_name_and_major() throws InterruptedException {
		//open masters module and enter country name and chose major
		driver.findElement(By.xpath("//*[@id=\"college-finder\"]/span[1]")).click();
		Thread.sleep(1000); // Adding thread sleep for page load wait time
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/main/div/div[1]/a[2]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='vs1__combobox']//div[@class='vs__actions']")).click();
		driver.findElement(By.xpath("//*[@class=\"vs__selected-options\"]//input[@placeholder=\"Select Country\"]")).sendKeys(Keys.ARROW_DOWN, Keys.RETURN);	        
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"vs2__combobox\"]/div[1]/input")).sendKeys("Mech");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"vs2__combobox\"]/div[1]/input")).sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
		driver.findElement(By.xpath("//button[@class=\"px-6 py-2 sm:px-8 sm:py-1 text-sm font-medium text-white bg-orange-500 border border-transparent rounded-md shadow-sm hover:bg-orange-600 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-orange-500\"]")).click();
		Thread.sleep(4000);
	}

	@And("user enters undergarduate college name, course major and CGPA score")
	public void user_enters_undergarduate_college_name_course_major_and_cgpa_score() throws InterruptedException {
		// enter Valid UG college name, major and CGPA
		driver.findElement(By.xpath("//*[@id=\"vs4__combobox\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"vs__selected-options\"]//input[@placeholder=\"Select College\"]")).sendKeys("PES");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class=\"vs__selected-options\"]//input[@placeholder=\"Select College\"]")).sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
		driver.findElement(By.xpath("//*[@id=\"vs6__combobox\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vs6__combobox\"]//input[@placeholder=\"Select Major\"]")).sendKeys("Mech");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"vs6__combobox\"]//input[@placeholder=\"Select Major\"]")).sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
		driver.findElement(By.xpath("//*[@id=\"marks\"]")).sendKeys("9");
		driver.findElement(By.xpath("//button[@class=\"px-6 py-2 sm:px-8 sm:py-1 text-sm font-medium text-white bg-orange-500 border border-transparent rounded-md shadow-sm hover:bg-orange-600 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-orange-500\"]")).click();
		Thread.sleep(4000);

	}

	@And("user enters English and aptitude scores")
	public void user_enters_english_and_aptitude_scores() throws InterruptedException{
		// enter Valid English and aptitude score
		driver.findElement(By.xpath("//div[@tabindex='0']//div[contains(text(),'IELTS')]")).click();
		driver.findElement(By.xpath("//input[@id=\"ielts_overall_score\"]")).sendKeys("7.5");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@tabindex='0']//div[contains(text(),'GMAT')]")).click();
		driver.findElement(By.xpath("//input[@id=\"total_gmat_score\"]")).sendKeys("683");
		driver.findElement(By.xpath("//button[@class=\"px-6 py-2 sm:px-8 sm:py-1 text-sm font-medium text-white bg-orange-500 border border-transparent rounded-md shadow-sm hover:bg-orange-600 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-orange-500\"]\r\n")).click();
		Thread.sleep(4000);
	}

	@And("user enters relevant work expereince and projects")
	public void user_enters_relevant_work_expereince_and_projects() throws InterruptedException {
		// add relevant work experience and projects and check results
		driver.findElement(By.xpath("//input[@id=\"work_exp\"]")).sendKeys("24");
		driver.findElement(By.xpath("//div[@tabindex=\"0\"]//div[contains(text(),'National')]")).click();
		driver.findElement(By.xpath("//input[@id=\"project\"]")).sendKeys("4");
		driver.findElement(By.xpath("//button[@class=\"px-6 py-2 sm:px-8 sm:py-1 text-sm font-medium text-white bg-orange-500 border border-transparent rounded-md shadow-sm hover:bg-orange-600 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-orange-500\"]")).click();
		Thread.sleep(4000);
	}
	

	@Then("user can see list of universities sorted by price")
	public void user_can_see_list_of_universities_sorted_by_price() throws InterruptedException {
		//University results are displayed but login is required. 
		if (driver.findElement(By.xpath("//a[@href=\"/login\"]//button")).isDisplayed()) {
			driver.findElement(By.xpath("//button[@class=\"inline-flex justify-center items-center rounded-md border border-transparent shadow-sm px-4 py-2 bg-orange-400 text-base font-semibold text-white hover:bg-orange-500 focus:outline-none sm:text-sm leading-4\"]")).click();
			System.out.println("User to Signup/Login to Yocket account");
		}
		else {
			System.out.println("Retry previous steps again");
		}
		Thread.sleep(9000);
		driver.close();
		driver.quit();
	}

}


