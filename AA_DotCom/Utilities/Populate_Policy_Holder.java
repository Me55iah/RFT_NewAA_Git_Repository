package Utilities;
import resources.Utilities.Populate_Policy_HolderHelper;
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
public class Populate_Policy_Holder extends Populate_Policy_HolderHelper
{
	/**
	 * Script Name   : <b>Populate_Poicy_Holder</b>
	 * Generated     : <b>11 Dec 2014 14:14:59</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/12/11
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		// Populate Police Holder Details
		
		policyHolderTitlem().waitForExistence(20.0,  0.25);
		
		policyHolderTitlem(ANY, READY).click();
		policyHolderFirstname(ANY, READY).click(atPoint(60,9));
		iE(breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("Frederick");
		policyHolderSurname(ANY, READY).click(atPoint(68,13));
		iE(breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("Mercurial");
		policyHolderDobDate(ANY, READY).click(atPoint(31,19));
		iE(breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("10/03/1965");
		addressAddressLine1(ANY, READY).click(atPoint(39,9));
		iE(breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("28");
		addressPostcode(ANY, READY).click(atPoint(51,14));
		iE(breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("RG24 8GB");
		button_findYourFullAddressbutt(ANY, READY).click();
		
		emailAddress().waitForExistence(20.0,  0.25);
		
		emailAddress(ANY, READY).click(atPoint(147,19));
		sleep(0.5);
		iE(breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("tia@theaa.com");
		sleep(0.5);
		phoneNumber(ANY, READY).click(atPoint(127,10));
		sleep(0.5);
		iE(breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("07788 456456");
		sleep(0.5);
		mobileNumber(ANY, READY).click(atPoint(115,11));
		sleep(0.5);
		iE(breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("07788 456456");

		// hit continue
		continuesubmit(ANY, READY).click();
		
		logInfo("Policy Holder Address Details Populated");
	}
}

