package Motor_MK2.Your__Details;
import resources.Motor_MK2.Your__Details.Your_DetailsHelper;
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
//		String sHouseNumber = "12";
//		String sPostcode = "PO121LQ";
//		String sPhoneNumber = "02393111330";
//		String sMobilePhone = "097788461994";
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
//		String sNoClaimsBonus = "5";
//		
//		
//		//Boolean bRegNumberKnown = false;
//		//Boolean bExactModel = true;
//		Boolean bUKBirth = true;
//		Boolean bMarriedStatus = true;
//		Boolean bAAMember = false;
//		Boolean bUKDrivingLicence = true;
//		Boolean bClaims = false;
//		Boolean bConvictions = false;
//		Boolean bAddDriver = false;
////		Common_Variables.fuelType = "Petrol";
////		Common_Variables.transMissionType = "Manual";
////		Common_Variables.regNumberKnown = false;
//		//Verification
//		String svTitle = "Your_Details_Data";
//		String sReport = "Your Details Data Entry Was Successful";
//		String sExpected = "Your cover includes";
//		String sActual = "";

		//-----------------------------------------------------------------------------------------
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
		//-----------------------------------------------------------------------------------------
		// Verification  -  CONFIRM SCREEN TRANSITION - NO VALIDATION ERRORS!!!!
		String sTitle = "Your_Details_Data";
		String sReport = "The Personal Details Data Entry Was Successful, Your Cover Screen Appeared As Expected";
		String sExpected = "Your quote";
		String sActual = "";
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
		//--------------------------------------------------------------------------------		
		// Personal Details
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.Your__Details.Personal_Details");
		//--------------------------------------------------------------------------------		
		// Address Details
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.Your__Details.Address_Details");
		//--------------------------------------------------------------------------------		
		// Contact Details
		//--------------------------------------------------------------------------------		
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.Your__Details.Contact_Details");
		//--------------------------------------------------------------------------------		
		// Employment Details
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.Your__Details.Employment_Details");
		//--------------------------------------------------------------------------------		
		// Driving Licence Details
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();                        
		callScript("Motor_MK2.Your__Details.Your_Driving_Licence");
		//--------------------------------------------------------------------------------		
		// Motor Claims Details
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.Your__Details.Motor_Claim_Details");
		//--------------------------------------------------------------------------------		
		// Motor Conviction Details
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		callScript("Motor_MK2.Your__Details.Motor_Conviction_Details");
		//--------------------------------------------------------------------------------		
		// Motor Cover Details
		//--------------------------------------------------------------------
		unregisterAll();
		System.gc();
		try {
			callScript("Motor_MK2.Your__Details.Your_Cover");
			//--------------------------------------------------------------------------------		
			// Motor Add Another Driver
			//--------------------------------------------------------------------
			unregisterAll();
			System.gc();
			callScript("Motor_MK2.Your__Details.Additional_Drivers.Add_Additional_Driver");
			//--------------------------------------------------------------------------------		
			// Motor Add Breakdown Service
			//--------------------------------------------------------------------
			unregisterAll();
			System.gc();
			callScript("Motor_MK2.Your__Details.Breakdown_Service");

			//--------------------------------------------------------------------
			BrowserSync();		
			//--------------------------------------------------------------------
			// COMMIT YOUR DETAILS - Synchronise On Button
			button_nextsubmit().waitForExistence(20,  0.25);
			button_nextsubmit(ANY, READY).click();
			//--------------------------------------------------------------------
			// Synchronise
			try {
				link_emailMyQuote().waitForExistence(16,  0.25);	
				//--------------------------------------------------------------------
				// Scrape Following Screen (YOUR DETAILS) for ACTUAL Value to Compare
				sActual = (String)html_main().getProperty(".text");
				if (sActual.contains("Your quote")){
					sActual = "Your quote";
				}
				//--------------------------------------------------------------------
				// Verify Success on your Details (YOUR DETAILS SCREEN APPEARANCE)
				VerifyandReport(sTitle, sExpected, sActual, sReport);
			} catch (ObjectNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		} catch (ObjectNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		//--------------------------------------------------------------------
		// END OF YOUR DETAILS
		//--------------------------------------------------------------------
		
	}
}

