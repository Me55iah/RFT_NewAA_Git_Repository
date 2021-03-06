// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Motor_MK2.Your__Details;
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
 * Script Name   : <b>Your_Cover</b><br>
 * Generated     : <b>2015/07/30 11:27:05</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  July 30, 2015
 * @author horned
 */
public abstract class Your_CoverHelper extends Utilities.AA_SuperHelper
{
	/**
	 * Nextsubmit: with default state.
	 *		.id : next_button
	 * 		.type : submit
	 * 		.value : Next
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 1
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
	 * 		.classIndex : 1
	 */
	protected GuiTestObject button_nextsubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_nextsubmit"), anchor, flags);
	}
	
	/**
	 * CarInsuranceYourDetailsTheAA: with default state.
	 *		.title : RegularExpression(Your details)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceYourDetai() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourDetai"));
	}
	/**
	 * CarInsuranceYourDetailsTheAA: with specific test context and state.
	 *		.title : RegularExpression(Your details)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceYourDetai(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourDetai"), anchor, flags);
	}
	
	/**
	 * mainContent: with default state.
	 *		.id : mainContent
	 * 		.class : Html.DIV
	 * 		.title : 
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
	 * 		.class : Html.DIV
	 * 		.title : 
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
	
	/**
	 * Comprehensive: with default state.
	 *		.id : 
	 * 		.value : Comprehensive
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 51
	 */
	protected GuiTestObject label_comprehensive() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_comprehensive"));
	}
	/**
	 * Comprehensive: with specific test context and state.
	 *		.id : 
	 * 		.value : Comprehensive
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 51
	 */
	protected GuiTestObject label_comprehensive(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_comprehensive"), anchor, flags);
	}
	
	/**
	 * ThirdPartyFireAndTheft: with default state.
	 *		.id : 
	 * 		.value : Third Party, Fire and Theft
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 52
	 */
	protected GuiTestObject label_thirdPartyFireAndTheft() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_thirdPartyFireAndTheft"));
	}
	/**
	 * ThirdPartyFireAndTheft: with specific test context and state.
	 *		.id : 
	 * 		.value : Third Party, Fire and Theft
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 52
	 */
	protected GuiTestObject label_thirdPartyFireAndTheft(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_thirdPartyFireAndTheft"), anchor, flags);
	}
	
	/**
	 * ThirdPartyOnly: with default state.
	 *		.id : 
	 * 		.value : Third Party Only
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 53
	 */
	protected GuiTestObject label_thirdPartyOnly() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_thirdPartyOnly"));
	}
	/**
	 * ThirdPartyOnly: with specific test context and state.
	 *		.id : 
	 * 		.value : Third Party Only
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 53
	 */
	protected GuiTestObject label_thirdPartyOnly(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_thirdPartyOnly"), anchor, flags);
	}
	
	/**
	 * aaMotorPreviousPolicyInsurer: with default state.
	 *		.text : RegularExpression(Please select)
	 * 		.id : previous-insurer
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.previousPolicy.insurer
	 * 		.classIndex : 4
	 */
	protected SelectGuiSubitemTestObject list_aaMotorPreviousPolicyInsu() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorPreviousPolicyInsu"));
	}
	/**
	 * aaMotorPreviousPolicyInsurer: with specific test context and state.
	 *		.text : RegularExpression(Please select)
	 * 		.id : previous-insurer
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.previousPolicy.insurer
	 * 		.classIndex : 4
	 */
	protected SelectGuiSubitemTestObject list_aaMotorPreviousPolicyInsu(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorPreviousPolicyInsu"), anchor, flags);
	}
	
	/**
	 * aaMotorPreviousPolicyNcd: with default state.
	 *		.text : Please select None 1 2 3 4 5 6 7 8 9 or more
	 * 		.id : no-claims-discount
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.previousPolicy.ncd
	 * 		.classIndex : 5
	 */
	protected SelectGuiSubitemTestObject list_aaMotorPreviousPolicyNcd() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorPreviousPolicyNcd"));
	}
	/**
	 * aaMotorPreviousPolicyNcd: with specific test context and state.
	 *		.text : Please select None 1 2 3 4 5 6 7 8 9 or more
	 * 		.id : no-claims-discount
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.previousPolicy.ncd
	 * 		.classIndex : 5
	 */
	protected SelectGuiSubitemTestObject list_aaMotorPreviousPolicyNcd(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorPreviousPolicyNcd"), anchor, flags);
	}
	
	/**
	 * aaMotorCoverStart: with default state.
	 *		.id : policy-start-date
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.motor.cover.start
	 * 		.classIndex : 9
	 */
	protected TextGuiTestObject text_aaMotorCoverStart() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_aaMotorCoverStart"));
	}
	/**
	 * aaMotorCoverStart: with specific test context and state.
	 *		.id : policy-start-date
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.motor.cover.start
	 * 		.classIndex : 9
	 */
	protected TextGuiTestObject text_aaMotorCoverStart(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_aaMotorCoverStart"), anchor, flags);
	}
	
	/**
	 * aaMotorPreviousPolicyExpiryDate: with default state.
	 *		.id : policy-end-date
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.motor.previousPolicyExpiryDate
	 * 		.classIndex : 8
	 */
	protected TextGuiTestObject text_aaMotorPreviousPolicyExpi() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_aaMotorPreviousPolicyExpi"));
	}
	/**
	 * aaMotorPreviousPolicyExpiryDate: with specific test context and state.
	 *		.id : policy-end-date
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.motor.previousPolicyExpiryDate
	 * 		.classIndex : 8
	 */
	protected TextGuiTestObject text_aaMotorPreviousPolicyExpi(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_aaMotorPreviousPolicyExpi"), anchor, flags);
	}
	
	

	protected Your_CoverHelper()
	{
		setScriptName("Motor_MK2.Your__Details.Your_Cover");
	}
	
}

