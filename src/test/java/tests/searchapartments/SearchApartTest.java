package tests.searchapartments;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class SearchApartTest extends BaseTest {


    @Test
   public void checkIsRedrectToListing(){

       basePage.open("https://realt.by/");
       realtHomePage.enterCountRoom()
                    .clickToFind();


   }
}
