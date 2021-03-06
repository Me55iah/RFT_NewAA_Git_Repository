// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Utilities;
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
 * Script Name   : <b>Pay_DD_New</b><br>
 * Generated     : <b>2015/06/10 09:28:06</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  June 10, 2015
 * @author horned
 */
public abstract class Pay_DD_NewHelper extends Utilities.AA_SuperHelper
{
	/**
	 * BuyBreakdownCoversubmit: with default state.
	 *		.id : nextPageImageButton
	 * 		.type : submit
	 * 		.value : Buy breakdown cover
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : submitAppForm
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_buyBreakdownCoversubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_buyBreakdownCoversubmit"));
	}
	/**
	 * BuyBreakdownCoversubmit: with specific test context and state.
	 *		.id : nextPageImageButton
	 * 		.type : submit
	 * 		.value : Buy breakdown cover
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : submitAppForm
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_buyBreakdownCoversubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_buyBreakdownCoversubmit"), anchor, flags);
	}
	
	/**
	 * BreakdownCoverYourPaymentAA: with default state.
	 *		.title : RegularExpression(Cover)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(cover)
	 */
	protected DocumentTestObject document_breakdownCoverYourPay() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_breakdownCoverYourPay"));
	}
	/**
	 * BreakdownCoverYourPaymentAA: with specific test context and state.
	 *		.title : RegularExpression(Cover)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(cover)
	 */
	protected DocumentTestObject document_breakdownCoverYourPay(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_breakdownCoverYourPay"), anchor, flags);
	}
	
	/**
	 * bd_important_information: with default state.
	 *		.id : bd_important_information
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_bd_important_information() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_bd_important_information"));
	}
	/**
	 * bd_important_information: with specific test context and state.
	 *		.id : bd_important_information
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_bd_important_information(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_bd_important_information"), anchor, flags);
	}
	
	/**
	 * container: with default state.
	 *		.id : container
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_container() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_container"));
	}
	/**
	 * container: with specific test context and state.
	 *		.id : container
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_container(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_container"), anchor, flags);
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
	 * IConfirmThatYouHaveInformedMeOfTheImportanceOfReading: with default state.
	 *		.id : 
	 * 		.value : I confirm that you have informed me of the importance of reading the terms and c ...
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 3
	 */
	protected GuiTestObject label_iConfirmThatYouHaveInfor() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_iConfirmThatYouHaveInfor"));
	}
	/**
	 * IConfirmThatYouHaveInformedMeOfTheImportanceOfReading: with specific test context and state.
	 *		.id : 
	 * 		.value : I confirm that you have informed me of the importance of reading the terms and c ...
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 3
	 */
	protected GuiTestObject label_iConfirmThatYouHaveInfor(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_iConfirmThatYouHaveInfor"), anchor, flags);
	}
	
	/**
	 * BreakdownCoverTermsAndConditions: with default state.
	 *		.text : RegularExpression(terms and conditions)
	 * 		.id : 
	 * 		.href : RegularExpression(terms-and-conditions)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject link_breakdownCoverTermsAndCon() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_breakdownCoverTermsAndCon"));
	}
	/**
	 * BreakdownCoverTermsAndConditions: with specific test context and state.
	 *		.text : RegularExpression(terms and conditions)
	 * 		.id : 
	 * 		.href : RegularExpression(terms-and-conditions)
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject link_breakdownCoverTermsAndCon(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_breakdownCoverTermsAndCon"), anchor, flags);
	}
	
	/**
	 * PlaybackLogForFull_Road_BreakDown_Cover_Regression_Test_MK2Opera: with default state.
	 *		.text : Playback Log for Full_Road_BreakDown_Cover_Regression_Test_MK2 - Opera
	 * 		.class : Chrome_WidgetWin_1
	 * 		.processName : opera.exe
	 * 		.name : Playback Log for Full_Road_BreakDown_Cover_Regression_Test_MK2 - Opera
	 */
	protected TopLevelSubitemTestObject playbackLogForFull_Road_BreakD() 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("playbackLogForFull_Road_BreakD"));
	}
	/**
	 * PlaybackLogForFull_Road_BreakDown_Cover_Regression_Test_MK2Opera: with specific test context and state.
	 *		.text : Playback Log for Full_Road_BreakDown_Cover_Regression_Test_MK2 - Opera
	 * 		.class : Chrome_WidgetWin_1
	 * 		.processName : opera.exe
	 * 		.name : Playback Log for Full_Road_BreakDown_Cover_Regression_Test_MK2 - Opera
	 */
	protected TopLevelSubitemTestObject playbackLogForFull_Road_BreakD(TestObject anchor, long flags) 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("playbackLogForFull_Road_BreakD"), anchor, flags);
	}
	
	/**
	 * accountName: with default state.
	 *		.id : accountName
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : accountName
	 * 		.classIndex : 2
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
	 * 		.classIndex : 2
	 */
	protected TextGuiTestObject text_accountName(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_accountName"), anchor, flags);
	}
	
	/**
	 * accountNo: with default state.
	 *		.id : accountNo
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : accountNo
	 * 		.classIndex : 1
	 */
	protected TextGuiTestObject text_accountNo() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_accountNo"));
	}
	/**
	 * accountNo: with specific test context and state.
	 *		.id : accountNo
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : accountNo
	 * 		.classIndex : 1
	 */
	protected TextGuiTestObject text_accountNo(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_accountNo"), anchor, flags);
	}
	
	/**
	 * sortCode: with default state.
	 *		.id : sort_code_id
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : sortCode
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_sortCode() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_sortCode"));
	}
	/**
	 * sortCode: with specific test context and state.
	 *		.id : sort_code_id
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : sortCode
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_sortCode(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_sortCode"), anchor, flags);
	}
	
	/**
	 * TimesheetOpera: with default state.
	 *		.text : Timesheet - Opera
	 * 		.class : Chrome_WidgetWin_1
	 * 		.processName : opera.exe
	 * 		.name : Timesheet - Opera
	 */
	protected TopLevelSubitemTestObject timesheetOperawindow() 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("timesheetOperawindow"));
	}
	/**
	 * TimesheetOpera: with specific test context and state.
	 *		.text : Timesheet - Opera
	 * 		.class : Chrome_WidgetWin_1
	 * 		.processName : opera.exe
	 * 		.name : Timesheet - Opera
	 */
	protected TopLevelSubitemTestObject timesheetOperawindow(TestObject anchor, long flags) 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("timesheetOperawindow"), anchor, flags);
	}
	
	

	protected Pay_DD_NewHelper()
	{
		setScriptName("Utilities.Pay_DD_New");
	}
	
}

