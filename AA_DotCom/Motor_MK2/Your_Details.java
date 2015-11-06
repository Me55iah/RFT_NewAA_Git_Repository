package Motor_MK2;
import resources.Motor_MK2.Your_DetailsHelper;
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
public class Your_Details extends Your_DetailsHelper
{
	/**
	 * Script Name   : <b>Your_Details</b>
	 * Generated     : <b>26 May 2015 15:51:52</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/05/26
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//-----------------------------------------------------------------------------------------
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
		String sTitle = "Mr";
		String sFirstName = "Reginald";
		String sLastName = "Bucket";
		String sDoB = "10/03/1965";
		String sResidentSinceMonth = "November";
 		String sResidentSinceYear = "2000";
		String sLicenceQualificationMonth = "January";
 		String sLicenceQualificationYear = "1998";
		String sHouseNumber = "12";
		String sPostcode = "PO121LQ";
		String sPhoneNumber = "02393111330";
		String sMobilePhone = "097788461994";
		String sEmail = "theeaatester@theaa.com";
		String sEmploymentStatus = "Employed";
		String sEmploymentRole = "Accountant";
		String sEmploymentType = "Accountancy";	
		String sDrivingLicenceType = "Provisional";
		String sPreviousInsurer = "Abbey";
		String sInsCoverType = "FullyComp";
		//String sCoverEndDate = "01/06/2016";
		String sCoverStartDate = "02/06/2015";
		String sOldCoverExpiryDate = "01/06/2015";
		String sNoClaimsBonus = "5";
		
		
		//Boolean bRegNumberKnown = false;
		//Boolean bExactModel = true;
		Boolean bUKBirth = true;
		Boolean bMarriedStatus = true;
		Boolean bAAMember = false;
		Boolean bUKDrivingLicence = true;
		Boolean bClaims = false;
		Boolean bConvictions = false;
		Boolean bAddDriver = false;
//		Common_Variables.fuelType = "Petrol";
//		Common_Variables.transMissionType = "Manual";
//		Common_Variables.regNumberKnown = false;
		//Verification
		String svTitle = "Your_Details_Data";
		String sReport = "Your Details Data Entry Was Successful";
		String sExpected = "Your cover includes";
		String sActual = "";

		
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
		//-----------------------------------------------------------------------------------------
		// Synchronise
		label_title().waitForExistence(20,  0.25);
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
		text_aaMotorDrivers0FirstName().waitForExistence(20,  0.25);
		text_aaMotorDrivers0FirstName(ANY, READY).click(atPoint(45,35));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sFirstName);
		//--------------------------------------------------------------------
		// Last Name
		text_aaMotorDrivers0LastName(ANY, READY).click(atPoint(33,41));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sLastName);
		//--------------------------------------------------------------------
		// Date of Birth
		text_dateOfBirth(ANY, READY).click(atPoint(211,33));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sDoB);
		//--------------------------------------------------------------------
		// Bring HMI Components into View
		callScript("Utilities.pageDown");
		//--------------------------------------------------------------------
		// UK From Birth
		if (bUKBirth == true){
			label_fromBirth().waitForExistence(20,  0.25);
			label_fromBirth(ANY, READY).click();
			sleep(0.5);
		}
		// If Not, Date of Arrival MM/YYYY - UK Resident Since?
		else {
			//---------------------------------------------------------------
			// Arrival Month
			list_aaMotorDriverResidentMonth().waitForExistence(20,  0.25);
			list_aaMotorDriverResidentMonth(ANY, READY).click();
			list_aaMotorDriverResidentMonth(ANY, READY).click(atText(sResidentSinceMonth));
			//---------------------------------------------------------------
			// Arrival Year
			list_aaMotorDriversResidentYear().waitForExistence(20,  0.25);
			list_aaMotorDriversResidentYear(ANY, READY).click();
			list_aaMotorDriversResidentYear(ANY, READY).click(atText(sResidentSinceYear));
			sleep(0.5);
			//---------------------------------------------------------------
		}			
		//--------------------------------------------------------------------
		// Marital Status 
		if (bMarriedStatus == true){
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
		if (bAAMember == true){
			label_AAMember_yes().waitForExistence(20,  0.25);
			label_AAMember_yes(ANY, READY).click();
			// DETAILS OF AA MEMBERSHIP HERE
			// TODO
			// DETAILS OF AA MEMBERSHIP HERE
		}
		// If Not Member
		else {
			label_AAMember_no().waitForExistence(20,  0.25);
			label_AAMember_no(ANY, READY).click();
		}
		//--------------------------------------------------------------------
		// Bring HMI Components into View
		// callScript("Utilities.pageDown");
		//--------------------------------------------------------------------
		// Address Details
		// House Name - Number
		text_aaMotorDrivers0AddressHou2().waitForExistence(20,  0.25);
		text_aaMotorDrivers0AddressHou2(ANY, READY).click(atPoint(129,35));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sHouseNumber);
		//--------------------------------------------------------------------
		// Postcode
		text_aaMotorDrivers0AddressHou().waitForExistence(20,  0.25);
		text_aaMotorDrivers0AddressHou(ANY, READY).click(atPoint(88,33));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sPostcode);
		//--------------------------------------------------------------------
		// Lookup Address
		link_findYourAddress().waitForExistence(20,  0.25);
		link_findYourAddress(ANY, READY).click();
		
		// SYNCHRONISE on RETURNED SELECT ADDRESS PAGE
		
		//--------------------------------------------------------------------
		// Contact Details
		// LandLine Phone Number
		html_aaTelephoneNumber().waitForExistence(20,  0.25);
		html_aaTelephoneNumber(ANY, READY).click(atPoint(276,20));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sPhoneNumber);
		//--------------------------------------------------------------------
		// Bring HMI Components into View
		callScript("Utilities.pageDown");
		//--------------------------------------------------------------------
		// Mobile Phone Number
		html_aaMobileNumber().waitForExistence(20,  0.25);
		html_aaMobileNumber(ANY, READY).click(atPoint(49,37));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sMobilePhone);
		//--------------------------------------------------------------------
		// EMail Address
		text_aaMotorDrivers0Email0().waitForExistence(20,  0.25);
		text_aaMotorDrivers0Email0(ANY, READY).click(atPoint(177,38));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sEmail);
		//--------------------------------------------------------------------
		// Employment Details
		// Employment Status
		switch (sEmploymentStatus){
		//--------------------------------------------------------------------
			case "Employed":
				label_employedOrSelfEmployed(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "House Husband":
				label_housewifeOrHusband(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Student":
				label_student(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Retired":
				label_retired(ANY, READY).click();
				break;								
				//--------------------------------------------------------------------
			case "Unemployed":
				label_unemployed(ANY, READY).click();
				break;								
				//--------------------------------------------------------------------
			case "Disabled":
				label_registeredDisabledNotEmp(ANY, READY).click();
				break;								
		}
		//----------------------------------------------------------------------------
		// Employment Title		
		// Primary Job
		text_aaMotorDrivers0Occupation().waitForExistence(20,  0.25);
		text_aaMotorDrivers0Occupation(ANY, READY).click(atPoint(215,36));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys(sEmploymentRole);
		// 2 tabs to next editable field
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		//----------------------------------------------------------------------------
		// Primary Job Industry/Type
		text_aaMotorDrivers0Fulltimebu().waitForExistence(20,  0.25);
		text_aaMotorDrivers0Fulltimebu(ANY, READY).click(atPoint(72,29));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys(sEmploymentType);
		// 2 tabs to next editable field
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		//----------------------------------------------------------------------------
		
		// Currently Ignoring This Option
		
//		// Secondary Job
//		text_aaMotorDrivers0Parttimeoc().waitForExistence(20,  0.25);
//		text_aaMotorDrivers0Parttimeoc(ANY, READY).click(atPoint(276,31));
//		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys(sSecondaryEmploymentRole);
//		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
//		//----------------------------------------------------------------------------
//		// Secondary Job Industry/Type
//		text_aaMotorDrivers0Parttimebu().waitForExistence(20,  0.25);
//		text_aaMotorDrivers0Parttimebu(ANY, READY).click(atPoint(94,27));
//		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys(sSecondaryEmploymentType);
//		html_otherOccupationType_sugge().click(atPoint(58,8));
//		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		//----------------------------------------------------------------------------
		// Employment Industry

		// Currently Ignoring This Option		
		
		//--------------------------------------------------------------------
		// Driving Licence     
		if (bUKDrivingLicence == true){
			label_DrivingLicence_yes().waitForExistence(20,  0.25);
			label_DrivingLicence_yes(ANY, READY).click();
			//--------------------------------------------------------------------
			// When Did You Qualify?
			// Year?
			list_aaMotorDrivers0LicenceHel().waitForExistence(20,  0.25);
			list_aaMotorDrivers0LicenceHel(ANY, READY).click();
			list_aaMotorDrivers0LicenceHel(ANY, READY).click(atText(sLicenceQualificationYear));
			// Month?
			list_aaMotorDrivers0LicenceHel2().waitForExistence(20,  0.25);
			list_aaMotorDrivers0LicenceHel2(ANY, READY).click();
			list_aaMotorDrivers0LicenceHel2(ANY, READY).click(atText(sLicenceQualificationMonth));
		}
		//--------------------------------------------------------
		// If No UK Licence
		else {
			label_DrivingLicence_no().waitForExistence(20,  0.25);
			label_DrivingLicence_no(ANY, READY).click();
			
			switch (sDrivingLicenceType){ // If FULL UK Non Existing
			//--------------------------------------------------------------------
				case "Provisional":
					label_provisionalUKLicence(ANY, READY).click();
					break;
					//--------------------------------------------------------------------
				case "EU":
					label_euLicence(ANY, READY).click();
					break;
					//--------------------------------------------------------------------
				case "NonEU":
					label_nonEULicence(ANY, READY).click();
					break;
					//--------------------------------------------------------------------
				}
		}
		//--------------------------------------------------------------------
		// Bring HMI Components into View
		callScript("Utilities.pageDown");
		//--------------------------------------------------------------------
		// Claims and Incidents
		if (bClaims == true){
			label_Claims_yes().waitForExistence(20,  0.25);
			label_Claims_yes(ANY, READY).click();
			//--------------------------------------------------------------------			
			// Add Claim/Incident Detail
			link_addDetails().waitForExistence(20,  0.25);
			link_addDetails(ANY, READY).click();
			// Add Claim/Incident Screen
			callScript("Road_MK2.Add_Incident");
		}
		//--------------------------------------------------------------------
		// Single
		else {
			label_Claims_no().waitForExistence(20,  0.25);
			label_Claims_no(ANY, READY).click();
		}
		//--------------------------------------------------------------------
		// Motoring Convictions
		//--------------------------------------------------------------------
		// Convictions
		if (bConvictions == true){
			label_Convictions_yes().waitForExistence(20,  0.25);
			label_Convictions_yes(ANY, READY).click();
			//--------------------------------------------------------------------			
			// Add Convictions Detail
			link_addAConviction().waitForExistence(20,  0.25);
			link_addAConviction(ANY, READY).click();
			// Add Claim/Incident Screen
			callScript("Road_MK2.Add_Conviction");
		}
		//--------------------------------------------------------------------
		// Single
		else {
			label_Convictions_no().waitForExistence(20,  0.25);
			label_Convictions_no(ANY, READY).click();
		}
		//--------------------------------------------------------------------
		// Your Cover
		// Previous Insurer
		list_aaMotorPreviousPolicyInsu().waitForExistence(20,  0.25);
		list_aaMotorPreviousPolicyInsu(ANY, READY).click();
		list_aaMotorPreviousPolicyInsu(ANY, READY).click(atText(sPreviousInsurer));
		//--------------------------------------------------------------------
		// Your Cover
		// End Date of Current/Expiring Policy
		text_aaMotorPreviousPolicyExpi().waitForExistence(20,  0.25);
		text_aaMotorPreviousPolicyExpi(ANY, READY).click(atPoint(183,40));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys(sOldCoverExpiryDate);
		//--------------------------------------------------------------------
		// Your Cover
		// No Claims Bonus
		list_aaMotorPreviousPolicyNcd().waitForExistence(20,  0.25);
		list_aaMotorPreviousPolicyNcd(ANY, READY).click();
		list_aaMotorPreviousPolicyNcd(ANY, READY).click(atText(sNoClaimsBonus));
		//--------------------------------------------------------------------
		// Your Cover
		// Start Date of NEW Policy
		text_aaMotorCoverStart().waitForExistence(20,  0.25);
		text_aaMotorCoverStart(ANY, READY).click(atPoint(270,30));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys(sCoverStartDate);
		//--------------------------------------------------------------------
		// Your Cover
		// Insurance Cover Type
		switch (sInsCoverType){
		//--------------------------------------------------------------------
			case "FullyComp":
				label_comprehensive(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Third Party Fire Theft":
				label_thirdPartyFireAndTheft(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Third Party Only":
				label_thirdPartyOnly(ANY, READY).click();
				break;
		}
		//--------------------------------------------------------------------
		// Add a Driver    bAddDriver
		if (bAddDriver == true){	
			button_addAnotherDriversubmit().waitForExistence(20,  0.25);
			button_addAnotherDriversubmit(ANY, READY).click();
			callScript("Road_MK2.Additional_Driver");
		}
		else {
			
		}
		
		//--------------------------------------------------------------------
		// COMMIT YOUR DETAILS
		button_nextsubmit().waitForExistence(20,  0.25);
		button_nextsubmit(ANY, READY).click();
		//--------------------------------------------------------------------
		BrowserSync();		
		//--------------------------------------------------------------------
		// Scrape Following Screen (YOUR DETAILS) for ACTUAL Value to Compare
		sActual = (String)html_main().getProperty(".text");
		if (sActual.contains("Your cover includes")){
			sActual = "Your cover includes";
		}
		//--------------------------------------------------------------------
		// Verify Success on your Details (YOUR DETAILS SCREEN APPEARANCE)
		VerifyandReport(svTitle, sExpected, sActual, sReport);
		//--------------------------------------------------------------------
		// END OF YOUR DETAILS
		//--------------------------------------------------------------------
		
		
	}
}

