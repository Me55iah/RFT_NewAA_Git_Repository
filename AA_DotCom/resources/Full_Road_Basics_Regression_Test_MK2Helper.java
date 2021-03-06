// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources;
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
 * Script Name   : <b>Full_Road_Basics_Regression_Test_MK2</b><br>
 * Generated     : <b>2015/03/18 11:41:04</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  March 18, 2015
 * @author horned
 */
public abstract class Full_Road_Basics_Regression_Test_MK2Helper extends Utilities.AA_SuperHelper
{
	/**
	 * BasicBreakdownInsuranceCoverForYourCarAA: with default state.
	 *		.title : RegularExpression(Basic Breakdown Insurance)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(basic-breakdown-insurance)
	 */
	protected DocumentTestObject document_basicBreakdownInsuran() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_basicBreakdownInsuran"));
	}
	/**
	 * BasicBreakdownInsuranceCoverForYourCarAA: with specific test context and state.
	 *		.title : RegularExpression(Basic Breakdown Insurance)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(basic-breakdown-insurance)
	 */
	protected DocumentTestObject document_basicBreakdownInsuran(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_basicBreakdownInsuran"), anchor, flags);
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
	
	

	protected Full_Road_Basics_Regression_Test_MK2Helper()
	{
		setScriptName("Full_Road_Basics_Regression_Test_MK2");
	}
	
}

