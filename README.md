# IDC Jenkins Activity

# Previous Activity
Before you do this activity, please complete the [previous activity.](https://gitlab.com/abhiramk/idc-git-training/blob/master/README.md)

# Instructions
- This repository's structure is based on the Page Object Model structure.
- In the `com.training.pom.pages` package, you will find 2 files: `AlertsPage.java` and `BasePage.java`
    - `BasePage.java` contains all the common functions and elements between all webpages.
    - `AlertsPage.java` represents the elements in the [Robots Alerts Page](https://robots.liberari.com/jsalerts).

- In the `com.training.pom.tests` package, you will find 2 files: `AlertsTest.java` and `BaseTest.java`
    - `BaseTest.java` contains all the common testing functions for all tests.
    - `AlertsTest.java` contains all the tests that apply to the Alerts Page.
    
- The Project Root contains a `testng.xml` which is where you will be specifying which tests to run.
    
- Keeping this file structure in mind, read the following instructions to complete the activity.

# Jenkins Activity Preparation
- Fork this repository
- Clone your fork
- In the `com.training.pom.pages` package, create the following two files with the specified content:
    - `iframePage.java`: This should represent all the elements in the [Robots iFrames Page](https://robots.liberari.com/iframes).
    - `iframeceptionPage.java`: This should represent all the elements in the [Robots iFrameception Page](https://robots.liberari.com/iframeception).
    
- In the `com.training.pom.tests` package, create the following two files with the specified content:
    - `iframeTest.java`: This should contain any 2 tests for `iframePage.java`. The tests you write are up to you as long as they are valid.
    - `iframeceptionTest.java`: This should contain any 2 tests for `iframeceptionPage.java`. Once again, the tests you write are up to you as long as they are valid.
    
- Edit the `testng.xml` to include the two test classes you've written.

- If you want to see the solution, you can see check the `solution` branch.