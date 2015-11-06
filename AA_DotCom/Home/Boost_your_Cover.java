package Home;

import resources.Common_Variables;
import resources.Home.Boost_your_CoverHelper;
import Utilities.Portal_Synchronisation;
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
 * Description : Functional Test Script
 * 
 * @author courtl
 */
@SuppressWarnings("unused")

///////////////////////////////////////////////////////////////////////////////////////////
//25//11/2014 - Failing Logic - Added 61 on - DH                                         //
//
///////////////////////////////////////////////////////////////////////////////////////////

public class Boost_your_Cover extends Boost_your_CoverHelper {
	/**
	 * Script Name : <b>Boost_your_Cover</b> Generated : <b>27 Feb 2013
	 * 11:20:34</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/02/27
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		if (Common_Variables.HLE == true) {

			label_legalExpensesCover£2599G2().click();
			//------------------------------------------------------------------------------------------
			//callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
			BrowserSync();
			try {
				button_buyNowsubmit().waitForExistence();
				button_buyNowsubmit(ANY, READY).click();
				sleep(2);
			} catch (Exception e) {
				//-----------------------------------------------------------------			
				callScript("Home.Important_Information_Screen");
				//-----------------------------------------------------------------				
				button_buyNowsubmit().waitForExistence();
				button_buyNowsubmit(ANY, READY).click();
			}
			BrowserSync();
		}

		else {
			//------------------------------------------------------------------------------------------
			//callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
			BrowserSync();
			//-----------------------------------------------------------------			
//			try {
//				callScript("Home.Important_Information_Screen");
//			} catch (ObjectNotFoundException e) {
//				
//			}
			//-----------------------------------------------------------------				
			// ADDED - Failing logic
			if (button_yessubmit().exists()){
				//button_yessubmit().waitForExistence();
				button_yessubmit(ANY, READY);
			}
			else {
				button_buyNowsubmit(ANY, READY).click();
				sleep(5.0);
			}
		System.gc();
		
		}
	}
}
