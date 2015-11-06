// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Utilities;

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
 * Script Name   : <b>IE11_Page_Loaded</b><br>
 * Generated     : <b>2015/05/06 16:03:03</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  May 06, 2015
 * @author horned
 */
public abstract class IE11_Page_LoadedHelper extends RationalTestScript
{
	/**
	 * WaitingForPrelive1TheaaCom: with default state.
	 *		.class : Html.HtmlBrowser.Tab
	 * 		.name : RegularExpression(theaa)
	 */
	protected BrowserTabTestObject Tab1() 
	{
		return new BrowserTabTestObject(
                        getMappedTestObject("Tab1"));
	}
	/**
	 * WaitingForPrelive1TheaaCom: with specific test context and state.
	 *		.class : Html.HtmlBrowser.Tab
	 * 		.name : RegularExpression(theaa)
	 */
	protected BrowserTabTestObject Tab1(TestObject anchor, long flags) 
	{
		return new BrowserTabTestObject(
                        getMappedTestObject("Tab1"), anchor, flags);
	}
	
	/**
	 * htmlBrowser: with default state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject iE() 
	{
		return new BrowserTestObject(
                        getMappedTestObject("iE"));
	}
	/**
	 * htmlBrowser: with specific test context and state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject iE(TestObject anchor, long flags) 
	{
		return new BrowserTestObject(
                        getMappedTestObject("iE"), anchor, flags);
	}
	
	

	protected IE11_Page_LoadedHelper()
	{
		setScriptName("Utilities.IE11_Page_Loaded");
	}
	
}

