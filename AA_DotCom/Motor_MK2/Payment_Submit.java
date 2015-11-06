package Motor_MK2;
import resources.Motor_MK2.Payment_SubmitHelper;
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
public class Payment_Submit extends Payment_SubmitHelper
{
	/**
	 * Script Name   : <b>Payment_Submit</b>
	 * Generated     : <b>5 Jun 2015 09:06:59</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/05
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		// Verification
		String sTitle = "Pre_Payment_Submit";
		String sExpected = "CanonicalizationMethod Algorithm";
		String sReport = "Pre Payment Submission XML Was Successfull";
		
		
		
		//Synchronisation
		text__Xml_Content().waitForExistence(20,  0.25);
		
		
		// Send Payment
		
		//--------------------------------------------------------------------
		// Scrape Following Screen (YOUR DETAILS) for ACTUAL Value to Compare
		String sActual = (String)text__Xml_Content().getProperty(".contentText");
		if (sActual.contains("CanonicalizationMethod Algorithm")){
			sActual = "CanonicalizationMethod Algorithm";
		}
		//--------------------------------------------------------------------
		// Verify Success on CAR Details (YOUR DETAILS SCREEN APPEARANCE)
		VerifyandReport(sTitle, sExpected, sActual, sReport);
		//--------------------------------------------------------------------

		//----------------------------------------------------------------
		button_submit().waitForExistence(10,  0.25);
		button_submit(ANY, READY).click();
		//----------------------------------------------------------------  TO TRY CATCH
		BrowserSync();

		
		
	}
}

