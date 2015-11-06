package Mobile_Devices.IOS;
import resources.Common_Variables;
import resources.Mobile_Devices.IOS.Device_SelectorHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author horned
 */
public class Device_Selector extends Device_SelectorHelper
{
	/**
	 * Script Name   : <b>Device_Selector</b>
	 * Generated     : <b>2 Nov 2015 14:20:41</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/11/02
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{

		
		String sDeviceType = Common_Variables.Mobile_Device;
		String sDeviceOrientation = Common_Variables.Mobile_Device_Orientation;

		// Device Selection
		
		//------------------------------------------------------------------------------------------
		// Default Value ZONE 1
		// Select the ZONE that's Required
		switch (sDeviceType){
			
			case "IPAD":
				html_to_ipad(ANY, READY).click();
				break;
				
			case "IPhone":
				html_to_iphone(ANY, READY).click();
				break;
				
			case "IPhone5":
				html_to_iphone5(ANY, READY).click();
				break;
				
			case "Spare":
				html_to_iphone5(ANY, READY).click();
				break;
		}
		
		
		logInfo("Device Type "+sDeviceType+" Selected");

		
		// Orientation
		
		switch (sDeviceOrientation){
		
		case "Landscape":
			// Default LS, Nothing to do
			break;
			
		case "Portrait":
			html_rotate(ANY, READY).click();
			break;
			
	}
		
		
	}
}

