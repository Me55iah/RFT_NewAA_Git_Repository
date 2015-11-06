// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Motor_MK2.Please_Call_Us;
import Utilities.AA_SuperHelper;
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
 * Script Name   : <b>Quote_Failure</b><br>
 * Generated     : <b>2015/09/14 10:14:25</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  September 14, 2015
 * @author horned
 */
public abstract class Quote_FailureHelper extends Utilities.AA_SuperHelper
{
	/**
	 * mainContent: with default state.
	 *		.id : mainContent
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_mainContent() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_mainContent"));
	}
	/**
	 * mainContent: with specific test context and state.
	 *		.id : mainContent
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_mainContent(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_mainContent"), anchor, flags);
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
	
	

	protected Quote_FailureHelper()
	{
		setScriptName("Motor_MK2.Please_Call_Us.Quote_Failure");
	}
	
}
