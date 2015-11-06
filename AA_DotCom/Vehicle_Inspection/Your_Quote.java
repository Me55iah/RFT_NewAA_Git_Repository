package Vehicle_Inspection;
import resources.Common_Variables;
import resources.Vehicle_Inspection.Your_QuoteHelper;
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
public class Your_Quote extends Your_QuoteHelper
{
	/**
	 * Script Name   : <b>Your_Quote</b>
	 * Generated     : <b>18 Sep 2015 14:50:04</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/09/18
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//------------------------------------------------------------------------------------------  		
		String sAAMember = Common_Variables.membershipYN;
		String sQuoteType = Common_Variables.quoteType;
		//------------------------------------------------------------------------------------------
		// Test Data
//		String sAAMember = "No";
//		String sQuoteType = "Basic";
		// Test Data
		//------------------------------------------------------------------------------------------
		// AA Member
		//----------
		switch (sAAMember){
			
			case "Yes":
				label_yes(ANY, READY).click();
				logInfo("AA Member Selected");
				break;
				//--------------------------------------------
			case "No":
				label_no(ANY, READY).click();
				logInfo("AA Member NOT Selected");
				break;
				//--------------------------------------------
		}
		//------------------------------------------------------------------------------------------		
		// Quote Type
		//----------
		switch (sQuoteType){
			
			case "Basic":
				html_basic(ANY, READY).click();
				logInfo("Basic Cover Selected");
				break;
				//--------------------------------------------
			case "Comprehensive":
				html_comprehensive(ANY, READY).click();
				logInfo("Comprehensive Cover Selected");
				break;
				//--------------------------------------------
		}
		
		//------------------------------------------------------------------------------------------
		button_continuesubmit().waitForExistence(2,  0.25);
		button_continuesubmit(ANY, READY).click();
		//------------------------------------------------------------------------------------------
	}
}

