package org.nyk;

public class NykaaManager {
	
	private HomePage hom;
	private BabyPowder babyPage;
	private HimalayaBabyPowder himalayaPage;
	private CartFrame frameWindow;
	private Cart cartPage;
	private TestData test;
	private ExcelReader excelReader;

	public ExcelReader getExcelReader() {
		excelReader = new ExcelReader();
		return excelReader;
	}

	public TestData getTest() {
		test = new TestData();
		return test;
	}

	public HomePage getHom() {
		hom = new HomePage();
		return hom;
	}
	
	public BabyPowder getBabyPage() {
		babyPage = new BabyPowder();
		return babyPage;
	}
	
	public HimalayaBabyPowder getHimalayaPage() {
		himalayaPage = new HimalayaBabyPowder();
		return himalayaPage;
	}
	
	public CartFrame getFrameWindow() {
		frameWindow = new CartFrame();
		return frameWindow;
	}
	
	public Cart getCartPage() {
		cartPage = new Cart();
		return cartPage;
	}
	

}
