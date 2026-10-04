package com.ui.tests;

import static com.constants.Browser.CHROME;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;

public class LoginTest3 {

	HomePage homePage;

	@BeforeMethod(description = "Load the Homepage of the website")
	public void setup() {
		homePage = new HomePage(CHROME, true);
	}

	@Test(description = "verifies with the valid user is able to login into the application", groups = { "e2e",
			"sanity" })
	public void loginTest() {
		assertEquals(homePage.goToLoginPage().doLoginWith("dihivi5520@nuitx.com", "password").getUsername(),
				"Tushar Arban");
	}

}
