package BreakDown_Cover_MK2;
import resources.Common_Variables;
import resources.BreakDown_Cover_MK2.Personal_DetailsHelper;
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
public class Personal_Details extends Personal_DetailsHelper
{
	/**
	 * Script Name   : <b>Personal_Details</b>
	 * Generated     : <b>5 Jun 2015 12:27:37</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/05
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
//		//-----------------------------------------------------------------------------------------
//		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
//		String sTitle = "Mr";
//		String sFirstName = "Reginald";
//		String sLastName = "Bucket";
//		String sDoB = "10/03/1965";
//		String sResidentSinceMonth = "November";
// 		String sResidentSinceYear = "2000";
//		String sLicenceQualificationMonth = "January";
// 		String sLicenceQualificationYear = "1998";
//		String sAddressLine1 = "12 Queens Road";
//		String sAddressLine2 = "";
//		String sAddressTown = "Gosport";
//		String sAddressCounty = "Hampshire";
//		String sPostcode = "PO121LQ";
//		String sPhoneNumber = "02393111330";
//		String sMobilePhone = "07788461994";
//		String sEmail = "theeaatester@theaa.com";
//		String sEmploymentStatus = "Employed";
//		String sEmploymentRole = "Accountant";
//		String sEmploymentType = "Accountancy";	
//		String sDrivingLicenceType = "Provisional";
//		String sPreviousInsurer = "Abbey";
//		String sInsCoverType = "FullyComp";
//		//String sCoverEndDate = "01/06/2016";
//		String sCoverStartDate = "02/06/2015";
//		String sOldCoverExpiryDate = "01/06/2015";
//		String sMotorInsRenewalDate = "July"; // Month Only
//		String sNoClaimsBonus = "5";
//		String sPaymentOptions = "Annual Card";
//		
//		String sBreakDownCover = "Two People";
//		String sMotorInsRenewalMonth = "July";
//		//Boolean bRegNumberKnown = false;
//		//Boolean bExactModel = true;
//		Boolean bUKBirth = true;
//		Boolean bMarriedStatus = true;
//		Boolean bAAMember = false;
//		Boolean bUKDrivingLicence = true;
//		Boolean bClaims = false;
//		Boolean bConvictions = false;
//		Boolean bAddDriver = false;
//		Boolean bCouncilBadge = false;
//		Boolean bRequireEBCCover = false;
////		Common_Variables.fuelType = "Petrol";
////		Common_Variables.transMissionType = "Manual";
////		Common_Variables.regNumberKnown = false;
		
		//-----------------------------------------------------------------------------------------
		// Working Data
		String sTitle = Common_Variables.proposerTitle;
		String sFirstName = Common_Variables.proposerForename;
		String sLastName = Common_Variables.proposerLastname;
		String sDoB = Common_Variables.proposerDOB;
		boolean bCouncilBadge = Common_Variables.CouncilBadge;
		String sAddressLine1 = Common_Variables.proposer_HouseNumber;
		String sAddressLine2 = Common_Variables.proposer_Address_Line2;
		String sAddressTown = Common_Variables.proposer_Address_Town;		
		String sAddressCounty = Common_Variables.proposer_Address_County;		
		String sPostcode = Common_Variables.proposer_PostCode;
		String sPhoneNumber = Common_Variables.proposer_PhoneNumber;
		String sMobilePhone = Common_Variables.proposer_MobileNumber;	
		String sEmail = Common_Variables.proposer_Email;
		String sMotorInsRenewalMonth = Common_Variables.motorRenewalMonth;
		boolean bRequireEBCCover = Common_Variables.EBCRequired;
		String sPaymentOptions = Common_Variables.paymentType;
		String sBreakDownCover = Common_Variables.personsCovered;
		String sRegistration = Common_Variables.vehicleReg;
		// Working Data
		//-----------------------------------------------------------------------------------------
		//Verification
		String svTitle = "Your_Details_Data";
		String sReport = "Your Details Data Entry Was Successful";
		String sExpected = "Your cover includes";
		String sActual = "";		
		//--------------------------------------------------------------------
//		// Synchronise
//		try {
//			//label_ms().waitForExistence(2,  0.25);
//			sleep(2);
//			label_ms(ANY, READY).click();
//			} catch (AmbiguousRecognitionException e1) {
//				// Sometime Previous Page Navigation FAILS? - So Double Check, and Click Continue if incorrect page is visible
//				try {
//					if (button_continuesubmit2().exists()){
//						button_continuesubmit2(ANY, READY).click();
//					}
//					if (button_continuesubmit().exists()){
//						button_continuesubmit(ANY, READY).click();
//					}
//				
//				} catch (ObjectNotFoundException e) {
//			}	
//		}	
		
//		
//		if (!label_ms().exists()){
//			if (button_continuesubmit().exists()){
//				button_continuesubmit(ANY, READY).click();
//				sleep(1);
//			}
//		}	
//		if (!label_ms().exists()){		
//			if (button_continuesubmit2().exists()){
//				button_continuesubmit2(ANY, READY).click();
//				sleep(1);				
//			}
//
//		}
//		
//		BrowserSync();
		//--------------------------------------------------------------------
		// Title
		switch (sTitle){
		//--------------------------------------------------------------------
			case "Mr":
				label_mr(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Mrs":
				label_mrs(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Miss":
				label_miss(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Ms":
				label_ms(ANY, READY).click();
				break;								
		}
		//--------------------------------------------------------------------
		// First Name
		text_policyHolderFirstname().waitForExistence(20,  0.25);
		text_policyHolderFirstname(ANY, READY).doubleClick(atPoint(45,35));
		iE(breakdownCover(),DEFAULT_FLAGS).inputChars(sFirstName);
 		//--------------------------------------------------------------------
		BrowserSync();
 		//--------------------------------------------------------------------
		// Last Name
		text_policyHolderSurname().waitForExistence(20,  0.25);
		text_policyHolderSurname(ANY, READY).doubleClick(atPoint(33,41));
		iE(breakdownCover(),DEFAULT_FLAGS).inputChars(sLastName);
 		//--------------------------------------------------------------------
		BrowserSync();
 		//--------------------------------------------------------------------
		// Date of Birth           ("23/02/12")
		text_policyHolderDobDate().waitForExistence(20,  0.25);
		text_policyHolderDobDate(ANY, READY).doubleClick(atPoint(211,33));
		iE(breakdownCover(),DEFAULT_FLAGS).inputChars(sDoB);
		//--------------------------------------------------------------------
		// Council Issued Badge?  // Default NO BADGE - false
 		if (bCouncilBadge == true){
 			label_iHaveABlueBadgeIssuedByM().waitForExistence(20,  0.25);
			label_iHaveABlueBadgeIssuedByM(ANY, READY).click();
 		}
		//--------------------------------------------------------------------
 		// Address Line 1
 		text_addressAddressLine1().waitForExistence(20,  0.25);
 		text_addressAddressLine1(ANY, READY).doubleClick(atPoint(68,40));
 		iE(breakdownCover(),DEFAULT_FLAGS).inputChars(sAddressLine1);
		//--------------------------------------------------------------------
 		// PostCode 
 		text_addressPostcode().waitForExistence(20,  0.25);
 		text_addressPostcode(ANY, READY).doubleClick(atPoint(68,40));
 		iE(breakdownCover(),DEFAULT_FLAGS).inputChars(sPostcode);
		//--------------------------------------------------------------------
 		//
 		// Find Address
 		if (button_findYourFullAddressbutt().isShowing()){
 			button_findYourFullAddressbutt().waitForExistence(20,  0.25);
 			button_findYourFullAddressbutt(ANY, READY).click(atPoint(68,40));
 	 		//--------------------------------------------------------------------
 			BrowserSync();
 	 		//--------------------------------------------------------------------
// 			// Selects The Highlighted Address If Selection Dialog Is Presented
// 			try {
//				if (html_addressOverlay().isShowing()){
//					//String sAddressOverlay_Text = (String)html_addressOverlay().getProperty(".text");
//					// Ensure Address Selector Is Visible
//					try {
//						
//						//if (sAddressOverlay_Text.contains("Select the address from the list below")){
//						//	html_addressSelectConfirm().waitForExistence(20,  0.25);
//							sleep(0.5);
//							html_addressSelectConfirm(ANY, READY).click();
//							sleep(1);
//							button_continuesubmit2().waitForExistence(25,  0.25);
//							
//						//}
//					
//					} catch (Exception e) {
//						// List Didn't Appear, Just Carry On
//						//e.printStackTrace();
//					}				
//				}
//			} catch (Exception e) {
//				// List Didn't Appear, Just Carry On
//				//e.printStackTrace();
//			}	 	
	 		//--------------------------------------------------------------------
			// Temporarily Suspend Log To Hide The Following Erroneous Tool Error!!!
	 		//--------------------------------------------------------------------
			setCurrentLogFilter(DISABLE_LOGGING);  // A
	 		//--------------------------------------------------------------------
			try {
 				sleep(0.5);
 				html_addressSelectConfirm(ANY, READY).click();
 				// button_continuesubmit2().waitForExistence(25,  0.25);
			} catch (Exception e) {
				//
				//e.printStackTrace(); // Don't Need This Info, We Know Already
			}
	 		//--------------------------------------------------------------------
			// RESUME Temporarily Suspended Log To Hide The Previous Erroneous Tool Error!!!
	 		//--------------------------------------------------------------------
 			setCurrentLogFilter(ENABLE_LOGGING);
 	 		//--------------------------------------------------------------------
 			BrowserSync();
 	 		//--------------------------------------------------------------------	 		
 		}
 		else {
 			//--------------------------------------------------------------------
 			// Address Line 2
 	 		text_addressAddressLine2().waitForExistence(20,  0.25);
 	 		text_addressAddressLine2(ANY, READY).doubleClick(atPoint(68,40));
 	 		iE(breakdownCover(),DEFAULT_FLAGS).inputChars(sAddressLine2);
 			//--------------------------------------------------------------------
 	 		// Address Line 3 - Town
 	 		text_addressTown().waitForExistence(20,  0.25);
 	 		text_addressTown(ANY, READY).doubleClick(atPoint(68,40));
 	 		iE(breakdownCover(),DEFAULT_FLAGS).inputChars(sAddressTown);
 			//--------------------------------------------------------------------
 	 		// Address Line 4 - County
 	 		text_addressCounty().waitForExistence(20,  0.25);
 	 		text_addressCounty(ANY, READY).doubleClick(atPoint(68,40));
 	 		iE(breakdownCover(),DEFAULT_FLAGS).inputChars(sAddressCounty);
			//--------------------------------------------------------------------
  		}
 		//--------------------------------------------------------------------
		BrowserSync();
 		//--------------------------------------------------------------------
 		// Phone
 		text_phoneNumber().waitForExistence(20,  0.25);
 		text_phoneNumber(ANY, READY).doubleClick(atPoint(122,52));
 		iE(breakdownCover(),DEFAULT_FLAGS).inputChars(sPhoneNumber);
		//--------------------------------------------------------------------
 		// Mobile Phone
 		text_mobileNumber().waitForExistence(20,  0.25);
 		text_mobileNumber(ANY, READY).doubleClick(atPoint(122,52));
 		iE(breakdownCover(),DEFAULT_FLAGS).inputChars(sMobilePhone);
		//--------------------------------------------------------------------
 		// Email
 		text_emailAddress().waitForExistence(20,  0.25);
 		text_emailAddress(ANY, READY).doubleClick(atPoint(122,52));
 		iE(breakdownCover(),DEFAULT_FLAGS).inputChars(sEmail);
		//--------------------------------------------------------------------
		// Number Plate  // Read Only - Parsed From Previous Screen
 		
		//--------------------------------------------------------------------
 		// Motor Insurance Renewal Month
 		list_motorInsRenewalMonth().waitForExistence(20,  0.25);
 		list_motorInsRenewalMonth(ANY, READY).doubleClick(atPoint(122,52));
 		iE(breakdownCover(),DEFAULT_FLAGS).inputChars(sMotorInsRenewalMonth);
		//--------------------------------------------------------------------
		// Contact About EBC Cover?
 		if (bRequireEBCCover == true){
 			label_EBC_Cover_Required().waitForExistence(20,  0.25);
 			label_EBC_Cover_Required(ANY, READY).click();
 		}
		//--------------------------------------------------------------------
 		// Payment Options
		//--------------------------------------------------------------------
		// Title
		switch (sPaymentOptions){
		//--------------------------------------------------------------------
			case "Annual Bank Account":
				label_fromABankAccountAnnually(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Annual Card":
				label_byCardAnnually(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Monthly":
				label_monthlyPayments(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
		}
		//--------------------------------------------------------------------	
		// Add Second Person Branch
		if (sBreakDownCover.equalsIgnoreCase("Two People")){
			// Second Person
			//--------------------------------------------------------------------
			callScript("BreakDown_Cover_MK2.Variations.Add_Second_Person");
			//--------------------------------------------------------------------
		}
		//--------------------------------------------------------------------	
		// Add Family Branch
		if (sBreakDownCover.equalsIgnoreCase("Family")){
			callScript("BreakDown_Cover_MK2.Variations.Add_Family");
		}
		//--------------------------------------------------------------------	
		// Add Vehicle Branch
		if (sBreakDownCover.equalsIgnoreCase("Vehicle")){
			//stop();
			
		}
		//--------------------------------------------------------------------		
//		// Re-Enter Reg Dialogue and Refresh Quote - When Required
//		try {
//			sleep(0.5);
//			text_vehReg(ANY, READY).click(atPoint(74,35));			
//			sleep(0.5);
//			iE(breakdownCover(),DEFAULT_FLAGS).inputChars(sRegistration);
//			button_updateYourQuotesubmit(ANY, READY).click();
//			sleep(0.5);
//			button_updateYourQuotesubmit(ANY, READY).click();
//			
//		} catch (Exception e) {
//			//
//			e.printStackTrace();
//		}
		 
		// Quote Details
		callScript("BreakDown_Cover_MK2.Your_Quote");
		//--------------------------------------------------------------------		
		// MAF Verification
		// Main Textual Content of MAF Confirmed
		callScript("Verification.MAF_Road_Textual");		
		//--------------------------------------------------------------------		
		// Submit
		button_continuesubmit().waitForExistence(20,  0.25);
		button_continuesubmit(ANY, READY).click(atPoint(122,52)); 		
 		//--------------------------------------------------------------------
		BrowserSync();
 		//--------------------------------------------------------------------
		// NO REGISTRATION DIALOG DISPLAYED
		//--------------------------------------------------------------------	
		svTitle = "The_SPECIAL_OFFER_Details_Screen";
		sReport = "The SPECIAL OFFER Details Screen Appeared As Expected";
		sExpected = "Special offer";

		// Scrape Following Screen (YOUR DETAILS) for ACTUAL Value to Compare
		sActual = (String)form_sorconline_form().getProperty(".text");
		if (sActual.contains("Special offer: free Home Emergency Response")){
			sActual = "Special offer";
		//--------------------------------------------------------------------	
		}
		// INCONSISTENT, AND ONLT TELLS US THE NEXT SCREEN APPEARED
		// Verify Appearance of Following Screen (NO VALIDATION ERRORS)
 		// VerifyandReport(svTitle, sExpected, sActual, sReport);
		//--------------------------------------------------------------------	
	}
}

