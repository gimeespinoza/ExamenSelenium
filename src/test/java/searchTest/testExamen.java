package searchTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

class testExamen {

	@Test 
	public void buscarProductoExistente() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("FADED SHORT SLEEVE T-SHIRTS");
		driver.findElement(By.name("submit_search")).click();
		String textTypeOfResult = driver.findElement(By.className("lighter")).getText();
		System.out.print(textTypeOfResult);
		Assert.assertEquals(textTypeOfResult, "Showing 1 - 1 of 1 item");
		driver.close();
		driver.quit();
	}
		
	@Test 
	public void buscarProductoInexistente() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("remera");
		driver.findElement(By.name("submit_search")).click();
		String textTypeOfResult = driver.findElement(By.className("heading-counter")).getText();
		System.out.print(textTypeOfResult);
		Assert.assertEquals(textTypeOfResult, "No results were found for your search Remera");
		driver.close();
		driver.quit();
	}
	
@Test 
		public void buscarVestido() {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/");
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
		driver.findElement(By.id("list")).click();
		driver.findElement(By.xpath("//*[@id=\"color_20\"]")).click();
		System.out.print("El vestido es Azul");}

@Test 
			public void examenWomen() {
				System.setProperty ("webdriver.chrome.driver", "drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.navigate().to("http://automationpractice.com/index.php");
				driver.manage().window().maximize();	
				driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/h5/a")).click();
				driver.findElement(By.xpath("//*[@id=\"ul_layered_id_attribute_group_3\"]/li[1]/label/a")).click();
				System.out.println("NO PUEDO CONTINUAR DESDE ACA, POR QUE LA PAGINA NO CARGA LOS COLORES CORRECTAMENTE");
				driver.close();
				driver.quit();}
		
@Test 
				public void examenDropdown() {
					
					System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.navigate().to("http://automationpractice.com/index.php");
					driver.manage().window().maximize();	
					driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
					Select order = new Select(driver.findElement(By.id("selectProductSort")));
					order.selectByValue("price:asc");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					order.selectByValue("position:asc");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						e.printStackTrace();
					order.selectByValue("price:desc");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e2) {
						e.printStackTrace();
					order.selectByValue("name:asc");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e3) {
						e.printStackTrace();
					order.selectByValue("name:desc");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e4) {
						e.printStackTrace();
					order.selectByValue("quantity:desc");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e5) {
						e.printStackTrace();
					order.selectByValue("name:asc");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e6) {
						e.printStackTrace();
					order.selectByValue("name:desc");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e7) {
						e.printStackTrace();
					order.selectByValue("reference:asc");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e8) {
						e.printStackTrace();
					order.selectByValue("reference:desc");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e9) {
						e.printStackTrace(); 
					
					
					driver.close();
					driver.quit();
				
			 }}}}
	   }}}}

  }}}}
					