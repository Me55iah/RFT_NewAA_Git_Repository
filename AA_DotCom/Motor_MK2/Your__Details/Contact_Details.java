package Motor_MK2.Your__Details;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Details.Contact_DetailsHelper;
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
public class Contact_Details extends Contact_DetailsHelper
{
	/**
	 * Script Name   : <b>Contact_Details</b>
	 * Generated     : <b>1 Jul 2015 13:16:59</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/01
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
//		//-----------------------------------------------------------------------------------------
//		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
//		//-----------------------------------------------------------------------------------------
//		String sPhoneNumber = "02393111330";
//		String sMobilePhone = "097788461994";
//		String sEmail = "theeaatester@theaa.com";
//		//-----------------------------------------------------------------------------------------
//		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
//		//-----------------------------------------------------------------------------------------
		String sPhoneNumber = Common_Variables.proposer_PhoneNumber;
		String sMobilePhone = Common_Variables.proposer_MobileNumber;
		String sEmail = Common_Variables.proposer_Email;		
		//--------------------------------------------------------------------
		// Contact Details
		// LandLine Phone Number
		html_aaTelephoneNumber().waitForExistence(20,  0.25);
		html_aaTelephoneNumber(ANY, READY).click(atPoint(276,20));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sPhoneNumber);
		//--------------------------------------------------------------------
		// Bring HMI Components into View
		// callScript("Utilities.pageDown");
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

	}
}

