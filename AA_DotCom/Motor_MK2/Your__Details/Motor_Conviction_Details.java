package Motor_MK2.Your__Details;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Details.Motor_Conviction_DetailsHelper;
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
public class Motor_Conviction_Details extends Motor_Conviction_DetailsHelper
{
	/**
	 * Script Name   : <b>Incident_Details</b>
	 * Generated     : <b>2 Jul 2015 09:51:23</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/02
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//--------------------------------------------------------------------
		boolean bConvictions = Common_Variables.insuredConvictions;
		//--------------------------------------------------------------------
		// Motoring Convictions
		//--------------------------------------------------------------------
		//  Convictions
		if (bConvictions == true){
			label_Convictions_yes().waitForExistence(20,  0.25);
			label_Convictions_yes(ANY, READY).click();
			//--------------------------------------------------------------------			
			// Add Convictions Detail
			link_addAConviction().waitForExistence(20,  0.25);
			link_addAConviction(ANY, READY).click();
			// Add Claim/Incident Screen
			callScript("Motor_MK2.Your__Details.Add_Conviction");
		}
		//--------------------------------------------------------------------
		// No Motoring Convictions
		//--------------------------------------------------------------------
		else {
			label_Convictions_no().waitForExistence(20,  0.25);
			label_Convictions_no(ANY, READY).click();
		//--------------------------------------------------------------------
		}

}	}

