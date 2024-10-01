package Runner_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pages.RLL_240Testing_PhpTravels_Hotels.PhpTravels_FilterHotels_lib;
import com.pages.RLL_240Testing_PhpTravels_Hotels.PhpTravels_SearchHotels_lib;


public class dryrun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				//object
				PhpTravels_SearchHotels_lib page1= new PhpTravels_SearchHotels_lib();

				WebDriver wd = new FirefoxDriver();
				page1.init(wd);
				page1.Launch_PHP_Travels();
				page1.second_link();
				page1.Search_for_best_hotels();
				page1.Search_By_City();
				page1.searchCity();
				page1.Checkin_calender();
				page1.Checkin_Date();
				
				
//				page1.Checkout_calender();
//				page1.Checkout_Date();
				
				page1.Travellers();
				//page1.Rooms_Plus();
				//page1.Rooms_Minus();
			
//				page1.Nationality();
//				page1.Country();
				page1.Search();
				
				
				PhpTravels_FilterHotels_lib page2 = new PhpTravels_FilterHotels_lib();
				page2.intit(wd);
				page2.Launch_PHP_Travels();

//				page2.star_Rating();
//				page2.star_Rating1();
				
//				page2.Price_Range();
//				page2.Price_Range1();
				
				//page2.Price_Sort_By();
				page2.Price_Sort_By1();
				
				page2.Apply_Filters();
				page2.Reset();
				page2.View_More();
				
				
			}

		}