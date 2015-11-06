package Motor_MK2;
import resources.Motor_MK2.Thank_You_For_BuyingHelper;
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
public class Thank_You_For_Buying extends Thank_You_For_BuyingHelper
{
	/**
	 * Script Name   : <b>Thank_You_For_Buying</b>
	 * Generated     : <b>5 Jun 2015 09:23:31</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/05
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//--------------------------------------------------------------------
		// Verification
		String sTitle = "Purchase_Success";
		String sExpected = "Thank you for buying AA Car Insurance";
		String sReport = "Purchase Success, Thank You FOr Buying AA Insurance Was Reported";
		//--------------------------------------------------------------------
		//Synchronisation
		html_main().waitForExistence(20,  0.25);
		//--------------------------------------------------------------------		
		// Send Payment
		//--------------------------------------------------------------------
		// Scrape Following Screen (YOUR DETAILS) for ACTUAL Value to Compare
		String sActual = (String)html_main().getProperty(".contentText");
		if (sActual.contains("Thank you for buying AA Car Insurance")){
			sActual = "Thank you for buying AA Car Insurance";
		}
		//--------------------------------------------------------------------
		// Verify Success on CAR Details (YOUR DETAILS SCREEN APPEARANCE)
		VerifyandReport(sTitle, sExpected, sActual, sReport);
		//--------------------------------------------------------------------

		
		CloseAllBrowsers();
	}
}

