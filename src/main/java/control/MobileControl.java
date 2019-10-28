package control;

import io.appium.java_client.MobileElement;
import pagedef.IPage;

public class MobileControl extends WebControl {
	private MobileElement mobileElement = null;

	public MobileControl(String name, IPage page, MobileElement element) {
		super(name, page, element);
		this.mobileElement = element;
	}

}
