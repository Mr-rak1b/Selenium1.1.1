import org.example.Homepage;
import org.example.Setup;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class HomeTest extends Setup{

    public Homepage home;

    @BeforeMethod
    void setupTest(){
        setupDriver("https://amaon.com");
        home = PageFactory.initElements(driver,Homepage.class);
    }

    @AfterMethod
    void tearDown(){
    driver.quit();
    }



    @Test
    void testDeals(){
        String actualText = home.dealsText();
        Assert.assertEquals(actualText,"Top Deal");
    }

    @Test
    void testBasics(){
    home.clickAmazonBasics();
    String ActualUrl = driver.getCurrentUrl();
    Assert.assertEquals(ActualUrl,"https://www.amazon.com/stores/node/20648519011?channel=discovbar?field-lbr_brands_browse-bin=AmazonBasics&ref_=nav_cs_amazonbasics");
    }

    @Test
    void SellOnAmzon(){
        home.clickSellonAmazon();
    }

    @Test
    void makeMoneY()
    {
        home.MakeMoney();
    }

//    @Test
//    void testHeaderLinks(){
//        ArrayList<String> expected = new ArrayList<>();
//        expected.add("Today's Deals");
//        expected.add("Music");
//        expected.add("Books");
//        expected.add("Registry");
//
//        ArrayList<String> actual = home.headerText();
//        Assert.assertEquals(actual,expected);
//
//    }




}
