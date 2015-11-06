package Motor_MK2.Your__Details;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Details.Motor_Claim_DetailsHelper;
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
public class Motor_Claim_Details extends Motor_Claim_DetailsHelper
{
	/**
	 * Script Name   : <b>Motoring_Convictions</b>
	 * Generated     : <b>1 Jul 2015 13:22:25</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/01
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//--------------------------------------------------------------------
		boolean bClaims = Common_Variables.insuredClaims;
		//--------------------------------------------------------------------
		// Motoring Claims
		//--------------------------------------------------------------------
		// Claims
		if (bClaims == true){
			label_Claims_yes().waitForExistence(20,  0.25);
			label_Claims_yes(ANY, READY).click();
			//--------------------------------------------------------------------			
			// Add Convictions Detail
			link_addClaim().waitForExistence(20,  0.25);
			link_addClaim(ANY, READY).click();
			// Add Claim/Incident Screen
			callScript("Motor_MK2.Your__Details.Add_Claim");
		}
		//--------------------------------------------------------------------
		// No Motoring Claims
		//--------------------------------------------------------------------
		else {
			label_Claims_no().waitForExistence(20,  0.25);
			label_Claims_no(ANY, READY).click();
		//--------------------------------------------------------------------
		}

	}
}

