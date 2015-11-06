package Basics_Road;
import resources.Common_Variables;
import resources.Basics_Road.Branch_To_UK_BreakdownHelper;
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
public class Branch_To_UK_Breakdown extends Branch_To_UK_BreakdownHelper
{
	/**
	 * Script Name   : <b>Branch_To_UK_Breakdown</b>
	 * Generated     : <b>17 Sep 2015 10:41:31</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/09/17
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		// String sBasicBreakdownSelection = Common_Variables.quickPick;		
		// sBasicBreakdownSelection = "28";
		//boolean bNot28 = Common_Variables.upgrades_Breakdown_Cover;
		//Common_Variables.upgrades_Breakdown_Cover = true;
//		if (Common_Variables.quickPick == "28"){
//			// Nothing to do
//		}
//		else {
//			String sContentText = (String)html_pricevalue().getProperty(".contentText");
//		}
		//----------------------------------------------------------------------------------------
		BrowserSync();
		//----------------------------------------------------------------------------------------
		html_pricevalue().waitForExistence(5,  0.25);
		//----------------------------------------------------------------------------------------
		String sContentText = (String)html_pricevalue().getProperty(".contentText");
		//----------------------------------------------------------------------------------------
		// Trim £
		int iLength = sContentText.length();
		sContentText = sContentText.substring(1,iLength-1);
		//----------------------------------------------------------------------------------------
		// Scraped Value Compared With Datapool Value
		//----------------------------------------------------------------------------------------
		if (Common_Variables.quickPick.contains(sContentText)){
			sContentText = Common_Variables.quickPick;
			System.out.println(sContentText+" Basic Selection was made, and Navigation to UK Breakdown Was Successfull");
			logTestResult(sContentText+" Basic Selection was made, and Navigation to UK Breakdown Was Successfull", true);		
		}
		else {
			sContentText = Common_Variables.quickPick;
			System.out.println(sContentText+" Basic Selection was made, and Navigation to UK Breakdown Was NOT Successfull");
			logTestResult(sContentText+" Basic Selection was made, and Navigation to UK Breakdown Was NOT Successfull", false);
			
		}		
		
		//----------------------------------------------------------------------------------------
		// Compare previous selected price with that displayed on header of arrival page
		//----------------------------------------------------------------------------------------
		vpManual("Price_Transition_UK_Breakdown", sContentText, Common_Variables.quickPick).performTest();
		//----------------------------------------------------------------------------------------
			
//		//--------------------------------------
//		// 5 Basic Selection Variations
//		//--------------------------------------
//		switch (Common_Variables.quickPick){
//		//--------------------------------------
//		
//			case "28":
//				// NOT STIMULATED FROM HERE
//				// PASS THROUGH
//				break;
//				//--------------------------------------
//			case "35":
//				// Scraped Value Compared With Datapool Value
//				if (Common_Variables.quickPick.contains("35")){
//					System.out.println("£35 Basic Selection was made, and Navigation to UK Breakdown Was Successfull");
//					logTestResult("£35 Basic Selection was made, and Navigation to UK Breakdown Was Successfull", true);
//				}
//				else {
//					System.out.println("£35 Basic Selection was made, and Navigation to UK Breakdown Was NOT Successfull");
//					logTestResult("£35 Basic Selection was made, and Navigation to UK Breakdown Was NOT Successfull", false);
//				}				
//				break;
//				//--------------------------------------
//			case "75":
//				// Scraped Value Compared With Datapool Value
//				if (Common_Variables.quickPick.contains("75")){
//					System.out.println("£75 Basic Selection was made, and Navigation to UK Breakdown Was Successfull");
//					logTestResult("£75 Basic Selection was made, and Navigation to UK Breakdown Was Successfull", true);
//				}
//				else {
//					System.out.println("£75 Basic Selection was made, and Navigation to UK Breakdown Was NOT Successfull");
//					logTestResult("£75 Basic Selection was made, and Navigation to UK Breakdown Was NOT Successfull", false);
//				}				
//				break;
//				//--------------------------------------
//			case "110":
//				// Scraped Value Compared With Datapool Value
//				if (Common_Variables.quickPick.contains("110")){
//					System.out.println("£110 Basic Selection was made, and Navigation to UK Breakdown Was Successfull");
//					logTestResult("£110 Basic Selection was made, and Navigation to UK Breakdown Was Successfull", true);
//				}
//				else {
//					System.out.println("£110 Basic Selection was made, and Navigation to UK Breakdown Was NOT Successfull");
//					logTestResult("£110 Basic Selection was made, and Navigation to UK Breakdown Was NOT Successfull", false);
//				}				
//				break;
//				//--------------------------------------
//			case "140":
//				// Scraped Value Compared With Datapool Value
//				if (Common_Variables.quickPick.contains("140")){
//					System.out.println("£140 Basic Selection was made, and Navigation to UK Breakdown Was Successfull");
//					logTestResult("£140 Basic Selection was made, and Navigation to UK Breakdown Was Successfull", true);
//				}
//				else {
//					System.out.println("£140 Basic Selection was made, and Navigation to UK Breakdown Was NOT Successfull");
//					logTestResult("£140 Basic Selection was made, and Navigation to UK Breakdown Was NOT Successfull", false);
//				}				
//				break;
//				//--------------------------------------
//				
//				
//			}				

		
	}
}

