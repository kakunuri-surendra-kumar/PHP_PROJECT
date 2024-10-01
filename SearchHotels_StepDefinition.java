package RLL_240Testing_PhpTravels_Hotels_StepDefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pages.RLL_240Testing_PhpTravels_Hotels.PhpTravels_SearchHotels_lib;
import io.cucumber.java.en.*;

public class SearchHotels_StepDefinition {

    WebDriver wd;
    PhpTravels_SearchHotels_lib searchHotels = new PhpTravels_SearchHotels_lib();
    Logger log;
    
    public void init(WebDriver wd) {
		this.wd=wd;
		log=Logger.getLogger(SearchHotels_StepDefinition.class);
	}
    
    @Given("User launches the PHP Travels website")
    public void user_launches_the_php_travels_website() {
        wd = new FirefoxDriver();
        searchHotels = new PhpTravels_SearchHotels_lib();
        searchHotels.init(wd);
        searchHotels.Launch_PHP_Travels();
        log.info("pass");
    }

    @When("User clicks on Hotels link")
    public void user_clicks_on_hotels_link() {
        searchHotels.second_link();
    }

    @And("User clicks on Search for best hotels")
    public void user_clicks_on_search_for_best_hotels() {
        searchHotels.Search_for_best_hotels();
    }

    @And("User selects city as Dubai")
    public void user_selects_city_as_dubai() {
        searchHotels.Search_By_City();
        searchHotels.searchCity();
    }

    @And("User selects check-in date")
    public void user_selects_check_in_date() {
        searchHotels.Checkin_calender();
        searchHotels.Checkin_Date();
    }

    @And("User selects check-out date")
    public void user_selects_check_out_date() {
        searchHotels.Checkout_calender();
        searchHotels.Checkout_Date();
    }

    @And("User selects number of travellers")
    public void user_selects_number_of_travellers() {
        searchHotels.Travellers();
    }

    @Then("User clicks on Search button")
    public void user_clicks_on_search_button() {
        searchHotels.Search();
        wd.quit();
    }
}
