package Motor_MK2;
import resources.Motor_MK2.Add_ClaimHelper;
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
public class Add_Claim extends Add_ClaimHelper
{
	/**
	 * Script Name   : <b>Add_Incident</b>
	 * Generated     : <b>1 Jun 2015 11:47:48</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/01
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
		String sHouseNumber = "12";
		String sPostcode = "PO121LQ";
		String sPhoneNumber = "02393111330";
		String sMobilePhone = "097788461994";
		String sEmail = "theeaatester@theaa.com";
		String sEmploymentStatus = "Employed";
		String sEmploymentRole = "Accountant";
		String sEmploymentType = "Accountancy";	
		String sDrivingLicenceType = "Provisional";
		//Boolean bRegNumberKnown = false;
		//Boolean bExactModel = true;
		Boolean bUKBirth = true;
		Boolean bMarriedStatus = true;
		Boolean bAAMember = false;
		Boolean bUKDrivingLicence = true;
		Boolean bClaims = false;
//		Common_Variables.fuelType = "Petrol";
//		Common_Variables.transMissionType = "Manual";
//		Common_Variables.regNumberKnown = false;

		
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
		//-----------------------------------------------------------------------------------------
		// Synchronise
		link_claimsConfirm().waitForExistence(20,  0.25);
		//--------------------------------------------------------------------

		
		
		// HTML Browser
		// Document: Car Insurance: Your details - The AA: https://prelive9.theaa.com/car-insurance/buy/policyholder-details
		text_aaMotorDrivers0Claims0Val().click(atPoint(100,29));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars("1000");
		list_aaMotorDrivers0Claims0Mon().click();
		list_aaMotorDrivers0Claims0Mon().click(atText("February"));
		list_aaMotorDrivers0Claims0Yea().click();
		list_aaMotorDrivers0Claims0Yea().click(atText("2011"));
		label_no().click();
		label_yes().click();
		label_yes2().click();
		label_no2().click();
		link_claimsConfirm().click();
		link_claimsConfirm().click();
		
		
		
		
		
		// TODO Insert code here
	}
}

