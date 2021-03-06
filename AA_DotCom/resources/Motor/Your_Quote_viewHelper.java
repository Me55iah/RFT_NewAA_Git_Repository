// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Motor;
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
 * Script Name   : <b>Your_Quote_view</b><br>
 * Generated     : <b>2015/02/19 15:40:02</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  February 19, 2015
 * @author horned
 */
public abstract class Your_Quote_viewHelper extends Utilities.AA_SuperHelper
{
	/**
	 * BuyNowsubmit: with default state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Buy now
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_buyNowsubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_buyNowsubmit"));
	}
	/**
	 * BuyNowsubmit: with specific test context and state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Buy now
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_buyNowsubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_buyNowsubmit"), anchor, flags);
	}
	
	/**
	 * BuyNowsubmit: with default state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Buy now
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_buyNowsubmit_old() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_buyNowsubmit_old"));
	}
	/**
	 * BuyNowsubmit: with specific test context and state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Buy now
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_buyNowsubmit_old(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_buyNowsubmit_old"), anchor, flags);
	}
	
	/**
	 * Nextsubmit: with default state.
	 *		.id : 
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
	 *		.id : 
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
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Next
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject button_nextsubmit2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_nextsubmit2"));
	}
	/**
	 * Nextsubmit: with specific test context and state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Next
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject button_nextsubmit2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_nextsubmit2"), anchor, flags);
	}
	
	/**
	 * RetrieveMyQuotesubmit: with default state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Retrieve my quote
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_retrieveMyQuotesubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_retrieveMyQuotesubmit"));
	}
	/**
	 * RetrieveMyQuotesubmit: with specific test context and state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Retrieve my quote
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_retrieveMyQuotesubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_retrieveMyQuotesubmit"), anchor, flags);
	}
	
	/**
	 * CarInsuranceRetrieveAQuoteTheAA: with default state.
	 *		.title : Car Insurance: Retrieve a quote - The AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance/buy/quote-retrieval)
	 */
	protected DocumentTestObject document_carInsuranceRetrieveA() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceRetrieveA"));
	}
	/**
	 * CarInsuranceRetrieveAQuoteTheAA: with specific test context and state.
	 *		.title : Car Insurance: Retrieve a quote - The AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance/buy/quote-retrieval)
	 */
	protected DocumentTestObject document_carInsuranceRetrieveA(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceRetrieveA"), anchor, flags);
	}
	
	/**
	 * CarInsuranceSelectYourAddressTheAA: with default state.
	 *		.title : Car Insurance: Select your address - The AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceSelectYou() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceSelectYou"));
	}
	/**
	 * CarInsuranceSelectYourAddressTheAA: with specific test context and state.
	 *		.title : Car Insurance: Select your address - The AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceSelectYou(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceSelectYou"), anchor, flags);
	}
	
	/**
	 * CarInsuranceYourQuoteOptionsTheAA: with default state.
	 *		.title : Car Insurance: Your quote options - The AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceYourQuote() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourQuote"));
	}
	/**
	 * CarInsuranceYourQuoteOptionsTheAA: with specific test context and state.
	 *		.title : Car Insurance: Your quote options - The AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceYourQuote(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourQuote"), anchor, flags);
	}
	
	/**
	 * quoteForm: with default state.
	 *		.id : quoteForm
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject form_quoteForm() 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_quoteForm"));
	}
	/**
	 * quoteForm: with specific test context and state.
	 *		.id : quoteForm
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject form_quoteForm(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_quoteForm"), anchor, flags);
	}
	
	/**
	 * addonListAnnual: with default state.
	 *		.id : addon-list-annual
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_addonListAnnual() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_addonListAnnual"));
	}
	/**
	 * addonListAnnual: with specific test context and state.
	 *		.id : addon-list-annual
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_addonListAnnual(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_addonListAnnual"), anchor, flags);
	}
	
	/**
	 * addonListInstal: with default state.
	 *		.id : addon-list-instal
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_addonListInstal() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_addonListInstal"));
	}
	/**
	 * addonListInstal: with specific test context and state.
	 *		.id : addon-list-instal
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_addonListInstal(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_addonListInstal"), anchor, flags);
	}
	
	/**
	 * Address_Number_Selector: with default state.
	 *		.id : main
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_address_Number_Selector() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_address_Number_Selector"));
	}
	/**
	 * Address_Number_Selector: with specific test context and state.
	 *		.id : main
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_address_Number_Selector(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_address_Number_Selector"), anchor, flags);
	}
	
	/**
	 * annualSummary: with default state.
	 *		.id : annual-summary
	 * 		.title : 
	 * 		.class : Html.SPAN
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
	 * lcheckcontainerHIR: with default state.
	 *		.id : lcheckcontainerHIR
	 * 		.title : 
	 * 		.class : Html.DIV
	 */
	protected GuiTestObject html_lcheckcontainerHIR() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_lcheckcontainerHIR"));
	}
	/**
	 * lcheckcontainerHIR: with specific test context and state.
	 *		.id : lcheckcontainerHIR
	 * 		.title : 
	 * 		.class : Html.DIV
	 */
	protected GuiTestObject html_lcheckcontainerHIR(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_lcheckcontainerHIR"), anchor, flags);
	}
	
	/**
	 * lcheckcontainerXP: with default state.
	 *		.id : lcheckcontainerXP
	 * 		.title : 
	 * 		.class : Html.DIV
	 */
	protected GuiTestObject html_lcheckcontainerXP() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_lcheckcontainerXP"));
	}
	/**
	 * lcheckcontainerXP: with specific test context and state.
	 *		.id : lcheckcontainerXP
	 * 		.title : 
	 * 		.class : Html.DIV
	 */
	protected GuiTestObject html_lcheckcontainerXP(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_lcheckcontainerXP"), anchor, flags);
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
	 * monthlySummary: with default state.
	 *		.id : monthly-summary
	 * 		.title : 
	 * 		.class : Html.SPAN
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
	 * AnnualPayment: with default state.
	 *		.id : 
	 * 		.value : RegularExpression(Annual payment)
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
	 * AnnualPayment: with specific test context and state.
	 *		.id : 
	 * 		.value : RegularExpression(Annual payment)
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
	 * ClaimBackYourPolicyExcess: with default state.
	 *		.id : 
	 * 		.value : RegularExpression(Claim back your policy excess)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_claimBackYourPolicyExces() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_claimBackYourPolicyExces"));
	}
	/**
	 * ClaimBackYourPolicyExcess: with specific test context and state.
	 *		.id : 
	 * 		.value : RegularExpression(Claim back your policy excess)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_claimBackYourPolicyExces(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_claimBackYourPolicyExces"), anchor, flags);
	}
	
	/**
	 * CourtesyCarUpgrade: with default state.
	 *		.id : 
	 * 		.value : Courtesy car upgrade �2.82 a month �29.99   
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
	 * CourtesyCarUpgrade: with specific test context and state.
	 *		.id : 
	 * 		.value : Courtesy car upgrade �2.82 a month �29.99   
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
	 * LegalAssistance: with default state.
	 *		.id : 
	 * 		.value : RegularExpression(Legal assistance.*a month.*  )
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
	 * LegalAssistance: with specific test context and state.
	 *		.id : 
	 * 		.value : RegularExpression(Legal assistance.*a month.*  )
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
	 * PayMonthly: with default state.
	 *		.id : 
	 * 		.value : RegularExpression(Pay monthly.*)
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
	 * PayMonthly: with specific test context and state.
	 *		.id : 
	 * 		.value : RegularExpression(Pay monthly.*)
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
	 * PersonalAccidentCover: with default state.
	 *		.id : 
	 * 		.value : RegularExpression(Personal accident cover.* a month.*  )
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
	 * PersonalAccidentCover: with specific test context and state.
	 *		.id : 
	 * 		.value : RegularExpression(Personal accident cover.* a month.*  )
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
	 * 		.name : aa.motor.cover.type
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
	 * 		.name : aa.motor.cover.type
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
	protected SelectGuiSubitemTestObject list_aaMotorVoluntaryExcess() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVoluntaryExcess"));
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
	protected SelectGuiSubitemTestObject list_aaMotorVoluntaryExcess(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVoluntaryExcess"), anchor, flags);
	}
	
	/**
	 * aaMotorVoluntaryExcessCode: with default state.
	 *		.text : Please select �Nil �50 �75 �100 �125 �150 �200 �250 �300 �350 �400 �450 �500
	 * 		.id : voluntary-excess
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : aa.motor.voluntaryExcess.code
	 * 		.classIndex : 2
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
	 * 		.classIndex : 2
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVoluntaryExcessCod(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVoluntaryExcessCod"), anchor, flags);
	}
	
	/**
	 * SELECTEDADDRESS27: with default state.
	 *		.id : addr27
	 * 		.type : radio
	 * 		.value : 27
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : SELECTEDADDRESS
	 * 		.classIndex : 27
	 */
	protected ToggleGUITestObject radioButton_selectedaddresS27() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_selectedaddresS27"));
	}
	/**
	 * SELECTEDADDRESS27: with specific test context and state.
	 *		.id : addr27
	 * 		.type : radio
	 * 		.value : 27
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : SELECTEDADDRESS
	 * 		.classIndex : 27
	 */
	protected ToggleGUITestObject radioButton_selectedaddresS27(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_selectedaddresS27"), anchor, flags);
	}
	
	/**
	 * SELECTEDADDRESS28: with default state.
	 *		.id : 
	 * 		.type : radio
	 * 		.value : -1
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : SELECTEDADDRESS
	 * 		.classIndex : 27
	 */
	protected ToggleGUITestObject radioButton_selectedaddresS28() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_selectedaddresS28"));
	}
	/**
	 * SELECTEDADDRESS28: with specific test context and state.
	 *		.id : 
	 * 		.type : radio
	 * 		.value : -1
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : SELECTEDADDRESS
	 * 		.classIndex : 27
	 */
	protected ToggleGUITestObject radioButton_selectedaddresS28(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_selectedaddresS28"), anchor, flags);
	}
	
	/**
	 * aaQuoteRetrievePostcode: with default state.
	 *		.id : postcode
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.quoteRetrieve.postcode
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_aaQuoteRetrievePostcode() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_aaQuoteRetrievePostcode"));
	}
	/**
	 * aaQuoteRetrievePostcode: with specific test context and state.
	 *		.id : postcode
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.quoteRetrieve.postcode
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_aaQuoteRetrievePostcode(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_aaQuoteRetrievePostcode"), anchor, flags);
	}
	
	/**
	 * aaQuoteRetrieveReference: with default state.
	 *		.id : reference
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.quoteRetrieve.reference
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_aaQuoteRetrieveReference() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_aaQuoteRetrieveReference"));
	}
	/**
	 * aaQuoteRetrieveReference: with specific test context and state.
	 *		.id : reference
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.quoteRetrieve.reference
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_aaQuoteRetrieveReference(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_aaQuoteRetrieveReference"), anchor, flags);
	}
	
	/**
	 * aaQuoteRetrieveSurname: with default state.
	 *		.id : last-name
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.quoteRetrieve.surname
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_aaQuoteRetrieveSurname() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_aaQuoteRetrieveSurname"));
	}
	/**
	 * aaQuoteRetrieveSurname: with specific test context and state.
	 *		.id : last-name
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.quoteRetrieve.surname
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_aaQuoteRetrieveSurname(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_aaQuoteRetrieveSurname"), anchor, flags);
	}
	
	/**
	 * dateOfBirth: with default state.
	 *		.id : birth-date
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : date-of-birth
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_dateOfBirth() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_dateOfBirth"));
	}
	/**
	 * dateOfBirth: with specific test context and state.
	 *		.id : birth-date
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : date-of-birth
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_dateOfBirth(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_dateOfBirth"), anchor, flags);
	}
	
	/**
	 * Locate and return the verification point aaMotorCoverType_list object in the SUT.
	 */
	protected IFtVerificationPoint aaMotorCoverType_listVP() 
	{
		return vp("aaMotorCoverType_list");
	}
	protected IFtVerificationPoint aaMotorCoverType_listVP(TestObject anchor)
	{
		return vp("aaMotorCoverType_list", anchor);
	}
	
	/**
	 * Locate and return the verification point aaMotorProtectNCD_list object in the SUT.
	 */
	protected IFtVerificationPoint aaMotorProtectNCD_listVP() 
	{
		return vp("aaMotorProtectNCD_list");
	}
	protected IFtVerificationPoint aaMotorProtectNCD_listVP(TestObject anchor)
	{
		return vp("aaMotorProtectNCD_list", anchor);
	}
	
	/**
	 * Locate and return the verification point aaMotorVoluntaryExcessCode_list object in the SUT.
	 */
	protected IFtVerificationPoint aaMotorVoluntaryExcessCode_listVP() 
	{
		return vp("aaMotorVoluntaryExcessCode_list");
	}
	protected IFtVerificationPoint aaMotorVoluntaryExcessCode_listVP(TestObject anchor)
	{
		return vp("aaMotorVoluntaryExcessCode_list", anchor);
	}
	
	

	protected Your_Quote_viewHelper()
	{
		setScriptName("Motor.Your_Quote_view");
	}
	
}

