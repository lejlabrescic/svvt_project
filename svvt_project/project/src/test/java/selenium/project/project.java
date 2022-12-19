package selenium.project;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class project {
	private static WebDriver  webDriver;
	private static String baseUrl;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/acaus/OneDrive/Desktop/labselenium/chromedriver_win32/chromedriver.exe");
		webDriver = new ChromeDriver();
		baseUrl = "https://www.korpa.ba/";
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		webDriver.quit();
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
/*
	@Test
	void testRegistration() throws InterruptedException {
		webDriver.get("https://korpa.ba/");
		webDriver.manage().window().maximize(); 
		webDriver.findElement(By.xpath("/html/body/section[1]/div[2]/div/div[1]/div[2]/form/div/div/div[1]/a")).click();
		
		WebElement name = webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[2]/form/div[1]/input"));
		name.sendKeys("Amila");
		Thread.sleep(1000);
		
		WebElement email = webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[2]/form/div[2]/input"));
		email.sendKeys("amila.causevic@stu.ibu.edu.ba");
		Thread.sleep(1000);
		
		WebElement number = webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[2]/form/div[3]/input"));
		number.sendKeys("061835427");
		Thread.sleep(1000);
		
		WebElement password = webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[2]/form/div[4]/input"));
		password.sendKeys("testiramoprojekatza10");
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[2]/form/button")).click();
		Thread.sleep(5000);
		
	} */
	
	/*
	@Test 

	void testLogin() throws InterruptedException {
		webDriver.get("https://korpa.ba/");
		webDriver.manage().window().maximize(); 
		webDriver.findElement(By.xpath("/html/body/section[1]/div[2]/div/div[1]/div[2]/form/div/div/div[2]/a\r\n")).click();
		
		WebElement email = webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[2]/form/div[1]/input"));
		email.sendKeys("amila.causevic@stu.ibu.edu.ba");
		Thread.sleep(1000);
		
		WebElement password = webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[2]/form/div[2]/input"));
		password.sendKeys("testiramoprojekatza10");
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[2]/form/button")).click();
		Thread.sleep(2000);
	}
	/*
	 /*
	
	@Test 
	void testMojProfil() throws InterruptedException {
		
		
		webDriver.findElement(By.xpath("/html/body/nav/div/div/ul/li[3]/a")).click();
		
		webDriver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/div/div/div/p[3]/a")).click();
		Thread.sleep(2000);
		
		WebElement name = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div/div[1]/input"));
		name.clear();
		name.sendKeys("Lejla i Amila <3");
		Thread.sleep(2000);
	
		webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click(); 
		Thread.sleep(2000);
		
	
		 
		webDriver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/ul/li[4]/a")).click();
		
		webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(2000);

		WebElement adresa = webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div[2]/div/div/div[1]/div/input[1]"));

		adresa.sendKeys("Branislava Nušića, Novi Grad Sarajevo");
		Thread.sleep(1000);
		
		WebElement broj = webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div[2]/div/div/div[2]/input"));
	
		broj.sendKeys("46");
		Thread.sleep(1000);
		
		WebElement sprat = webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div[2]/div/div/div[3]/input"));
		sprat.sendKeys("4");
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div[2]/div/div/div[4]/div/div/div/label[1]")).click();
		
		WebElement info = webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div[2]/div/div/div[6]/textarea"));
		info.sendKeys("Hello :) ");
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div[2]/div/div/div[7]/div/label[2]")).click();
		webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div[3]/button[2]")).click();
		Thread.sleep(2000);
			
	} */
	/*
	@Test 	
	void testDodajAdresu() throws InterruptedException {
		
		webDriver.findElement(By.xpath("/html/body/nav/div/div/ul/li[3]/a")).click();
		webDriver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/ul/li[4]/a")).click();
		
		webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(2000);

		WebElement adresa = webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div[2]/div/div/div[1]/div/input[1]"));

		adresa.sendKeys("Branislava Nušića, Novi Grad Sarajevo");
		Thread.sleep(1000);
		
		WebElement broj = webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div[2]/div/div/div[2]/input"));
	
		broj.sendKeys("46");
		Thread.sleep(1000);
		
		WebElement sprat = webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div[2]/div/div/div[3]/input"));
		sprat.sendKeys("4");
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div[2]/div/div/div[4]/div/div/div/label[1]")).click();
		
		WebElement info = webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div[2]/div/div/div[6]/textarea"));
		info.sendKeys("Hello :) ");
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div[2]/div/div/div[7]/div/label[2]")).click();
		webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[3]/div/form/div[1]/div[3]/button[2]")).click();
		Thread.sleep(2000);
			
	} */
	
	

}
