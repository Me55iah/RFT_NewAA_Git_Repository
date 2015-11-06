package Motor_MK2;
import resources.Motor_MK2.Check_Your_DetailsHelper;
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
public class Check_Your_Details extends Check_Your_DetailsHelper
{
	/**
	 * Script Name   : <b>Check_Your_Details</b>
	 * Generated     : <b>3 Jun 2015 11:28:52</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/03
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		// TODO Insert code here
	
	
	
		
		
		
		//--------------------------------------------
		BrowserSync();
		//--------------------------------------------		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//--------------------------------------------
		// Assumptions Are Correct
		label_yes().waitForExistence(20,  0.25);
		label_yes(ANY, READY).click();
		
		
		//--------------------------------------------
		// Submit  // DONE BY THE CALLER
		//button_nextsubmit().waitForExistence(20,  0.25);		
		//button_nextsubmit(ANY, READY).click();
	
	
	
	}
}

