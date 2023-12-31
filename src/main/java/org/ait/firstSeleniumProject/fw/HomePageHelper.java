package org.ait.firstSeleniumProject.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends HelperBase {
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isHomeComponentPresent(){
        return driver.findElements(By.xpath("//div[@id='nivo-slider']")).size()>0;
    }

    public void clickOnHomeLink() {
        click(By.cssSelector("[href='/']"));
    }
}
