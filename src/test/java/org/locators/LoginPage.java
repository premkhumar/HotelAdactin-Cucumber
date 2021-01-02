package org.locators;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonSubTypes.Type;

public class LoginPage extends LibGlobal{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUsername;
	
	@FindBy(id="password")
	private WebElement txtPass;
	
	@FindBy(id="login")
	private WebElement btnLogin;

	public WebElement gettxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void loginPage(String userName,String pass) {

		sendValue(gettxtUsername(), userName);
		sendValue(getTxtPass(), pass);
		click(btnLogin);
		
	}
	
	

}
