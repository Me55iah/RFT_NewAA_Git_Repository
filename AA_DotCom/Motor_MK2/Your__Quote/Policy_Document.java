package Motor_MK2.Your__Quote;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Quote.Policy_DocumentHelper;
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
public class Policy_Document extends Policy_DocumentHelper
{
	/**
	 * Script Name   : <b>Policy_Document</b>
	 * Generated     : <b>3 Jul 2015 13:39:20</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/03
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//-----------------------------------------------------------------------------------------
		// Do You Know The Car Registration Number
		String sPolicyDocuments = Common_Variables.policyDocuments; 	// Excess	
		//------------------------------------------------------------------------------------------
		// Default Send Online/Email
		switch (sPolicyDocuments){
			// POST SNAIL
			case "post":
				label_sendByPost().waitForExistence(5, 0.25);			
				label_sendByPost(ANY, READY).click();
				break;
			// EMAIL
			case "mail":
				label_sendOnline().waitForExistence(5, 0.25);			
				label_sendOnline(ANY, READY).click();
				break;	
		}		
		//-----------------------------------------------------------------------------------------

	}
}

