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
 * Script Name   : <b>Full_EBC_Regression_Test</b><br>
 * Generated     : <b>2014/06/25 07:51:09</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  June 25, 2014
 * @author courtl
 */
public abstract class Full_EBC_Regression_TestHelper extends RationalTestScript
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
	 * ChromeLegacyWindow: with default state.
	 *		.text : Chrome Legacy Window
	 * 		.class : Chrome_RenderWidgetHostHWND
	 * 		.name : Chrome Legacy Window
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject chromeLegacyWindowwindow() 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("chromeLegacyWindowwindow"));
	}
	/**
	 * ChromeLegacyWindow: with specific test context and state.
	 *		.text : Chrome Legacy Window
	 * 		.class : Chrome_RenderWidgetHostHWND
	 * 		.name : Chrome Legacy Window
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject chromeLegacyWindowwindow(TestObject anchor, long flags) 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("chromeLegacyWindowwindow"), anchor, flags);
	}
	
	/**
	 * EuropeanBreakdownCoverYourDetailsTheAA: with default state.
	 *		.title : RegularExpression(European Breakdown Cover.*)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(https://.*)
	 */
	protected DocumentTestObject document_europeanBreakdownCove() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_europeanBreakdownCove"));
	}
	/**
	 * EuropeanBreakdownCoverYourDetailsTheAA: with specific test context and state.
	 *		.title : RegularExpression(European Breakdown Cover.*)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(https://.*)
	 */
	protected DocumentTestObject document_europeanBreakdownCove(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_europeanBreakdownCove"), anchor, flags);
	}
	
	/**
	 * httpsWwwGoogleCoUk_ChromeNewtabEspv2IeUTF8: with default state.
	 *		.title : 
	 * 		.class : Html.HtmlDocument
	 * 		.url : https://www.google.co.uk/_/chrome/newtab?espv=2&ie=UTF-8
	 */
	protected DocumentTestObject document_httpsWwwGoogleCoUk_Ch() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_httpsWwwGoogleCoUk_Ch"));
	}
	/**
	 * httpsWwwGoogleCoUk_ChromeNewtabEspv2IeUTF8: with specific test context and state.
	 *		.title : 
	 * 		.class : Html.HtmlDocument
	 * 		.url : https://www.google.co.uk/_/chrome/newtab?espv=2&ie=UTF-8
	 */
	protected DocumentTestObject document_httpsWwwGoogleCoUk_Ch(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_httpsWwwGoogleCoUk_Ch"), anchor, flags);
	}
	
	/**
	 * NewTabGoogleChrome: with default state.
	 *		.text : New Tab - Google Chrome
	 * 		.class : Chrome_WidgetWin_1
	 * 		.processName : chrome.exe
	 * 		.name : New Tab - Google Chrome
	 */
	protected TopLevelSubitemTestObject newTabGoogleChromewindow() 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("newTabGoogleChromewindow"));
	}
	/**
	 * NewTabGoogleChrome: with specific test context and state.
	 *		.text : New Tab - Google Chrome
	 * 		.class : Chrome_WidgetWin_1
	 * 		.processName : chrome.exe
	 * 		.name : New Tab - Google Chrome
	 */
	protected TopLevelSubitemTestObject newTabGoogleChromewindow(TestObject anchor, long flags) 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("newTabGoogleChromewindow"), anchor, flags);
	}
	
	

	protected Full_EBC_Regression_TestHelper()
	{
		setScriptName("Full_EBC_Regression_Test");
	}
	
}

