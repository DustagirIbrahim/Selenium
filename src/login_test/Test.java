package login_test; 




import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 

public class Test { 
	  
    // Main driver method 
    public static void main(String[] args) 
    { 
    	  WebDriver driver = new ChromeDriver(); 
    
    	driver.get("https://qa.adiglobaldistribution.pr/"); 
    	System.out.println("hello team");
    	 driver.getTitle();
    	driver.close();
    }}
