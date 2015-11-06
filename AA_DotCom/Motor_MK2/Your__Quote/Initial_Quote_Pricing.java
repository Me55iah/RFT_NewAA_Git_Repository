package Motor_MK2.Your__Quote;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Quote.Initial_Quote_PricingHelper;
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
public class Initial_Quote_Pricing extends Initial_Quote_PricingHelper
{
	/**
	 * Script Name   : <b>Initial_Quote_Pricing</b>
	 * Generated     : <b>3 Jul 2015 11:37:15</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/03
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//--------------------------------------------------------------------------------------------------------------------
		// STRUCTURE CHANGED 7/8/15 - Top Page Calculation Now Fails - Page Function Not Updating Correctly - WATCH THIS - DH
		//--------------------------------------------------------------------------------------------------------------------
		
		//------------------------------------------------------------
		// DATUM For Following Verification
		// Grab ALL Text (String From html - Container
		String sContainer_Text = (String)html_main().getProperty(".text");
		// System.out.println(sContainer_Text);
		System.out.println(" - - - - - I N I T I A L   P R I C I N G S - - - - - ");
		//------------------------------------------------------------
		// Initial Monthly Costing		
		String sStartName = "Pay monthly";
		String sEndName = "Select"; // 
		int iIndex = 1;
		String sStartNameContent = null;
		//------------------------------------------------------------
		// Initial Monthly Costing		
		logInfo(" - - - - - I_n_i_t_i_a_l_____M_o_n_t_h_l_y_____C_o_s_t_i_n_g - - - - -");
		subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
		String sInitialMonthlyCost_TopPage = Common_Variables.sActual;
		Common_Variables.initialMonthlyCost = sInitialMonthlyCost_TopPage;
		//------------------------------------------------------------
		// Initial Annual Costing		
		sStartName = "Annual payment";
		sEndName = "Select";    // Quote features
		//------------------------------------------------------------
		// Initial Annual Costing		
		logInfo(" - - - - - I_n_i_t_i_a_l_____A_n_n_u_a_l_____C_o_s_t_i_n_g - - - - -");
		subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
		String sInitialAnnualCost_TopPage = Common_Variables.sActual;
		Common_Variables.initialAnnualCost = sInitialAnnualCost_TopPage;
		//------------------------------------------------------------
		// Initial Monthly Costing		
		sStartName = "Pay monthly";
		sEndName = "Select";
		iIndex = 1;                              // SHOULD BE 2 - PAGE IN STATE OF FLUX - 
		sStartNameContent = null;
		//------------------------------------------------------------
		// Initial Monthly Costing		
		logInfo(" - - - - - I_n_i_t_i_a_l_____M_o_n_t_h_l_y_____C_o_s_t_i_n_g - - - - -");
		subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
		String sInitialMonthlyCost_BottomPage = Common_Variables.sActual;		
		//------------------------------------------------------------
		// Initial Annual Costing		
		sStartName = "Annual payment";
		sEndName = "Select";
		//------------------------------------------------------------
		// Initial Annual Costing		
		logInfo(" - - - - - I_n_i_t_i_a_l_____A_n_n_u_a_l_____C_o_s_t_i_n_g - - - - -");
		subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
		String sInitialAnnualCost_BottomPage = Common_Variables.sActual;
		//------------------------------------------------------------	
		// ANNUAL COSTS MATCH ACROSS INITIAL QUOTE PAGE
		String sTitle = "Annual_Costs_Match"; String sReport = sTitle;
		//                     |---------- Actual --------|---------- Expected ----------|
		VerifyandReport(sTitle, sInitialAnnualCost_TopPage, sInitialAnnualCost_BottomPage, sReport);
		//------------------------------------------------------------	
		// MONTHLY COSTS MATCH ACROSS INITIAL QUOTE PAGE
		sTitle = "Monthly_Costs_Match"; sReport = sTitle;
		//                     |---------- Actual --------|---------- Expected ----------|
		VerifyandReport(sTitle, sInitialMonthlyCost_TopPage, sInitialMonthlyCost_BottomPage, sReport);
		//------------------------------------------------------------		
	}
}

