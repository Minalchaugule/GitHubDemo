
public class TestUS {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			
			//System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			//WebDriver d=new FirefoxDriver();
			
			d.manage().window().maximize(); 
			 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			 //String password=GetPassword(d);
			d.get("https://www.amazon.co.uk");
			Thread.sleep(8000);
			Actions act=new Actions(d);
			act.moveToElement(d.findElement(By.xpath("//a[@id='nav-link-accountList']")));
			d.findElement(By.xpath("//span[text()='Sign in']")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("minal.chaugule88@gmail.com");
			d.findElement(By.xpath("//input[@id='continue']")).click();
			d.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Minal@123");
			Thread.sleep(2000);
			
			d.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
			d.findElement(By.xpath("//div[text()='Audible Audiobooks']")).click();
			d.findElement(By.xpath("//div[@class='nav-sprite hmenu-close-icon']")).click();
			d.findElement(By.xpath("//a[@id='icp-nav-flyout']")).click();
			d.findElement(By.xpath("//div[text()='Change country/region']")).click();
			d.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
			d.findElement(By.linkText("India")).click();
	}

}


}
