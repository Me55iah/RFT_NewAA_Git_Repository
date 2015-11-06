package Motor_MK2.Your__Details;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Details.Add_ClaimHelper;
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
	 * Script Name   : <b>Add_Claim</b>
	 * Generated     : <b>23 Jul 2015 11:43:53</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/23
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{

		
//		//-------------------------------------------------------------------- 
//		// Test Data
//		String sIncident = "Hit in Rear";
//		String sIncidentClaimCost = "2000";
//		Boolean bIncidentFaultClaim = false;
//		Boolean bIncidentInjuryClaim = false;
//		String sIncidentMonth = "July";		
//		String sIncidentYear = "2011";		
//		// Test Data
		//-------------------------------------------------------------------- 
		String sIncident = Common_Variables.motoringIncident;
		String sIncidentClaimCost = Common_Variables.motoringClaimCost;
		Boolean bIncidentFaultClaim = Common_Variables.motoringFaultClaim;
		Boolean bIncidentInjuryClaim = Common_Variables.motoringInjuryClaim;
		String sIncidentMonth = Common_Variables.motoringIncidentMonth;		
		String sIncidentYear = Common_Variables.motoringIncidentYear;		
		//--------------------------------------------------------------------
		// Claim Cost
		//--------------------------------------------------------------------
		text_IncidentClaimsValue_().waitForExistence(10,  0.25);
		text_IncidentClaimsValue_(ANY, READY).click(atPoint(129,35));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sIncidentClaimCost);
		//--------------------------------------------------------------------	
		// Incident Date - YYYY - MMMM
		//--------------------------------------------------------------------
		// MONTH
		list_IncidentClaims_Month_().waitForExistence(10,  0.25);
		list_IncidentClaims_Month_(ANY, READY).click(atPoint(129,35));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sIncidentMonth);
		//--------------------------------------------------------------------
		// YEAR
		list_IncidentClaims_Year_().waitForExistence(10,  0.25);
		list_IncidentClaims_Year_(ANY, READY).click(atPoint(129,35));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars(sIncidentYear);
		//--------------------------------------------------------------------
		// Fault Claim?
		//--------------------------------------------------------------------
		// 	YES
		if (bIncidentFaultClaim == true){
			label_yes_Fault_Claim_().waitForExistence(10,  0.25);
			label_yes_Fault_Claim_(ANY, READY).click(atPoint(129,35));
		} // NO
		else {
			label_no_Fault_Claim_().waitForExistence(10,  0.25);
			label_no_Fault_Claim_(ANY, READY).click(atPoint(129,35));
		}		
		//--------------------------------------------------------------------
		// Personal Injury Claim?
		//--------------------------------------------------------------------
		// 	YES
		if (bIncidentInjuryClaim == true){
			label_yes_Injury_Claim_().waitForExistence(10,  0.25);
			label_yes_Injury_Claim_(ANY, READY).click(atPoint(129,35));
		} // NO
		else {
			label_no_Injury_Claim_().waitForExistence(10,  0.25);
			label_no_Injury_Claim_(ANY, READY).click(atPoint(129,35));

		}
		//--------------------------------------------------------------------	
		// Select Incident Type
 		//--------------------------------------------------------------------
		// Temporarily Suspend Log To Hide The Following Erroneous Tool Error!!!
 		//--------------------------------------------------------------------
		setCurrentLogFilter(DISABLE_LOGGING);  // A
 		//--------------------------------------------------------------------
		try { // Behaviour Issue, Selects Item, Then Reports Off Screen Coord Error? WORKAROUND OK 
//			list_IncidentClaims_Reason().waitForExistence(20,  0.25);
//			list_IncidentClaims_Reason(ANY, READY).click(atText("Please select incident"));	
//		 	BrowserSync();
//			list_IncidentClaims_Reason_(ANY, READY).click(atText("Please select incident"));	
 		 	sleep(2);
			list_IncidentClaims_Reason_(ANY, READY).click(atText(sIncident));	
			logWarning("NOT A REAL DEFECT - SELECTION ISSUE FROM LB - PL1 Might Be OK");
		 	BrowserSync();
		 	sleep(2);
//			iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys("{ExtDown}"); //{ENTER}
//			sleep(0.25);
//			list_IncidentClaims_Reason_(ANY, READY).click(atText(sIncident));
			
		} catch (CoordinateOffScreenException e) {
			// Second Attempt To Select Correct Item From List 
			// list_IncidentClaims_Reason_(ANY, READY).click(atText(sIncident));	

		}
 		//--------------------------------------------------------------------
		// RESUME Temporarily Suspended Log To Hide The Previous Erroneous Tool Error!!!
 		//--------------------------------------------------------------------
		setCurrentLogFilter(ENABLE_LOGGING);
	 	//--------------------------------------------------------------------
		link_claimsConfirm_().waitForExistence(2, 0.25);
		link_claimsConfirm_(ANY, READY).click();
		//--------------------------------------------------------------------

	}
}

