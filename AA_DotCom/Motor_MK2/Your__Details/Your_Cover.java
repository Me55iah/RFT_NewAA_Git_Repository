package Motor_MK2.Your__Details;
import resources.Common_Variables;
import resources.Full_Motor_Regression_Test_MK2Helper;
import resources.Motor_MK2.Your__Details.Your_CoverHelper;
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
public class Your_Cover extends Your_CoverHelper
{
	/**
	 * Script Name   : <b>Your_Cover</b>
	 * Generated     : <b>1 Jul 2015 13:31:13</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/01
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
//		//--------------------------------------------------------------------
//		String sInsCoverType = "Comprehensive";
//		String sPreviousInsurer = "A.G.F";
//		String sCoverStartDate = "";
//		String sOldCoverExpiryDate = "27/10/2014";
//		String sNoClaimsBonus = "4";
//		Common_Variables.EBC_tripFutureStartDay = 10;
		//--------------------------------------------------------------------
		String sInsCoverType = Common_Variables.coverType;
		String sPreviousInsurer = Common_Variables.previousSupplier;
		String sNoClaimsBonus = Common_Variables.NCB;
		//----------------------------------------
		// Grab Int From Datapool And Convert to dd/MM/yyyy Format For Future Dated Policies
		Integer_to_Date();		
		//----------------------------------------
		String sPolicyExpirationDate = Common_Variables.coverExpirationDate;
		String sPolicyStartDate = Common_Variables.coverStartDate;		
		String sPolicyEndDate = Common_Variables.coverEndDate;
		System.out.println("Policy Start Date "+sPolicyStartDate+" - Policy End Date "+sPolicyEndDate+" - Old Policy Expired - "+sPolicyExpirationDate); 	// dd/mm/yyyy
		//--------------------------------------------------------------------
		// Your Cover Previous Insurer
		//--------------------------------------------------------------------
		// Previous Insurer - Detect For NULL Or Not? in dp
		if (!sPreviousInsurer.equals("")){
			list_aaMotorPreviousPolicyInsu().waitForExistence(20,  0.25);
			list_aaMotorPreviousPolicyInsu(ANY, READY).click();
			sleep(2);
			list_aaMotorPreviousPolicyInsu(ANY, READY).click(atText(sPreviousInsurer));
		}
		//--------------------------------------------------------------------
		// callScript("Utilities.pageDown");
		//--------------------------------------------------------------------
		// Your Old Cover Expiry Date
		//--------------------------------------------------------------------
		// Date of Current/Expiring Policy - NO PREVIOUS POLICY THEN NOT PRESENTED (Expected)
		try {
			text_aaMotorPreviousPolicyExpi().waitForExistence(20,  0.25);
			text_aaMotorPreviousPolicyExpi(ANY, READY).click(atPoint(183,40));
			iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys(sPolicyExpirationDate+"{ENTER}{TAB}"); // ENTER
			sleep(0.5);
			//--------------------------------------------------------------------
			// Your Cover No Claims Bonus
			//--------------------------------------------------------------------
			// No Claims Bonus
			list_aaMotorPreviousPolicyNcd().waitForExistence(20,  0.25);
			list_aaMotorPreviousPolicyNcd(ANY, READY).click();
			list_aaMotorPreviousPolicyNcd().click(atText(sNoClaimsBonus));
		} catch (Exception e) {
			// None
		}
//		//--------------------------------------------------------------------
//		// SORRY, SERVICE UNAVAILABLE CAUGHT HERE
//		String sServiceUnavailable = (String)html_mainContent().getProperty(".text");		
//		try {
//			//-------------------------------------------------------------------------
//			// Detect Registration Match Unsuccessful Message		// We couldn't match the registration number
//			if (sServiceUnavailable.contains("Unfortunately our online car insurance service is unavailable")){
//				System.out.println(sServiceUnavailable);
//				//CloseAllBrowsers();
//
//				//--------------------------------------------------------------------
//				// END OF CURRENT SCRIPT TIMING
//				//CurrTime(); String timeStampE = CurrTime();
//				//System.out.println("Scenario End time = " + timeStampE);
//				//setDatapool("Script_End_Time", "" + timeStampE);
//				//--------------------------------------------------------------------
//				// MAY_EXIT;
//				// dpNext();
//				// currentRow++;
//				sleep(2.0);
//				callScript("Motor_MK2.Please_Call_Us.Quote_Failure");
//				// goto Full_Motor_Regression_Test_MK2.next_Iteration;
//				//--------------------------------------------------------------------
//			}		 
//		} catch (Exception e) {
//			// None
//		}
		//--------------------------------------------------------------------
		// Your Cover Start Date
		//----------------------------------------
		// Start Date of NEW Policy
		try {
			text_aaMotorCoverStart().waitForExistence(20,  0.25);
			text_aaMotorCoverStart().click(atPoint(174,34));
			sleep(2);
			iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys("+{ExtLeft 11}+");		
			iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys(sPolicyStartDate+"{ENTER}{TAB}"); // ENTER
			sleep(0.5);
			// stop();
			//--------------------------------------------------------------------
			label_comprehensive().waitForExistence(25,  0.25);
			//--------------------------------------------------------------------
			// Your Cover Type
			if (sInsCoverType.contains("Comprehensive")){
				//sInsCoverType = "Comprehensive";
				label_comprehensive(ANY, READY).click();
			} // TPFT //--------------------------------------------------
			if (sInsCoverType.contains("Third party, fire and theft")){
				//sInsCoverType = "Third party, fire and theft";
				label_thirdPartyFireAndTheft(ANY, READY).click();
			} // TPO  //--------------------------------------------------
			if (sInsCoverType.contains("Third party ")){
				//sInsCoverType = "Third Party Only";
				label_thirdPartyOnly(ANY, READY).click();
			}
		} catch (Exception e) {
			 
			 
		}		
//		//--------------------------------------------------------------------
//		label_comprehensive().waitForExistence(25,  0.25);
//		//--------------------------------------------------------------------
//		// Insurance Cover Type
//		switch (sInsCoverType){
//		//--------------------------------------------------------------------		
//			case "Comprehensive":				
//				label_comprehensive(ANY, READY).click();
//				break;
//				//--------------------------------------------------------------------
//			case "Third Party, Fire and Theft":
//				label_thirdPartyFireAndTheft(ANY, READY).click();
//				break;
//				//--------------------------------------------------------------------
//			case "Third Party Only":
//				label_thirdPartyOnly(ANY, READY).click();
//				break;
//		}
		//--------------------------------------------------------------------
	}
}

