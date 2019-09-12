package com.training.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iframeceptionPage extends BasePage {

    // Constructor
    public iframeceptionPage(WebDriver driver) {
		super(driver);
    }

    // Page Methods
    public iframeceptionPage goToPage() {
		driver.get(this.URL);
		return this;
	}
    
    // Page Variables
    String URL = new String("https://robots.liberari.com/iframeception/");

    // Web Elements
    public By frameHeading = By.tagName("h1");
    public By button = By.tagName("button");


    // Page Methods
    public void switchToFrame(int frame_number){
        driver.switchTo().frame(frame_number);
    }

    public WebElement getHeadingElement(){
        WebElement headingElement = driver.findElement(frameHeading);
        return headingElement;
    }

    public WebElement getButtonElement(){
        WebElement buttonElement = driver.findElement(button);
        return buttonElement;
    }
    
    public void switchToMain(){
        driver.switchTo().defaultContent();
    }

    public String getHeadingText(){
        WebElement heading = driver.findElement(frameHeading);
        return heading.getText();
    }

    public void getHeadingAndPrint(){
        System.out.println(getHeadingText());
    }
}