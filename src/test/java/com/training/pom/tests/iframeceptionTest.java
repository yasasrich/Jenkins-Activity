package com.training.pom.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;

import com.training.pom.pages.iframeceptionPage;

public class iframeceptionTest extends BaseTest {
	
  @Test
  public void VerifyFirstFrameHeading() {
	  iframeceptionPage page = new iframeceptionPage(driver);
      page.goToPage();
      page.switchToFrame(0);
      WebElement element = page.getHeadingElement();
      Assert.assertTrue(element.isDisplayed());
      // page.getFirstHeadingAndPrint();
  }

  @Test
  public void VerifyThirdFrameButton() {
	  iframeceptionPage page = new iframeceptionPage(driver);
      page.goToPage();
      page.switchToFrame(0);
      page.switchToFrame(0);
      page.switchToFrame(0);
      WebElement button = page.getButtonElement();
      Assert.assertTrue(button.isDisplayed());
  }

}