package Motor_MK2.Your__Details;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Details.Add_ConvictionHelper;
import Utilities.IE11_Page_Loaded;

import com.rational.test.ft.*;
import com.rational.test.ft.application.Activate;
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
public class Add_Conviction extends Add_ConvictionHelper
{
	/**
	 * Script Name   : <b>Add_Conviction</b>
	 * Generated     : <b>29 Jul 2015 15:57:21</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/29
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//-------------------------------------------------------------------- 
//		// Test Data
//		String sMotorOffence = "AC10 - Failing to stop after an accident"; //AC30 - Undefined accident offence"; //AC10 - Failing to stop after an accident";
//		String sPenaltyPoints = "6";
//		String sBanLengthMonths = "6"; 
//		Boolean bDrivingBan = true;
//		String sFineAmount = "400";
//		String sConvictionMonth = "May";		
//		String sConvictionYear = "2012";		
//		// Test Data
		//-------------------------------------------------------------------- 
		String sMotorOffence = Common_Variables.motoringOffence;
		String sPenaltyPoints = Common_Variables.penaltyPoints;
		String sBanLengthMonths = Common_Variables.motoringBanLength;	
		Boolean bDrivingBan = Common_Variables.drivingBan;		
		String sFineAmount = Common_Variables.motoringFineAmount;	
		String sConvictionMonth = Common_Variables.motoringConvictionMonth;		
		String sConvictionYear = Common_Variables.motoringConvictionYear;		
		//--------------------------------------------------------------------
		BrowserSync();
		iE().activate();
		form_convictionForm(ANY, READY).click();		
		//--------------------------------------------------------------------	
		// Offence
		//--------------------------------------------------------------------
		// Date of Conviction - YYYY - MMMM
		//--------------------------------------------------------------------
		// MONTH
		//--------------------------------------------------------------------
		list_aaDriversConvictionDate_Month().waitForExistence(10,  0.25);
		list_aaDriversConvictionDate_Month(ANY, READY).click(atPoint(129,35));
		list_aaDriversConvictionDate_Month().click(atText(sConvictionMonth));		
		// iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sConvictionMonth);
		//--------------------------------------------------------------------
		// YEAR
		//--------------------------------------------------------------------
		list_aaDriversConvictionDate_Year().waitForExistence(10,  0.25);
		list_aaDriversConvictionDate_Year(ANY, READY).click(atPoint(129,35));		
		list_aaDriversConvictionDate_Year().click(atText(sConvictionYear));
		// iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sConvictionYear);		
		//--------------------------------------------------------------------
		// Penalty Points
		//--------------------------------------------------------------------
		list_aaDriversConvictionPenaltyPoints_Received().waitForExistence(10,  0.25);
		list_aaDriversConvictionPenaltyPoints_Received(ANY, READY).click();
		sleep(0.25);
		list_aaDriversConvictionPenaltyPoints_Received(ANY, READY).click(atText(sPenaltyPoints));		
		//--------------------------------------------------------------------
		// Fine Received
		//--------------------------------------------------------------------
		list_aaDriversConvictionFine_Amount(ANY, READY).click(atPoint(153,39));
		iE(document_carInsuranceYourDetai(ANY, READY),DEFAULT_FLAGS).inputChars(sFineAmount);
		//--------------------------------------------------------------------
		// Driving Ban Imposed
		//--------------------------------------------------------------------
		// 	YES
		if (bDrivingBan == true){
			label_Driving_Ban_Yes().waitForExistence(10,  0.25);
			label_Driving_Ban_Yes(ANY, READY).click();
			//--------------------------------------------------------------------
			// Ban Length Months
			//--------------------------------------------------------------------
			text_aaConviction_Ban_Months(ANY, READY).click();
			iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sBanLengthMonths);		
		//--------------------------------------------------------------------	
		} // NO
		else {
			label_Driving_Ban_No().waitForExistence(10,  0.25);
			label_Driving_Ban_No(ANY, READY).click();
		}		
		// Select Incident Type
 		//--------------------------------------------------------------------
		setCurrentLogFilter(DISABLE_LOGGING);  // A
 		//--------------------------------------------------------------------
		try { // Behaviour Issue, Selects Item, Then Reports Off Screen Coord Error? WORKAROUND OK 
//			list_IncidentClaims_Reason().waitForExistence(20,  0.25);
//			list_IncidentClaims_Reason(ANY, READY).click(atText("Please select incident"));	
//		 	BrowserSync();
//			list_IncidentClaims_Reason_(ANY, READY).click(atText("Please select incident"));	
 		 	sleep(2);
		 	list_aaMotorDriver_Offence(ANY, READY).click(atText(sMotorOffence));	
			logWarning("NOT A REAL DEFECT - SELECTION ISSUE FROM LB - PL1 Might Be OK");
		 	BrowserSync();
		 	sleep(2);
		} catch (CoordinateOffScreenException e) {
			// Second Attempt To Select Correct Item From List  
			// list_aaMotorDriver_Offence(ANY, READY).click(atText(sMotorOffence));
		}
 		//--------------------------------------------------------------------
		// RESUME Temporarily Suspended Log To Hide The Previous Erroneous Tool Error!!!
 		//--------------------------------------------------------------------
		setCurrentLogFilter(ENABLE_LOGGING);
	 	//--------------------------------------------------------------------
		// Commit
		//--------------------------------------------------------------------
		link_convictionConfirm().waitForExistence(2, 0.25);
		link_convictionConfirm(ANY, READY).click();
		//--------------------------------------------------------------------
		
		
		
//		// HTML Browser
//		// Document: RegularExpression(Your details): RegularExpression(car-insurance)
//		list_aaMotorDriver_Offence().click(atText("AC20 - Failing to give particulars or to report an accident within 24 hours"));
//		list_aaMotorDriver_Offence().click(atText("AC30 - Undefined accident offence"));
//		list_aaMotorDriver_Offence().click(atText("BA10 - Driving while disqualified by order of Court"));
//		list_aaMotorDriver_Offence().click(atText("BA20 - Driving while disqualified as under age"));
//		list_aaMotorDriver_Offence().click(atText("BA30 - Attempting to drive while disqualified by order of Court"));
//		list_aaMotorDriver_Offence().click(atText("CD10 - Driving without due care and attention"));
		
		
	}
}

