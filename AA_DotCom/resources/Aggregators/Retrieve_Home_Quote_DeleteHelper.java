// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Aggregators;
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
 * Script Name   : <b>Retrieve_Home_Quote_Delete</b><br>
 * Generated     : <b>2015/05/07 09:48:06</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  May 07, 2015
 * @author horned
 */
public abstract class Retrieve_Home_Quote_DeleteHelper extends Utilities.AA_SuperHelper
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
	 * GetQuotesubmit: with default state.
	 *		.id : HomeInsQuoteRetrGetQuoteButt
	 * 		.type : submit
	 * 		.value : Get quote
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : Submit
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_getQuotesubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_getQuotesubmit"));
	}
	/**
	 * GetQuotesubmit: with specific test context and state.
	 *		.id : HomeInsQuoteRetrGetQuoteButt
	 * 		.type : submit
	 * 		.value : Get quote
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : Submit
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_getQuotesubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_getQuotesubmit"), anchor, flags);
	}
	
	/**
	 * GetQuotesubmit: with default state.
	 *		.id : HomeInsMarketValButton
	 * 		.type : submit
	 * 		.value : Get quote
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : Submit
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_getQuotesubmit2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_getQuotesubmit2"));
	}
	/**
	 * GetQuotesubmit: with specific test context and state.
	 *		.id : HomeInsMarketValButton
	 * 		.type : submit
	 * 		.value : Get quote
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : Submit
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_getQuotesubmit2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_getQuotesubmit2"), anchor, flags);
	}
	
	/**
	 * HomeInsuranceRetrieveYourQuoteTheAA: with default state.
	 *		.title : Home Insurance : Retrieve your quote - The AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(theaa)
	 */
	protected DocumentTestObject document_homeInsuranceRetrieve() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_homeInsuranceRetrieve"));
	}
	/**
	 * HomeInsuranceRetrieveYourQuoteTheAA: with specific test context and state.
	 *		.title : Home Insurance : Retrieve your quote - The AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(theaa)
	 */
	protected DocumentTestObject document_homeInsuranceRetrieve(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_homeInsuranceRetrieve"), anchor, flags);
	}
	
	/**
	 * HomeInsuranceYourHomeSMarketValueTheAA: with default state.
	 *		.title : RegularExpression(market value)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(theaa)
	 */
	protected DocumentTestObject document_homeInsuranceYourHome() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_homeInsuranceYourHome"));
	}
	/**
	 * HomeInsuranceYourHomeSMarketValueTheAA: with specific test context and state.
	 *		.title : RegularExpression(market value)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(theaa)
	 */
	protected DocumentTestObject document_homeInsuranceYourHome(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_homeInsuranceYourHome"), anchor, flags);
	}
	
	/**
	 * HomeInsuranceYourQuotesTheAA: with default state.
	 *		.title : RegularExpression(Insurance)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(insurance)
	 */
	protected DocumentTestObject document_homeInsuranceYourQuot() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_homeInsuranceYourQuot"));
	}
	/**
	 * HomeInsuranceYourQuotesTheAA: with specific test context and state.
	 *		.title : RegularExpression(Insurance)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(insurance)
	 */
	protected DocumentTestObject document_homeInsuranceYourQuot(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_homeInsuranceYourQuot"), anchor, flags);
	}
	
	/**
	 * endorsementsOverlay: with default state.
	 *		.id : endorsements-overlay
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 2
	 */
	protected GuiTestObject html_endorsementsOverlay() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_endorsementsOverlay"));
	}
	/**
	 * endorsementsOverlay: with specific test context and state.
	 *		.id : endorsements-overlay
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 2
	 */
	protected GuiTestObject html_endorsementsOverlay(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_endorsementsOverlay"), anchor, flags);
	}
	
	/**
	 * MarketValue: with default state.
	 *		.id : MarketValue
	 * 		.title : 
	 * 		.class : Html.INPUT.number
	 * 		.name : MarketValue
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_marketValue() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_marketValue"));
	}
	/**
	 * MarketValue: with specific test context and state.
	 *		.id : MarketValue
	 * 		.title : 
	 * 		.class : Html.INPUT.number
	 * 		.name : MarketValue
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_marketValue(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_marketValue"), anchor, flags);
	}
	
	/**
	 * birthDay: with default state.
	 *		.text : Day 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 2 ...
	 * 		.id : birthDay
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : birthDay
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_birthDay() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_birthDay"));
	}
	/**
	 * birthDay: with specific test context and state.
	 *		.text : Day 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 2 ...
	 * 		.id : birthDay
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : birthDay
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_birthDay(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_birthDay"), anchor, flags);
	}
	
	/**
	 * birthMonth: with default state.
	 *		.text : Month January February March April May June July August September October Novemb ...
	 * 		.id : birthMonth
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : birthMonth
	 * 		.classIndex : 1
	 */
	protected SelectGuiSubitemTestObject list_birthMonth() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_birthMonth"));
	}
	/**
	 * birthMonth: with specific test context and state.
	 *		.text : Month January February March April May June July August September October Novemb ...
	 * 		.id : birthMonth
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : birthMonth
	 * 		.classIndex : 1
	 */
	protected SelectGuiSubitemTestObject list_birthMonth(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_birthMonth"), anchor, flags);
	}
	
	/**
	 * birthYear: with default state.
	 *		.text : Year 1998 1997 1996 1995 1994 1993 1992 1991 1990 1989 1988 1987 1986 1985 1984  ...
	 * 		.id : birthYear
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : birthYear
	 * 		.classIndex : 2
	 */
	protected SelectGuiSubitemTestObject list_birthYear() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_birthYear"));
	}
	/**
	 * birthYear: with specific test context and state.
	 *		.text : Year 1998 1997 1996 1995 1994 1993 1992 1991 1990 1989 1988 1987 1986 1985 1984  ...
	 * 		.id : birthYear
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : birthYear
	 * 		.classIndex : 2
	 */
	protected SelectGuiSubitemTestObject list_birthYear(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_birthYear"), anchor, flags);
	}
	
	/**
	 * INSURANCETYPEBuildingsAndContents: with default state.
	 *		.id : insuranceTypeBC
	 * 		.type : radio
	 * 		.value : Buildings and Contents
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : INSURANCETYPE
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_Building_Contents() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_Building_Contents"));
	}
	/**
	 * INSURANCETYPEBuildingsAndContents: with specific test context and state.
	 *		.id : insuranceTypeBC
	 * 		.type : radio
	 * 		.value : Buildings and Contents
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : INSURANCETYPE
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_Building_Contents(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_Building_Contents"), anchor, flags);
	}
	
	/**
	 * INSURANCETYPEBuildings: with default state.
	 *		.id : insuranceTypeB
	 * 		.type : radio
	 * 		.value : Buildings
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : INSURANCETYPE
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_Buildings_Only_Ins() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_Buildings_Only_Ins"));
	}
	/**
	 * INSURANCETYPEBuildings: with specific test context and state.
	 *		.id : insuranceTypeB
	 * 		.type : radio
	 * 		.value : Buildings
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : INSURANCETYPE
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_Buildings_Only_Ins(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_Buildings_Only_Ins"), anchor, flags);
	}
	
	/**
	 * INSURANCETYPEContents: with default state.
	 *		.id : insuranceTypeC
	 * 		.type : radio
	 * 		.value : Contents
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : INSURANCETYPE
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_Contents_Only_Ins() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_Contents_Only_Ins"));
	}
	/**
	 * INSURANCETYPEContents: with specific test context and state.
	 *		.id : insuranceTypeC
	 * 		.type : radio
	 * 		.value : Contents
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : INSURANCETYPE
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_Contents_Only_Ins(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_Contents_Only_Ins"), anchor, flags);
	}
	
	/**
	 * postcode: with default state.
	 *		.id : postcode
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : postcode
	 * 		.classIndex : 1
	 */
	protected TextGuiTestObject text_postcode() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_postcode"));
	}
	/**
	 * postcode: with specific test context and state.
	 *		.id : postcode
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : postcode
	 * 		.classIndex : 1
	 */
	protected TextGuiTestObject text_postcode(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_postcode"), anchor, flags);
	}
	
	/**
	 * QUOTEREF: with default state.
	 *		.id : quoteref
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : QUOTEREF
	 * 		.classIndex : 2
	 */
	protected TextGuiTestObject text_quoteref() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_quoteref"));
	}
	/**
	 * QUOTEREF: with specific test context and state.
	 *		.id : quoteref
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : QUOTEREF
	 * 		.classIndex : 2
	 */
	protected TextGuiTestObject text_quoteref(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_quoteref"), anchor, flags);
	}
	
	/**
	 * surname: with default state.
	 *		.id : surname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : surname
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_surname() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_surname"));
	}
	/**
	 * surname: with specific test context and state.
	 *		.id : surname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : surname
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_surname(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_surname"), anchor, flags);
	}
	
	

	protected Retrieve_Home_Quote_DeleteHelper()
	{
		setScriptName("Aggregators.Retrieve_Home_Quote_Delete");
	}
	
}

