package Motor_MK2;
import resources.Common_Variables;
import resources.Motor_MK2.Select_Your_CoverHelper;
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
public class Select_Your_Cover extends Select_Your_CoverHelper
{
	/**
	 * Script Name   : <b>Select_Your_Cover</b>
	 * Generated     : <b>26 May 2015 15:45:00</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/05/26
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
// 		//-----------------------------------------------------------------------------------------
// 		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
//		String sTitle = "Mr";
//		String sFirstName = "Reginald";
//		String sLastName = "Bucket";
//		String sDoB = "10/03/1965";
//		String sResidentSinceMonth = "November";
 		//-----------------------------------------------------------------------------------------		
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
		//-----------------------------------------------------------------------------------------
		String sCoverType = Common_Variables.coverType;		
		String sNo_Claims_Discount = Common_Variables.NCB;	
		String sPreviousInsurer = Common_Variables.previousSupplier;		
//		String sCoverStartDate = Common_Variables.proposerUKResidentSinceMonth;
//		String sCoverEndDate = Common_Variables.proposerUKResidentSinceYear;
		String sCoverStartDate = Common_Variables.coverStartDate;
		String sCoverEndDate = Common_Variables.coverEndDate;		
		//-----------------------------------------------------------------------------------------
		// Synchronise
		// label_title().waitForExistence(20,  0.25);
		//--------------------------------------------------------------------
		// Current/Previous Insurer
		//--------------------------------------------------------------------
		list_aaMotorPreviousPolicyInsu().waitForExistence(10, 0.25);
		list_aaMotorPreviousPolicyInsu(ANY, READY).click();
		sleep(0.5);
		list_aaMotorPreviousPolicyInsu().click(atText(sPreviousInsurer)); // click(atText("A.A.Star (AA)"));
		//--------------------------------------------------------------------
		// Last Policy Expiration Date
		//--------------------------------------------------------------------
		text_aaMotorPreviousPolicyExpi(ANY, READY).click(atPoint(188,26));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys(sCoverEndDate+"{ENTER}"); // ("07/07/2014{ENTER}");
		text_aaMotorCoverStart().click(atPoint(256,32));
		//--------------------------------------------------------------------
		// No Claims Bonus
		//--------------------------------------------------------------------
		list_aaMotorPreviousPolicyNcd(ANY, READY).click();
		list_aaMotorPreviousPolicyNcd().click(atText(sNo_Claims_Discount));
		//--------------------------------------------------------------------
		// New Policy Start Date
		//--------------------------------------------------------------------
		text_aaMotorCoverStart(ANY, READY).click(atPoint(296,35));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys(sCoverStartDate+"{ENTER}"); // ("07/07/2014{ENTER}");
		//--------------------------------------------------------------------
		// Level Of Cover (Cover Type)
		//--------------------------------------------------------------------
		switch (sCoverType){
		//--------------------------------------------------------------------
			case "Comprehensive":
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
				//--------------------------------------------------------------------
		}
		//--------------------------------------------------------------------	
	stop();
	}
}

