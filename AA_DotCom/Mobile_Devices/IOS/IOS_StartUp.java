package Mobile_Devices.IOS;
import resources.Mobile_Devices.IOS.IOS_StartUpHelper;
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
public class IOS_StartUp extends IOS_StartUpHelper
{
	/**
	 * Script Name   : <b>IOS_StartUp</b>
	 * Generated     : <b>30 Oct 2015 11:16:41</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/10/30
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//--------------------------------
		// Start Environment
		startBrowser("IE", "IPadPeek.com");
		//--------------------------------
		
		//--------------------------------
		// Start Emulator
		text_url(ANY, READY).click();
		iE(document_iPadPeekIPhonePeek(),DEFAULT_FLAGS).inputKeys("prelive1.theaa.com{ENTER}");
		//--------------------------------

		//--------------------------------
		// Navigate BrakeDown
		link_breakdownCover(ANY, READY).click();
		//--------------------------------

		//--------------------------------
		// Select £105
		
		// HTML Browser
		// Document: iPad Peek / iPhone Peek: http://ipadpeek.com/
		text_url().click(atPoint(432,17));
		html_kbd().click(atPoint(622,109));
		// Document: Breakdown Cover | Roadside Assistance & Car Recovery | AA: http://www.theaa.com/breakdown-cover/
		link_joinNow£105().click();
		// Document: UK Breakdown Cover | View and choose your cover | AA: http://www.theaa.com/breakdown-cover/uk-breakdown/view-options.do?optMshp=vcon300&ico=road_home&icl=bundle&icc=b2
		form_optionsForm().click();
		html_breakdownRepairCover().click(atPoint(643,88));
		button_continuesubmit().click();
		iE(document_iPadPeekIPhonePeek(),DEFAULT_FLAGS).inputChars("ABC123");
		button_updateYourQuotesubmit().click();
		button_updateYourQuotesubmit().click();
		button_continuesubmit().click();
		// Document: Breakdown Cover | Your details | AA: https://www.theaa.com/breakdown-cover/uk-breakdown/view-customerdetails.do?comingFrom=quote&newJourney=true&optMshp=scon300PLCP
		label_mr().click();
		text_policyHolderFirstname().click(atPoint(110,51));
		iE(document_iPadPeekIPhonePeek(),DEFAULT_FLAGS).inputChars("Johnny");
		text_policyHolderSurname().click(atPoint(41,38));
		iE(document_iPadPeekIPhonePeek(),DEFAULT_FLAGS).inputChars("Rotten");
		text_policyHolderDobDate().click(atPoint(125,31));
		iE(document_iPadPeekIPhonePeek(),DEFAULT_FLAGS).inputChars("19/05/1959");
		label_iHaveABlueBadgeIssuedByM().click();
		text_addressAddressLine1().click(atPoint(171,48));
		iE(document_iPadPeekIPhonePeek(),DEFAULT_FLAGS).inputChars("1");
		text_addressPostcode().click(atPoint(136,26));
		iE(document_iPadPeekIPhonePeek(),DEFAULT_FLAGS).inputChars("RG21 4AE");
		button_findYourFullAddressbutt().click();
		text_phoneNumber().click(atPoint(182,44));
		iE(document_iPadPeekIPhonePeek(),DEFAULT_FLAGS).inputChars("01256987654");
		text_mobileNumber().click(atPoint(70,35));
		iE(document_iPadPeekIPhonePeek(),DEFAULT_FLAGS).inputChars("07788987654");
		text_emailAddress().click(atPoint(145,31));
		iE(document_iPadPeekIPhonePeek(),DEFAULT_FLAGS).inputChars("jrotten@theaa.com");
		button_continuesubmit2().click();
		// Document: Breakdown Cover | Your details | AA: https://www.theaa.com/breakdown-cover/uk-breakdown/submit-customerdetails.do
		text_phoneNumber2().click(atPoint(277,42));
		iE(document_iPadPeekIPhonePeek(),DEFAULT_FLAGS).inputChars("0125");
		text_phoneNumber2().click(atPoint(227,34));
		iE(document_iPadPeekIPhonePeek(),DEFAULT_FLAGS).inputChars("0");
		text_phoneNumber2().click(atPoint(179,33));
		 
		//--------------------------------

		
		
		
		
		
		
		
		
		
		
		//--------------------------------
		// Close IPad Emulator
		link_breakdownCover(ANY, READY).click();
		//--------------------------------

	}
}

