package org.locators;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookaHotelPage extends LibGlobal{
	
	public BookaHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name")
	private WebElement txtFistName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtBillingAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCreditcardNo;
	
	@FindBy(id="cc_type")
	private WebElement selCreditCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement selExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement selExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCvv;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;

	public WebElement getTxtFistName() {
		return txtFistName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtBillingAddress() {
		return txtBillingAddress;
	}

	public WebElement getTxtCreditcardNo() {
		return txtCreditcardNo;
	}

	public WebElement getSelCreditCardType() {
		return selCreditCardType;
	}

	public WebElement getSelExpMonth() {
		return selExpMonth;
	}

	public WebElement getSelExpYear() {
		return selExpYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	public void bookaHotelPage(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		
		sendValue(txtFistName, string);
		sendValue(txtLastName, string2);
		sendValue(txtBillingAddress, string3);
		sendValue(txtCreditcardNo, string4);
		selectbyVisibleText(selCreditCardType, string5);
		selectbyVisibleText(selExpMonth, string6);
		selectbyVisibleText(selExpYear, string7);
		sendValue(txtCvv, string8);
		
	}
	
	public void bookSubmit() {

		click(btnBookNow);
	}
	
}
