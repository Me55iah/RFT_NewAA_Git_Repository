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
 * Script Name   : <b>Extra_Verification</b><br>
 * Generated     : <b>2015/02/19 11:32:52</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  February 19, 2015
 * @author horned
 */
public abstract class Extra_VerificationHelper extends Utilities.AA_SuperHelper
{
	/**
	 * Today05Jan: with default state.
	 *		.id : 0-nights-stay
	 * 		.value : Today   05 Jan 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 20
	 */
	protected GuiTestObject End_Day() 
	{
		return new GuiTestObject(
                        getMappedTestObject("End_Day"));
	}
	/**
	 * Today05Jan: with specific test context and state.
	 *		.id : 0-nights-stay
	 * 		.value : Today   05 Jan 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 20
	 */
	protected GuiTestObject End_Day(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("End_Day"), anchor, flags);
	}
	
	/**
	 * Today05Jan: with default state.
	 *		.id : Today
	 * 		.value : Today   05 Jan 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 8
	 */
	protected GuiTestObject Start_Day() 
	{
		return new GuiTestObject(
                        getMappedTestObject("Start_Day"));
	}
	/**
	 * Today05Jan: with specific test context and state.
	 *		.id : Today
	 * 		.value : Today   05 Jan 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 8
	 */
	protected GuiTestObject Start_Day(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("Start_Day"), anchor, flags);
	}
	
	/**
	 * CarInsuranceYourQuoteOptionsTheAA: with default state.
	 *		.title : Car Insurance: Your quote options - The AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance/buy/quote)
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
	 * 		.url : RegularExpression(car-insurance/buy/quote)
	 */
	protected DocumentTestObject document_carInsuranceYourQuote(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourQuote"), anchor, flags);
	}
	
	/**
	 * HomeInsuranceYouAndYourHomeTheAAMicrosoftInternetExplorerProvidedByTheAA: with default state.
	 *		.text : Home Insurance : You and your home - The AA - Microsoft Internet Explorer provid ...
	 * 		.class : IEFrame
	 * 		.processName : iexplore.exe
	 * 		.name : Home Insurance : You and your home - The AA - Microsoft Internet Explorer provid ...
	 */
	protected TopLevelSubitemTestObject homeInsuranceYouAndYourHomeThe() 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("homeInsuranceYouAndYourHomeThe"));
	}
	/**
	 * HomeInsuranceYouAndYourHomeTheAAMicrosoftInternetExplorerProvidedByTheAA: with specific test context and state.
	 *		.text : Home Insurance : You and your home - The AA - Microsoft Internet Explorer provid ...
	 * 		.class : IEFrame
	 * 		.processName : iexplore.exe
	 * 		.name : Home Insurance : You and your home - The AA - Microsoft Internet Explorer provid ...
	 */
	protected TopLevelSubitemTestObject homeInsuranceYouAndYourHomeThe(TestObject anchor, long flags) 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("homeInsuranceYouAndYourHomeThe"), anchor, flags);
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
	 * InternetExplorer_Server: with default state.
	 *		.text : null
	 * 		.class : Internet Explorer_Server
	 * 		.processName : iexplore.exe
	 * 		.name : null
	 */
	protected TopLevelSubitemTestObject internetExplorer_Serverwindow() 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("internetExplorer_Serverwindow"));
	}
	/**
	 * InternetExplorer_Server: with specific test context and state.
	 *		.text : null
	 * 		.class : Internet Explorer_Server
	 * 		.processName : iexplore.exe
	 * 		.name : null
	 */
	protected TopLevelSubitemTestObject internetExplorer_Serverwindow(TestObject anchor, long flags) 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("internetExplorer_Serverwindow"), anchor, flags);
	}
	
	/**
	 * TotalExcess�400400: with default state.
	 *		.id : 
	 * 		.value : RegularExpression(Total excess)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 2
	 */
	protected GuiTestObject label_totalExcess() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_totalExcess"));
	}
	/**
	 * TotalExcess�400400: with specific test context and state.
	 *		.id : 
	 * 		.value : RegularExpression(Total excess)
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 2
	 */
	protected GuiTestObject label_totalExcess(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_totalExcess"), anchor, flags);
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
	protected SelectGuiSubitemTestObject list_lH_ExtraCover_VoluntaryEx() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_lH_ExtraCover_VoluntaryEx"));
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
	protected SelectGuiSubitemTestObject list_lH_ExtraCover_VoluntaryEx(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_lH_ExtraCover_VoluntaryEx"), anchor, flags);
	}
	
	/**
	 * firstname: with default state.
	 *		.id : firstname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : firstname
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_firstname() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_firstname"));
	}
	/**
	 * firstname: with specific test context and state.
	 *		.id : firstname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : firstname
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_firstname(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_firstname"), anchor, flags);
	}
	
	/**
	 * surname: with default state.
	 *		.id : surname
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : surname
	 * 		.classIndex : 1
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
	 * 		.classIndex : 1
	 */
	protected TextGuiTestObject text_surname(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_surname"), anchor, flags);
	}
	
	

	protected Extra_VerificationHelper()
	{
		setScriptName("Motor.Extra_Verification");
	}
	
}
