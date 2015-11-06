package Motor_MK2.Your__Quote;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Quote.Policy_ExcessHelper;
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
public class Policy_Excess extends Policy_ExcessHelper
{
	/**
	 * Script Name   : <b>Policy_Excess</b>
	 * Generated     : <b>3 Jul 2015 13:38:13</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/03
	 * @author horned
	 */
	public void testMain(Object[] String ) 
	{
//		//------------------------------------------------------------
//		// Test Data
//		String sVoluntaryExcess = "£250";
//		String sCompulsoryExcess = "£350";
//		String sTotalExcess = "£600";
//		String sExcessCompare = "";
//		// Test Data
		//------------------------------------------------------------
		String sVoluntaryExcess = Common_Variables.xmlVoluntaryExcess;
		String sCompulsoryExcess = Common_Variables.xmlCompulsoryExcess;
		String sTotalExcess = Common_Variables.xmlTotalExcess;
		String sExcessCompare = "";
		
		//------------------------------------------------------------
		// DATUM For Following Verification
		// Grab ALL Text (String From html - Container
		String sContainer_Text = (String)html_volxsContainer().getProperty(".text");
		//System.out.println(sContainer_Text); 
		System.out.println(" - - - - - E_X_C_E_S_S_____D_E_T_A_I_L_S - - - - - ");
		//------------------------------------------------------------
		// Initial Voluntary Excess			
		String sStartName = "Voluntary";
		String sEndName = "Total";
		int iIndex = 4;
		String sStartNameContent = "";
		//------------------------------------------------------------
		// Initial Voluntary Excess		
		logInfo(" - - - - - I_n_i_t_i_a_l_____V_o_l_u_n_t_a_r_y_____E_x_c_e_s_s - - - - -");
		subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
		//------------------------------------------------------------
		Common_Variables.xmlVoluntaryExcess = sStartNameContent;
		sVoluntaryExcess = Common_Variables.xmlVoluntaryExcess;
		//sVoluntaryExcess = (sVoluntaryExcess.substring(1, 4));
		//------------------------------------------------------------
		// Initial Compulsory Excess		
		sStartName = "Compulsory";
		sEndName = "Voluntary";
		iIndex = 3;
		//------------------------------------------------------------
		// Data Refresh
		sContainer_Text = (String)html_volxsContainer().getProperty(".text");
		// Initial Compulsory Excess		
		logInfo(" - - - - - I_n_i_t_i_a_l_____C_o_m_p_u_l_s_o_r_y_____E_x_c_e_s_s - - - - -");
		subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
		//------------------------------------------------------------
		Common_Variables.xmlCompulsoryExcess = sStartNameContent;
		sCompulsoryExcess = Common_Variables.xmlCompulsoryExcess;
		//sCompulsoryExcess = (sCompulsoryExcess.substring(1, 4));
		//------------------------------------------------------------
		// Data Refresh
		sContainer_Text = (String)html_volxsContainer().getProperty(".text");
		// Initial Total Excess		
		sStartName = "Total";
		sEndName = "Malicious ";
		//------------------------------------------------------------
		// Initial Total Excess		
		logInfo(" - - - - - I_n_i_t_i_a_l_____T_o_t_a_l_____E_x_c_e_s_s - - - - -");
		subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
		//------------------------------------------------------------
		Common_Variables.xmlTotalExcess = sStartNameContent;
		sTotalExcess = Common_Variables.xmlTotalExcess;
		//sTotalExcess = (sTotalExcess.substring(1, 4));
		//------------------------------------------------------------
		// Check Math
		sExcessCompare = (sVoluntaryExcess) + (sCompulsoryExcess);
		
		VerifyandReport("Excess_Calculations", sExcessCompare, sTotalExcess, "Excess Values");
		
		// QUoote contains Info - Not Checked For Content Currently
	
		//------------------------------------------------------------	
		sleep(1);
		// Expand Excess Details Sub Section
		link_viewFullExcessDetails().waitForExistence(10, 0.25);
		link_viewFullExcessDetails(ANY, READY).click();
		//------------------------------------------------------------	
		
		
	}
}

