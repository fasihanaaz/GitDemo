import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SelIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}
