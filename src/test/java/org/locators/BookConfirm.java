package org.locators;

import java.io.IOException;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class BookConfirm extends LibGlobal {

	public BookConfirm() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "hotel_name")
	private WebElement hotelName;

	@FindBy(id = "location")
	private WebElement hotelLocation;

	@FindBy(id = "total_rooms")
	private WebElement totalRooms;

	@FindBy(name = "logout")
	private WebElement btnLogout;

	public WebElement getBtnLogout() {
		return btnLogout;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getHotelLocation() {
		return hotelLocation;
	}

	public WebElement getTotalRooms() {
		return totalRooms;
	}

	public void bookConfirm() throws IOException {

		String actHotelName = getAttribute(getHotelName(), "value");
		String actHotelLoca = getAttribute(getHotelLocation(), "value");
		String actTotalRoom = getAttribute(getTotalRooms(), "value");

		Assert.assertEquals("Hotel Sunshine", actHotelName);
		Assert.assertEquals("Melbourne", actHotelLoca);
		Assert.assertEquals("6 Room(s)", actTotalRoom);

		screenShot("img3");

	}

	public void logout() {

		click(getBtnLogout());
	}

}
