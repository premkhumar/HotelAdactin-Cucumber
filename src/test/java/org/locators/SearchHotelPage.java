package org.locators;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends LibGlobal {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement selLocation;

	@FindBy(id = "hotels")
	private WebElement selHotel;

	@FindBy(id = "room_type")
	private WebElement selRoomType;

	@FindBy(id = "room_nos")
	private WebElement selRoomNos;

	@FindBy(id = "datepick_in")
	private WebElement txtDateIn;

	@FindBy(id = "datepick_out")
	private WebElement txtDateOut;

	@FindBy(id = "adult_room")
	private WebElement noAdult;

	@FindBy(id = "child_room")
	private WebElement noChild;

	@FindBy(name = "Submit")
	private WebElement btnSubmit;

	public WebElement getSelLocation() {
		return selLocation;
	}

	public WebElement getSelHotel() {
		return selHotel;
	}

	public WebElement getSelRoomType() {
		return selRoomType;
	}

	public WebElement getSelRoomNos() {
		return selRoomNos;
	}

	public WebElement getTxtDateIn() {
		return txtDateIn;
	}

	public WebElement getTxtDateOut() {
		return txtDateOut;
	}

	public WebElement getNoAdult() {
		return noAdult;
	}

	public WebElement getNoChild() {
		return noChild;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void searchHotelPage(String location, String hotel, String roomType, String roomNos, String dateIn,
			String dateOut, String adult, String child) {

		selectbyVisibleText(getSelLocation(), location);
		selectbyVisibleText(getSelHotel(), hotel);
		selectbyVisibleText(getSelRoomType(), roomType);
		selectbyVisibleText(getSelRoomNos(), roomNos);
		clear(getTxtDateIn());
		sendValue(getTxtDateIn(), dateIn);
		clear(getTxtDateOut());
		sendValue(getTxtDateOut(), dateOut);
		selectbyVisibleText(getNoAdult(), adult);
		selectbyVisibleText(getNoChild(), child);

	}
}
