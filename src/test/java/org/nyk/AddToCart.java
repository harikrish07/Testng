package org.nyk;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.baseclass.BaseClassMethods;

public class AddToCart extends BaseClassMethods  {
	
	public static void main(String[] args) throws IOException, InvalidFormatException {
		NykaaManager nm = new NykaaManager();
	//	browserLaunch(nm.getTest().getABrowser());
		browserLaunch(nm.getExcelReader().getABrowser());
	//	getUrl(nm.getTest().getAUrl());
		getUrl(nm.getExcelReader().getAUrl());
		implicitlyWait(10);
		mouseHoover(nm.getHom().getMomProduct());
		mouseHooverClick(nm.getHom().getPowderProduct());
	//	windowHandles(nm.getTest().getATitle());
		windowHandles(nm.getExcelReader().getATitle());
		click(nm.getBabyPage().getHimalaPowder());
	//	windowHandles(nm.getTest().getAHimalayaPageTitle());
		windowHandles(nm.getExcelReader().getAHimalayaPageTitle());
	//	dropDown(nm.getHimalayaPage().getWeight(), nm.getTest().getWeight());
		dropDown(nm.getHimalayaPage().getWeight(), nm.getExcelReader().getWeight());
		click(nm.getHimalayaPage().getBag());
		click(nm.getHimalayaPage().getBagButton());
		switchToFrame(nm.getFrameWindow().getFrame());
		click(nm.getFrameWindow().getQuantity());
		click(nm.getFrameWindow().getQuantitySize());
		click(nm.getFrameWindow().getProceedButton());
		switchToDefaultPage();
		click(nm.getCartPage().getBagAtCheckout());
		click(nm.getCartPage().getEditBagAtCheckout());
		click(nm.getCartPage().getRemoveCartItem());
		explicitWait(nm.getCartPage().getDeleteButton());
		screenshot();
		click(nm.getCartPage().getDeleteButton());
	}

}
