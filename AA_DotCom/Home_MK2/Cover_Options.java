package Home_MK2;
import resources.Common_Variables;
import resources.Home_MK2.Cover_OptionsHelper;
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
public class Cover_Options extends Cover_OptionsHelper
{
	/**
	 * Script Name   : <b>Cover_Options</b>
	 * Generated     : <b>14 Jan 2015 13:31:00</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/01/14
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
////		// // Test Data
//		(Common_Variables.centralHeatingInsType) = "Plus";
//		(Common_Variables.homeInsType) = "Emergency";
//		(Common_Variables.receive_Policy_Documents) = "Post";
//		(Common_Variables.policy_Excess) = "99";
//		(Common_Variables.paymentType) = "Monthly Card Payment";
//		(Common_Variables.membership) = true;
////		// // Test Data

		//--------------------------------------------------------------------------------------------------
		// Synchronise on Page Start
		central_Heating_Emergency_Response().waitForExistence(25,  0.25);
		sleep(2);
		//--------------------------------------------------------------------------------------------------					
		// Plus OR Emergency - HEATING          (Plus/Emergency/NONE) **  DEFAULT NONE SET  **
		switch (Common_Variables.centralHeatingInsType){
		
			case "Emergency":			//		(Level 1)
				central_Heating_Emergency_Response(ANY, READY).click();	
				break;

			case "Plus":				//		(Level 2)
				central_Heating_Response(ANY, READY).click();
				break;
		}
			logTestResult("Central Heating Response Was Set To "+Common_Variables.centralHeatingInsType, true);
		//--------------------------------------------------------------------------------------------------					
		// Plus OR Emergency - HOME          	(Plus/Emergency/NONE)**  DEFAULT NONE SET  **
		switch (Common_Variables.homeInsType){
		
			case "Emergency":			//		(Level 1)
				home_Emergency_Response(ANY, READY).click();			
				break;

			case "Plus":				//		(Level 2)
				home_Response(ANY, READY).click();
				break;
		}
			logTestResult("Home (Emergency) Response Was Set To "+Common_Variables.homeInsType, true);
		//--------------------------------------------------------------------------------------------------					
		// After Check ABOVE Box Selection - Extra Section For Payments and Cover Details Rendered
		//--------------------------------------------------------------------------------------------------
		// Synchronise on Page Extension (Post?Online Options Available For Every Case)
		label_online().waitForExistence(10,  0.25);
		//--------------------------------------------------------------------------------------------------					
		//
		//--------------------------------------------------------------------------------------------------					
		// Policy Document Provision 			(Postage/Online) **  DEFAULT ONLINE  **
		switch (Common_Variables.receive_Policy_Documents){
		
			case "Online":				//		(Level 1)
				label_online(ANY, READY).click();			
				break;

			case "Post":				//		(Level 2)
				label_byPost(ANY, READY).click();
				break;
		}
			logTestResult("Policy Document Mode To Receive "+Common_Variables.receive_Policy_Documents, true);
		//--------------------------------------------------------------------------------------------------					
		// Policy Excess 						(None/50/99) 		**  DEFAULT 99  **
		switch (Common_Variables.policy_Excess){  // Oh No - Numbers and String :-)
		
			case "99":				//		(Level 1)
				label_excessNinetynine(ANY, READY).click();			
				break;

			case "50":				//		(Level 2)
				label_excessFifty(ANY, READY).click();
				break;
		
			case "None":			//		(Level 3)
				label_excessNone(ANY, READY).click();
				break;		
		}
		logTestResult("Policy Excess Amount = "+Common_Variables.policy_Excess, true);
		//--------------------------------------------------------------------------------------------------					
		// Payment Type 						(Monthly Direct Debit/Monthly Card Payment/Annual Card Payment) 		
		//														**  DEFAULT Monthly Direct Debit ** 
		switch (Common_Variables.paymentType){
		
			case "Monthly Card Payment":						//		(Level 1)
				label_monthlyCardPayment(ANY, READY).click();			
				break;
	
			case "Annual Card Payment":							//		(Level 2)
				label_annualCardPayment(ANY, READY).click();
				break;
		
			case "Monthly Direct Debit":						//		(Level 3)
				label_monthlyDirectDebit(ANY, READY).click();
				break;
		}
		logTestResult("Policy Payment Type Is "+Common_Variables.paymentType, true);
		//--------------------------------------------------------------------------------------------------					
		// AA Membership
		if ((Common_Variables.membership) == true){
			label_applyMyAAMemberDiscount(ANY, READY).click();
			logTestResult("Has AA Membership "+Common_Variables.membership, true);
		} else {
			logTestResult("No AA Membership", true);
		}
		//--------------------------------------------------------------------------------------------------					
		// MATHS
		// TOTAL PAGE FOOTER
		String sQuoteTotalprice_Text = (String)html_hMquoteTotalprice().getProperty(".text");
		// TOTAL RH PAGE (Page SubTotals)
		String sTotalprice_Text = (String)html_hMtableTotalprice().getProperty(".text");
		logTestResult("Page SubTotals and Totals are "+sQuoteTotalprice_Text+" - "+sTotalprice_Text, true);
		System.out.println("Page SubTotals and Totals are "+sQuoteTotalprice_Text+" - "+sTotalprice_Text);
		// Compare
		vpManual("Compared_Quote_Prices", sQuoteTotalprice_Text, sTotalprice_Text).performTest();
		// Write To DataStore
		Common_Variables.totalQuotePrice = sTotalprice_Text;
		//--------------------------------------------------------------------------------------------------					
		// Navigate To NEXT Page		
		// Synchronise  - Calculation Field, null, then several attempts at calculation
		html_hMquoteTotalprice().waitForExistence(15.0, 0.25);
		// 
		sleep(1);
		button_nextsubmit(ANY, READY).waitForExistence(20,  0.25);
		button_nextsubmit().click();
		//--------------------------------------------------------------------------------------------------					
		}
}

