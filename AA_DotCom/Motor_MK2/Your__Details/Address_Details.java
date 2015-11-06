package Motor_MK2.Your__Details;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Details.Address_DetailsHelper;
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
public class Address_Details extends Address_DetailsHelper
{
	/**
	 * Script Name   : <b>Address_Details</b>
	 * Generated     : <b>1 Jul 2015 13:15:45</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/01
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
// 		//-----------------------------------------------------------------------------------------
// 		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
//		String sHouseNumber = "12";
//		String sPostcode = "PO121LQ";
// 		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
// 		//-----------------------------------------------------------------------------------------
		String sHouseNumber = Common_Variables.proposer_HouseNumber;
		String sPostcode = Common_Variables.proposer_PostCode;
		//--------------------------------------------------------------------
		// Bring HMI Components into View
		// callScript("Utilities.pageDown");
		//--------------------------------------------------------------------
		// Address Details
		// House Name - Number
		text_aaMotorDriverHouseNumber().waitForExistence(20,  0.25);
		text_aaMotorDriverHouseNumber(ANY, READY).click(atPoint(129,35));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sHouseNumber);
		//--------------------------------------------------------------------
		// Postcode
		text_aaMotorDriverPostCode().waitForExistence(20,  0.25);
		text_aaMotorDriverPostCode(ANY, READY).click(atPoint(88,33));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sPostcode);
		//--------------------------------------------------------------------
		// Lookup Address
		link_findYour_Address().waitForExistence(20,  0.25);
		link_findYour_Address(ANY, READY).click();
		//--------------------------------------------------------------------		
		sleep(1);
		//--------------------------------------------------------------------
		// SYNCHRONISE on RETURNED SELECT ADDRESS PAGE
		//--------------------------------------------------------------------		
		if (list_address().isShowing()){			
			list_address(ANY, READY).click();
			sleep(0.5);
			// Select 1st Address from List
			iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys("{ExtDown}"); // {ENTER}
			sleep(0.5);
//			// Sometimes Listbox to select exact address is returned (Even when you have already selected the NUMBER of address)
//			if (link_continue().isEnabled()){
//				link_continue(ANY, READY).click();
//				sleep(0.5);
//			}
		//--------------------------------------------------------------------

		}
	}
}

