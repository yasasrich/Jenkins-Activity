package com.training.pom.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;

import com.training.pom.pages.iframePage;

public class iframeTest extends BaseTest {
	
  @Test
  public void VerifyFirstFrameHeading() {
	  iframePage page = new iframePage(driver);
      page.goToPage();
      page.switchToFrame(0);
      WebElement element = page.getHeadingElement();
      Assert.assertTrue(element.isDisplayed());
      // page.getFirstHeadingAndPrint();
  }

  @Test
  public void VerifySecondFrameHeading() {
	  iframePage page = new iframePage(driver);
      page.goToPage();
      page.switchToFrame(1);
      WebElement element = page.getHeadingElement();
      Assert.assertTrue(element.isDisplayed());
  }

}