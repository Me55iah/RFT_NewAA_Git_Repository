// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources;

import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>Full_HER_Regression_Test</b><br>
 * Generated     : <b>2013/10/23 16:40:05</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  October 23, 2013
 * @author courtl
 */
public abstract class Full_HER_Regression_TestHelper extends RationalTestScript
{
	/**
	 * htmlBrowser: with default state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject browser_htmlBrowser() 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"));
	}
	/**
	 * htmlBrowser: with specific test context and state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject browser_htmlBrowser(TestObject anchor, long flags) 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"), anchor, flags);
	}
	
	/**
	 * _ThankYouForBuyingAAHomeInsuranceTheAA: with default state.
	 *		.title : RegularExpression(: Thank you for buying AA .*  Insurance - The AA.*)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(https://.*)
	 */
	protected DocumentTestObject document__ThankYouForBuyingAAH() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document__ThankYouForBuyingAAH"));
	}
	/**
	 * _ThankYouForBuyingAAHomeInsuranceTheAA: with specific test context and state.
	 *		.title : RegularExpression(: Thank you for buying AA .*  Insurance - The AA.*)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(https://.*)
	 */
	protected DocumentTestObject document__ThankYouForBuyingAAH(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document__ThankYouForBuyingAAH"), anchor, flags);
	}
	
	

	protected Full_HER_Regression_TestHelper()
	{
		setScriptName("Full_HER_Regression_Test");
	}
	
}
