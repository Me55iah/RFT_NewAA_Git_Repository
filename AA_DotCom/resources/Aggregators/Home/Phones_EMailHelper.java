// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Aggregators.Home;
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
 * Script Name   : <b>Phones_EMail</b><br>
 * Generated     : <b>2015/06/23 10:18:17</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  June 23, 2015
 * @author horned
 */
public abstract class Phones_EMailHelper extends Utilities.AA_SuperHelper
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
	 * HomeInsuranceYouAndYourHomeTheAA: with default state.
	 *		.title : RegularExpression(Home Insurance)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(home-insurance)
	 */
	protected DocumentTestObject document_homeInsuranceYouAndYo() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_homeInsuranceYouAndYo"));
	}
	/**
	 * HomeInsuranceYouAndYourHomeTheAA: with specific test context and state.
	 *		.title : RegularExpression(Home Insurance)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(home-insurance)
	 */
	protected DocumentTestObject document_homeInsuranceYouAndYo(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_homeInsuranceYouAndYo"), anchor, flags);
	}
	
	/**
	 * daytime: with default state.
	 *		.id : daytime
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : daytime
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_daytime() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_daytime"));
	}
	/**
	 * daytime: with specific test context and state.
	 *		.id : daytime
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : daytime
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_daytime(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_daytime"), anchor, flags);
	}
	
	/**
	 * mobile: with default state.
	 *		.id : mobile
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : mobile
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_mobile() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_mobile"));
	}
	/**
	 * mobile: with specific test context and state.
	 *		.id : mobile
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : mobile
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_mobile(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_mobile"), anchor, flags);
	}
	
	/**
	 * email: with default state.
	 *		.id : email
	 * 		.title : 
	 * 		.class : Html.INPUT.email
	 * 		.name : email
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_email() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_email"));
	}
	/**
	 * email: with specific test context and state.
	 *		.id : email
	 * 		.title : 
	 * 		.class : Html.INPUT.email
	 * 		.name : email
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_email(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_email"), anchor, flags);
	}
	
	

	protected Phones_EMailHelper()
	{
		setScriptName("Aggregators.Home.Phones_EMail");
	}
	
}

