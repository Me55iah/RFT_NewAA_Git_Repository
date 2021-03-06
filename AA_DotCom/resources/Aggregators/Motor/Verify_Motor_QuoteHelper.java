// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Aggregators.Motor;
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
 * Script Name   : <b>Verify_Motor_Quote</b><br>
 * Generated     : <b>2015/05/06 15:38:42</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  May 06, 2015
 * @author horned
 */
public abstract class Verify_Motor_QuoteHelper extends Utilities.AA_SuperHelper
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
	 * BuyNowsubmit: with default state.
	 *		.id : page-submit
	 * 		.type : submit
	 * 		.value : Buy now
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject button_buyNowsubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_buyNowsubmit"));
	}
	/**
	 * BuyNowsubmit: with specific test context and state.
	 *		.id : page-submit
	 * 		.type : submit
	 * 		.value : Buy now
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject button_buyNowsubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_buyNowsubmit"), anchor, flags);
	}
	
	/**
	 * CarInsuranceYourQuoteOptionsTheAA: with default state.
	 *		.title : RegularExpression(Insurance: Your quote options - The AA)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(insurance/buy/quote)
	 */
	protected DocumentTestObject document_carInsuranceYourQuote() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourQuote"));
	}
	/**
	 * CarInsuranceYourQuoteOptionsTheAA: with specific test context and state.
	 *		.title : RegularExpression(Insurance: Your quote options - The AA)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(insurance/buy/quote)
	 */
	protected DocumentTestObject document_carInsuranceYourQuote(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourQuote"), anchor, flags);
	}
	
	/**
	 * annualSummary: with default state.
	 *		.id : annual-summary
	 * 		.title : 
	 * 		.class : Html.SPAN
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_annualSummary() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_annualSummary"));
	}
	/**
	 * annualSummary: with specific test context and state.
	 *		.id : annual-summary
	 * 		.title : 
	 * 		.class : Html.SPAN
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_annualSummary(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_annualSummary"), anchor, flags);
	}
	
	/**
	 * aside: with default state.
	 *		.id : aside
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_aside() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_aside"));
	}
	/**
	 * aside: with specific test context and state.
	 *		.id : aside
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_aside(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_aside"), anchor, flags);
	}
	
	/**
	 * main: with default state.
	 *		.id : main
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_main() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_main"));
	}
	/**
	 * main: with specific test context and state.
	 *		.id : main
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_main(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_main"), anchor, flags);
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
	 * monthlySummary: with default state.
	 *		.id : monthly-summary
	 * 		.title : 
	 * 		.class : Html.SPAN
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_monthlySummary() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_monthlySummary"));
	}
	/**
	 * monthlySummary: with specific test context and state.
	 *		.id : monthly-summary
	 * 		.title : 
	 * 		.class : Html.SPAN
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_monthlySummary(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_monthlySummary"), anchor, flags);
	}
	
	/**
	 * priceSection: with default state.
	 *		.id : price-section
	 * 		.title : 
	 * 		.class : Html.P
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_priceSection() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_priceSection"));
	}
	/**
	 * priceSection: with specific test context and state.
	 *		.id : price-section
	 * 		.title : 
	 * 		.class : Html.P
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_priceSection(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_priceSection"), anchor, flags);
	}
	
	/**
	 * AnnualPayment�39251: with default state.
	 *		.id : 
	 * 		.value : RegularExpression(  Annual payment)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_annualPayment() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_annualPayment"));
	}
	/**
	 * AnnualPayment�39251: with specific test context and state.
	 *		.id : 
	 * 		.value : RegularExpression(  Annual payment)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_annualPayment(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_annualPayment"), anchor, flags);
	}
	
	/**
	 * CourtesyCarUpgrade�282AMonth�2999: with default state.
	 *		.id : 
	 * 		.value : RegularExpression(Courtesy car upgrade)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_courtesyCarUpgrade() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_courtesyCarUpgrade"));
	}
	/**
	 * CourtesyCarUpgrade�282AMonth�2999: with specific test context and state.
	 *		.id : 
	 * 		.value : RegularExpression(Courtesy car upgrade)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_courtesyCarUpgrade(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_courtesyCarUpgrade"), anchor, flags);
	}
	
	/**
	 * LegalAssistance�244AMonth�2599: with default state.
	 *		.id : 
	 * 		.value : RegularExpression(Legal assistance)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_legalAssistance() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_legalAssistance"));
	}
	/**
	 * LegalAssistance�244AMonth�2599: with specific test context and state.
	 *		.id : 
	 * 		.value : RegularExpression(Legal assistance)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_legalAssistance(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_legalAssistance"), anchor, flags);
	}
	
	/**
	 * PayMonthly�3682: with default state.
	 *		.id : 
	 * 		.value : RegularExpression( Pay monthly)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 1
	 */
	protected GuiTestObject label_payMonthly() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_payMonthly"));
	}
	/**
	 * PayMonthly�3682: with specific test context and state.
	 *		.id : 
	 * 		.value : RegularExpression( Pay monthly)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 1
	 */
	protected GuiTestObject label_payMonthly(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_payMonthly"), anchor, flags);
	}
	
	/**
	 * PersonalAccidentCover�141AMonth�1500: with default state.
	 *		.id : 
	 * 		.value : RegularExpression(Personal accident cover)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_personalAccidentCover() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_personalAccidentCover"));
	}
	/**
	 * PersonalAccidentCover�141AMonth�1500: with specific test context and state.
	 *		.id : 
	 * 		.value : RegularExpression(Personal accident cover)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_personalAccidentCover(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_personalAccidentCover"), anchor, flags);
	}
	
	/**
	 * aaMotorCoverType: with default state.
	 *		.text : Comprehensive Third Party Fire and Theft Third Party Only
	 * 		.id : CoverType
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : RegularExpression(cover\.type)
	 * 		.classIndex : 1
	 */
	protected SelectGuiSubitemTestObject list_aaMotorCoverType() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorCoverType"));
	}
	/**
	 * aaMotorCoverType: with specific test context and state.
	 *		.text : Comprehensive Third Party Fire and Theft Third Party Only
	 * 		.id : CoverType
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : RegularExpression(cover\.type)
	 * 		.classIndex : 1
	 */
	protected SelectGuiSubitemTestObject list_aaMotorCoverType(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorCoverType"), anchor, flags);
	}
	
	/**
	 * aaMotorProtectNCD: with default state.
	 *		.text : Protected Not Protected
	 * 		.id : ProtectNCD
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.protectNCD
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_aaMotorProtectNCD() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorProtectNCD"));
	}
	/**
	 * aaMotorProtectNCD: with specific test context and state.
	 *		.text : Protected Not Protected
	 * 		.id : ProtectNCD
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.protectNCD
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_aaMotorProtectNCD(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorProtectNCD"), anchor, flags);
	}
	
	/**
	 * aaMotorVoluntaryExcessCode: with default state.
	 *		.text : Please select �Nil �50 �75 �100 �125 �150 �200 �250 �300 �350 �400 �450 �500
	 * 		.id : voluntary-excess
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.voluntaryExcess.code
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVoluntaryExcessCod() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVoluntaryExcessCod"));
	}
	/**
	 * aaMotorVoluntaryExcessCode: with specific test context and state.
	 *		.text : Please select �Nil �50 �75 �100 �125 �150 �200 �250 �300 �350 �400 �450 �500
	 * 		.id : voluntary-excess
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.voluntaryExcess.code
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVoluntaryExcessCod(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVoluntaryExcessCod"), anchor, flags);
	}
	
	

	protected Verify_Motor_QuoteHelper()
	{
		setScriptName("Aggregators.Motor.Verify_Motor_Quote");
	}
	
}

