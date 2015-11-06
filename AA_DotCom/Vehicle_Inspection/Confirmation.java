package Vehicle_Inspection;
import resources.Vehicle_Inspection.ConfirmationHelper;
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
import com.rational.test.ft.value.managers.NullObjectValue;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author horned
 */
public class Confirmation extends ConfirmationHelper
{
	/**
	 * Script Name   : <b>Confirmation</b>
	 * Generated     : <b>22 Sep 2015 10:05:30</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/09/22
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//----------------------------------------------------------------------
		// Verify SUCCESS of Journey
		// Grab Inspection Details and Report
		//----------------------------------------------------------------------
		try {			
			//----------------------------------------------------------------------				
			html_thankYou().waitForExistence(20.0,  0.25);
			//----------------------------------------------------------------------				
			String sPaymentSuccess_Text = (String)html_thankYou().getProperty(".text");		
			//----------------------------------------------------------------------				
			System.out.println(" PAYMENT SUCCESS * * * "+sPaymentSuccess_Text+"* * * ");
			logTestResult(" PAYMENT SUCCESS * * * "+sPaymentSuccess_Text+"* * * ", true);		
			//----------------------------------------------------------------------				
		} catch (Exception e) {			
			logTestResult(" There Is A Problem WIth The CONFIRMATION Page - Quote Text Is NULL, Payment Gateway Issue or The Page Structure Changed?", false);		
		}
		//----------------------------------------------------------------------	
		System.out.println("Test Journey Completed");
		System.out.println("---------------------------------------------------");
		iE().close();
		//stop();
		//----------------------------------------------------------------------	
	}		
}

