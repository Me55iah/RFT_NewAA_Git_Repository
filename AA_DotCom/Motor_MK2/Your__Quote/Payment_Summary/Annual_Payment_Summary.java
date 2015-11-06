package Motor_MK2.Your__Quote.Payment_Summary;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Quote.Payment_Summary.Annual_Payment_SummaryHelper;
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
public class Annual_Payment_Summary extends Annual_Payment_SummaryHelper
{
	/**
	 * Script Name   : <b>Final_Quote_Pricing</b>
	 * Generated     : <b>3 Jul 2015 13:39:53</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/03
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//-----------------------------------------------------------------------------------------
		// Test Data
		//String sPaymentFrequency = "Instalment";  // "Single Payment";           // FROM FINAL QUOTE PRICING
		// Test Data
		//-----------------------------------------------------------------------------------------
		// Payment Frequency - Type
 		String sPaymentFrequency = Common_Variables.paymentType; 
 		String sExpectedQuoteReference = Common_Variables.intermediateQuoteReference;
		String sRemainingPolicyBalance = Common_Variables.PolicyRemainingBalance;
		// String sExpectedPolicyPrice = 
		//------------------------------------------------------------------------------------------
		// Test Data
		
		// Test Data
		//------------------------------------------------------------------------------------------ ANNUAL
		// FIELDS TO CAPTURE            * * * *    Appearance Dependent on Previous Selection  * * * *
		//------------------------------------------------------------------------------------------ ANNUAL
		// Payment summary                      		Typical Format
		// 1) - Car insurance 							£n,nnn.nn
		// 2) - Motor Legal Assistance 					£nn.nn
		// 3) - Excess Protection 						£nn.nn
		// 4) - Car Hire 								£nn.nn
		// 5) - Motor Accident Plan 					£nn.nn
		// 6) - Breakdown Cover (annual direct debit) 	£nn.nn
		//------------------------------------------------------------------------------------------ ANNUAL

		// 7) - Annual payment 							£n,nnn.nn
		
		//------------------------------------------------------------------------------------------ ANNUAL
		// Quote Reference			                    Typical Format
		// 8) - Please quote reference: 				WW3MT225BNSR
		//------------------------------------------------------------------------------------------ ANNUAL

		
				
		// Default MONTHLY OPTION
		String sContainer_Text = "";
		//--------------------------------------------
		// MONTHLY PAYMENTS (Default)
		//--------------------------------------------
		if (sPaymentFrequency.contains("Instalment")){
			
			//------------------------------------------------------------
			// DATUM For Following Verification
			// Grab ALL Text (String From html - Container
			sContainer_Text = (String)html_main().getProperty(".text");
			//System.out.println(sContainer_Text);
			System.out.println(" - - - - - I N S T A L L M E N T    P R I C I N G S - - - - - ");
			//------------------------------------------------------------
			// Final Monthly Costing	
			// DEPOSIT
			String sStartName = "Car insurance initial card payment:"; // Car insurance initial card payment:
//			String sStartName = "Initial deposit (card payment):";
			String sEndName = "11 monthly payments of:";               // 11 monthly payments of:
			int iIndex = 1;
			String sStartNameContent = null;
			//------------------------------------------------------------
			// Final Monthly Payments		
			logInfo(" - - - - - M_o_n_t_h_l_y_____D_e_p_o_s_i_t - - - - -");
			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);            ///////////////////
			//------------------------------------------------------------
			Common_Variables.depositAmount = Common_Variables.sActual;
			//------------------------------------------------------------
			// 11 Monthly Costing	
			// MONTHLY
			sStartName = "11 monthly payments of:";
			sEndName = "Total credit:";
			iIndex = 1;
			sStartNameContent = null;
			//------------------------------------------------------------
			// Final Monthly Deposit		
			logInfo(" - - - - - M_o_n_t_h_l_y_____P_A_Y_M_E_N_T_S - - - - -");
			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
			//------------------------------------------------------------
			Common_Variables.monthlyPrice = Common_Variables.sActual;
			//------------------------------------------------------------
			// Final Monthly Costing	
			// TOTAL CREDIT
			sStartName = "Total credit:";
			sEndName = "Total payable:";
			iIndex = 1;
			sStartNameContent = null;
			//------------------------------------------------------------
			// Final Total Credit		
			logInfo(" - - - - - T_o_t_a_l_____C_r_e_d_i_t - - - - -");
			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
			//------------------------------------------------------------
			Common_Variables.totalCredit = Common_Variables.sActual;
			Common_Variables.PolicyRemainingBalance = Common_Variables.sActual;
			//------------------------------------------------------------
			// Balance Remaining	
			sStartName = "Total credit:";
			sEndName = "Total payable:";
			iIndex = 1;
			sStartNameContent = null;
			//------------------------------------------------------------
			// Intermediate Quote Reference
			logInfo(" - - - - - Q_u_o_t_e______B_a_l_a_n_c_e - - - - -");
			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
			//------------------------------------------------------------
			Common_Variables.PolicyRemainingBalance = Common_Variables.sActual;
			
			//------------------------------------------------------------
			// One Off Card Payment Charge			
			//------------------------------------------------------------
			// TOTAL PAYABLE
			sStartName = "Total payable:";
			sEndName = "**"; // Detect Space
			iIndex = 1;
			sStartNameContent = null;
			//------------------------------------------------------------
			// Final Total Credit		
			logInfo(" - - - - - F_i_n_a_l_____T_o_t_a_l_____P_a_y_a_b_l_e - - - - -");
			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
			//------------------------------------------------------------
			Common_Variables.totalPayable = Common_Variables.sActual;
			//------------------------------------------------------------

			sContainer_Text = (String)document_carInsuranceYourQuote().getProperty(".text");
			//System.out.println(sContainer_Text);

			//------------------------------------------------------------
			// QUOTE REFERENCE	
			sStartName = "Please quote reference:";
			sEndName = "Call us on:";
			iIndex = 1;
			sStartNameContent = null;
			//------------------------------------------------------------
			// Intermediate Quote Reference
			logInfo(" - - - - - Q_u_o_t_e______R_e_f_e_r_e_n_c_e - - - - -");
			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
			//------------------------------------------------------------
			Common_Variables.intermediateQuoteReference = Common_Variables.sActual;
			//------------------------------------------------------------

			
			// CARRY TOTAL PAYABLE TO FINAL PAGE CALCULATION 
			
 			// stop();
			// * * * * * *    ADD ONS    * * * * * * start
			
			// THESE ARE TOTALED ON THIS PAGE - LOGIC INDICATES SELECTIONS, TOTALS ARE CARRIED FORWARD FOR VERIFICATION
						
			// * * * * * *    ADD ONS    * * * * * * end
			//------------------------------------------------------------
		}
		if (sPaymentFrequency.contains("Single Payment")){
			sContainer_Text = (String)html_main().getProperty(".text");
			//System.out.println(sContainer_Text);
			System.out.println(" - - - - - F I N A L    S I N G L E    P A Y M E N T    P R I C I N G S - - - - - ");
			//------------------------------------------------------------
			// Final Monthly Costing	
			// TOTAL PAYABLE
			String sStartName = "insurance"; 				// payment summary Car insurance
			String sEndName = "Car";               // Car insurance
			int iIndex = 4; // third of 4 Appearances           // 1
			String sStartNameContent = null;
			//------------------------------------------------------------
			// Final Total		
			logInfo(" - - - - - F_i_n_a_l_____T_o_t_a_l_____P_a_y_a_b_l_e - - - - -");
			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
			//------------------------------------------------------------
			// For Checks On DONE Page
			Common_Variables.carInsuranceAnnual = Common_Variables.sActual;
			//------------------------------------------------------------
			// QUOTE REFERENCE DUPLICATION - REMOVE TO COMMON
			sContainer_Text = (String)form_quoteForm().getProperty(".text");
			// System.out.println(sContainer_Text);
			//------------------------------------------------------------
			// QUOTE REFERENCE	
			sStartName = "Please quote reference:";
			sEndName = "Call us on:";
			iIndex = 1;
			sStartNameContent = null;
			//------------------------------------------------------------
			// Intermediate Quote Reference
			logInfo(" - - - - - Q_u_o_t_e______R_e_f_e_r_e_n_c_e - - - - -");
			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
			//------------------------------------------------------------
			Common_Variables.intermediateQuoteReference = Common_Variables.sActual;
			//------------------------------------------------------------
			// One Off Card Payment Charge			
			//------------------------------------------------------------
			// TOTAL PAYABLE
			sStartName = "Total payable:";
			sEndName = " "; // Detect Space
			iIndex = 1;
			sStartNameContent = null;
			//------------------------------------------------------------
			// Final Total Credit		
			logInfo(" - - - - - F_i_n_a_l_____T_o_t_a_l_____P_a_y_a_b_l_e - - - - -");
			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
			//------------------------------------------------------------
			Common_Variables.totalPayable = Common_Variables.sActual;
			//------------------------------------------------------------
		}				
		//-----------------------------------------------------------------------------------------
		//stop();
	}
}

