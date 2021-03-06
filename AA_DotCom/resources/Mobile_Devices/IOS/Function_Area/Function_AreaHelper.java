// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Mobile_Devices.IOS.Function_Area;

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
 * Script Name   : <b>Function_Area</b><br>
 * Generated     : <b>2015/10/30 13:58:49</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  October 30, 2015
 * @author horned
 */
public abstract class Function_AreaHelper extends RationalTestScript
{
	/**
	 * iPadPeekIPhonePeek: with default state.
	 *		.title : iPad Peek / iPhone Peek
	 * 		.class : Html.HtmlDocument
	 * 		.url : http://ipadpeek.com/
	 */
	protected DocumentTestObject document_iPadPeekIPhonePeek() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_iPadPeekIPhonePeek"));
	}
	/**
	 * iPadPeekIPhonePeek: with specific test context and state.
	 *		.title : iPad Peek / iPhone Peek
	 * 		.class : Html.HtmlDocument
	 * 		.url : http://ipadpeek.com/
	 */
	protected DocumentTestObject document_iPadPeekIPhonePeek(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_iPadPeekIPhonePeek"), anchor, flags);
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
	
	/**
	 * httpsPrelive1TheaaComBreakdownCoverUkBreakdown: with default state.
	 *		.id : url
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_url() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_url"));
	}
	/**
	 * httpsPrelive1TheaaComBreakdownCoverUkBreakdown: with specific test context and state.
	 *		.id : url
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_url(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_url"), anchor, flags);
	}
	
	

	protected Function_AreaHelper()
	{
		setScriptName("Mobile_Devices.IOS.Function_Area.Function_Area");
	}
	
}

