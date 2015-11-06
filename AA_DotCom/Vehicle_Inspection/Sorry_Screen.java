package Vehicle_Inspection;
import resources.Common_Variables;
import resources.Vehicle_Inspection.Sorry_ScreenHelper;
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
public class Sorry_Screen extends Sorry_ScreenHelper
{
	/**
	 * Script Name   : <b>Sorry_Screen</b>
	 * Generated     : <b>23 Sep 2015 15:43:05</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/09/23
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//----------------------------------------------------------------------------------------------
		// Reason For Refusal Reported
		//----------------------------------------------------------------------------------------------
		String sRefused = Common_Variables.expectedOutcome;
		String sVehicleReg = Common_Variables.vehicleReg;
		//String sVehicleReg = "ABC123";
		//----------------------------------------------------------------------------------------------
		BrowserSync();
		//----------------------------------------------------------------------------------------------
		String sRefusalReason_Text = 
		   (String)form_sorryWeReUnableToProvideA().getProperty(".text");
		//----------------------------------------------------------------------------------------------
		if (sRefusalReason_Text.contains(sRefused)){
			logTestResult("The Vehicle ("+sVehicleReg+") "+sRefused+"  ", true);
			System.out.println("The Vehicle ("+sVehicleReg+") "+sRefused+"  ");
		}
		else{
			logTestResult("The Vehicle ("+sVehicleReg+") "+sRefused+"  ", true);
			System.out.println("The Vehicle ("+sVehicleReg+") "+sRefused+"  ");
		}
		
		//----------------------------------------------------------------------------------------------
		iE().close();
	}
}

