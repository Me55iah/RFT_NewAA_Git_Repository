// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.EBC_MK2;
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
 * Script Name   : <b>Payment_Options</b><br>
 * Generated     : <b>2015/02/06 13:48:38</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  February 06, 2015
 * @author horned
 */
public abstract class Payment_OptionsHelper extends Utilities.AA_SuperHelper
{
	/**
	 * HomeMembershipBoilerCoverHomeEmergencyAA: with default state.
	 *		.title : RegularExpression(AA)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(theaa)
	 */
	protected DocumentTestObject AA() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("AA"));
	}
	/**
	 * HomeMembershipBoilerCoverHomeEmergencyAA: with specific test context and state.
	 *		.title : RegularExpression(AA)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(theaa)
	 */
	protected DocumentTestObject AA(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("AA"), anchor, flags);
	}
	
	/**
	 * BuyNowsubmit: with default state.
	 *		.id : card-detail-button
	 * 		.type : submit
	 * 		.value : Next
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject button_buyNowsubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_buyNowsubmit"));
	}
	/**
	 * BuyNowsubmit: with specific test context and state.
	 *		.id : card-detail-button
	 * 		.type : submit
	 * 		.value : Next
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject button_buyNowsubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_buyNowsubmit"), anchor, flags);
	}
	
	/**
	 * Continuesubmit: with default state.
	 *		.id : continue
	 * 		.type : submit
	 * 		.value : Continue
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject button_continuesubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_continuesubmit"));
	}
	/**
	 * Continuesubmit: with specific test context and state.
	 *		.id : continue
	 * 		.type : submit
	 * 		.value : Continue
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject button_continuesubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_continuesubmit"), anchor, flags);
	}
	
	/**
	 * Nextsubmit: with default state.
	 *		.id : payment_nextButton
	 * 		.type : submit
	 * 		.value : Next
	 * 		.title : 
	 * 		.class : Html.BUTTON
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
	 *		.id : payment_nextButton
	 * 		.type : submit
	 * 		.value : Next
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_nextsubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_nextsubmit"), anchor, flags);
	}
	
	/**
	 * ddon: with default state.
	 *		.id : dd
	 * 		.type : checkbox
	 * 		.value : on
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : dd
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected ToggleGUITestObject checkBox_ddon() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_ddon"));
	}
	/**
	 * ddon: with specific test context and state.
	 *		.id : dd
	 * 		.type : checkbox
	 * 		.value : on
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : dd
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected ToggleGUITestObject checkBox_ddon(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_ddon"), anchor, flags);
	}
	
	/**
	 * termsDDon: with default state.
	 *		.id : termsDD
	 * 		.type : checkbox
	 * 		.value : on
	 * 		.class : Html.INPUT.checkbox
	 * 		.title : 
	 * 		.name : termsDD
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_termsDDon() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_termsDDon"));
	}
	/**
	 * termsDDon: with specific test context and state.
	 *		.id : termsDD
	 * 		.type : checkbox
	 * 		.value : on
	 * 		.class : Html.INPUT.checkbox
	 * 		.title : 
	 * 		.name : termsDD
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_termsDDon(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_termsDDon"), anchor, flags);
	}
	
	/**
	 * HtmlComboLBox: with default state.
	 *		.class : Html.ComboLBox
	 */
	protected GuiTestObject comboListBox_ExpiryDateYear() 
	{
		return new GuiTestObject(
                        getMappedTestObject("comboListBox_ExpiryDateYear"));
	}
	/**
	 * HtmlComboLBox: with specific test context and state.
	 *		.class : Html.ComboLBox
	 */
	protected GuiTestObject comboListBox_ExpiryDateYear(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("comboListBox_ExpiryDateYear"), anchor, flags);
	}
	
	/**
	 * EuropeanBreakdownCoverAA: with default state.
	 *		.title : RegularExpression(AA)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(theaa)
	 */
	protected DocumentTestObject document_europeanBreakdownCove() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_europeanBreakdownCove"));
	}
	/**
	 * EuropeanBreakdownCoverAA: with specific test context and state.
	 *		.title : RegularExpression(AA)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(theaa)
	 */
	protected DocumentTestObject document_europeanBreakdownCove(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_europeanBreakdownCove"), anchor, flags);
	}
	
	/**
	 * TheAAPaymentGateway: with default state.
	 *		.title : The AA: Payment Gateway
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(.*payments.*)
	 */
	protected DocumentTestObject document_theAAPaymentGateway() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_theAAPaymentGateway"));
	}
	/**
	 * TheAAPaymentGateway: with specific test context and state.
	 *		.title : The AA: Payment Gateway
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(.*payments.*)
	 */
	protected DocumentTestObject document_theAAPaymentGateway(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_theAAPaymentGateway"), anchor, flags);
	}
	
	/**
	 * accountNumber: with default state.
	 *		.id : accountNumber
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : accountNumber
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_accountNumber() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_accountNumber"));
	}
	/**
	 * accountNumber: with specific test context and state.
	 *		.id : accountNumber
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : accountNumber
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_accountNumber(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_accountNumber"), anchor, flags);
	}
	
	/**
	 * CardModelAccountNumberModelValue: with default state.
	 *		.id : CardModel_AccountNumberModel_Value
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : CardModel.AccountNumberModel.Value
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_cardModelAccountNumberMod() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_cardModelAccountNumberMod"));
	}
	/**
	 * CardModelAccountNumberModelValue: with specific test context and state.
	 *		.id : CardModel_AccountNumberModel_Value
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : CardModel.AccountNumberModel.Value
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_cardModelAccountNumberMod(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_cardModelAccountNumberMod"), anchor, flags);
	}
	
	/**
	 * CardModelVerificationNumberModelValue: with default state.
	 *		.id : CardModel_VerificationNumberModel_Value
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : CardModel.VerificationNumberModel.Value
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_cardModelVerificationNumb() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_cardModelVerificationNumb"));
	}
	/**
	 * CardModelVerificationNumberModelValue: with specific test context and state.
	 *		.id : CardModel_VerificationNumberModel_Value
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : CardModel.VerificationNumberModel.Value
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_cardModelVerificationNumb(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_cardModelVerificationNumb"), anchor, flags);
	}
	
	/**
	 * ddTotal: with default state.
	 *		.id : dd-total
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_ddTotal() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_ddTotal"));
	}
	/**
	 * ddTotal: with specific test context and state.
	 *		.id : dd-total
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_ddTotal(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_ddTotal"), anchor, flags);
	}
	
	/**
	 * sortCode: with default state.
	 *		.id : sortCode
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : sortCode
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_sortCode() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_sortCode"));
	}
	/**
	 * sortCode: with specific test context and state.
	 *		.id : sortCode
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : sortCode
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_sortCode(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_sortCode"), anchor, flags);
	}
	
	/**
	 * sortCode1: with default state.
	 *		.id : sortCode1
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : sortCode1
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_sortCode1() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_sortCode1"));
	}
	/**
	 * sortCode1: with specific test context and state.
	 *		.id : sortCode1
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : sortCode1
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_sortCode1(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_sortCode1"), anchor, flags);
	}
	
	/**
	 * sortCode2: with default state.
	 *		.id : sortCode2
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : sortCode2
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_sortCode2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_sortCode2"));
	}
	/**
	 * sortCode2: with specific test context and state.
	 *		.id : sortCode2
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : sortCode2
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_sortCode2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_sortCode2"), anchor, flags);
	}
	
	/**
	 * sortCode3: with default state.
	 *		.id : sortCode3
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : sortCode3
	 * 		.classIndex : 2
	 */
	protected GuiTestObject html_sortCode3() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_sortCode3"));
	}
	/**
	 * sortCode3: with specific test context and state.
	 *		.id : sortCode3
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : sortCode3
	 * 		.classIndex : 2
	 */
	protected GuiTestObject html_sortCode3(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_sortCode3"), anchor, flags);
	}
	
	/**
	 * total_card_payment: with default state.
	 *		.id : total_card_payment
	 * 		.title : 
	 * 		.class : Html.SPAN
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_total_card_payment() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_total_card_payment"));
	}
	/**
	 * total_card_payment: with specific test context and state.
	 *		.id : total_card_payment
	 * 		.title : 
	 * 		.class : Html.SPAN
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject html_total_card_payment(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_total_card_payment"), anchor, flags);
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
	 * PleaseConfirmThisIsYourAccountAndYouHaveReadTheInform: with default state.
	 *		.id : 
	 * 		.value : RegularExpression(Please confirm this is your account.*)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject label_pleaseConfirmThisIsYourA() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_pleaseConfirmThisIsYourA"));
	}
	/**
	 * PleaseConfirmThisIsYourAccountAndYouHaveReadTheInform: with specific test context and state.
	 *		.id : 
	 * 		.value : RegularExpression(Please confirm this is your account.*)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected GuiTestObject label_pleaseConfirmThisIsYourA(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_pleaseConfirmThisIsYourA"), anchor, flags);
	}
	
	/**
	 * CardModelExpiryDateModelMonth: with default state.
	 *		.text : MM 01 02 03 04 05 06 07 08 09 10 11 12
	 * 		.id : CardModel_ExpiryDateModel_Month
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : CardModel.ExpiryDateModel.Month
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected SelectGuiSubitemTestObject list_cardModelExpiryDateModelM() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardModelExpiryDateModelM"));
	}
	/**
	 * CardModelExpiryDateModelMonth: with specific test context and state.
	 *		.text : MM 01 02 03 04 05 06 07 08 09 10 11 12
	 * 		.id : CardModel_ExpiryDateModel_Month
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : CardModel.ExpiryDateModel.Month
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected SelectGuiSubitemTestObject list_cardModelExpiryDateModelM(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardModelExpiryDateModelM"), anchor, flags);
	}
	
	/**
	 * CardModelExpiryDateModelYear: with default state.
	 *		.text : YYYY 2014 2015 2016 2017 2018 2019 2020 2021 2022 2023 2024
	 * 		.id : CardModel_ExpiryDateModel_Year
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : CardModel.ExpiryDateModel.Year
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected SelectGuiSubitemTestObject list_cardModelExpiryDateModelY() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardModelExpiryDateModelY"));
	}
	/**
	 * CardModelExpiryDateModelYear: with specific test context and state.
	 *		.text : YYYY 2014 2015 2016 2017 2018 2019 2020 2021 2022 2023 2024
	 * 		.id : CardModel_ExpiryDateModel_Year
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : CardModel.ExpiryDateModel.Year
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected SelectGuiSubitemTestObject list_cardModelExpiryDateModelY(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardModelExpiryDateModelY"), anchor, flags);
	}
	
	/**
	 * CardModelTypeModelCodedValue: with default state.
	 *		.text : Select Visa Visa Debit MasterCard Debit MasterCard AA Visa AA MasterCard
	 * 		.id : CardModel_TypeModel_CodedValue
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : CardModel.TypeModel.CodedValue
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected SelectGuiSubitemTestObject list_cardModelTypeModelCodedVa() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardModelTypeModelCodedVa"));
	}
	/**
	 * CardModelTypeModelCodedValue: with specific test context and state.
	 *		.text : Select Visa Visa Debit MasterCard Debit MasterCard AA Visa AA MasterCard
	 * 		.id : CardModel_TypeModel_CodedValue
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : CardModel.TypeModel.CodedValue
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected SelectGuiSubitemTestObject list_cardModelTypeModelCodedVa(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardModelTypeModelCodedVa"), anchor, flags);
	}
	
	/**
	 * accountName: with default state.
	 *		.id : accountName
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : accountName
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject text_accountName() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_accountName"));
	}
	/**
	 * accountName: with specific test context and state.
	 *		.id : accountName
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : accountName
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject text_accountName(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_accountName"), anchor, flags);
	}
	
	/**
	 * accountNumber: with default state.
	 *		.id : accountNumber
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : accountNumber
	 * 		.classIndex : 1
	 */
	protected TextGuiTestObject text_accountNumber() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_accountNumber"));
	}
	/**
	 * accountNumber: with specific test context and state.
	 *		.id : accountNumber
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : accountNumber
	 * 		.classIndex : 1
	 */
	protected TextGuiTestObject text_accountNumber(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_accountNumber"), anchor, flags);
	}
	
	/**
	 * CardModelCardholderNameModelFullname: with default state.
	 *		.id : CardModel_CardholderNameModel_Fullname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : CardModel.CardholderNameModel.Fullname
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject text_cardModelCardholderNameMo() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_cardModelCardholderNameMo"));
	}
	/**
	 * CardModelCardholderNameModelFullname: with specific test context and state.
	 *		.id : CardModel_CardholderNameModel_Fullname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : CardModel.CardholderNameModel.Fullname
	 * 		.classIndex : RegularExpression(\d)
	 */
	protected TextGuiTestObject text_cardModelCardholderNameMo(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_cardModelCardholderNameMo"), anchor, flags);
	}
	
	/**
	 * holdersName: with default state.
	 *		.id : holdersName
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : holdersName
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_holdersName() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_holdersName"));
	}
	/**
	 * holdersName: with specific test context and state.
	 *		.id : holdersName
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : holdersName
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_holdersName(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_holdersName"), anchor, flags);
	}
	
	

	protected Payment_OptionsHelper()
	{
		setScriptName("EBC_MK2.Payment_Options");
	}
	
}

