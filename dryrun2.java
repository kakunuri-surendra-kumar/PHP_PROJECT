package Runner_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pages.RLL_240Testing_PhpTravels_Hotels.PhpTravels_FilterHotels_lib;


public class dryrun2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		
		PhpTravels_FilterHotels_lib page2 = new PhpTravels_FilterHotels_lib();
		page2.intit(wd);
		page2.Launch_PHP_Travels();

//		page2.star_Rating();
//		page2.star_Rating1();
		
//		page2.Price_Range();
//		page2.Price_Range1();
		
		//page2.Price_Sort_By();
		page2.Price_Sort_By1();
		
		page2.Apply_Filters();
		page2.Reset();
		page2.View_More();
		
	}

}
