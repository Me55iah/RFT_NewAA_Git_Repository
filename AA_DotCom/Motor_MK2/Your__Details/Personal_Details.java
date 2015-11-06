package Motor_MK2.Your__Details;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Details.Personal_DetailsHelper;
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
	 * Generated     : <b>1 Jul 2015 13:48:04</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/01
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		
		// CHILDREN UNDER 16 - CURRENTLY SETS YES WHEN PRESENTED
		
		
// 		//-----------------------------------------------------------------------------------------
// 		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
//		String sTitle = "Mr";
//		String sFirstName = "Reginald";
//		String sLastName = "Bucket";
//		String sDoB = "10/03/1965";
//		String sResidentSinceMonth = "November";
// 		String sResidentSinceYear = "2000";		
//		Boolean bUKBirth = true;
// 		Boolean bMarriedStatus = true;
// 		Boolean bAAMember = false;
// 		//-----------------------------------------------------------------------------------------		
//		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
//		//-----------------------------------------------------------------------------------------
		String sTitle = Common_Variables.proposerTitle;
		String sFirstName = Common_Variables.proposerForename;
		String sLastName = Common_Variables.proposerLastname;
		String sDoB = Common_Variables.proposerDOB;
		String sResidentSinceMonth = Common_Variables.proposerUKResidentSinceMonth;
		String sResidentSinceYear = Common_Variables.proposerUKResidentSinceYear;
		Boolean bUKBirth = Common_Variables.proposerUKBorn;
		String sMarriedStatus = Common_Variables.maritalStatus;
		Boolean bAAMember = Common_Variables.membership;	
		//---------------------------------------------------------------
		// DOB Changes 21/10/2015 - 1 field to 3 fields
		String DOB_Day = Common_Variables.proposerDOB.substring(0, 2);
		String DOB_Month = Common_Variables.proposerDOB.substring(3, 5);
		String DOB_Year = Common_Variables.proposerDOB.substring(6, 10);
		//-----------------------------------------------------------------------------------------
		// Synchronise
		label_title().waitForExistence(20,  0.25);
		//--------------------------------------------------------------------
		System.out.println(" Proposer "+sTitle+" "+sFirstName+" "+sLastName);
		System.out.println(" Date of Birth "+sDoB);
//		//--------------------------------------------------------------------
//		// Sometime Previous Page Navigation FAILS? - So Double Check, and Click Continue if incorrect page is visible
//		try {
//			if (button_continuesubmit().exists()){
//				button_continuesubmit(ANY, READY).click();
//			}
//		} catch (ObjectNotFoundException e) {
//			
//		}
//		//--------------------------------------------------------------------
		// Title
		//--------------------------------------------------------------------
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
		//--------------------------------------------------------------------
		text_aaMotorDrivers0FirstName().waitForExistence(20,  0.25);
		text_aaMotorDrivers0FirstName(ANY, READY).click(atPoint(45,35));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sFirstName);
		//--------------------------------------------------------------------
		// Last Name
		//--------------------------------------------------------------------
		text_aaMotorDrivers0LastName(ANY, READY).click(atPoint(33,41));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sLastName);
		//--------------------------------------------------------------------
		// Date of Birth
		//--------------------------------------------------------------------
		//text_dateOfBirth(ANY, READY).click(atPoint(211,33));  // Changed 21/10/15
		//iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sDoB);
		
		
		//--------------------------------------------------------------------
		// DOB Entry Change 21/10/15
		// Day
		html_aa_motor_drivers_0__dobDa(ANY, READY).click();
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(DOB_Day);
		// Month
		html_aa_motor_drivers_0__dobMo(ANY, READY).click();
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(DOB_Month);
		// Year
		html_aa_motor_drivers_0__dobYe(ANY, READY).click();
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(DOB_Year);
		//--------------------------------------------------------------------
		
		
		//--------------------------------------------------------------------
		// Bring HMI Components into View
		callScript("Utilities.pageDown");
		//--------------------------------------------------------------------
		// Children Under 16? - Presented Depending On Previous Logic
		if (label_doYouHaveAnyChildrenUnde().isShowing()){
			label_yes().waitForExistence(5,  0.25);
			label_yes(ANY, READY).click();
		//	label_no().click();
		}
		//--------------------------------------------------------------------
		// UK From Birth
		//--------------------------------------------------------------------
		if (bUKBirth == true){
			label_fromBirth().waitForExistence(20,  0.25);
			label_fromBirth(ANY, READY).click();
			sleep(0.5);
		}
		// If Not, Date of Arrival MM/YYYY - UK Resident Since?
		else {
			//---------------------------------------------------------------
			// Arrival Month
			//--------------------------------------------------------------------
			list_aaMotorDriverResidentMonth().waitForExistence(20,  0.25);
			list_aaMotorDriverResidentMonth(ANY, READY).click();
			list_aaMotorDriverResidentMonth(ANY, READY).click(atText(sResidentSinceMonth));
			//---------------------------------------------------------------
			// Arrival Year
			//--------------------------------------------------------------------
			list_aaMotorDriversResidentYear().waitForExistence(20,  0.25);
			list_aaMotorDriversResidentYear(ANY, READY).click();
			list_aaMotorDriversResidentYear(ANY, READY).click(atText(sResidentSinceYear));
			sleep(0.5);
			//---------------------------------------------------------------
		}			
		//--------------------------------------------------------------------
		// Marital Status 
		//--------------------------------------------------------------------
		if (sMarriedStatus.equals("Married")){
			label_marriedCivilPartnerWidow().waitForExistence(20,  0.25);
			label_marriedCivilPartnerWidow(ANY, READY).click();
		}
		// Single
		else {
			label_singleLivingWithPartner().waitForExistence(20,  0.25);
			label_singleLivingWithPartner(ANY, READY).click();
		}
		//--------------------------------------------------------------------
		// AA Member?     bAAMember
		//--------------------------------------------------------------------
		if (bAAMember == true){
			label_AAMember_yes().waitForExistence(20,  0.25);
			label_AAMember_yes(ANY, READY).click();
			// DETAILS OF AA MEMBERSHIP HERE
			// TODO
			// DETAILS OF AA MEMBERSHIP HERE
		}
		//--------------------------------------------------------------------
		// If Not Member
		//--------------------------------------------------------------------
		else {
			label_AAMember_no().waitForExistence(20,  0.25);
			label_AAMember_no(ANY, READY).click();
		//--------------------------------------------------------------------
		}
	}
}

