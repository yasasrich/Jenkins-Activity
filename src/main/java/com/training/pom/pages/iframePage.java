package com.training.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iframePage extends BasePage {

    // Constructor
    public iframePage(WebDriver driver) {
		super(driver);
    }

    // Page Methods
    public iframePage goToPage() {
		driver.get(this.URL);
		return this;
	}
    
    // Page Variables
    String URL = new String("https://robots.liberari.com/iframes/");

    // Web Elements
    public By frameHeading = By.tagName("h1");


    // Page Methods
    public void switchToFrame(int frame_number){
        driver.switchTo().frame(frame_number);
    }

    public void switchToMain(){
        driver.switchTo().defaultContent();
    }

    public String getHeadingText(){
        WebElement heading = driver.findElement(frameHeading);
        return heading.getText();
    }

    public WebElement getHeadingElement(){
        WebElement headingElement = driver.findElement(frameHeading);
        return headingElement;
    }

    public void getFirstHeadingAndPrint(){
        switchToFrame(0);
        System.out.println(getHeadingText());
    }

    public void getSecondHeadingAndPrint(){
        switchToFrame(1);
        System.out.println(getHeadingText());
    }

}