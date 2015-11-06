package Utilities;
import resources.Utilities.Address_SelectorHelper;
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
public class Address_Selector extends Address_SelectorHelper
{
	/**
	 * Script Name   : <b>Address_Selector</b>
	 * Generated     : <b>22 Sep 2015 13:40:27</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/09/22
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		 
		try {
			String sSelectExactAddress = (String)form_yourAddressPleaseChooseYo().getProperty(".text");
			//------------------------------------------------------------------------------------------
			if (sSelectExactAddress.contains("Please choose your address")){
				//-------------------------------------------------
				// Select ListBox - Pick 1st Item
				list_select(ANY, READY).click();
				sleep(0.5);
				browser_htmlBrowser(document_vehicleInspectionsFor(),DEFAULT_FLAGS).inputKeys("{ExtDown}{ENTER}");
				//--------------------------------------------------
				// Commit
				button_continuesubmit().waitForExistence(5,  0.25);
				button_continuesubmit(ANY, READY).click();
			}
		} catch (ObjectNotFoundException e) {
				
		}

				
	}
}

