// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Motor_MK2.Your__Quote;
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
 * Script Name   : <b>Additional_Car_Details</b><br>
 * Generated     : <b>2015/07/14 12:30:39</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  July 14, 2015
 * @author horned
 */
public abstract class Additional_Car_DetailsHelper extends Utilities.AA_SuperHelper
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
	 * Nextsubmit: with default state.
	 *		.id : next_button
	 * 		.type : submit
	 * 		.value : Next
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_nextsubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_nextsubmit"));
	}
	/**
	 * Nextsubmit: with specific test context and state.
	 *		.id : next_button
	 * 		.type : submit
	 * 		.value : Next
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_nextsubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_nextsubmit"), anchor, flags);
	}
	
	/**
	 * Nextsubmit: with default state.
	 *		.id : submit
	 * 		.type : submit
	 * 		.value : Next
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_nextsubmit2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_nextsubmit2"));
	}
	/**
	 * Nextsubmit: with specific test context and state.
	 *		.id : submit
	 * 		.type : submit
	 * 		.value : Next
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_nextsubmit2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_nextsubmit2"), anchor, flags);
	}
	
	/**
	 * CarInsuranceAdditionalCarDetailsTheAA: with default state.
	 *		.title : RegularExpression(Additional car details)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(registration-details)
	 */
	protected DocumentTestObject document_carInsuranceAdditiona() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceAdditiona"));
	}
	/**
	 * CarInsuranceAdditionalCarDetailsTheAA: with specific test context and state.
	 *		.title : RegularExpression(Additional car details)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(registration-details)
	 */
	protected DocumentTestObject document_carInsuranceAdditiona(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceAdditiona"), anchor, flags);
	}
	
	/**
	 * RegistrationNotFoundWeWereUnableToRetrieveDetailsForNK: with default state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject form_registrationNotFoundWeWer() 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_registrationNotFoundWeWer"));
	}
	/**
	 * RegistrationNotFoundWeWereUnableToRetrieveDetailsForNK: with specific test context and state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject form_registrationNotFoundWeWer(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_registrationNotFoundWeWer"), anchor, flags);
	}
	
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
	 * NKD305MIsMyCorrectRegistrationNumber: with default state.
	 *		.id : 
	 * 		.value : RegularExpression(is my correct registration number\.)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_nkD305MIsMyCorrectRegist() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_nkD305MIsMyCorrectRegist"));
	}
	/**
	 * NKD305MIsMyCorrectRegistrationNumber: with specific test context and state.
	 *		.id : 
	 * 		.value : RegularExpression(is my correct registration number\.)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_nkD305MIsMyCorrectRegist(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_nkD305MIsMyCorrectRegist"), anchor, flags);
	}
	
	/**
	 * NoThisIsnTMyRegistrationIWantToAmend: with default state.
	 *		.id : 
	 * 		.value : No, this isn't my registration. I want to amend.
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 1
	 */
	protected GuiTestObject label_noThisIsnTMyRegistration() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_noThisIsnTMyRegistration"));
	}
	/**
	 * NoThisIsnTMyRegistrationIWantToAmend: with specific test context and state.
	 *		.id : 
	 * 		.value : No, this isn't my registration. I want to amend.
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 1
	 */
	protected GuiTestObject label_noThisIsnTMyRegistration(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_noThisIsnTMyRegistration"), anchor, flags);
	}
	
	/**
	 * aaAdditionalRegistration: with default state.
	 *		.id : registration
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.additional.registration
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_aaAdditionalRegistration() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_aaAdditionalRegistration"));
	}
	/**
	 * aaAdditionalRegistration: with specific test context and state.
	 *		.id : registration
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.additional.registration
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_aaAdditionalRegistration(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_aaAdditionalRegistration"), anchor, flags);
	}
	
	

	protected Additional_Car_DetailsHelper()
	{
		setScriptName("Motor_MK2.Your__Quote.Additional_Car_Details");
	}
	
}

