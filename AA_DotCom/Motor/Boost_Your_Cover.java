package Motor;

import resources.Common_Variables;
import resources.Motor.Boost_Your_CoverHelper;
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
public class Boost_Your_Cover extends Boost_Your_CoverHelper {
	/**
	 * Script Name : <b>Boost_Your_Cover</b> Generated : <b>12 Mar 2013
	 * 11:37:17</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/03/12
	 * @author courtl
	 */
	
	public static String pageAddress;
	
	public void testMain(Object[] args) {
		
		//sleep(5.0);
		//------------------------------------------------------------------------------------------
		callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
		//------------------------------------------------------------------------------------------

		boolean freeBreakdown2 = html_breakdownlabel(ANY, LOADED).exists();

		if (freeBreakdown2 == true) {

			label_yesPlease4(ANY, LOADED).click();
			sleep(1.0);
			System.out.println("Free Road was offered and selected");

		}

		boolean freeHer2 = label_noThanks(ANY, LOADED).exists();

		if (freeHer2 == true) {

			boolean freeHer3 = list_aaHerPropertyType3(ANY, LOADED).exists();

			if (freeHer3 == true) {

				label_yesPlease5().click();
				sleep(2.0);

				list_aaHerPropertyType3(ANY, LOADED).select("Detached");
				list_aaHerNumberOfRooms3(ANY, LOADED).select("4");
				iE(
						document_carInsuranceBoostYour(ANY, LOADED),
						DEFAULT_FLAGS).inputKeys("{TAB}");
				System.out
						.println("Free Home Membership was offered and selected");
			}

		}
//		//---------------------------------------------------------------------------
//		pageAddress = (String) iE(ANY, LOADED).getProperty(".documentName");
//
//		if (pageAddress.contains("quote"));{
//			// Detect Motor Variant Screen and Set Known .view
//			sleep(2);
//			iE(document_carInsuranceYourQuote(),DEFAULT_FLAGS).click(atPoint(497,37));
//			sleep(1);
//			iE(document_carInsuranceYourQuote(),DEFAULT_FLAGS).click(atPoint(497,38));
//			iE(document_carInsuranceYourQuote(),DEFAULT_FLAGS).inputKeys("-view{ENTER}");
//		}
//
//		//---------------------------------------------------------------------------

		
		iE(document_carInsuranceBoostYour(), DEFAULT_FLAGS)
				.inputKeys("{ExtPgDn}");
		button_buyNowsubmit(ANY, READY).click();

		unregisterAll();

		//------------------------------------------------------------------------------------------
		callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
		//------------------------------------------------------------------------------------------

	}
}
