package Basics_Road;
import resources.Common_Variables;
import resources.Basics_Road.Cover_Details_1Helper;
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
@SuppressWarnings("unused")
public class Cover_Details_1 extends Cover_Details_1Helper
{
	/**
	 * Script Name   : <b>Cover_Details_1</b>
	 * Generated     : <b>27 Jan 2015 10:23:03</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2015/01/27
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{

//		////	// // Test Data
//		(Common_Variables.EBC_tripDuration) = 365;        // Active For Annual Only
// 		(Common_Variables.EBC_tripFutureStartDay) = 8;    //Active for Single OR Annual
//		(Common_Variables.paymentType) = "Annual Direct Debit";
//		(Common_Variables.membership) = false;
//		(Common_Variables.proposerTitle) = "Miss";
//		(Common_Variables.proposerForename) = "Donald";
//		(Common_Variables.proposerLastname) = "Tiatest";
//		(Common_Variables.proposerDOB) ="26111956";
//		(Common_Variables.vehicleReg) = "ABC123";
//		(Common_Variables.membershipYN) = "FALSE";
//		//(Common_Variables.EBC_tripFutureStartDay) = 1; // 0 for today. 1 for tomorrow etc,
//		
//		////	// // Test Data
		String sRegNumber = Common_Variables.vehicleReg;
//		//--------------------------------------------------------------------
//		// Extra Options Now Presented
//		// Change Default, Basic Options - NO We Won't - Full Breakdown Checks These
//		
//		try {
//			button_continuesubmit2().waitForExistence(2, 0.25);
//			button_continuesubmit2(ANY, READY).click();
//		} catch (Exception e) {
//		}
//		//-----------------------
//		
//		try {
//			sleep(0.5);
//			iE(document_ukBreakdownCoverViewA(ANY, READY),DEFAULT_FLAGS).inputChars(sRegNumber);
//			button_updateCoversubmit(ANY, READY).click();
//		} catch (Exception e) {
//		}
//		//-----------------------
//		
//		try {
//			button_continuesubmit2().waitForExistence(2, 0.25);
//			button_continuesubmit2(ANY, READY).click();
//		} catch (Exception e) {
//		}
//						
//		//--------------------------------------------------------------------
//
//		//--------------------------------------------------------------------
//
//		//--------------------------------------------------------------------------------------------------					
//		// Vehicle Number Plate
//		//------------------------------------------------------------------------------------------
		// Enter Registration Number
		try {
			// Synchronisation
			sleep(0.5);
			text_reg(ANY, LOADED).waitForExistence(5.0, 0.25);
			text_reg().setText(Common_Variables.vehicleReg);
			logTestResult("Vehicle Registration Number Was Set To "+Common_Variables.vehicleReg, true);
		} catch (ObjectNotFoundException e) {
		}
//		//------------------------------------------------------------------------------------------
//		
//		
//		//--------------------------------------------------------------------------------------------------					
//		// Cover Start Date
//		//--------------------------------------------------------------------------------------------------
//		// Reuse of EBC Variable
//		(Common_Variables.EBC_Product) = "Annual cover";	// Annual Only
//		//------------------------------------------------------------------------------------------
//		// All Cover Lengths Dealt Within Below
//		callScript("Utilities.Joda_Date_Selection_Variant");
//		//------------------------------------------------------------------------------------------
//		
//		try {
//			if (button_continuesubmit().isShowing()){
//				button_continuesubmit(ANY, READY).click();
//			}
//		} catch (ObjectNotFoundException e) {
//			if (button_continuesubmit2().isShowing()){
//				button_continuesubmit2(ANY, READY).click();
//			}
//		}
//		
//	
//		//--------------------------------------------------------------------------------------------------					
//		// Blue Badge Holder?
//		//----------------------------------------------------------------
//		try {
//			//label_yes().waitForExistence(50.0,  0.25);
//			
//			if (Common_Variables.membershipYN.equalsIgnoreCase("TRUE")){
//				label_yes(ANY, READY).click();
//				logTestResult(" Blue Badge Holder Was Selected",true);
//			}	// Default NO
//			else if  (Common_Variables.membershipYN.equalsIgnoreCase("FALSE")){ 
//				label_no(ANY, READY).click();
//				logTestResult("Blue Badge Holder Was NOT Selected",true);
//			}
//		} catch (ObjectNotFoundException e) {
//
//		}
//		//----------------------------------------------------------------	
					
		BrowserSync();
		
		//--------------------------------------------------------------------------------------------------					
		// Personal Details
		//--------------------------------------------------------------------------------------------------					
		// Title
		//--------------------------------------------------------------------------------------------------					
		//--------------------------------------------------------------------
		// Proposer Title
		switch (Common_Variables.proposerTitle){
		
			case "Mr":
				label_mr(ANY, READY).click();
				break;
				
			case "Mrs":
				label_mrs(ANY, READY).click();
				break;
				
			case "Miss":
				label_miss(ANY, READY).click();
				break;
				
			case "Ms":
				label_ms(ANY, READY).click();
				break;
		}

		logTestResult("Proposer Title Was Set To "+Common_Variables.proposerTitle, true);

		//--------------------------------------------------------------------------------------------------					
		// First Name
		//--------------------------------------------------------------------------------------------------					
		text_firstname().waitForExistence(10.0,  0.25);
		text_firstname(ANY, READY).click();
		iE(document_basicBreakdown(),DEFAULT_FLAGS).inputChars(Common_Variables.proposerForename);
		
		logTestResult("Proposer First Name Was Set To "+Common_Variables.proposerForename, true);
		
		//--------------------------------------------------------------------------------------------------					
		// Last Name
		//--------------------------------------------------------------------------------------------------					
		text_surname().waitForExistence(10.0,  0.25);
		text_surname(ANY, READY).click();
		iE(document_basicBreakdown(),DEFAULT_FLAGS).inputChars(Common_Variables.proposerLastname);
	
		logTestResult("Proposer Last Name Was Set To "+Common_Variables.proposerLastname, true);
		
		//--------------------------------------------------------------------------------------------------					
		// Date of Birth
		//--------------------------------------------------------------------------------------------------
		// DD - Day
		//--------------------------------------------------------------------------------------------------
		String dobDay = Common_Variables.proposerDOB.substring(0, 2);
		html_dateOfBirthDay().waitForExistence(10.0,  0.25);
		html_dateOfBirthDay(ANY, READY).click();
		iE(document_basicBreakdown(),DEFAULT_FLAGS).inputChars(dobDay);		
		
		//--------------------------------------------------------------------------------------------------
		// MM - Month
		//--------------------------------------------------------------------------------------------------
		String dobMonth = Common_Variables.proposerDOB.substring(2, 4);
		html_dateOfBirthMonth().waitForExistence(10.0,  0.25);
		html_dateOfBirthMonth(ANY, READY).click();
		iE(document_basicBreakdown(),DEFAULT_FLAGS).inputChars(dobMonth);
		
		//--------------------------------------------------------------------------------------------------
		// YYYY - Year
		//--------------------------------------------------------------------------------------------------
		String dobYear = Common_Variables.proposerDOB.substring(4);
		html_dateOfBirthYear().waitForExistence(10.0,  0.25);
		html_dateOfBirthYear(ANY, READY).click();
		iE(document_basicBreakdown(),DEFAULT_FLAGS).inputChars(dobYear);

		logTestResult("Proposer Date od Birth Was Set To "+dobDay+"/"+dobMonth+"/"+dobYear+"/", true);
		
		//--------------------------------------------------------------------------------------------------
		// Contact Details
		//--------------------------------------------------------------------------------------------------
		// House Number
		//--------------------------------------------------------------------------------------------------
		text_lineOne().waitForExistence(10.0,  0.25);
		text_lineOne(ANY, READY).click(atPoint(79,21));
		iE(document_basicBreakdown(),DEFAULT_FLAGS).inputChars(Common_Variables.proposer_HouseNumber);
		
		
		//--------------------------------------------------------------------------------------------------
		// Postcode
		//--------------------------------------------------------------------------------------------------
		text_postcode().waitForExistence(10.0,  0.25);
		text_postcode(ANY, READY).click(atPoint(41,28));
		iE(document_basicBreakdown(),DEFAULT_FLAGS).inputChars(Common_Variables.proposer_PostCode);

		
		//--------------------------------------------------------------------------------------------------
		// Find Address
		//--------------------------------------------------------------------------------------------------
		button_findAddress().waitForExistence(25.0,  0.25);
		button_findAddress(ANY, READY).click();

		
		//--------------------------------------------------------------------------------------------------
		// Email
		//--------------------------------------------------------------------------------------------------
		sleep(2);
		text_email().waitForExistence(10.0,  0.25);
		text_email(ANY, READY).click(atPoint(139,17));
		iE(document_basicBreakdown(),DEFAULT_FLAGS).inputChars("test@tiatest.com");

		
		//--------------------------------------------------------------------------------------------------
		// Phone Number
		//--------------------------------------------------------------------------------------------------
		sleep(2);
		html_telephone().waitForExistence(10.0,  0.25);
		html_telephone(ANY, READY).click(atPoint(100,19));
		iE(document_basicBreakdown(),DEFAULT_FLAGS).inputChars("01234567890");

		
		//--------------------------------------------------------------------------------------------------
		// Payment Options
		//--------------------------------------------------------------------------------------------------
		// Card or Direct Debit
		//--------------------------------------------------------------------------------------------------
		switch (Common_Variables.paymentType){
		
		case "Annual Direct Debit":				
			label_annuallyByDirectDebit(ANY, READY).click();
			break;
			//--------------------------------------
		case "Annual Card Payment":
			label_annuallyByCard(ANY, READY).click();
			break;
			//--------------------------------------
		}
		
		 
		//--------------------------------------------------------------------------------------------------
		// Submit
		//--------------------------------------------------------------------------------------------------
		button_continuesubmit(ANY, LOADED).waitForExistence(25.0, 0.25);
		button_continuesubmit(ANY, LOADED).click();

		
	}
}

