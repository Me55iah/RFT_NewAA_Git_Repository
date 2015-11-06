package EBC_MK2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import resources.Common;
import resources.Common_Variables;
import resources.EBC_MK2.Cover_TypeHelper;
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
 * Description   : Functional Test Script
 * @author horned
 */

////////////////////////////////////////////////////////////////////////////////////////
//
//Uplift of EBC - Dave Horne - December 2014 - COVER TYPE DETAILS SCREEN (Step 1) (SURPLUS)
//
////////////////////////////////////////////////////////////////////////////////////////

public class Cover_Type extends Cover_TypeHelper
{
	/**
	 * Script Name   : <b>Cover_Type</b>
	 * Generated     : <b>5 Dec 2014 11:20:24</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/12/05
	 * @author horned
	 * @throws ParseException 
	 */
	
	//----------------------------------------------------------
	// DEFAULT IS SINGLE TRIP - Both Calenders Set With "Today"
	//----------------------------------------------------------
	
	public void testMain(Object[] args) throws ParseException 
	{
		
/*		// Debug Test Data Start   ************ COMMENT IN AND OUT AS REQUIRED **********		
		(Common_Variables.vehicleReg) = "EF54JWX";
		(Common_Variables.EBC_Product) = "Annual";
		(Common_Variables.startDate) = "";
		(Common_Variables.endDate) = "";
		(Common_Variables.todaysDate) = "";
		(Common_Variables.EBC_tripDuration) = "";		
		// ********************      Debug Test Data End     ***************************	
*/
		//Common_Variables.todaysDate = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());

		//int tripDuration = Integer.parseInt(Common_Variables.EBC_tripDuration);
			
		//------------------------------------------------------------------------------------------
		// Synchronise
		Registration_Number(ANY, LOADED).waitForExistence(20, 0.25);
 
		//------------------------------------------------------------------------------------------
		sleep(2.0);
		// Enter Registration Number
		Registration_Number(ANY, LOADED).setText(Common_Variables.vehicleReg);
		//------------------------------------------------------------------------------------------
		// Select SINGLE or ANNUAL Trip Cover
		switch (Common_Variables.EBC_Product){
			
			case "Single":                                                    // DAYS (Duration) BETWEEN 2 DATES
				chkBx_SingleTrip_Selection(ANY, READY).click();
				//------------------------------------------------------------------------------------------
				// Other (DAY) Node On (Start) Calender
				// CLICK For Days Not Displayed In Current Month
				// CLICK THIS ALWAYS TO EXPOSE ALL DAYS OF CURRENT MONTH
				cal_Other_Button_Leaving().waitForExistence(20.0,  0.25);
				cal_Other_Button_Leaving(ANY, READY).click();
				//------------------------------------------------------------------------------------------
				
				
				
				
				//------------------------------------------------------------------------------------------
				// Other (DAY) Node On (End) Calender
				// CLICK For Days Not Displayed In Current Month
				// CLICK THIS ALWAYS TO EXPOSE ALL DAYS OF CURRENT MONTH
				cal_Other_Button_Returning().waitForExistence(20.0,  0.25);
				cal_Other_Button_Returning(ANY, READY).click();
				//------------------------------------------------------------------------------------------
				
				
				
				break;
		//------------------------------------------------------------------------------------------
			
			case "Annual":                                                    // 1 DATE (Start Date Only)
				chkBx_Annual_Selection(ANY, READY).click();
				//------------------------------------------------------------------------------------------
				// Other (DAY) Node On (Start) Calender
				// CLICK For Days Not Displayed In Current Month
				// CLICK THIS ALWAYS TO EXPOSE ALL DAYS OF CURRENT MONTH
				cal_Other_Button_Leaving().waitForExistence(20.0,  0.25);
				cal_Other_Button_Leaving(ANY, READY).click();

				
		
				// Debug //////////////////////////////////////////////// Debug
				// Document: European breakdown cover | AA: RegularExpression(.*uropean-breakdown.*)
			//	cal_Other_Button_Leaving().click();
				cal_Leaving_Next_Button().waitForExistence(20.0,  0.25);
				cal_Leaving_Next_Button(ANY, READY).click();
				form_coverDetails().waitForExistence(20.0,  0.25);
				form_coverDetails(ANY, READY).click();
				
		
		// HTML Browser
		// Document: European breakdown cover | AA: RegularExpression(.*uropean-breakdown.*)
		form_coverDetails().click();
				
				
				// Debug //////////////////////////////////////////////// Debug
				// Document: European breakdown cover | AA: RegularExpression(.*uropean-breakdown.*)
			
				break;
				
		}

		
		
		
		
		
		
		// Date Selections
		// We now have the start date of the policy, we need to now add
		// the appropriate number of days to it
//		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//		java.util.Date policyEndDate = format.parse(Common_Variables.todaysDate);
//
//		tripDuration = tripDuration - 1;
//
//		// Add the required number of days to the start date to get the
//		// end date
//		java.util.Date policyEndDate2 = Common.DateUtil.addDays(policyEndDate, tripDuration);
//
//		final String OLD_FORMAT = "dd/MM/yyyy";
//		// final String NEW_FORMAT = "ddMMyy";
//
//		SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
//		sdf.applyPattern(OLD_FORMAT);
//		String sPolicyEndDate2 = sdf.format(policyEndDate2);
//
//		// System.out.println("Start Date = " + Common_Variables.todaysDate);
//		// System.out.println("End Date = " + sPolicyEndDate2);
//
//		String departDay = Common_Variables.todaysDate.substring(0, 2);
//		String departMonth = Common_Variables.todaysDate.substring(3, 5);
//		String departYear = Common_Variables.todaysDate.substring(6);
		
/*		//------------------------------------------------------------------------------------------
		// Other (DAY) Node On (Start) Calender
		// CLICK For Days Not Displayed In Current Month
		// CLICK THIS ALWAYS TO EXPOSE ALL DAYS OF CURRENT MONTH
		cal_Other_Button_Returning(ANY, READY).click();
		
		//------------------------------------------------------------------------------------------
		// Next Month Arrow LEAVING DATE
		// Only Available After DAY Selection
		cal_Leaving_Next_Button(ANY, READY).click();
		
		//------------------------------------------------------------------------------------------
		// Day Selection
		form_coverDetails(ANY, READY).click();
		
		//------------------------------------------------------------------------------------------
		// Other (DAY) Node On (End) Calender
		// CLICK For Days Not Displayed In Current Month
		// CLICK THIS ALWAYS TO EXPOSE ALL DAYS OF CURRENT MONTH
		cal_Other_Button_Leaving(ANY, READY).click();
		
		//------------------------------------------------------------------------------------------
		// Next Month Arrow Button RETURN DATE
		// Only Available After DAY Selection
		cal_Returning_Next_Button(ANY, READY).click();

		//------------------------------------------------------------------------------------------
		// Day Selection
		form_coverDetails(ANY, READY).click();

		
		//------------------------------------------------------------------------------------------

		// Continue to NEXT Screen
		continue_Submit().waitForExistence(20, 0.25);
		continue_Submit(ANY, READY).click();
		
		//------------------------------------------------------------------------------------------
*/	}
}
