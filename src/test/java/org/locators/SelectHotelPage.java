package org.locators;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends LibGlobal{
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_0")
	private WebElement selRadioBtn;
	
	@FindBy(id="continue")
	private WebElement btnContinue;

	public WebElement getSelRadioBtn() {
		return selRadioBtn;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	public void selectHotelPage() {
		
		click(selRadioBtn);
		
	}
	public void selectContinue() {
		click(btnContinue);
	}
}
