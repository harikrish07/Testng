package org.nykaa;

import org.baseclass.BaseClassMethods;
import org.baseclass.LoginPage;

public class FacebbookLogin extends BaseClassMethods {
		
			public static void main(String[] args) {
				browserLaunch("chrome");
				getUrl("https://www.facebook.com/");
				
				//invoking constructor in LoginPage
				LoginPage l = new LoginPage();
				enterText(l.getTxtUserName(), "harish");
				enterText(l.getTxtPassword(), "H123");
				click(l.getLoginButton());
				
				
				
			}
	
}
