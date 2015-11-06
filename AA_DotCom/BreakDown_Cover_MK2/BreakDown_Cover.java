package BreakDown_Cover_MK2;
import resources.Common_Variables;
import resources.BreakDown_Cover_MK2.BreakDown_CoverHelper;
import Utilities.pageDown;

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
public class BreakDown_Cover extends BreakDown_CoverHelper
{
	/**
	 * Script Name   : <b>BreakDown_Cover</b>
	 * Generated     : <b>5 Jun 2015 12:18:55</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/05
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//-----------------------------------------------------------------------------------------
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
//		String sRegNumber = "NKD305M";
//		String sRegYear = "1970";
//		String sVehicleMake = "FORD";
//		String sVehicleModel = "CORTINA";
//		String sVehicleValue = "20000";
// 		String sFuelType = "Petrol";
//		String sTransmissionType = "Manual";
//		String sNumberSeats = "4";
		
//		String sBreakDownCover = "Vehicle";  // Cover for you // Cover for two // Family cover // Vehicle cover
//		String sBreakDownCoverOptions = "Relay";	
//		String sPaymentPeriod = "1Year";
		
		// Vehicle cover, Cover for you,  OK  . Cover for two NOT OK
		
		
//		Boolean bRegNumberKnown = false;
//		Boolean bExactModel = true;
//		Boolean bRHDrive = true;
//		Boolean bVehicleModified = true;
//		Boolean bHaveCarAlready = true;
//		Boolean bKeptHomeAddress = true;
//		Boolean bAnotherVehicle = false; // More than 1 vehicle owned by this person
//		Boolean bCaravanOwner = false;
		
//		String sVehicleMod = "Bull Bars";  // Rear Roof Spoiler // Alloy Wheels
//		String sSecurityDevice = "Additional Device";  // Security Device Fitted?
//		String sSecurityDeviceModel = "AA Protector Car Immobiliser";
//		String sSecurityDeviceFitter = "Unknown";
		
//		String sMileage = "15000";
//		String sPurchaseMonth = "January";
//		String sPurchaseYear = "2013";
//		String sVehicleOwner = "Policyholder";
//		String sRegisteredKeeper = "Policyholder";
//		String sVehicleUsage = "Social, Domestic, Pleasure & Commuting (No Business Use)";
//		String sVehicleStorage = "Locked Garage";
//		String sGaragePostCode = "PO122HE";  // NOT KEPT AT REGISTERED ADDRESS OVERNIGHT DECISION
//		Common_Variables.fuelType = "Petrol";
//		Common_Variables.transMissionType = "Manual";
//		Common_Variables.regNumberKnown = false;
		
		
		
		//-----------------------------------------------------------------------------------------
		// Working Data
		String sBreakDownCover = Common_Variables.personsCovered;
		// String sBreakDownCoverOptions = Common_Variables.coverType;  // Boolean Method Used
		String sPaymentPeriod = Common_Variables.paymentType;
		String sRegNumber = Common_Variables.vehicleReg;
		Boolean bUpgrades_Relay = Common_Variables.upgrades_Relay; // National Recovery
		Boolean bUpgrades_HomeStart = Common_Variables.upgrades_AtHome;
		Boolean bUpgrades_OnwardTravel = Common_Variables.upgrades_OnwardTravel;
		Boolean bUpgrades_PartsGarage = Common_Variables.upgrades_PartsGarage;
		
		
//		String sTitle = Common_Variables.proposerTitle;
//		String sFirstName = Common_Variables.proposerForename;
//		String sLastName = Common_Variables.proposerLastname;
//		String sDoB = Common_Variables.proposerDOB;
//		boolean bCouncilBadge = Common_Variables.CouncilBadge;
//		String sAddressLine1 = Common_Variables.proposer_HouseNumber;
//		String sAddressLine2 = Common_Variables.proposer_Address_Line2;
//		String sAddressTown = Common_Variables.proposer_Address_Town;		
//		String sAddressCounty = Common_Variables.proposer_Address_County;		
//		String sPostcode = Common_Variables.proposer_PostCode;
//		String sPhoneNumber = Common_Variables.proposer_PhoneNumber;
//		String sMobilePhone = Common_Variables.proposer_MobileNumber;	
//		String sEmail = Common_Variables.proposer_Email;
//		String sMotorInsRenewalDate = Common_Variables.policyRenewalDate;
//		boolean bRequireEBCCover = Common_Variables.EBCRequired;
//		String sPaymentOptions = Common_Variables.paymentType;
		// Working Data
		//-----------------------------------------------------------------------------------------

		
		//Verification For VEHICLE COVER BRANCH - Everything Else Branch Below
				
		String sVerTitle = "The_CAR_Details_Screen";
		String sReport = "The CAR Details Screen Appeared As Expected";
		String sExpected = "Vehicle";
		String sActual = "";
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
		//-----------------------------------------------------------------------------------------
		// IMATURE UI / HMI
		// callScript("Utilities.pageDown");
		//--------------------------------------------------------------------
//		// COOKIES?
//		try {
//			if (cookies_image_close().isShowing()){
//				cookies_image_close(ANY, READY).click();			
//			}
//		} catch (Exception e) {
//			// 
//		}
		//--------------------------------------------------------------------
		// Choose Your Cover
		switch (sBreakDownCover){
		//--------------------------------------------------------------------
		
			case "You":	
				//iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).click(atPoint(1255,625));
				//ControlClick("class", "bd-check", "id", "single", 1);				
				// html_mainContainer().click(atPoint(1253,377));				
				// iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).click(atPoint(1261,863));
				
				// Eureka
				sleep(0.5);
				((GuiTestObject)form_optionsForm().find(atDescendant("class","bd-option", "id","youLabel"))[0]).click();
				sleep(0.5);
				
				break;
				//--------------------------------------------------------------------
			case "Two People":				
				//iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).click(atPoint(1254,840));	
				//iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).click(atPoint(1248,415));
				//iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).click(atPoint(1269,1025)); // 1014
				
				//ControlClick("class", "bd-check", "id", "joint", 1);
				
				//iE(document_ukBreakdownCoverViewA(),LOADED).inputKeys("{ExtPgDn}");
				//iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).click(atPoint(1261,165));

				// Eureka
				sleep(0.5);
				((GuiTestObject)form_optionsForm().find(atDescendant("class","bd-option", "id","jointLabel"))[0]).click();
				sleep(0.5);

				//iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).click(atPoint(1244,1050));
				// callScript("Motor_MK2.Personal_Details");				
				// iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).inputKeys("{ExtPgDn 2}");
				break;
				//--------------------------------------------------------------------
			case "Family":	
				//iE(document_ukBreakdownCoverViewA(),LOADED).inputKeys("{ExtPgDn}");
				// iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).click(atPoint(1256,312));

				
				//iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).inputKeys("{ExtPgDn}");				
				//iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).click(atPoint(1255,214));				
				//iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).click(atPoint(1242,628));
				// Eureka
				sleep(0.5);
				((GuiTestObject)form_optionsForm().find(atDescendant("class","bd-option", "id","joint3Label"))[0]).click();
				sleep(0.5);

				//	iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).click(atPoint(1244,302));				
			//	ControlClick("class", "bd-check", "id", "joint3", 1);
			// callScript("Motor_MK2.Personal_Details");
				// iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).inputKeys("{ExtPgDn 2}");
				break;
				//--------------------------------------------------------------------
			case "Vehicle":
				//iE(document_ukBreakdownCoverViewA(),LOADED).inputKeys("{ExtPgDn}");
				//iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).click(atPoint(1262,459));
				// DEFAULT SELECTION
				// Eureka 
				// THIS OPTION IS DEFAULT SELECTION - Select Previous, Then Re-Select This
				sleep(0.5);
				//((GuiTestObject)form_optionsForm().find(atDescendant("class","bd-option", "id","joint3Label"))[0]).click();
				//sleep(1.5);				
				//((GuiTestObject)form_optionsForm().find(atDescendant("class","bd-option-on", "id","carLabel"))[0]).click();
				((GuiTestObject)form_optionsForm().find(atDescendant("for","vehicle", "id","carLabel"))[0]).click();
				sleep(0.5);					//iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).inputKeys("{ExtPgDn}");
				//iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).click(atPoint(1255,427));
				//iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).click(atPoint(1247,842));
			//	iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).click(atPoint(1250,450));				
			//	ControlClick("class", "bd-check", "id", "vehicle", 1);
				break;								
				//--------------------------------------------------------------------
		}
		//stop();
 		//--------------------------------------------------------------------
 		// Choose Your Options
		// RELAY
		if (bUpgrades_Relay == true){
			html_relay().waitForExistence(1,  0.25);
			html_relay(ANY, READY).click();
		}
		//--------------------------------------------------------------------
		// HOME START
		if (bUpgrades_HomeStart == true){
			html_homeStart().waitForExistence(1,  0.25);
			html_homeStart(ANY, READY).click();
		}
		//--------------------------------------------------------------------
		// STAY MOBILE
		if (bUpgrades_OnwardTravel == true){
			html_stayMobile().waitForExistence(1,  0.25);
			html_stayMobile(ANY, READY).click();
		}
		//--------------------------------------------------------------------
		// PARTS and GARAGE
		if (bUpgrades_PartsGarage == true){
			label_addThisOption().waitForExistence(1,  0.25);
			label_addThisOption(ANY, READY).click();
		}
		
		// ALTERNATE METHOD of Choose Your Options
//		switch (sBreakDownCoverOptions){
//		//--------------------------------------------------------------------
//			case "Relay":  				// RELAY
//				///html_relay().click(atPoint(237,188));
//				html_relay(ANY, READY).click();
//				break;		
//				//--------------------------------------------------------------------
//			case "Home Start":			// Home Start
//				html_homeStart(ANY, READY).click();
//				break;
//				//--------------------------------------------------------------------
//			case "Stay Mobile":			// Onward Travel
//				html_stayMobile(ANY, READY).click();
//				break;
//				//--------------------------------------------------------------------
//			case "Parts":				// aArts and Garage COver
//				label_addThisOption(ANY, READY).click();
//				break;								
//				//--------------------------------------------------------------------
//		}
		//-----------------------------------------------------------------------------------------
		// Choose Your Payment Period
		switch (sPaymentPeriod){
		//--------------------------------------------------------------------
			case "Month":
				label_monthly().waitForExistence(10,  0.25);
				label_monthly(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Year":
				label_1Year().waitForExistence(10,  0.25);
				label_1Year(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
		}
		//--------------------------------------------------------------------
		// Submit
		button_continuesubmit().waitForExistence(10,  0.25);
		button_continuesubmit(ANY, READY).click();
		//--------------------------------------------------------------------
		BrowserSync();
		//--------------------------------------------------------------------
		// POPUP - REGISTRATION
		if (sBreakDownCover.equalsIgnoreCase("Vehicle") && (text_vehReg().exists())){
		//if (text_vehReg().exists()){
		
			try {
				text_vehReg().waitForExistence(5,  0.25);
				//text_vehReg(ANY, READY).click();
			} catch (ObjectNotFoundException e) {
				text_vehReg2().waitForExistence(5,  0.25);
				//text_vehReg2(ANY, READY).click();
			}
			//--------------------------------------------------------------------
			// Input Registration
			iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).inputChars(sRegNumber);
			iE(document_ukBreakdownCoverViewA(),DEFAULT_FLAGS).inputKeys("{ENTER}");
			//--------------------------------------------------------------------				
			// SUbmit Registration
			//link_addAVehicle().click();
			try {
				button_updateYourQuotesubmit().waitForExistence(5,  0.25);
				//button_updateYourQuotesubmit(ANY, READY).click();
			} catch (ObjectNotFoundException e) {
				button_updateCoversubmit().waitForExistence(5,  0.25);
				//button_updateCoversubmit(ANY, READY).click();
			}			
			//--------------------------------------------------------------------
			BrowserSync();
			//--------------------------------------------------------------------
			// Verification Of Following VEHICLE DETAILS Screen Arrival
			//--------------------------------------------------------------------		
			// Scrape Following Screen (YOUR DETAILS) for ACTUAL Value to Compare
			sActual = (String)form_sorconline_form().getProperty(".text");
			if (sActual.contains("Vehicle")){
				sActual = "Vehicle";
			}
			//--------------------------------------------------------------------
			// Verify Success on CAR Details (YOUR DETAILS SCREEN APPEARANCE)
	 		VerifyandReport(sVerTitle, sExpected, sActual, sReport);
	 		
			//--------------------------------------------------------------------
			// Submit - Second Submit, As Registration popup Triggered By The First Action
			button_continuesubmit().waitForExistence(10,  0.25);
			button_continuesubmit(ANY, READY).click();
			//--------------------------------------------------------------------

		}
		
		else {
			// NO REGISTRATION DIALOG DISPLAYED
			//--------------------------------------------------------------------	
			// Next Page Displayed (Personal Details) so Synchronise on MR Label
			label_mr().waitForExistence(50,  0.25);
			//--------------------------------------------------------------------				
			sVerTitle = "The_COVER_Details_Data";
			sReport = "The COVER Details Data Entry Was Successful, Your Personal Details Screen Appeared As Expected";
			sExpected = "Personal details";
			
			// Scrape Following Screen (YOUR DETAILS) for ACTUAL Value to Compare
			sActual = (String)form_sorconline_form().getProperty(".text");
			if (sActual.contains("Personal Details details")){
				sActual = "Personal details";
		 		VerifyandReport(sVerTitle, sExpected, sActual, sReport);
			}
		}
		//button_updateYourQuotesubmit().waitForExistence(10,  0.25);
		//button_updateYourQuotesubmit(ANY, READY).click();
		 
		
		// Grab Cost And Lock It In Commons
		//--------------------------------------------------------------------
		// END OF BREAKDOWN_COVER
		//--------------------------------------------------------------------
	}
}

