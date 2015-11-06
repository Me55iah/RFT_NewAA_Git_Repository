package Motor;

import resources.Common_Variables;
import resources.Motor.Your_DetailsHelper;
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
 * Description : Functional Test Script // text_Proposer_Postcode
 * 
 * @author courtl
 */
@SuppressWarnings("unused")
public class Your_Details extends Your_DetailsHelper {
	/**
	 * Script Name : <b>Your_Details</b> Generated : <b>11 Mar 2013 10:47:53</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/03/11
	 * @author courtl                    text_aaMotorDrivers0Occupation
	 */
	public void testMain(Object[] args) {

		
//		// Test Data
//		// debug ---------------------------------------------
//		//Common_Variables.paymentType = ("Single Payment");
//		//Common_Variables.paymentType = ("AA Instalment Account (TIA)");
//		Common_Variables.proposerTitle = "Mrs";
//		Common_Variables.proposerForename = "Claire";
//		Common_Variables.proposerLastname = "Sholtz";
//		Common_Variables.proposerDOB = "21071967";
//		Common_Variables.maritalStatus = "Married";
//		Common_Variables.proposer_HouseNumber = "28";
//		Common_Variables.proposer_PostCode = "RG24 8GB";
//		Common_Variables.homeTelNo = "01234567890";
//		Common_Variables.proposerOccupation = "IT Consultant";
//		Common_Variables.proposerBusiness = "Information Technology";
//		Common_Variables.dateTestPassed = "1990";
//		Common_Variables.insuredClaims = false;
//		Common_Variables.insuredConvictions = true;
//		Common_Variables.NCB = "1";
//		Common_Variables.coverType = "Comprehensive";
//		Common_Variables.personsCovered = "IOD"; // IAS
//		Common_Variables.todaysDate = CurrDate(0);
//		// debug ---------------------------------------------

		
		
		
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------
		
		// Set Proposers Title
		if (Common_Variables.proposerTitle.equals("Mr")) {
			radioButton_Proposer_Title_Mr().setState(SELECTED);
		}

		if (Common_Variables.proposerTitle.equals("Mrs")) {
			radioButton_Proposer_Title_Mrs().setState(SELECTED);
		}

		if (Common_Variables.proposerTitle.equals("Miss")) {
			radioButton_Proposer_Title_Miss().setState(SELECTED);
		}

		if (Common_Variables.proposerTitle.equals("Ms")) {
			radioButton_Proposer_Title_Ms().setState(SELECTED);
		}

		// Set Proposer First and Last Name
		text_Proposer_FirstName(ANY, READY).click(atPoint(3, 13));
		iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
				.inputChars(Common_Variables.proposerForename);
		text_Proposer_LastName(ANY, READY).click(atPoint(40, 10));
		iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
				.inputChars(Common_Variables.proposerLastname);

		// Set Proposer DOB
		text_dateOfBirth(ANY, READY).click(atPoint(7, 13));
		iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
				.inputChars(Common_Variables.proposerDOB);

		iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
				.inputKeys("{TAB}");

		//sleep(2.0);
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

		// Gonna have to work out how old the Proposer is to see if they will
		// get the U30's question

		String YOB = Common_Variables.proposerDOB.substring(4);
		int iYOB = Integer.parseInt(YOB);

		String currentYear = Common_Variables.todaysDate.substring(6);
		int iCurrentYear = Integer.parseInt(currentYear);

		int proposerAge = iCurrentYear - iYOB;

		if (proposerAge < 30) {

			boolean under16Children = label_doYouHaveAnyChildrenUnde().exists();

			if (under16Children == true) {

				radioButton_aaMotorDriver_Under_16_No().setState(SELECTED);

			}
		}

		// How long UK resident
		checkBox_aaMotorDrivers0UkResi(ANY, READY).click();

		sleep(0.1);

		// Set Marital Status

		if (Common_Variables.maritalStatus.equals("Single")) {

			radioButton_aaMotorDrivers0Mar2().setState(SELECTED);

		} else {
			radioButton_aaMotorDrivers0Mar().setState(SELECTED);
		}

		// Set Proposer Address
		text_Proposer_House_Number(ANY, READY).click(atPoint(5, 13));
		sleep(0.1);
		iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
				.inputChars(Common_Variables.proposer_HouseNumber);
		sleep(0.1);
		text_PostCode(ANY, READY).click(atPoint(21, 6)); // text_Proposer_Postcode
		sleep(0.1);
		iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
				.inputChars(Common_Variables.proposer_PostCode);
		sleep(0.1);

		link_findYourAddress2().waitForExistence(20, 0.25);
		link_findYourAddress2(ANY, READY).click();

		//sleep(3.0);
		// Add Detail To Console Output For Quote Retrieval Information
		System.out.println("---------------------- Quote Retrieval Details ------------------------");
		System.out.println("First Name = <"+Common_Variables.proposerForename+"> Last Name = <"+Common_Variables.proposerLastname+"> ");
		System.out.println("Date of Birth = <"+Common_Variables.proposerDOB+"> Post Code = <"+Common_Variables.proposer_PostCode+"> ");

		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

		label_addressLine1().waitForExistence(20, 0.25);

		// Proposer Phone Number
		// text_aaTelephoneNumber(ANY, READY).click(atPoint(6, 13));
		if (!Common_Variables.homeTelNo.equals("")) {
			iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
					.inputChars(Common_Variables.homeTelNo);
		} else {
			iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
					.inputChars("01234567890");
		}

		//--------------------------------------------------------------------
		// synchronise
		html_aaMobileNumber().waitForExistence(25.0,  0.25);
		//-------------------------------------------------------------------
		
		// Proposer Mobile Number
		html_aaMobileNumber(ANY, READY).click(atPoint(5, 12));
		iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
				.inputChars("07700900123");

		// Proposer Email Address
		text_aaMotorDriversEmail().waitForExistence(10,  0.25);
		text_aaMotorDriversEmail(ANY, READY).click(atPoint(5, 9));
		iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
				.inputChars("tia@tiatest.com");

		iE(document_carInsuranceYourDetai2(), DEFAULT_FLAGS)
				.inputKeys("{TAB}");

		iE(document_carInsuranceYourDetai2(), DEFAULT_FLAGS)
				.inputKeys("{ExtPgDn}");

		text_aaMotorDrivers0Occupation2().waitForExistence(10,  0.25);
		text_aaMotorDrivers0Occupation2(ANY, READY).click(atPoint(7, 12));
		
		sleep(1.0);
		
		iE(document_carInsuranceYourDetai2(), DEFAULT_FLAGS)
				.inputChars(Common_Variables.proposerOccupation);
		
		sleep(1.0);
		
		//--------------------------------------------------------------------
		// synchronise
		text_aaMotorDrivers0Fulltimebu().waitForExistence(25.0,  0.25);
		//-------------------------------------------------------------------

				
		if (Common_Variables.proposerOccupation.contains("-")) {
			html_mainOccupation_suggest_it(ANY, READY).click(atPoint(131, 10));
		} else {
			iE(document_carInsuranceYourDetai2(), DEFAULT_FLAGS)
			.inputKeys("{TAB}");
		}

		text_aaMotorDrivers0Fulltimebu(ANY, READY).click(atPoint(5, 14));
		iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
				.inputChars(Common_Variables.proposerBusiness);
		iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
				.inputKeys("{TAB}");
		sleep(1.0);

		iE(document_carInsuranceYourDetai2(), DEFAULT_FLAGS)
				.inputKeys("{ExtPgDn}");

		radioButton_aaMotorDrivers0Non().setState(SELECTED);

		// Proposer Driving License
		list_aaMotorDrivers0LicenceHel(ANY, READY).click();
		sleep(0.1);
		list_aaMotorDrivers0LicenceHel(ANY, READY).click(
				atText(Common_Variables.dateTestPassed));
		
		//sleep(1.1);
		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

		// Proposers Previous Claims
		if (Common_Variables.insuredClaims == true) {
			radioButton_aaMotorDrivers0Has2(ANY, READY).click();
		}
		if (Common_Variables.insuredClaims == false) {
			radioButton_aaMotorDrivers0Has(ANY, READY).click();
		}

		sleep(0.5);

		// Add proposers previous claims
		if (Common_Variables.insuredClaims == true) {

			int index = 0;
			while (index < Common_Variables.insuredNumPrevClaims) {
				Common_Variables.prevClaimNumber = index+1;
				callScript("Motor.Proposer_Previous_Claims");
				index++;
			}
		}

		// Proposers Convictions
		if (Common_Variables.insuredConvictions == true) {
			radioButton_aaMotorDrivers0Has3(ANY, READY).click();
		}
		if (Common_Variables.insuredConvictions == false) {
			radioButton_aaMotorDrivers0Has4(ANY, READY).click();
		}

		// Add Proposer Previous Convictions
		if (Common_Variables.insuredConvictions == true) {
			callScript("Motor.Proposer_Previous_Convictions");

		}

		// Previous Insurance
		list_aaMotorPreviousPolicyInsu(ANY, READY).click();
		iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
				.inputKeys("{ExtDown 2}{ENTER}");
		sleep(0.5);
		
		//--------------------------------------------------------------------
		// synchronise
		text_aaMotorPreviousPolicyExpi().waitForExistence(25.0,  0.25);
		//--------------------------------------------------------------------
		text_aaMotorPreviousPolicyExpi3().click(atPoint(143,12));
		
		iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
				.inputChars(Common_Variables.todaysDate);
		iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
				.inputKeys("{ENTER}");
		sleep(0.5);

		int iNCB = Integer.parseInt(Common_Variables.NCB);
		int index = 0;
		list_aaMotorPreviousPolicyNcd(ANY, READY).click();

		
		
		iNCB = iNCB + 1;

		while (index < iNCB) {
			iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
					.inputKeys("{ExtDown}");
			index++;
		}

		iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
				.inputKeys("{ENTER}");

		sleep(0.5);

		//--------------------------------------------------------------------
		// synchronise
		text_aaMotorCoverStart().waitForExistence(25.0,  0.25);
		//--------------------------------------------------------------------
		
		text_aaMotorCoverStart(ANY, READY).click(atPoint(12, 13));
		iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
				.inputChars(Common_Variables.todaysDate);
		iE(document_carInsuranceYourDetai(), DEFAULT_FLAGS)
				.inputKeys("{ENTER}");
		sleep(0.5);

		// Cover Type
		if (Common_Variables.coverType.equals("Comprehensive")) {
			radioButton_Cover_Comp().setState(SELECTED);
		}
		if (Common_Variables.coverType.equals("Third Party Fire and Theft")) {
			radioButton_Cover_TPFT().setState(SELECTED);
		}
		if (Common_Variables.coverType.equals("Third Party Only")) {
			radioButton_Cover_TPO().setState(SELECTED);
		}

		// Additional Drivers
		if (!Common_Variables.personsCovered.equals("IOD")) {

			callScript("Motor.Add_Additional_Driver");

		}

		boolean next = button_nextsubmit2().ensureObjectIsVisible();

		while (next == false) {
			sleep(2.5);
			next = button_nextsubmit2().ensureObjectIsVisible();
		}

		//--------------------------------------------------------------------
		// synchronise
		BrowserSync();
		button_nextsubmit2().waitForExistence(50.0,  0.25);
		//--------------------------------------------------------------------
		// Request the Quote
		button_nextsubmit2(ANY, READY).click();

		//------------------------------------------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------------------------------------------

		unregisterAll();

		// Detect Number of Street Picker (sometimes appears although all address detail were entered
		
		if (radioButton_selectedaddresS27().exists()){		
			
			//radioButton_selectedaddresS27().waitForExistence(0.25,  10);
			radioButton_selectedaddresS27(ANY, READY).click();			
			
			// Pagedown
			//(document_carInsuranceSelectYou(ANY, READY),DEFAULT_FLAGS).click(atPoint(980,16));
			iE(document_carInsuranceSelectYou(ANY, READY),DEFAULT_FLAGS).inputKeys("{ExtPgDn}");
						
			nextsubmit_Address_Lookup().waitForExistence(0.25,  10);
			nextsubmit_Address_Lookup(ANY, READY).doubleClick();
			
			// and next page too
		
			button_nextsubmit2().waitForExistence(0.25,  10);
			button_nextsubmit2(ANY, READY).doubleClick();
		}
		
	}
}
