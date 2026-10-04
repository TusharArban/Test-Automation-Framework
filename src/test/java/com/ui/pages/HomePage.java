package com.ui.pages;

import static com.constants.Env.QA;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import com.utility.BrowserUtility;
import com.utility.JSONUtility;
import com.utility.LoggerUtility;

public final class HomePage extends BrowserUtility {

	Logger logger = LoggerUtility.getLogger(this.getClass());
	private static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[contains(text(),\"Sign in\")]");

	public HomePage(Browser browserName, boolean isHeadless) {
		super(browserName, isHeadless);
		// goToWebsite(PropertiesUtil.readProperty(QA, "URL"));
		goToWebsite(JSONUtility.readJSONData(QA).getUrl());
	}

	public HomePage(WebDriver driver) {
		super(driver);
		// goToWebsite(PropertiesUtil.readProperty(QA, "URL"));
		goToWebsite(JSONUtility.readJSONData(QA).getUrl());
	}

	public LoginPage goToLoginPage() {
		logger.info("Clicking on Sign In Link");
		clickOn(SIGN_IN_LINK_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}

}
