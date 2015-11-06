package Motor_MK2.Your__Quote;
import resources.Motor_MK2.Your__Quote.Extra_Cover_DefaultsHelper;
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
public class Extra_Cover_Defaults extends Extra_Cover_DefaultsHelper
{
	/**
	 * Script Name   : <b>Extra_Cover_Defaults</b>
	 * Generated     : <b>1 Oct 2015 09:03:17</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/10/01
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//----------------------------------
		// Page Default Value Checks		 
		//----------------------------------
		
		String sContainer_Text = (String)html_main().getProperty(".text");
		//----------------------------------
		// Free Breakdown Cover
		//----------------------------------
		if (sContainer_Text.contains("Add free breakdown cover")){
			logTestResult("Add free breakdown cover is NOT Selected by Default", true);
		}
		else{
			logTestResult("Add free breakdown cover is SELECTED (INCORRECTLY) by Default", false);
		}
		//----------------------------------
		// Add Legal Assistance
		//----------------------------------
		if (sContainer_Text.contains("Add legal assistance")){
			logTestResult("Add legal assistance is NOT Selected by Default", true);
		}
		else{
			logTestResult("Add legal assistance is SELECTED (INCORRECTLY) by Default", false);
		}
		//----------------------------------
		// Add Personal Accident Cover
		//----------------------------------
		if (sContainer_Text.contains("Add personal accident cover")){
			logTestResult("Add personal accident cover is NOT Selected by Default", true);
		}
		else{
			logTestResult("Add personal accident cover is SELECTED (INCORRECTLY) by Default", false);
		}
		//----------------------------------
		// Courtesy Car upgrade
		//----------------------------------
		if (sContainer_Text.contains("Add courtesy car upgrade")){
			logTestResult("Add courtesy car upgrade is NOT Selected by Default", true);
		}
		else{
			logTestResult("Add courtesy car upgrade is SELECTED (INCORRECTLY) by Default", false);
		}
		//----------------------------------
		// Add policy excess protection
		//----------------------------------
		if (sContainer_Text.contains("Add policy excess protection")){
			logTestResult("Add policy excess protection is NOT Selected by Default", true);
		}
		else{
			logTestResult("Add policy excess protection is SELECTED (INCORRECTLY) by Default", false);
		}
		
	}
}

