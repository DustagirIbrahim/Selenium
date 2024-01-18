package Selenium_maven.Selenium_maven;


import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
	        driver.get("https://qa.adiglobaldistribution.pr/");
	        driver.close();
	}
	
	}
	


