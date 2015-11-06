package Motor_MK2.Your__Quote;
import resources.Motor_MK2.Your__Quote.Check_Your_DetailsHelper;
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
	 * Generated     : <b>9 Jul 2015 11:24:45</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/09
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//-----------------------------------------------------------------------------------------
		// BrowserSync();
		button_nextsubmit().waitForExistence(5,  0.25);
		//-----------------------------------------------------------------------------------------
		// Assumptions Correct
		try {
			label_yes().waitForExistence(10, 0.25);
			if (label_yes().isShowing()){
				label_yes().waitForExistence(5,  0.25);
				label_yes(ANY, READY).click();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//-----------------------------------------------------------------------------------------
		// Submit
		button_nextsubmit().waitForExistence(5,  0.25);
		button_nextsubmit(ANY, READY).click();
		//-----------------------------------------------------------------------------------------
		
	}
}

