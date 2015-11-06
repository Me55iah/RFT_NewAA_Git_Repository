package Aggregators.Home;
import resources.Aggregators.Home.Phones_EMailHelper;
import Utilities.pageDown;

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
public class Phones_EMail extends Phones_EMailHelper
{
	/**
	 * Script Name   : <b>Phones_EMail</b>
	 * Generated     : <b>23 Jun 2015 09:55:17</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/23
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//---------------------------------------------------------------------
		BrowserSync();
		//---------------------------------------------------------------------
		// Daytime Phone
		html_daytime().waitForExistence(10,  0.25);
		html_daytime(ANY, READY).click(atPoint(89,14));
		browser_htmlBrowser(document_homeInsuranceYouAndYo(),DEFAULT_FLAGS).inputChars("01256123456");
		// ------------------------------------------------------------------------------------------
		// Mobile Phone
		html_mobile().waitForExistence(10,  0.25);
		html_mobile(ANY, READY).click(atPoint(89,11));
		browser_htmlBrowser(document_homeInsuranceYouAndYo(),DEFAULT_FLAGS).inputChars("07788123456");
		// ------------------------------------------------------------------------------------------
		// EMail
		text_email().waitForExistence(10,  0.25);
		text_email(ANY, READY).click(atPoint(98,8));
		browser_htmlBrowser(document_homeInsuranceYouAndYo(),DEFAULT_FLAGS).inputChars("testing@theaa.com");
		// ------------------------------------------------------------------------------------------
		callScript("Utilities.pageDown");
		// ------------------------------------------------------------------------------------------
	}
}

