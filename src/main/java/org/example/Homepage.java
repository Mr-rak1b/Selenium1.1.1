package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Set;

public class Homepage {

    @FindBy(css = ".deal-of-the-day div h2")
    WebElement deals;

    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[6]")
    WebElement amazonBasics;

    @FindBy(xpath = "//div[id='nav-xshop-container']/div/a")
    Set<WebElement> headerLinks;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[1]/a")
    WebElement sellonAmazon;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[11]/a")
    WebElement makeMoney;

    public void MakeMoney()
    {
        makeMoney.click();
    }

    public void clickSellonAmazon(){
        sellonAmazon.click();
    }

    public void clickAmazonBasics() {
        amazonBasics.click();
    }

     public String dealsText() {
        return deals.getText();
    }



//    public ArrayList<String> headerText(){
//
//        ArrayList<String> links = new ArrayList<>();
//        for(WebElement a : headerLinks) {
//            links.add(a.getText());
//        }
//        System.out.println(links);
//        return links;
//    }
}
