package Motor_MK2;
import resources.Motor_MK2.Boost_Your_CoverHelper;
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
public class Boost_Your_Cover extends Boost_Your_CoverHelper
{
	/**
	 * Script Name   : <b>Boost_Your_Cover</b>
	 * Generated     : <b>2 Jun 2015 16:09:35</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/02
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//-----------------------------------------------------------------------------------------
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
		
		//Verification
		String svTitle = "Boost_Your_Cover";
		String sReport = "Boost Your Cover Page Displayed Successfully";
		String sExpected = "Additional car details";
		String sActual = "";

		
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
		//-----------------------------------------------------------------------------------------
		
		
//		// Memory Resource Issues Causes Different Approach Here
//		String sAPI_ID1 = "class";   				// leading "." ignored
//		String sAPI1Value = "Html.INPUT.submit"; 
//		String sAPI_ID2 = "value";   				// leading "." ignored
//		String sAPI2Value = "Buy now";
//		int iObjectIndex = 1;
//		
//		ControlClick(sAPI_ID1, sAPI1Value, sAPI_ID2, sAPI2Value, iObjectIndex);
				
		// 
		
//		callScript("Utilities.pageDown");
		callScript("Utilities.pageDown");
		callScript("Utilities.pageDown");
		
		unregisterAll();
				
				
//		form_addonsForm().waitForExistence(20,  0.25);
//		form_addonsForm(ANY, READY).click();
		
		iE().activate();
		
		if (button_buyNowsubmit().exists()){
			button_buyNowsubmit().waitForExistence(20,  0.25);
			button_buyNowsubmit(ANY, READY).click();

		}
		else {
			
			// Out of Memory - Needs Resorting to Key Strokes
			if (html_freeoffers().exists()){
				html_freeoffers(ANY, READY).click(atPoint(441,1));
			}
			if (form_addonsForm().exists()){
				form_addonsForm(ANY, READY).click(atPoint(441,1));
			}
			// Out of Memory - Needs Resorting to Key Strokes
 			iE(document_carInsuranceBoostYour(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
 			iE(document_carInsuranceBoostYour(),DEFAULT_FLAGS).inputKeys("{ENTER}");

		}
		
//		
		unregisterAll();
		System.gc();
		//--------------------------------------------------------------------
		// COMMIT YOUR QUOTE DETAILS                             MEMORY EXHAUSTED
		//button_buyNowsubmit2().waitForExistence(20,  0.25);
		//button_buyNowsubmit2(ANY, READY).click();
		//--------------------------------------------------------------------
		BrowserSync();		
		
//		unregisterAll();
		//--------------------------------------------------------------------
		// Scrape Following Screen (YOUR QUOTE DETAILS) for ACTUAL Value to Compare
		if (html_main().exists()){
			sActual = (String)html_main().getProperty(".text");
			if (sActual.contains("Additional car details")){
				sActual = "Additional car details";
			}
			//--------------------------------------------------------------------
			// Verify Success on your Details (YOUR DETAILS SCREEN APPEARANCE)
			VerifyandReport(svTitle, sExpected, sActual, sReport);

		}
			 

		//--------------------------------------------------------------------
		// END OF YOUR BOOST YOUR COVER DETAILS
		//--------------------------------------------------------------------
	}
}

